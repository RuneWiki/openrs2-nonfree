import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!ra;")
	public static Class170 aClass170_116;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "Z")
	public static boolean aBoolean462;

	@OriginalMember(owner = "client!is", name = "r", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString354 = "Examine";

	@OriginalMember(owner = "client!is", name = "q", descriptor = "[I")
	public static final int[] anIntArray528 = new int[4];

	@OriginalMember(owner = "client!is", name = "F", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!is", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString355 = "glow1:";

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!nj;)I")
	public static int method5471(@OriginalArg(1) Class25_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4085;
		@Pc(12) Class33 local12 = arg0.method4659();
		if (arg0.aBoolean405) {
			local8 = arg0.anInt4093;
		} else if (arg0.anInt5276 == local12.anInt950 || local12.anInt965 == arg0.anInt5276 || arg0.anInt5276 == local12.anInt982 || local12.anInt971 == arg0.anInt5276) {
			local8 = arg0.anInt4082;
		} else if (arg0.anInt5276 == local12.anInt973 || arg0.anInt5276 == local12.anInt961 || local12.anInt954 == arg0.anInt5276 || local12.anInt952 == arg0.anInt5276) {
			local8 = arg0.anInt4066;
		}
		return local8;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ra;ZLclient!ra;)V")
	public static void method5477(@OriginalArg(0) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static312.aClass170_108 = arg0;
		Static118.aClass170_53 = arg1;
	}
}
