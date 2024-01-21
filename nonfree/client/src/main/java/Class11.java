import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class11 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!fe;")
	private final Class2_Sub8 aClass2_Sub8_1 = new Class2_Sub8(null);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public void method287(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub8_1.method1372();
		this.anIntArray76[arg0] += local4;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method288(@OriginalArg(0) int arg0) {
		this.aClass2_Sub8_1.anInt2342 = this.anIntArray78[arg0];
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
	private int method289(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub8_1.aByteArray59[this.aClass2_Sub8_1.anInt2342];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray75[arg0] = local13;
			this.aClass2_Sub8_1.anInt2342++;
		} else {
			local13 = this.anIntArray75[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method291(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub8_1.method1372();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub8_1.aByteArray59[this.aClass2_Sub8_1.anInt2342] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub8_1.anInt2342++;
				this.anIntArray75[arg0] = local57;
				return this.method291(arg0, local57);
			}
		}
		this.aClass2_Sub8_1.anInt2342 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()Z")
	public boolean method290() {
		@Pc(3) int local3 = this.anIntArray78.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray78[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	private int method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static14.aByteArray14[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub8_1.method1410() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub8_1.method1410() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub8_1.method1410();
		local12 = this.aClass2_Sub8_1.method1372();
		if (local7 == 47) {
			this.aClass2_Sub8_1.anInt2342 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub8_1.method1388();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray76[arg0];
			this.aLong23 += (long) local38 * (long) (this.anInt463 - local32);
			this.anInt463 = local32;
			this.aClass2_Sub8_1.anInt2342 += local12;
			return 2;
		} else {
			this.aClass2_Sub8_1.anInt2342 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(J)V")
	public void method292(@OriginalArg(0) long arg0) {
		this.aLong23 = arg0;
		@Pc(6) int local6 = this.anIntArray78.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray76[local8] = 0;
			this.anIntArray75[local8] = 0;
			this.aClass2_Sub8_1.anInt2342 = this.anIntArray77[local8];
			this.method287(local8);
			this.anIntArray78[local8] = this.aClass2_Sub8_1.anInt2342;
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)J")
	public long method293(@OriginalArg(0) int arg0) {
		return this.aLong23 + (long) arg0 * (long) this.anInt463;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()Z")
	public boolean method294() {
		return this.aClass2_Sub8_1.anInt2342 < 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([B)V")
	public void method295(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub8_1.aByteArray59 = arg0;
		this.aClass2_Sub8_1.anInt2342 = 10;
		@Pc(12) int local12 = this.aClass2_Sub8_1.method1396();
		this.anInt462 = this.aClass2_Sub8_1.method1396();
		this.anInt463 = 500000;
		this.anIntArray77 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass2_Sub8_1.method1406();
			@Pc(38) int local38 = this.aClass2_Sub8_1.method1406();
			if (local33 == 1297379947) {
				this.anIntArray77[local27] = this.aClass2_Sub8_1.anInt2342;
				local27++;
			}
			this.aClass2_Sub8_1.anInt2342 += local38;
		}
		this.anIntArray78 = (int[]) this.anIntArray77.clone();
		this.anIntArray76 = new int[local12];
		this.anIntArray75 = new int[local12];
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()V")
	public void method296() {
		this.aClass2_Sub8_1.anInt2342 = -1;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
	public void method297() {
		this.aClass2_Sub8_1.aByteArray59 = null;
		this.anIntArray77 = null;
		this.anIntArray78 = null;
		this.anIntArray76 = null;
		this.anIntArray75 = null;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "()Z")
	public boolean method298() {
		return this.aClass2_Sub8_1.aByteArray59 != null;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "()I")
	public int method299() {
		return this.anIntArray78.length;
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "()I")
	public int method300() {
		@Pc(3) int local3 = this.anIntArray78.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray78[local9] >= 0 && this.anIntArray76[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray76[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public void method301(@OriginalArg(0) int arg0) {
		this.anIntArray78[arg0] = this.aClass2_Sub8_1.anInt2342;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)I")
	public int method302(@OriginalArg(0) int arg0) {
		return this.method289(arg0);
	}
}
