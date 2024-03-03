import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	public static int anInt3710 = -1;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!h;")
	public static final Class89 aClass89_153 = new Class89(28, 6);

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!ql;")
	public final Class192 aClass192_2;

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "Z")
	private final boolean aBoolean240;

	static {
		new Class79("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZII)V", line = 168)
	public Class11_Sub2_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean109, arg1.aBoolean108);
		this.aClass192_2 = new Class192(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean240 = arg1.anInt1334 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!wm;)V", line = 3)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		this.aClass192_2.method4931(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V", line = 54)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I", line = 67)
	@Override
	public int method6085() {
		return this.aClass192_2.anInt5417;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I", line = 78)
	@Override
	public int method6086() {
		return this.aClass192_2.anInt5420;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 89)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(16) Class31 local16 = this.aClass192_2.method4942(false, false, arg2, 65536, super.anInt3704, super.anInt3706);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class14 local23 = arg2.method2810();
			local23.method3923(super.anInt3706, super.anInt3702, super.anInt3704);
			return local16.method3821(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Z", line = 110)
	@Override
	public boolean method6087() {
		return this.aClass192_2.method4939();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 122)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wm;B)V", line = 140)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_2.method4942(true, true, arg0, 131072, super.anInt3704, super.anInt3706);
		if (local16 != null) {
			this.aClass192_2.method4936(arg0, super.anInt3704 >> 7, local16, super.anInt3706 >> 7, super.anInt3704 >> 7, false, super.anInt3706 >> 7);
		}
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z", line = 156)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 179)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_2.method4942(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I", line = 205)
	@Override
	public int method6082() {
		return this.aClass192_2.anInt5421;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 230)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 241)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_2.method4942(true, false, arg0, 1024, super.anInt3704, super.anInt3706);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = arg0.method2810();
		local23.method3923(super.anInt3706, super.anInt3702, super.anInt3704);
		@Pc(38) Class12_Sub4 local38 = null;
		if (this.aBoolean240) {
			local38 = Static138.method2708(1);
		}
		if (this.aClass192_2.aClass12_Sub5_5 == null) {
			local16.method3836(local23, local38 == null ? null : local38.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(68) Class224 local68 = this.aClass192_2.aClass12_Sub5_5.method4359();
			arg0.method2826(local16, local68, local23, local38 == null ? null : local38.aClass12_Sub2Array1[0]);
		}
		this.aClass192_2.method4936(arg0, super.anInt3704 >> 7, local16, super.anInt3706 >> 7, super.anInt3704 >> 7, true, super.anInt3706 >> 7);
		return local38;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wm;I)V", line = 283)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		this.aClass192_2.method4941(arg0);
	}
}
