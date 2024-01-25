import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
	public static int anInt2697;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	public static int anInt2685 = 0;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!kq;")
	public static final Class136 aClass136_4 = new Class136("WTRC", 1);

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "[I")
	public static final int[] anIntArray223 = new int[14];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method2175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static449.method5706(arg0, arg1)) {
			return Static408.method5123(arg0, arg1) | (arg0 & 0xB000) != 0 | Static392.method4989(arg1, arg0) ? true : (Static187.method2739(arg0, arg1) | Static109.method1889(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)[Lclient!gn;")
	public static Class94[] method2180() {
		return new Class94[] { Static445.aClass94_4, Static106.aClass94_11, Static425.aClass94_24, Static97.aClass94_10, Static122.aClass94_15, Static62.aClass94_5, Static324.aClass94_23, Static278.aClass94_21, Static225.aClass94_22, Static65.aClass94_12, Static138.aClass94_16, Static355.aClass94_20, Static108.aClass94_13, Static443.aClass94_25, Static140.aClass94_2 };
	}
}
