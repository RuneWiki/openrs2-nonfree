import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class37 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public int anInt978;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!vj;")
	private final Class2_Sub22 aClass2_Sub22_2 = new Class2_Sub22(null);

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class37() {
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([B)V")
	public Class37(@OriginalArg(0) byte[] arg0) {
		this.method767(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)J")
	public long method754(@OriginalArg(0) int arg0) {
		return this.aLong40 + (long) arg0 * (long) this.anInt979;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I")
	public int method755(@OriginalArg(0) int arg0) {
		return this.method760(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()I")
	public int method756() {
		@Pc(3) int local3 = this.anIntArray82.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray82[local9] >= 0 && this.anIntArray83[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray83[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "()V")
	public void method757() {
		this.aClass2_Sub22_2.aByteArray115 = null;
		this.anIntArray81 = null;
		this.anIntArray82 = null;
		this.anIntArray83 = null;
		this.anIntArray80 = null;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public void method758(@OriginalArg(0) int arg0) {
		this.aClass2_Sub22_2.anInt10247 = this.anIntArray82[arg0];
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "()Z")
	public boolean method759() {
		return this.aClass2_Sub22_2.aByteArray115 != null;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
	private int method760(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub22_2.aByteArray115[this.aClass2_Sub22_2.anInt10247];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray80[arg0] = local13;
			this.aClass2_Sub22_2.anInt10247++;
		} else {
			local13 = this.anIntArray80[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method762(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub22_2.method8523();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub22_2.aByteArray115[this.aClass2_Sub22_2.anInt10247] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub22_2.anInt10247++;
				this.anIntArray80[arg0] = local57;
				return this.method762(arg0, local57);
			}
		}
		this.aClass2_Sub22_2.anInt10247 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(J)V")
	public void method761(@OriginalArg(0) long arg0) {
		this.aLong40 = arg0;
		@Pc(6) int local6 = this.anIntArray82.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray83[local8] = 0;
			this.anIntArray80[local8] = 0;
			this.aClass2_Sub22_2.anInt10247 = this.anIntArray81[local8];
			this.method766(local8);
			this.anIntArray82[local8] = this.aClass2_Sub22_2.anInt10247;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
	private int method762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static47.aByteArray10[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub22_2.method8547() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub22_2.method8547() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub22_2.method8547();
		local12 = this.aClass2_Sub22_2.method8523();
		if (local7 == 47) {
			this.aClass2_Sub22_2.anInt10247 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub22_2.method8539();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray83[arg0];
			this.aLong40 += (long) local38 * (long) (this.anInt979 - local32);
			this.anInt979 = local32;
			this.aClass2_Sub22_2.anInt10247 += local12;
			return 2;
		} else {
			this.aClass2_Sub22_2.anInt10247 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "()I")
	public int method764() {
		return this.anIntArray82.length;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "()Z")
	public boolean method765() {
		@Pc(3) int local3 = this.anIntArray82.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray82[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V")
	public void method766(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub22_2.method8523();
		this.anIntArray83[arg0] += local4;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([B)V")
	public void method767(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub22_2.aByteArray115 = arg0;
		this.aClass2_Sub22_2.anInt10247 = 10;
		@Pc(12) int local12 = this.aClass2_Sub22_2.method8546();
		this.anInt978 = this.aClass2_Sub22_2.method8546();
		this.anInt979 = 500000;
		this.anIntArray81 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub22_2.method8542();
			@Pc(38) int local38 = this.aClass2_Sub22_2.method8542();
			if (local33 == 1297379947) {
				this.anIntArray81[local27] = this.aClass2_Sub22_2.anInt10247;
				local27++;
			}
			this.aClass2_Sub22_2.anInt10247 += local38;
		}
		this.aLong40 = 0L;
		this.anIntArray82 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray82[local33] = this.anIntArray81[local33];
		}
		this.anIntArray83 = new int[local12];
		this.anIntArray80 = new int[local12];
	}

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "()V")
	public void method768() {
		this.aClass2_Sub22_2.anInt10247 = -1;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)V")
	public void method769(@OriginalArg(0) int arg0) {
		this.anIntArray82[arg0] = this.aClass2_Sub22_2.anInt10247;
	}
}
