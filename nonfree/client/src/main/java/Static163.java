import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "Lclient!m;")
	public static Class22 aClass22_6;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
	public static int anInt3578;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
	public static int anInt3580;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "[Lclient!di;")
	public static final Interface2[] anInterface2Array1 = new Interface2[75];

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(15, 0);
		local8.method4919();
		local8.anInt5680 = arg1;
		local8.anInt5686 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method3249() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static151.aClass167Array1[local1] = null;
		}
		Static231.anInt7332 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)Z")
	public static boolean method3252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static192.method3615(arg1, arg0) & Static8.method230(arg1, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!lp;I)[Lclient!uq;")
	public static Class294[] method3253(@OriginalArg(0) Class182 arg0) {
		if (!arg0.method4800()) {
			return new Class294[0];
		}
		@Pc(14) Class243 local14 = arg0.method4797();
		while (local14.anInt6905 == 0) {
			Static505.method7295(10L);
		}
		if (local14.anInt6905 == 2) {
			return new Class294[0];
		}
		@Pc(32) int[] local32 = (int[]) local14.anObject12;
		@Pc(43) Class294[] local43 = new Class294[local32.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(50) Class294 local50 = new Class294();
			local43[local45] = local50;
			local50.anInt8420 = local32[local45 << 2];
			local50.anInt8416 = local32[(local45 << 2) + 1];
			local50.anInt8412 = local32[(local45 << 2) + 2];
			local50.anInt8415 = local32[(local45 << 2) + 3];
		}
		return local43;
	}
}
