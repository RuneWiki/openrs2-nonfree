import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	public static int anInt60;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "Lclient!bc;")
	public static final Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "Lclient!kj;")
	public static Class133 aClass133_1 = null;

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
	public static int anInt65 = 2;

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
	public static final int anInt67 = 1338;

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
	public static int anInt68 = 0;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)I")
	public static int method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(30) int local30 = (local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local12 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return (((arg0 & 0xFF00) * local35 & 0xFF0000 | local35 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!oa;B)I")
	public static int method57(@OriginalArg(0) Class28_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt4408;
		@Pc(17) Class36 local17 = arg0.method4014();
		if (arg0.aBoolean340) {
			local8 = arg0.anInt4383;
		} else if (arg0.anInt4333 == local17.anInt684 || local17.anInt665 == arg0.anInt4333 || arg0.anInt4333 == local17.anInt696 || arg0.anInt4333 == local17.anInt659) {
			local8 = arg0.anInt4384;
		} else if (local17.anInt686 == arg0.anInt4333 || local17.anInt664 == arg0.anInt4333 || arg0.anInt4333 == local17.anInt685 || local17.anInt697 == arg0.anInt4333) {
			local8 = arg0.anInt4395;
		}
		return local8;
	}
}
