import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class9_Sub4_Sub3_Sub2 extends Class9_Sub4_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!ps", name = "Y", descriptor = "Lclient!oia;")
	private Class243 aClass243_4;

	@OriginalMember(owner = "client!ps", name = "W", descriptor = "Z")
	private boolean aBoolean646 = false;

	@OriginalMember(owner = "client!ps", name = "X", descriptor = "Lclient!vo;")
	public final Class363 aClass363_2;

	@OriginalMember(owner = "client!ps", name = "K", descriptor = "Z")
	private final boolean aBoolean645;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZII)V")
	public Class9_Sub4_Sub3_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt10216);
		this.aClass363_2 = new Class363(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean645 = arg1.anInt10253 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		this.aClass363_2.method8373(arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		this.aClass363_2.method8371(arg0);
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass363_2.method8378();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aClass363_2.anInt10317;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aClass363_2.method8377();
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aBoolean646;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return this.aClass243_4;
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class92 local12 = this.aClass363_2.method8376(false, 131072, arg1, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class115 local26 = arg1.method6156();
			local26.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			return Static423.aBoolean622 ? local12.method7061(arg0, arg2, local26, false, 0, Static32.anInt849) : local12.method7067(arg0, arg2, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!mg;B)V")
	public void method6805(@OriginalArg(0) Class200 arg0) {
		this.aClass363_2.method8380(arg0);
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		@Pc(20) Class92 local20 = this.aClass363_2.method8376(true, 262144, arg0, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10360 >> 9;
		@Pc(32) int local32 = super.anInt10357 >> 9;
		@Pc(35) Class115 local35 = arg0.method6156();
		local35.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		this.aClass363_2.method8374(local20, local27, local32, local35, false, local27, arg0, local32);
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8438();
		}
		return this.aClass363_2.method8382();
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aClass363_2.anInt10325;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class92 local14 = this.aClass363_2.method8376(false, 2048, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class115 local21 = arg0.method6156();
		local21.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(35) Class9_Sub2 local35 = Static167.method3172(1, this.aBoolean645);
		@Pc(40) int local40 = super.anInt10360 >> 9;
		@Pc(53) int local53 = super.anInt10357 >> 9;
		this.aClass363_2.method8374(local14, local40, local53, local21, true, local40, arg0, local53);
		if (Static423.aBoolean622) {
			local14.method7057(local21, local35.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			local14.method7053(local21, local35.aClass9_Sub6Array1[0], 0);
		}
		if (this.aClass363_2.aClass9_Sub5_8 != null) {
			@Pc(95) Class257 local95 = this.aClass363_2.aClass9_Sub5_8.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local95, Static32.anInt849);
			} else {
				arg0.method6183(local95);
			}
		}
		this.aBoolean646 = local14.F() || this.aClass363_2.aClass9_Sub5_8 != null;
		if (this.aClass243_4 == null) {
			this.aClass243_4 = Static126.method2627(super.anInt10365, super.anInt10360, local14, super.anInt10357);
		} else {
			Static499.method7244(super.anInt10365, super.anInt10360, super.anInt10357, local14, this.aClass243_4);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return this.aClass363_2.anInt10304;
	}
}
