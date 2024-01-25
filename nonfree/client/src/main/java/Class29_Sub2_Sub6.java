import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class29_Sub2_Sub6 extends Class29_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Lclient!vg;")
	private Class330 aClass330_8;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "Lclient!kd;")
	public final Class169 aClass169_4;

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "Z")
	private final boolean aBoolean647;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIIZIIIIIII)V")
	public Class29_Sub2_Sub6(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8457 == 1, Static110.method1746(arg12, arg13));
		this.aClass169_4 = new Class169(arg0, arg1, arg12, arg13, super.aByte103, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean647 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aClass169_4.method3584();
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		this.aClass169_4.method3583(arg0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class22 local18 = this.aClass169_4.method3581(true, 2048, super.anInt9222, super.anInt9218, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class34 local30 = arg0.method7096();
		local30.GA(super.anInt9222, super.anInt9223, super.anInt9218);
		@Pc(40) Class102_Sub2 local40 = null;
		if (this.aBoolean647) {
			local40 = Static228.method3369(1);
		}
		this.aClass169_4.method3582(arg0, local30, super.aShort124, super.aShort123, local18, super.aShort122, super.aShort121, true);
		if (this.aClass169_4.aClass102_Sub6_4 == null) {
			local18.method4689(local30, local40 == null ? null : local40.aClass102_Sub5Array1[0], 0);
		} else {
			@Pc(72) Class222 local72 = this.aClass169_4.aClass102_Sub6_4.method6847();
			arg0.method7118(local18, local72, local30, local40 == null ? null : local40.aClass102_Sub5Array1[0], 0);
		}
		if (this.aClass330_8 == null) {
			this.aClass330_8 = Static9.method170(local18, super.anInt9222, super.anInt9223, super.anInt9218);
		} else {
			Static113.method1763(super.anInt9223, super.anInt9222, local18, this.aClass330_8, super.anInt9218);
		}
		return local40;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return this.aClass330_8;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		@Pc(20) Class22 local20 = this.aClass169_4.method3581(true, 262144, super.anInt9222, super.anInt9218, arg0, true);
		if (local20 != null) {
			@Pc(25) Class34 local25 = arg0.method7096();
			local25.GA(super.anInt9222, super.anInt9223, super.anInt9218);
			this.aClass169_4.method3582(arg0, local25, super.aShort124, super.aShort123, local20, super.aShort122, super.aShort121, false);
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class22 local16 = this.aClass169_4.method3581(false, 131072, super.anInt9222, super.anInt9218, arg2, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class34 local30 = arg2.method7096();
			local30.GA(super.anInt9222, super.anInt9223, super.anInt9218);
			return local16.method4698(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aClass169_4.anInt4161;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aClass169_4.anInt4168;
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return this.aClass169_4.method3580();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		this.aClass169_4.method3579(arg0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aClass169_4.anInt4169;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass169_4.method3581(false, arg0, 0, 0, arg1, false);
	}
}
