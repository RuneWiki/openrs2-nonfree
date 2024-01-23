import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class56 {

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	public int anInt2638;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	public int anInt2641;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIZ)Lclient!ge;")
	public Class7_Sub1 method2030(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(28) Class7_Sub1 local28 = (Class7_Sub1) Static166.aClass79_25.method2483((long) (arg0 << 16 | this.anInt2641 | (arg1 ? 262144 : 0)));
		if (local28 != null) {
			return local28;
		}
		Static110.aClass51_37.method1868(this.anInt2641);
		local28 = Static36.method449(Static110.aClass51_37, this.anInt2641);
		if (local28 != null) {
			local28.method1529(Static28.anInt888, Static264.anInt5542, Static149.anInt3578);
			local28.anInt2105 = local28.anInt2107;
			local28.anInt2102 = local28.anInt2109;
			if (arg1) {
				local28.method1536();
			}
			for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
				local28.method1528();
			}
			Static166.aClass79_25.method2486(local28, (long) ((arg1 ? 262144 : 0) | this.anInt2641 | arg0 << 16));
		}
		return local28;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!ql;IB)V")
	public void method2032(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1772();
			if (local5 == 0) {
				return;
			}
			this.method2033(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILclient!ql;)V")
	private void method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub13 arg2) {
		if (arg0 == 1) {
			this.anInt2641 = arg2.method1764();
		} else if (arg0 == 2) {
			this.anInt2638 = arg2.method1773();
		} else if (arg0 == 3) {
			this.aBoolean143 = true;
		} else if (arg0 == 4) {
			this.anInt2641 = -1;
		}
	}
}
