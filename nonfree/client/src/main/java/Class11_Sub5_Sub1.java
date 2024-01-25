import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 {

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "Lclient!bn;")
	private Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	private int anInt2039 = 0;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
	private int anInt2044 = 0;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	private int anInt2037 = -32768;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
	private final int anInt2041 = -1;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	private int anInt2046 = 0;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
	public final int anInt2027;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	private final int anInt2038;

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
	private final int anInt2050;

	@OriginalMember(owner = "client!fp", name = "U", descriptor = "Lclient!hg;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class11_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt2039 = arg12;
		this.anInt2027 = arg1 + arg2;
		this.anInt2038 = arg0;
		this.anInt2050 = arg4;
		@Pc(49) Class139 local49 = Static399.aClass100_2.method2197(this.anInt2038);
		@Pc(52) int local52 = local49.anInt3448;
		if (local52 == -1) {
			this.aBoolean128 = true;
		} else {
			this.aClass109_1 = Static37.aClass80_1.method1879(local52);
			this.aBoolean128 = false;
		}
		if (this.anInt2027 == arg2) {
			Static245.method3411(false, this.anInt2044, this.aClass109_1, super.anInt7626, super.anInt7622, super.aByte101);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!za;II)Lclient!e;")
	private Class63 method1943(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class139 local8 = Static399.aClass100_2.method2197(arg2);
		@Pc(13) Class22 local13 = Static114.aClass22Array2[super.aByte101];
		@Pc(28) Class22 local28 = this.anInt2050 >= 3 ? null : Static114.aClass22Array2[this.anInt2050 + 1];
		return this.aBoolean128 ? local8.method2830(super.anInt7624, arg0, arg1, local13, Static37.aClass80_1, -1, super.anInt7626, -1, super.anInt7622, 0, local28) : local8.method2830(super.anInt7624, arg0, arg1, local13, Static37.aClass80_1, this.anInt2041, super.anInt7626, this.anInt2044, super.anInt7622, this.anInt2046, local28);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.method1943(arg0, 0, this.anInt2038);
		if (local16 != null) {
			this.method1944(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub1_1 != null) {
			this.aClass28_Sub1_1.method538();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!e;Lclient!za;I)V")
	private void method1944(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class75 arg1) {
		@Pc(10) Class191[] local10 = arg0.method6288();
		@Pc(13) Class254[] local13 = arg0.method6291();
		if ((this.aClass28_Sub1_1 == null || this.aClass28_Sub1_1.aBoolean24) && (local10 != null || local13 != null)) {
			this.aClass28_Sub1_1 = new Class28_Sub1(Static277.anInt5022);
		}
		if (this.aClass28_Sub1_1 != null) {
			this.aClass28_Sub1_1.method534(arg1, (long) Static277.anInt5022, local10, local13);
			this.aClass28_Sub1_1.method531(super.aByte101, super.aShort108, super.aShort107, super.aShort109, super.aShort106);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public void method1945() {
		if (this.aClass28_Sub1_1 != null) {
			this.aClass28_Sub1_1.method538();
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)I")
	@Override
	public int method6213() {
		return this.anInt2037;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
	public void method1946(@OriginalArg(0) int arg0) {
		if (this.aBoolean128) {
			return;
		}
		this.anInt2046 += arg0;
		while (this.aClass109_1.anIntArray238[this.anInt2044] < this.anInt2046) {
			this.anInt2046 -= this.aClass109_1.anIntArray238[this.anInt2044];
			this.anInt2044++;
			if (this.anInt2044 >= this.aClass109_1.anIntArray240.length) {
				this.aBoolean128 = true;
				break;
			}
		}
		if (!this.aBoolean128) {
			Static245.method3411(false, this.anInt2044, this.aClass109_1, super.anInt7626, super.anInt7622, super.aByte101);
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(21) Class63 local21 = this.method1943(arg0, (this.anInt2039 == 0 ? 0 : 5) | 0x800, this.anInt2038);
		if (local21 == null) {
			return null;
		}
		if (this.anInt2039 != 0) {
			local21.ma(this.anInt2039 * 2048);
		}
		@Pc(37) Class6 local37 = arg0.method5990();
		local37.U(super.anInt7626, super.anInt7624, super.anInt7622);
		if (this.aClass28_Sub1_1 == null) {
			local21.method6293(local37, null, 0);
		} else {
			@Pc(59) Class56 local59 = this.aClass28_Sub1_1.method536();
			arg0.method5960(local21, local59, local37, null);
		}
		this.anInt2037 = local21.B();
		this.method1944(local21, arg0);
		return null;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}
}
