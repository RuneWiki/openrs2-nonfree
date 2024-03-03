import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	public static int anInt327 = 0;

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "Lclient!ql;")
	public final Class192 aClass192_1;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Z")
	private final boolean aBoolean25;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIII)V", line = 87)
	public Class11_Sub1_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static165.method3350(arg8, arg9));
		this.aClass192_1 = new Class192(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt3482, super.anInt3481, arg7, arg10);
		this.aBoolean25 = arg1.anInt1334 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)Z", line = 5)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I", line = 17)
	@Override
	public int method6085() {
		return this.aClass192_1.anInt5417;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I", line = 30)
	@Override
	public int method6082() {
		return this.aClass192_1.anInt5421;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 43)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_1.method4942(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!wm;)V", line = 54)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		this.aClass192_1.method4931(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!wm;I)V", line = 65)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		this.aClass192_1.method4941(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method6087() {
		return this.aClass192_1.method4939();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)I", line = 98)
	@Override
	public int method6086() {
		return this.aClass192_1.anInt5420;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 113)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(21) Class31 local21 = this.aClass192_1.method4942(false, false, arg2, 65536, super.anInt3481, super.anInt3482);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class14 local28 = arg2.method2810();
			local28.method3923(super.anInt3482, super.anInt3480, super.anInt3481);
			return local21.method3821(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 133)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!wm;B)V", line = 144)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_1.method4942(true, true, arg0, 131072, super.anInt3481, super.anInt3482);
		if (local16 != null) {
			this.aClass192_1.method4936(arg0, super.anInt3481 >> 7, local16, super.anInt3482 >> 7, super.anInt3481 >> 7, false, super.anInt3482 >> 7);
		}
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V", line = 164)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 181)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 194)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class31 local16 = this.aClass192_1.method4942(true, false, arg0, 1024, super.anInt3481, super.anInt3482);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class14 local30 = arg0.method2810();
		local30.method3923(super.anInt3482, super.anInt3480, super.anInt3481);
		@Pc(40) Class12_Sub4 local40 = null;
		if (this.aBoolean25) {
			local40 = Static138.method2708(1);
		}
		if (this.aClass192_1.aClass12_Sub5_5 == null) {
			local16.method3836(local30, local40 == null ? null : local40.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(70) Class224 local70 = this.aClass192_1.aClass12_Sub5_5.method4359();
			arg0.method2826(local16, local70, local30, local40 == null ? null : local40.aClass12_Sub2Array1[0]);
		}
		this.aClass192_1.method4936(arg0, super.anInt3481 >> 7, local16, super.anInt3482 >> 7, super.anInt3481 >> 7, true, super.anInt3482 >> 7);
		return local40;
	}
}
