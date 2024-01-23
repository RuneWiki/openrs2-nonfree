import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class79 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZI)Lclient!wi;")
	public Class103_Sub2 method1788(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class103_Sub2 local23 = (Class103_Sub2) Static134.aClass169_75.method4017((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt2177));
		if (local23 != null) {
			return local23;
		}
		Static2.aClass138_1.method3340(this.anInt2177);
		local23 = Static206.method3274(Static2.aClass138_1, this.anInt2177);
		if (local23 != null) {
			local23.method4608(Static73.anInt1414, Static61.anInt1210, Static30.anInt553);
			local23.anInt5856 = local23.anInt5858;
			local23.anInt5860 = local23.anInt5857;
			if (arg0) {
				local23.method4602();
			}
			for (@Pc(69) int local69 = 0; local69 < arg1; local69++) {
				local23.method4603();
			}
			Static134.aClass169_75.method4016(local23, (long) (this.anInt2177 | arg1 << 16 | (arg0 ? 262144 : 0)));
		}
		return local23;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLclient!sb;)V")
	public void method1791(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2595();
			if (local5 == 0) {
				return;
			}
			this.method1794(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBLclient!sb;)V")
	private void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt2177 = arg2.method2593();
		} else if (arg0 == 2) {
			this.anInt2173 = arg2.method2588();
		} else if (arg0 == 3) {
			this.aBoolean162 = true;
		} else if (arg0 == 4) {
			this.anInt2177 = -1;
		}
	}
}
