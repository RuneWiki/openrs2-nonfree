import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class108 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public int anInt3280;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public int anInt3287;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIZ)Lclient!tb;")
	public Class59_Sub2 method2593(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(23) Class59_Sub2 local23 = (Class59_Sub2) Static250.aClass33_36.method841((long) ((arg1 ? 262144 : 0) | this.anInt3287 | arg0 << 16));
		if (local23 != null) {
			return local23;
		}
		Static22.aClass98_10.method2391(this.anInt3287);
		local23 = Static124.method2086(Static22.aClass98_10, this.anInt3287);
		if (local23 != null) {
			local23.method3800(Static151.anInt3051, Static22.anInt425, Static170.anInt3384);
			local23.anInt4747 = local23.anInt4748;
			local23.anInt4749 = local23.anInt4753;
			if (arg1) {
				local23.method3797();
			}
			for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
				local23.method3795();
			}
			Static250.aClass33_36.method845(local23, (long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.anInt3287));
		}
		return local23;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILclient!p;)V")
	private void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub17 arg2) {
		if (arg0 == 1) {
			this.anInt3287 = arg2.method1837();
		} else if (arg0 == 2) {
			this.anInt3280 = arg2.method1835();
		} else if (arg0 == 3) {
			this.aBoolean206 = true;
		} else if (arg0 == 4) {
			this.anInt3287 = -1;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!p;B)V")
	public void method2596(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1874();
			if (local5 == 0) {
				return;
			}
			this.method2594(local5, arg0, arg1);
		}
	}
}
