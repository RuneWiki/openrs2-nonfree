import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class98 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	private int anInt3195;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	public int anInt3196;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!lf;")
	private final Class4_Sub11 aClass4_Sub11_7 = new Class4_Sub11(null);

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class98() {
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "([B)V")
	public Class98(@OriginalArg(0) byte[] arg0) {
		this.method2916(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public void method2907(@OriginalArg(0) int arg0) {
		this.aClass4_Sub11_7.anInt3768 = this.anIntArray275[arg0];
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	public void method2908(@OriginalArg(0) int arg0) {
		this.anIntArray275[arg0] = this.aClass4_Sub11_7.anInt3768;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)I")
	private int method2909(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub11_7.aByteArray55[this.aClass4_Sub11_7.anInt3768];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray273[arg0] = local13;
			this.aClass4_Sub11_7.anInt3768++;
		} else {
			local13 = this.anIntArray273[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2917(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub11_7.method3448();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub11_7.aByteArray55[this.aClass4_Sub11_7.anInt3768] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub11_7.anInt3768++;
				this.anIntArray273[arg0] = local57;
				return this.method2917(arg0, local57);
			}
		}
		this.aClass4_Sub11_7.anInt3768 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "()V")
	public void method2910() {
		this.aClass4_Sub11_7.aByteArray55 = null;
		this.anIntArray276 = null;
		this.anIntArray275 = null;
		this.anIntArray274 = null;
		this.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "()Z")
	public boolean method2912() {
		@Pc(3) int local3 = this.anIntArray275.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray275[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "()I")
	public int method2913() {
		return this.anIntArray275.length;
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "()Z")
	public boolean method2914() {
		return this.aClass4_Sub11_7.aByteArray55 != null;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	public void method2915(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub11_7.method3448();
		this.anIntArray274[arg0] += local4;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([B)V")
	public void method2916(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub11_7.aByteArray55 = arg0;
		this.aClass4_Sub11_7.anInt3768 = 10;
		@Pc(12) int local12 = this.aClass4_Sub11_7.method3401();
		this.anInt3196 = this.aClass4_Sub11_7.method3401();
		this.anInt3195 = 500000;
		this.anIntArray276 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub11_7.method3418();
			@Pc(38) int local38 = this.aClass4_Sub11_7.method3418();
			if (local33 == 1297379947) {
				this.anIntArray276[local27] = this.aClass4_Sub11_7.anInt3768;
				local27++;
			}
			this.aClass4_Sub11_7.anInt3768 += local38;
		}
		this.aLong92 = 0L;
		this.anIntArray275 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray275[local33] = this.anIntArray276[local33];
		}
		this.anIntArray274 = new int[local12];
		this.anIntArray273 = new int[local12];
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
	private int method2917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static137.aByteArray48[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub11_7.method3440() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub11_7.method3440() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub11_7.method3440();
		local12 = this.aClass4_Sub11_7.method3448();
		if (local7 == 47) {
			this.aClass4_Sub11_7.anInt3768 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub11_7.method3442();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray274[arg0];
			this.aLong92 += (long) local38 * (long) (this.anInt3195 - local32);
			this.anInt3195 = local32;
			this.aClass4_Sub11_7.anInt3768 += local12;
			return 2;
		} else {
			this.aClass4_Sub11_7.anInt3768 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "()V")
	public void method2918() {
		this.aClass4_Sub11_7.anInt3768 = -1;
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "()I")
	public int method2919() {
		@Pc(3) int local3 = this.anIntArray275.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray275[local9] >= 0 && this.anIntArray274[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray274[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)I")
	public int method2920(@OriginalArg(0) int arg0) {
		return this.method2909(arg0);
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)J")
	public long method2921(@OriginalArg(0) int arg0) {
		return this.aLong92 + (long) arg0 * (long) this.anInt3195;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(J)V")
	public void method2922(@OriginalArg(0) long arg0) {
		this.aLong92 = arg0;
		@Pc(6) int local6 = this.anIntArray275.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray274[local8] = 0;
			this.anIntArray273[local8] = 0;
			this.aClass4_Sub11_7.anInt3768 = this.anIntArray276[local8];
			this.method2915(local8);
			this.anIntArray275[local8] = this.aClass4_Sub11_7.anInt3768;
		}
	}
}
