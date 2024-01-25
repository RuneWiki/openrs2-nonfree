import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class9_Sub4_Sub2_Sub5 extends Class9_Sub4_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!ts", name = "fb", descriptor = "Lclient!oia;")
	private Class243 aClass243_6;

	@OriginalMember(owner = "client!ts", name = "T", descriptor = "Z")
	private boolean aBoolean757 = false;

	@OriginalMember(owner = "client!ts", name = "ab", descriptor = "Lclient!vo;")
	public final Class363 aClass363_4;

	@OriginalMember(owner = "client!ts", name = "cb", descriptor = "Z")
	private final boolean aBoolean758;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZIIIIIII)V")
	public Class9_Sub4_Sub2_Sub5(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt10236 == 1, Static353.method5741(arg12, arg13));
		this.aClass363_4 = new Class363(arg0, arg1, arg12, arg13, super.aByte135, arg3, this, arg7, arg14);
		this.aBoolean758 = arg1.anInt10253 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return this.aClass243_6;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		this.aClass363_4.method8373(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static557.method7835();
		}
		return this.aClass363_4.method8382();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		this.aClass363_4.method8371(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aClass363_4.anInt10317;
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return this.aClass363_4.anInt10304;
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!mg;B)V")
	public void method7833(@OriginalArg(0) Class200 arg0) {
		this.aClass363_4.method8380(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aClass363_4.anInt10325;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class92 local14 = this.aClass363_4.method8376(false, 2048, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(26) Class115 local26 = arg0.method6156();
		local26.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(40) Class9_Sub2 local40 = Static167.method3172(1, this.aBoolean758);
		this.aClass363_4.method8374(local14, super.aShort117, super.aShort114, local26, true, super.aShort115, arg0, super.aShort116);
		if (Static423.aBoolean622) {
			local14.method7057(local26, local40.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			local14.method7053(local26, local40.aClass9_Sub6Array1[0], 0);
		}
		if (this.aClass363_4.aClass9_Sub5_8 != null) {
			@Pc(86) Class257 local86 = this.aClass363_4.aClass9_Sub5_8.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local86, Static32.anInt849);
			} else {
				arg0.method6183(local86);
			}
		}
		this.aBoolean757 = local14.F() || this.aClass363_4.aClass9_Sub5_8 != null;
		if (this.aClass243_6 == null) {
			this.aClass243_6 = Static126.method2627(super.anInt10365, super.anInt10360, local14, super.anInt10357);
		} else {
			Static499.method7244(super.anInt10365, super.anInt10360, super.anInt10357, local14, this.aClass243_6);
		}
		return local40;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aClass363_4.method8377();
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		@Pc(12) Class92 local12 = this.aClass363_4.method8376(true, 262144, arg0, true);
		if (local12 != null) {
			@Pc(17) Class115 local17 = arg0.method6156();
			local17.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			this.aClass363_4.method8374(local12, super.aShort117, super.aShort114, local17, false, super.aShort115, arg0, super.aShort116);
		}
	}

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass363_4.method8378();
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class92 local17 = this.aClass363_4.method8376(false, 131072, arg1, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class115 local24 = arg1.method6156();
			local24.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			return Static423.aBoolean622 ? local17.method7061(arg0, arg2, local24, false, 0, Static32.anInt849) : local17.method7067(arg0, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
	}

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aBoolean757;
	}
}
