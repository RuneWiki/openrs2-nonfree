import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "Lclient!bt;")
	private Class7_Sub3 aClass7_Sub3_7;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
	private final int anInt6804 = -1;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
	private int anInt6802 = 0;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!vn", name = "bb", descriptor = "I")
	private int anInt6821 = 0;

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
	private int anInt6807 = -32768;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	public final int anInt6806;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
	private final int anInt6810;

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "Lclient!hu;")
	private Class102 aClass102_3;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6806 = arg1 + arg2;
		this.anInt6810 = arg0;
		@Pc(41) int local41 = Static153.aClass116_1.method2791(this.anInt6810).anInt5101;
		if (local41 == -1) {
			this.aBoolean481 = true;
		} else {
			this.aBoolean481 = false;
			this.aClass102_3 = Static333.aClass50_2.method1175(local41);
		}
		if (arg2 == this.anInt6806) {
			Static343.method5495(this.aClass102_3, false, super.anInt6800, this.anInt6802, super.anInt6798, super.aByte73);
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		@Pc(9) Class159 local9 = this.method5905(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class21 local21 = arg0.method2445();
		local21.method3711(super.anInt6800, super.anInt6797, super.anInt6798);
		if (this.aClass7_Sub3_7 == null) {
			local9.method4952(local21, null, 0);
		} else {
			@Pc(36) Class34 local36 = this.aClass7_Sub3_7.method519();
			arg0.method2520(local9, local36, local21, null);
		}
		this.anInt6807 = local9.method4941();
		this.method5902(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub3_7 != null) {
			this.aClass7_Sub3_7.method528();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)V")
	public void method5900(@OriginalArg(1) int arg0) {
		if (this.aBoolean481) {
			return;
		}
		this.anInt6821 += arg0;
		while (this.anInt6821 > this.aClass102_3.anIntArray229[this.anInt6802]) {
			this.anInt6821 -= this.aClass102_3.anIntArray229[this.anInt6802];
			this.anInt6802++;
			if (this.anInt6802 >= this.aClass102_3.anIntArray231.length) {
				this.aBoolean481 = true;
				break;
			}
		}
		if (!this.aBoolean481) {
			Static343.method5495(this.aClass102_3, false, super.anInt6800, this.anInt6802, super.anInt6798, super.aByte73);
		}
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		@Pc(9) Class159 local9 = this.method5905(0, arg0);
		if (local9 != null) {
			this.method5902(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLclient!oj;Lclient!qh;)V")
	private void method5902(@OriginalArg(1) Class48 arg0, @OriginalArg(2) Class159 arg1) {
		@Pc(10) Class218[] local10 = arg1.method4962();
		@Pc(13) Class88[] local13 = arg1.method4960();
		if ((this.aClass7_Sub3_7 == null || this.aClass7_Sub3_7.aBoolean46) && (local10 != null || local13 != null)) {
			this.aClass7_Sub3_7 = new Class7_Sub3(Static339.anInt6265);
		}
		if (this.aClass7_Sub3_7 != null) {
			this.aClass7_Sub3_7.method518(arg0, (long) Static339.anInt6265, local10, local13);
			this.aClass7_Sub3_7.method521(super.aByte73, super.aShort95, super.aShort97, super.aShort96, super.aShort94);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method5904() {
		if (this.aClass7_Sub3_7 != null) {
			this.aClass7_Sub3_7.method528();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!oj;)Lclient!qh;")
	private Class159 method5905(@OriginalArg(0) int arg0, @OriginalArg(2) Class48 arg1) {
		@Pc(11) Class182 local11 = Static153.aClass116_1.method2791(this.anInt6810);
		return this.aBoolean481 ? local11.method4568(0, -1, Static333.aClass50_2, -1, arg0, arg1) : local11.method4568(this.anInt6821, this.anInt6802, Static333.aClass50_2, this.anInt6804, arg0, arg1);
	}

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)I")
	@Override
	public int method5894() {
		return this.anInt6807;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		return false;
	}
}
