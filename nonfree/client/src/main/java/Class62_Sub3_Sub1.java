import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class62_Sub3_Sub1 extends Class62_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "Lclient!ee;")
	public final Class49 aClass49_2;

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "Z")
	private final boolean aBoolean256;

	static {
		new Class93("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIIIZI)V")
	public Class62_Sub3_Sub1(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean271, arg1.aBoolean279);
		this.aClass49_2 = new Class49(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean256 = arg1.anInt3115 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aClass49_2.method1586();
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aClass49_2.anInt1541;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		this.aClass49_2.method1584(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aClass49_2.anInt1530;
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aClass49_2.anInt1517;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		this.aClass49_2.method1571(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		@Pc(16) Class7 local16 = this.aClass49_2.method1575(true, 131072, arg0, super.anInt3045, true, super.anInt3044);
		if (local16 != null) {
			this.aClass49_2.method1576(super.anInt3045 >> 7, super.anInt3044 >> 7, super.anInt3045 >> 7, false, arg0, local16, super.anInt3044 >> 7);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(16) Class7 local16 = this.aClass49_2.method1575(false, 1024, arg0, super.anInt3045, true, super.anInt3044);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class133 local23 = arg0.method4244();
		local23.method4324(super.anInt3044, super.anInt3035, super.anInt3045);
		@Pc(33) Class55_Sub3 local33 = null;
		if (this.aBoolean256) {
			local33 = Static241.method4172(1);
		}
		if (this.aClass49_2.aClass55_Sub7_1 == null) {
			local16.method1441(local23, local33 == null ? null : local33.aClass55_Sub4Array1[0], 0);
		} else {
			@Pc(69) Class75 local69 = this.aClass49_2.aClass55_Sub7_1.method4034();
			arg0.method4245(local16, local69, local23, local33 == null ? null : local33.aClass55_Sub4Array1[0]);
		}
		this.aClass49_2.method1576(super.anInt3045 >> 7, super.anInt3044 >> 7, super.anInt3045 >> 7, true, arg0, local16, super.anInt3044 >> 7);
		return local33;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class7 local16 = this.aClass49_2.method1575(false, 65536, arg1, super.anInt3045, false, super.anInt3044);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class133 local28 = arg1.method4244();
			local28.method4324(super.anInt3044, super.anInt3035, super.anInt3045);
			return local16.method1407(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.aClass49_2.method1575(false, arg1, arg0, 0, false, 0);
	}
}
