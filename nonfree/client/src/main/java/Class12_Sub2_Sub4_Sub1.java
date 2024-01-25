import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class12_Sub2_Sub4_Sub1 extends Class12_Sub2_Sub4 implements Interface14 {

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "Lclient!ifa;")
	private Class157 aClass157_2;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "client!iq", name = "T", descriptor = "Lclient!nq;")
	public final Class244 aClass244_1;

	@OriginalMember(owner = "client!iq", name = "V", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIIIZIIIII)V")
	public Class12_Sub2_Sub4_Sub1(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass244_1 = new Class244(arg0, arg1, arg10, arg11, super.aByte128, arg3, this, arg7, arg12);
		this.aBoolean296 = arg1.anInt5275 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			Static236.method3369();
		}
		return this.aClass244_1.method5143((byte) 108);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		@Pc(14) Class33 local14 = this.aClass244_1.method5152(true, arg0, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class25 local21 = arg0.method6862();
		local21.NA(super.anInt9374 + super.aShort61, super.anInt9373, super.aShort60 + super.anInt9375);
		@Pc(37) Class12_Sub3 local37 = null;
		if (this.aBoolean296) {
			local37 = Static443.method5793(1);
		}
		@Pc(55) int local55 = super.anInt9374 >> 9;
		@Pc(60) int local60 = super.anInt9375 >> 9;
		this.aClass244_1.method5149(local60, local55, local55, arg0, local60, local21, true, local14);
		if (Static286.aBoolean372) {
			local14.method7183(local21, local37 == null ? null : local37.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
		} else {
			local14.method7192(local21, local37 == null ? null : local37.aClass12_Sub6Array1[0], 0);
		}
		if (this.aClass244_1.aClass12_Sub4_4 != null) {
			@Pc(110) Class339 local110 = this.aClass244_1.aClass12_Sub4_4.method4130();
			if (Static286.aBoolean372) {
				arg0.method6883(local110, Static578.anInt9366);
			} else {
				arg0.method6860(local110);
			}
		}
		this.aBoolean295 = local14.LA() || this.aClass244_1.aClass12_Sub4_4 != null;
		if (this.aClass157_2 == null) {
			this.aClass157_2 = Static242.method3444(super.anInt9375, super.anInt9373, local14, super.anInt9374);
		} else {
			Static506.method6596(this.aClass157_2, super.anInt9374, super.anInt9373, super.anInt9375, local14);
		}
		return local37;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)I")
	@Override
	public int method7094() {
		return this.aClass244_1.anInt6153;
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7090(@OriginalArg(1) Class162 arg0) {
		this.aClass244_1.method5142(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public void method7088() {
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
	@Override
	public int method7091() {
		return this.aClass244_1.anInt6144;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
		@Pc(12) Class33 local12 = this.aClass244_1.method5152(true, arg0, false, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9374 >> 9;
		@Pc(28) int local28 = super.anInt9375 >> 9;
		@Pc(31) Class25 local31 = arg0.method6862();
		local31.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		this.aClass244_1.method5149(local28, local23, local23, arg0, local28, local31, false, local12);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.aClass244_1.method5144();
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return this.aClass157_2;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7089(@OriginalArg(0) Class162 arg0) {
		this.aClass244_1.method5151(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aClass244_1.anInt6157;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(12) Class33 local12 = this.aClass244_1.method5152(false, arg2, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class25 local19 = arg2.method6862();
			local19.NA(super.aShort61 + super.anInt9374, super.anInt9373, super.anInt9375 + super.aShort60);
			return Static286.aBoolean372 ? local12.method7201(arg0, arg1, local19, false, Static578.anInt9366) : local12.method7193(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aBoolean295;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aClass244_1.method5147();
	}
}
