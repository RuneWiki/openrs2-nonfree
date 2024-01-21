import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class12 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
	public int[] anIntArray44;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Lclient!h;")
	private final Class4_Sub11 aClass4_Sub11_2 = new Class4_Sub11(null);

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class12() {
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V")
	public Class12(@OriginalArg(0) byte[] arg0) {
		this.method283(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public void method282(@OriginalArg(0) int arg0) {
		this.anIntArray45[arg0] = this.aClass4_Sub11_2.anInt1597;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([B)V")
	public void method283(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub11_2.aByteArray19 = arg0;
		this.aClass4_Sub11_2.anInt1597 = 10;
		@Pc(12) int local12 = this.aClass4_Sub11_2.method1252();
		this.anInt469 = this.aClass4_Sub11_2.method1252();
		this.anInt468 = 500000;
		this.anIntArray43 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub11_2.method1263();
			@Pc(38) int local38 = this.aClass4_Sub11_2.method1263();
			if (local33 == 1297379947) {
				this.anIntArray43[local27] = this.aClass4_Sub11_2.anInt1597;
				local27++;
			}
			this.aClass4_Sub11_2.anInt1597 += local38;
		}
		this.aLong14 = 0L;
		this.anIntArray45 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray45[local33] = this.anIntArray43[local33];
		}
		this.anIntArray44 = new int[local12];
		this.anIntArray46 = new int[local12];
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(J)V")
	public void method284(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(6) int local6 = this.anIntArray45.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray44[local8] = 0;
			this.anIntArray46[local8] = 0;
			this.aClass4_Sub11_2.anInt1597 = this.anIntArray43[local8];
			this.method287(local8);
			this.anIntArray45[local8] = this.aClass4_Sub11_2.anInt1597;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
	public int method285(@OriginalArg(0) int arg0) {
		return this.method289(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
	public void method286() {
		this.aClass4_Sub11_2.anInt1597 = -1;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	public void method287(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub11_2.method1259();
		this.anIntArray44[arg0] += local4;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public void method288(@OriginalArg(0) int arg0) {
		this.aClass4_Sub11_2.anInt1597 = this.anIntArray45[arg0];
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)I")
	private int method289(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub11_2.aByteArray19[this.aClass4_Sub11_2.anInt1597];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray46[arg0] = local13;
			this.aClass4_Sub11_2.anInt1597++;
		} else {
			local13 = this.anIntArray46[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method295(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub11_2.method1259();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub11_2.aByteArray19[this.aClass4_Sub11_2.anInt1597] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub11_2.anInt1597++;
				this.anIntArray46[arg0] = local57;
				return this.method295(arg0, local57);
			}
		}
		this.aClass4_Sub11_2.anInt1597 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
	public int method290() {
		return this.anIntArray45.length;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()V")
	public void method291() {
		this.aClass4_Sub11_2.aByteArray19 = null;
		this.anIntArray43 = null;
		this.anIntArray45 = null;
		this.anIntArray44 = null;
		this.anIntArray46 = null;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z")
	public boolean method292() {
		return this.aClass4_Sub11_2.aByteArray19 != null;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "()Z")
	public boolean method293() {
		@Pc(3) int local3 = this.anIntArray45.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray45[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)J")
	public long method294(@OriginalArg(0) int arg0) {
		return this.aLong14 + (long) arg0 * (long) this.anInt468;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
	private int method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static16.aByteArray1[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub11_2.method1253() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub11_2.method1253() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub11_2.method1253();
		local12 = this.aClass4_Sub11_2.method1259();
		if (local7 == 47) {
			this.aClass4_Sub11_2.anInt1597 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub11_2.method1225();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray44[arg0];
			this.aLong14 += (long) local38 * (long) (this.anInt468 - local32);
			this.anInt468 = local32;
			this.aClass4_Sub11_2.anInt1597 += local12;
			return 2;
		} else {
			this.aClass4_Sub11_2.anInt1597 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "()I")
	public int method296() {
		@Pc(3) int local3 = this.anIntArray45.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray45[local9] >= 0 && this.anIntArray44[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray44[local9];
			}
		}
		return local5;
	}
}
