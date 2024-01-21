import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Z")
	public static boolean aBoolean234;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public static int anInt2640;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public static volatile int anInt2637 = -1;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!ve;")
	public static Class78 aClass78_2 = new Class78();

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!ja;")
	public static Class33 aClass33_30 = new Class33(50);

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	public static int[] anIntArray296 = new int[50];

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_780 = null;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_781 = Static60.method1113("huffman");

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public static int anInt2642 = -1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBBIILclient!ga;I)V")
	public static void method1729(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class20_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) (arg2 + (arg3 << 16));
		@Pc(16) Class4_Sub1_Sub11 local16 = (Class4_Sub1_Sub11) Static79.aClass81_10.method2010(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub1_Sub11) Static93.aClass81_13.method2010(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class4_Sub1_Sub11) Static110.aClass81_14.method2010(local6);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class4_Sub1_Sub11) Static27.aClass81_3.method2010(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class4_Sub1_Sub11();
			local16.aByte7 = arg1;
			local16.aClass20_Sub1_62 = arg4;
			local16.anInt2417 = arg5;
			if (arg0) {
				Static79.aClass81_10.method2015(local6, local16);
				Static133.anInt3145++;
			} else {
				aClass78_2.method1975(local16);
				Static110.aClass81_14.method2015(local6, local16);
				Static29.anInt686++;
			}
		} else if (arg0) {
			local16.method1906();
			Static79.aClass81_10.method2015(local6, local16);
			Static133.anInt3145++;
			Static29.anInt686--;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1730() {
		anIntArray297 = null;
		aClass22_781 = null;
		aClass22_780 = null;
		anIntArray296 = null;
		aClass78_2 = null;
		aClass33_30 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1731(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static33.aClass57_1);
		arg0.removeMouseMotionListener(Static33.aClass57_1);
		arg0.removeFocusListener(Static33.aClass57_1);
		Static68.anInt499 = 0;
	}
}
