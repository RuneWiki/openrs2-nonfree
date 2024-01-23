import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class52 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public int anInt1562;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public int anInt1570;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!aj;II)V")
	private void method1144(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt1562 = arg1.method2375();
		} else if (arg2 == 2) {
			this.anInt1570 = arg1.method2323();
		} else if (arg2 == 3) {
			this.aBoolean111 = true;
		} else if (arg2 == 4) {
			this.anInt1562 = -1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!aj;II)V")
	public void method1146(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method2334();
			if (local18 == 0) {
				return;
			}
			this.method1144(arg1, arg0, local18);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZI)Lclient!wk;")
	public Class43_Sub2 method1150(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class43_Sub2 local23 = (Class43_Sub2) Static147.aClass61_24.method1384((long) ((arg0 ? 262144 : 0) | this.anInt1562 | arg1 << 16));
		if (local23 != null) {
			return local23;
		}
		Static265.aClass132_89.method3166(this.anInt1562);
		local23 = Static182.method2785(Static265.aClass132_89, this.anInt1562);
		if (local23 != null) {
			local23.method4306(Static15.anInt424, Static127.anInt2560, Static192.anInt3879);
			local23.anInt5713 = local23.anInt5709;
			local23.anInt5711 = local23.anInt5710;
			if (arg0) {
				local23.method4305();
			}
			for (@Pc(71) int local71 = 0; local71 < arg1; local71++) {
				local23.method4307();
			}
			Static147.aClass61_24.method1377((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt1562), local23);
		}
		return local23;
	}
}
