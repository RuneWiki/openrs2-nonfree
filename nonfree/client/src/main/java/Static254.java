import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Lclient!ha;")
	public static Class35 aClass35_21;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!hba;")
	public static final Class111 aClass111_2 = new Class111();

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!uf;)[Lclient!ql;")
	public static Class237[] method3979(@OriginalArg(1) Class283 arg0) {
		if (!arg0.method7183()) {
			return new Class237[0];
		}
		@Pc(16) Class20 local16 = arg0.method7165();
		while (local16.anInt593 == 0) {
			Static379.method5233(10L);
		}
		if (local16.anInt593 == 2) {
			return new Class237[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject2;
		@Pc(43) Class237[] local43 = new Class237[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class237 local51 = new Class237();
			local43[local45] = local51;
			local51.anInt7570 = local37[local45 << 2];
			local51.anInt7571 = local37[(local45 << 2) + 1];
			local51.anInt7573 = local37[(local45 << 2) + 2];
			local51.anInt7575 = local37[(local45 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void method3981() {
		if (Static530.aClass20_9 == null) {
			return;
		}
		if (Static530.aClass20_9.anInt593 == 1) {
			Static530.aClass20_9 = null;
			return;
		}
		if (Static530.aClass20_9.anInt593 == 2) {
			Static504.method7418(Static519.aClass283_5, 2, Static343.aString137);
			Static530.aClass20_9 = null;
			return;
		}
	}
}
