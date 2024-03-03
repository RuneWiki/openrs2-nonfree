import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I", line = 14)
	public static int method6274() {
		@Pc(15) Class19 local15 = Static177.aClass19_8;
		@Pc(17) boolean local17 = false;
		if (Class2_Sub10.anInt1760 != 0) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(100, 100);
			local17 = true;
			local15 = Static361.method2824(0, null, null, local26, 0);
		}
		@Pc(43) long local43 = Static190.method3686();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local15.method2855();
		}
		@Pc(72) int local72 = (int) (Static190.method3686() - local43);
		local15.method2870(100, 0, 0, -16777216, 100);
		if (local17) {
			local15.method2827();
		}
		return local72;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!nk;II)V", line = 59)
	public static void method6275(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2) {
		Class50.anInt1547 = arg0;
		Class194.anInt5486 = arg2;
		Class2_Sub22.aClass161_6 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZII)Lclient!we;", line = 91)
	public static Class2_Sub41 method6276(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub41) Class233.aClass4_136.method90(local12);
	}
}
