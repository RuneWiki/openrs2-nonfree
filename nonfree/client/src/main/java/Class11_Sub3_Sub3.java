import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class11_Sub3_Sub3 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "Lclient!ql;")
	public final Class192 aClass192_3;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "Z")
	private final boolean aBoolean428;

	static {
		new Class79("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		new Class79(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIIIIII)V", line = 53)
	public Class11_Sub3_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static221.method4122(arg11, arg12));
		this.aClass192_3 = new Class192(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean428 = arg1.anInt1334 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 3)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(16) Class31 local16 = this.aClass192_3.method4942(false, false, arg2, 65536, super.anInt6330, super.anInt6332);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class14 local29 = arg2.method2810();
			local29.method3923(super.anInt6335 + super.anInt6332, super.anInt6336, super.anInt6338 + super.anInt6330);
			return local16.method3821(arg0, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)Z", line = 27)
	@Override
	public boolean method6087() {
		return this.aClass192_3.method4939();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I", line = 41)
	@Override
	public int method6082() {
		return this.aClass192_3.anInt5421;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 63)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)I", line = 96)
	@Override
	public int method6086() {
		return this.aClass192_3.anInt5420;
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "(I)I", line = 184)
	@Override
	public int method5749() {
		return this.aClass192_3.method4937();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 195)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_3.method4942(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!wm;I)V", line = 214)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		this.aClass192_3.method4941(arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 226)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_3.method4942(true, false, arg0, 1024, super.anInt6330, super.anInt6332);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = arg0.method2810();
		local23.method3923(super.anInt6332 + super.anInt6335, super.anInt6336, super.anInt6338 + super.anInt6330);
		@Pc(47) Class12_Sub4 local47 = null;
		if (this.aBoolean428) {
			local47 = Static138.method2708(1);
		}
		if (this.aClass192_3.aClass12_Sub5_5 == null) {
			local16.method3836(local23, local47 == null ? null : local47.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(63) Class224 local63 = this.aClass192_3.aClass12_Sub5_5.method4359();
			arg0.method2826(local16, local63, local23, local47 == null ? null : local47.aClass12_Sub2Array1[0]);
		}
		this.aClass192_3.method4936(arg0, super.anInt6330 >> 7, local16, super.anInt6332 >> 7, super.anInt6330 >> 7, true, super.anInt6332 >> 7);
		return local47;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I", line = 274)
	@Override
	public int method6085() {
		return this.aClass192_3.anInt5417;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!wm;)V", line = 285)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		this.aClass192_3.method4931(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!wm;B)V", line = 298)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		@Pc(21) Class31 local21 = this.aClass192_3.method4942(true, false, arg0, 131072, super.anInt6330, super.anInt6332);
		if (local21 != null) {
			this.aClass192_3.method4936(arg0, super.anInt6330 >> 7, local21, super.anInt6332 >> 7, super.anInt6330 >> 7, false, super.anInt6332 >> 7);
		}
	}
}
