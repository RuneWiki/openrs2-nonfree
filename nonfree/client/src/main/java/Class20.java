import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class20 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!lf;II)V")
	private void method500(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt559 = arg1.method1386();
		} else if (arg0 == 2) {
			this.anInt550 = arg1.method1352();
		} else if (arg0 == 3) {
			this.aBoolean23 = true;
		} else if (arg0 == 4) {
			this.anInt559 = -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZBI)Lclient!fe;")
	public Class23_Sub1 method502(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(28) Class23_Sub1 local28 = (Class23_Sub1) Static306.aClass187_153.method4527((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt559));
		if (local28 != null) {
			return local28;
		}
		Static279.aClass121_123.method3140(this.anInt559);
		local28 = Static125.method2196(Static279.aClass121_123, this.anInt559);
		if (local28 != null) {
			local28.method1499(Static310.anInt5668, Static308.anInt5494, Static225.anInt4140);
			local28.anInt4476 = local28.anInt4473;
			local28.anInt4468 = local28.anInt4469;
			if (arg0) {
				local28.method1495();
			}
			for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
				local28.method1491();
			}
			Static306.aClass187_153.method4524((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt559), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!lf;)V")
	public void method508(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1378();
			if (local9 == 0) {
				return;
			}
			this.method500(local9, arg1, arg0);
		}
	}
}
