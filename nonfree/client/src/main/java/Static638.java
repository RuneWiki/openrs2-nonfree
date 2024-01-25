import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static int anInt10171;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
	public static boolean aBoolean726;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "D")
	public static double aDouble37;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_15 = new Class311("", 17);

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	public static int anInt10172 = 104;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_148 = new Class200(65, 6);

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "[Lclient!gba;")
	public static final Class3_Sub4_Sub8[] aClass3_Sub4_Sub8Array4 = new Class3_Sub4_Sub8[14];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!l;)I")
	public static int method8714(@OriginalArg(1) Class4_Sub1_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt5827;
		@Pc(14) Class143 local14 = arg0.method5058();
		if (arg0.anInt5743 == -1 || arg0.aBoolean404) {
			local8 = arg0.anInt5808;
		} else if (local14.anInt4187 == arg0.anInt5743 || local14.anInt4194 == arg0.anInt5743 || local14.anInt4186 == arg0.anInt5743 || local14.anInt4182 == arg0.anInt5743) {
			local8 = arg0.anInt5807;
		} else if (arg0.anInt5743 == local14.anInt4171 || local14.anInt4170 == arg0.anInt5743 || local14.anInt4183 == arg0.anInt5743 || arg0.anInt5743 == local14.anInt4185) {
			local8 = arg0.anInt5810;
		}
		return local8;
	}
}
