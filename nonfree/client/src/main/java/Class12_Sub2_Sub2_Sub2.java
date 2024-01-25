import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class12_Sub2_Sub2_Sub2 extends Class12_Sub2_Sub2 implements Interface14 {

	@OriginalMember(owner = "client!jda", name = "P", descriptor = "Lclient!ifa;")
	private Class157 aClass157_3;

	@OriginalMember(owner = "client!jda", name = "R", descriptor = "Z")
	private boolean aBoolean306 = false;

	@OriginalMember(owner = "client!jda", name = "N", descriptor = "Lclient!nq;")
	public final Class244 aClass244_2;

	@OriginalMember(owner = "client!jda", name = "B", descriptor = "Z")
	private final boolean aBoolean305;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIIIZII)V")
	public Class12_Sub2_Sub2_Sub2(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5262);
		this.aClass244_2 = new Class244(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean305 = arg1.anInt5275 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return this.aClass157_3;
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(12) Class33 local12 = this.aClass244_2.method5152(false, arg2, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class25 local19 = arg2.method6862();
			local19.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			return Static286.aBoolean372 ? local12.method7201(arg0, arg1, local19, false, Static578.anInt9366) : local12.method7193(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aBoolean306;
	}

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)I")
	@Override
	public int method7093() {
		return this.aClass244_2.anInt6157;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7089(@OriginalArg(0) Class162 arg0) {
		this.aClass244_2.method5151(arg0);
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return this.aClass244_2.method5144();
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
	@Override
	public int method7091() {
		return this.aClass244_2.anInt6144;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		@Pc(14) Class33 local14 = this.aClass244_2.method5152(true, arg0, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class25 local21 = arg0.method6862();
		local21.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		@Pc(31) Class12_Sub3 local31 = null;
		if (this.aBoolean305) {
			local31 = Static443.method5793(1);
		}
		@Pc(43) int local43 = super.anInt9374 >> 9;
		@Pc(54) int local54 = super.anInt9375 >> 9;
		this.aClass244_2.method5149(local54, local43, local43, arg0, local54, local21, true, local14);
		if (Static286.aBoolean372) {
			local14.method7183(local21, local31 == null ? null : local31.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
		} else {
			local14.method7192(local21, local31 == null ? null : local31.aClass12_Sub6Array1[0], 0);
		}
		if (this.aClass244_2.aClass12_Sub4_4 != null) {
			@Pc(104) Class339 local104 = this.aClass244_2.aClass12_Sub4_4.method4130();
			if (Static286.aBoolean372) {
				arg0.method6883(local104, Static578.anInt9366);
			} else {
				arg0.method6860(local104);
			}
		}
		this.aBoolean306 = local14.LA() || this.aClass244_2.aClass12_Sub4_4 != null;
		if (this.aClass157_3 == null) {
			this.aClass157_3 = Static242.method3444(super.anInt9375, super.anInt9373, local14, super.anInt9374);
		} else {
			Static506.method6596(this.aClass157_3, super.anInt9374, super.anInt9373, super.anInt9375, local14);
		}
		return local31;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	@Override
	public void method7088() {
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
		@Pc(12) Class33 local12 = this.aClass244_2.method5152(true, arg0, true, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt9374 >> 9;
		@Pc(24) int local24 = super.anInt9375 >> 9;
		@Pc(27) Class25 local27 = arg0.method6862();
		local27.NA(super.anInt9374, super.anInt9373, super.anInt9375);
		this.aClass244_2.method5149(local24, local19, local19, arg0, local24, local27, false, local12);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7090(@OriginalArg(1) Class162 arg0) {
		this.aClass244_2.method5142(arg0);
	}

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.aClass244_2.method5143((byte) 108) : 67;
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7092() {
		return this.aClass244_2.method5147();
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)I")
	@Override
	public int method7094() {
		return this.aClass244_2.anInt6153;
	}
}
