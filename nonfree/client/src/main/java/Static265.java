import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	public static int anInt5654;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_3 = new Class167(0, Static588.aClass351_18, Static588.aClass351_18, 0, 1);

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_4 = new Class167(1, Static588.aClass351_18, 2);

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_5 = new Class167(2, Static588.aClass351_18, Static588.aClass351_18, 2, 3);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_6 = new Class167(3, Static588.aClass351_18, 3);

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_7 = new Class167(4, Static588.aClass351_18, Static588.aClass351_18, 3, 4);

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_8 = new Class167(5, Static588.aClass351_18, 4);

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_9 = new Class167(6, Static588.aClass351_18, 4);

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_10 = new Class167(7, Static588.aClass351_18, Static588.aClass351_18, 4, 5);

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_11 = new Class167(8, Static588.aClass351_18, Static588.aClass351_18, 5, 98, true, true);

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_12 = new Class167(9, Static588.aClass351_18, 99);

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_13 = new Class167(10, Static588.aClass351_18, 100);

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_14 = new Class167(11, Static588.aClass351_19, Static588.aClass351_19, 0, 92, true, true);

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_15 = new Class167(12, Static588.aClass351_19, Static588.aClass351_19, 92, 92);

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Lclient!jj;")
	private static final Class167 aClass167_16 = new Class167(13, Static588.aClass351_19, Static588.aClass351_19, 92, 93);

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_17 = new Class167(14, Static588.aClass351_19, Static588.aClass351_19, 94, 95);

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_18 = new Class167(15, Static588.aClass351_19, Static588.aClass351_19, 96, 97);

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_19 = new Class167(16, Static588.aClass351_19, 97);

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_20 = new Class167(17, Static588.aClass351_19, 97);

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_21 = new Class167(18, Static588.aClass351_19, 100);

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_22 = new Class167(19, Static588.aClass351_19, 100);

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "Lclient!jj;")
	public static final Class167 aClass167_23 = new Class167(20, Static588.aClass351_19, 100);

	@OriginalMember(owner = "client!jj", name = "H", descriptor = "[I")
	public static int[] anIntArray323 = new int[2];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!wea;Z)V")
	public static void method4893(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class370 arg1) {
		while (true) {
			@Pc(10) Class240 local10 = arg1.method9083(arg0);
			while (local10.anInt7566 == 0) {
				Static190.method3914(10L);
			}
			if (local10.anInt7566 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static190.method3914(100L);
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)[Lclient!jj;")
	public static Class167[] method4894() {
		return new Class167[] { aClass167_3, aClass167_4, aClass167_5, aClass167_6, aClass167_7, aClass167_8, aClass167_9, aClass167_10, aClass167_11, aClass167_12, aClass167_13, aClass167_14, aClass167_15, aClass167_16, aClass167_17, aClass167_18, aClass167_19, aClass167_20, aClass167_21, aClass167_22, aClass167_23 };
	}
}
