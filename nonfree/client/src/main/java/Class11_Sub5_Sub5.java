import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class11_Sub5_Sub5 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!us", name = "y", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_140 = new Class79(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!us", name = "R", descriptor = "Lclient!s;")
	public static final Class210 aClass210_13 = new Class210(14, 14);

	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!rt;")
	public static final Class209 aClass209_4 = new Class209("WIP", 2);

	@OriginalMember(owner = "client!us", name = "J", descriptor = "Lclient!ql;")
	public final Class192 aClass192_4;

	@OriginalMember(owner = "client!us", name = "E", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIIIIIII)V", line = 241)
	public Class11_Sub5_Sub5(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1352 == 1, Static307.method5654(arg13, arg12));
		this.aClass192_4 = new Class192(arg0, arg1, arg12, arg13, super.aByte78, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean459 = arg1.anInt1334 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 3)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 13)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 25)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_4.method4942(true, false, arg0, 1024, super.anInt6770, super.anInt6768);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = arg0.method2810();
		local23.method3923(super.anInt6768, super.anInt6769, super.anInt6770);
		@Pc(38) Class12_Sub4 local38 = null;
		if (this.aBoolean459) {
			local38 = Static138.method2708(1);
		}
		if (this.aClass192_4.aClass12_Sub5_5 == null) {
			local16.method3836(local23, local38 == null ? null : local38.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(54) Class224 local54 = this.aClass192_4.aClass12_Sub5_5.method4359();
			arg0.method2826(local16, local54, local23, local38 == null ? null : local38.aClass12_Sub2Array1[0]);
		}
		this.aClass192_4.method4936(arg0, super.aShort101, local16, super.aShort103, super.aShort102, true, super.aShort104);
		return local38;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I", line = 62)
	@Override
	public int method6082() {
		return this.aClass192_4.anInt5421;
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(I)I", line = 89)
	@Override
	public int method6081() {
		return this.aClass192_4.method4937();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z", line = 105)
	@Override
	public boolean method6087() {
		return this.aClass192_4.method4939();
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V", line = 117)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I", line = 128)
	@Override
	public int method6085() {
		return this.aClass192_4.anInt5417;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!wm;B)V", line = 139)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_4.method4942(true, true, arg0, 131072, super.anInt6770, super.anInt6768);
		if (local16 != null) {
			this.aClass192_4.method4936(arg0, super.aShort101, local16, super.aShort103, super.aShort102, false, super.aShort104);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!wm;)V", line = 172)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		this.aClass192_4.method4931(arg0);
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)I", line = 183)
	@Override
	public int method6086() {
		return this.aClass192_4.anInt5420;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 195)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(23) Class31 local23 = this.aClass192_4.method4942(false, false, arg2, 65536, super.anInt6770, super.anInt6768);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class14 local30 = arg2.method2810();
			local30.method3923(super.anInt6768, super.anInt6769, super.anInt6770);
			return local23.method3821(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 214)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_4.method4942(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!wm;I)V", line = 225)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		this.aClass192_4.method4941(arg0);
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(I)Z", line = 251)
	@Override
	public boolean method6077() {
		return false;
	}
}
