import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class62_Sub4_Sub1 extends Class62_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "Lclient!ee;")
	public final Class49 aClass49_4;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "Z")
	private final boolean aBoolean547;

	static {
		new Class93("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIIIIZI)V")
	public Class62_Sub4_Sub1(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static348.method5950(arg3, arg2));
		this.aClass49_4 = new Class49(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt6403, super.anInt6410, arg9, arg10);
		this.aBoolean547 = arg1.anInt3115 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aClass49_4.anInt1530;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		@Pc(21) Class7 local21 = this.aClass49_4.method1575(true, 131072, arg0, super.anInt6410, true, super.anInt6403);
		if (local21 != null) {
			this.aClass49_4.method1576(super.anInt6410 >> 7, super.anInt6403 >> 7, super.anInt6410 >> 7, false, arg0, local21, super.anInt6403 >> 7);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(16) Class7 local16 = this.aClass49_4.method1575(false, 1024, arg0, super.anInt6410, true, super.anInt6403);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class133 local28 = arg0.method4244();
		local28.method4324(super.anInt6403, super.anInt6402, super.anInt6410);
		@Pc(38) Class55_Sub3 local38 = null;
		if (this.aBoolean547) {
			local38 = Static241.method4172(1);
		}
		if (this.aClass49_4.aClass55_Sub7_1 == null) {
			local16.method1441(local28, local38 == null ? null : local38.aClass55_Sub4Array1[0], 0);
		} else {
			@Pc(68) Class75 local68 = this.aClass49_4.aClass55_Sub7_1.method4034();
			arg0.method4245(local16, local68, local28, local38 == null ? null : local38.aClass55_Sub4Array1[0]);
		}
		this.aClass49_4.method1576(super.anInt6410 >> 7, super.anInt6403 >> 7, super.anInt6410 >> 7, true, arg0, local16, super.anInt6403 >> 7);
		return local38;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		this.aClass49_4.method1584(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.aClass49_4.method1575(false, arg1, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aClass49_4.anInt1541;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aClass49_4.anInt1517;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class7 local16 = this.aClass49_4.method1575(false, 65536, arg1, super.anInt6410, false, super.anInt6403);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class133 local23 = arg1.method4244();
			local23.method4324(super.anInt6403, super.anInt6402, super.anInt6410);
			return local16.method1407(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		this.aClass49_4.method1571(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aClass49_4.method1586();
	}
}
