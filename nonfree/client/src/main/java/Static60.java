import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
	public static int[] anIntArray58;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "[I")
	public static final int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!ce", name = "Ab", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_22 = new Class90(12, -1);

	@OriginalMember(owner = "client!ce", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray64 = new int[13];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I")
	public static int method1364(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(31) int local31 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(39) int local39 = local31 + (local31 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!pw;")
	public static Class174 method1365(@OriginalArg(1) Component arg0) {
		return new Class174_Sub1(arg0);
	}
}
