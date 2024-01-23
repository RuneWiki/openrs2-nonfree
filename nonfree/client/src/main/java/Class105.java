import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class105 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public int anInt2843;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public int anInt2845;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!jj;)V")
	public void method2363(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method3122();
			if (local9 == 0) {
				return;
			}
			this.method2368(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZB)Lclient!rg;")
	public Class48_Sub2 method2365(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(23) Class48_Sub2 local23 = (Class48_Sub2) Static150.aClass31_24.method852((long) (this.anInt2845 | arg0 << 16 | (arg1 ? 262144 : 0)));
		if (local23 != null) {
			return local23;
		}
		Static271.aClass7_217.method242(this.anInt2845);
		local23 = Static168.method2554(Static271.aClass7_217, this.anInt2845);
		if (local23 != null) {
			local23.method3621(Static8.anInt240, Static1.anInt8, Static25.anInt2863);
			local23.anInt4749 = local23.anInt4746;
			local23.anInt4745 = local23.anInt4754;
			if (arg1) {
				local23.method3628();
			}
			for (@Pc(69) int local69 = 0; local69 < arg0; local69++) {
				local23.method3625();
			}
			Static150.aClass31_24.method851(local23, (long) (this.anInt2845 | arg0 << 16 | (arg1 ? 262144 : 0)));
		}
		return local23;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!jj;BII)V")
	private void method2368(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2845 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt2843 = arg0.method3109();
		} else if (arg1 == 3) {
			this.aBoolean213 = true;
		} else if (arg1 == 4) {
			this.anInt2845 = -1;
		}
	}
}
