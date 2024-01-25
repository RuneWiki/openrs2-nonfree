import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class5_Sub4_Sub1 extends Class5_Sub4 {

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Lclient!nd;")
	private Class8_Sub5 aClass8_Sub5_2;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	private int anInt2442 = -32768;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	private final int anInt2449 = -1;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
	private int anInt2458 = 0;

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
	public final int anInt2461;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
	private final int anInt2457;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "Lclient!md;")
	private Class131 aClass131_1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt2461 = arg2 + arg1;
		this.anInt2457 = arg0;
		@Pc(41) int local41 = Static155.method1566(this.anInt2457).anInt22;
		if (local41 == -1) {
			this.aBoolean133 = true;
		} else {
			this.aBoolean133 = false;
			this.aClass131_1 = Static343.method5604(local41);
		}
		if (this.anInt2461 == arg2) {
			Static161.method2570(this.anInt2447, false, super.anInt5905, this.aClass131_1, super.anInt5901);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!tj;I)Lclient!qb;")
	private Class124 method1998(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		@Pc(17) Class2 local17 = Static155.method1566(this.anInt2457);
		return this.aBoolean133 ? local17.method9(-1, arg0, arg1, 0, -1) : local17.method9(this.anInt2449, arg0, arg1, this.anInt2458, this.anInt2447);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!qb;ILclient!tj;)V")
	private void method1999(@OriginalArg(0) Class124 arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(10) Class112[] local10 = arg0.method4074();
		@Pc(13) Class191[] local13 = arg0.method4112();
		if ((this.aClass8_Sub5_2 == null || this.aClass8_Sub5_2.aBoolean239) && (local10 != null || local13 != null)) {
			this.aClass8_Sub5_2 = new Class8_Sub5(Static51.anInt1101);
		}
		if (this.aClass8_Sub5_2 != null) {
			this.aClass8_Sub5_2.method3574(arg1, (long) Static51.anInt1101, local10, local13);
			this.aClass8_Sub5_2.method3571(super.aByte69, super.aShort86, super.aShort89, super.aShort87, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public void method2001(@OriginalArg(1) int arg0) {
		if (this.aBoolean133) {
			return;
		}
		this.anInt2458 += arg0;
		while (this.aClass131_1.anIntArray337[this.anInt2447] < this.anInt2458) {
			this.anInt2458 -= this.aClass131_1.anIntArray337[this.anInt2447];
			this.anInt2447++;
			if (this.aClass131_1.anIntArray335.length <= this.anInt2447) {
				this.aBoolean133 = true;
				break;
			}
		}
		if (!this.aBoolean133) {
			Static161.method2570(this.anInt2447, false, super.anInt5905, this.aClass131_1, super.anInt5901);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public void method2004() {
		if (this.aClass8_Sub5_2 != null) {
			this.aClass8_Sub5_2.method3569();
		}
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I")
	@Override
	public int method5039() {
		return this.anInt2442;
	}

	@OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_2 != null) {
			this.aClass8_Sub5_2.method3569();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		@Pc(9) Class124 local9 = this.method1998(0, arg0);
		if (local9 != null) {
			this.method1999(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		@Pc(11) Class124 local11 = this.method1998(1024, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(23) Class56 local23 = arg0.method4739();
		local23.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
		if (this.aClass8_Sub5_2 == null) {
			local11.method4079(local23, null, 0);
		} else {
			@Pc(45) Class9 local45 = this.aClass8_Sub5_2.method3570();
			arg0.method4756(local11, local45, local23, null);
		}
		this.anInt2442 = local11.method4106();
		this.method1999(local11, arg0);
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return false;
	}
}
