import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class35 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public int anInt1267;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private int anInt1268;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!rd;")
	private final Class1_Sub20 aClass1_Sub20_3 = new Class1_Sub20(null);

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class35() {
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
	public Class35(@OriginalArg(0) byte[] arg0) {
		this.method920(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
	public int method907() {
		return this.anIntArray209.length;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public void method908(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub20_3.method2071();
		this.anIntArray210[arg0] += local4;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
	public boolean method909() {
		return this.aClass1_Sub20_3.aByteArray36 != null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public void method910(@OriginalArg(0) int arg0) {
		this.aClass1_Sub20_3.anInt2951 = this.anIntArray209[arg0];
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)I")
	public int method911(@OriginalArg(0) int arg0) {
		return this.method913(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
	private int method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static53.aByteArray25[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub20_3.method2053() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub20_3.method2053() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub20_3.method2053();
		local12 = this.aClass1_Sub20_3.method2071();
		if (local7 == 47) {
			this.aClass1_Sub20_3.anInt2951 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub20_3.method2075();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray210[arg0];
			this.aLong38 += (long) local38 * (long) (this.anInt1268 - local32);
			this.anInt1268 = local32;
			this.aClass1_Sub20_3.anInt2951 += local12;
			return 2;
		} else {
			this.aClass1_Sub20_3.anInt2951 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)I")
	private int method913(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub20_3.aByteArray36[this.aClass1_Sub20_3.anInt2951];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray207[arg0] = local13;
			this.aClass1_Sub20_3.anInt2951++;
		} else {
			local13 = this.anIntArray207[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method912(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub20_3.method2071();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub20_3.aByteArray36[this.aClass1_Sub20_3.anInt2951] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub20_3.anInt2951++;
				this.anIntArray207[arg0] = local57;
				return this.method912(arg0, local57);
			}
		}
		this.aClass1_Sub20_3.anInt2951 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	public void method914() {
		this.aClass1_Sub20_3.aByteArray36 = null;
		this.anIntArray208 = null;
		this.anIntArray209 = null;
		this.anIntArray210 = null;
		this.anIntArray207 = null;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()I")
	public int method915() {
		@Pc(3) int local3 = this.anIntArray209.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray209[local9] >= 0 && this.anIntArray210[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray210[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)J")
	public long method916(@OriginalArg(0) int arg0) {
		return this.aLong38 + (long) arg0 * (long) this.anInt1268;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()Z")
	public boolean method917() {
		@Pc(3) int local3 = this.anIntArray209.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray209[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(J)V")
	public void method918(@OriginalArg(0) long arg0) {
		this.aLong38 = arg0;
		@Pc(6) int local6 = this.anIntArray209.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray210[local8] = 0;
			this.anIntArray207[local8] = 0;
			this.aClass1_Sub20_3.anInt2951 = this.anIntArray208[local8];
			this.method908(local8);
			this.anIntArray209[local8] = this.aClass1_Sub20_3.anInt2951;
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
	public void method919() {
		this.aClass1_Sub20_3.anInt2951 = -1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([B)V")
	public void method920(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub20_3.aByteArray36 = arg0;
		this.aClass1_Sub20_3.anInt2951 = 10;
		@Pc(12) int local12 = this.aClass1_Sub20_3.method2087();
		this.anInt1267 = this.aClass1_Sub20_3.method2087();
		this.anInt1268 = 500000;
		this.anIntArray208 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub20_3.method2094();
			@Pc(38) int local38 = this.aClass1_Sub20_3.method2094();
			if (local33 == 1297379947) {
				this.anIntArray208[local27] = this.aClass1_Sub20_3.anInt2951;
				local27++;
			}
			this.aClass1_Sub20_3.anInt2951 += local38;
		}
		this.aLong38 = 0L;
		this.anIntArray209 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray209[local33] = this.anIntArray208[local33];
		}
		this.anIntArray210 = new int[local12];
		this.anIntArray207 = new int[local12];
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public void method921(@OriginalArg(0) int arg0) {
		this.anIntArray209[arg0] = this.aClass1_Sub20_3.anInt2951;
	}
}
