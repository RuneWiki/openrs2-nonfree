import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!wu;")
	public static Class380 aClass380_135;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray48;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Ljava/awt/Image;")
	public static Image anImage17;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_7 = new Class94(true);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!wu;BI)Lclient!oq;")
	public static Class256 method8590(@OriginalArg(0) Class380 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte[] local15 = arg0.method8616(arg1);
		return local15 == null ? null : new Class256(local15);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method8592(@OriginalArg(0) String arg0) {
		Static443.method6042("", 0, "", arg0, "", 4);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!mr;)[Lclient!ln;")
	public static Class210[] method8594(@OriginalArg(1) Class226 arg0) {
		if (!arg0.method4840()) {
			return new Class210[0];
		}
		@Pc(16) Class108 local16 = arg0.method4855();
		while (local16.anInt2766 == 0) {
			Static444.method6061(10L);
		}
		if (local16.anInt2766 == 2) {
			return new Class210[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject6;
		@Pc(43) Class210[] local43 = new Class210[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(59) Class210 local59 = new Class210();
			local43[local45] = local59;
			local59.anInt5212 = local37[local45 << 2];
			local59.anInt5208 = local37[(local45 << 2) + 1];
			local59.anInt5211 = local37[(local45 << 2) + 2];
			local59.anInt5213 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
