import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_20 = new Class150(85, 1);

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	public static int anInt489 = 0;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public static void method619() {
		@Pc(1) Class288 local1 = Static240.aClass288_34;
		synchronized (Static240.aClass288_34) {
			Static240.aClass288_34.method6742();
		}
		local1 = Static229.aClass288_33;
		synchronized (Static229.aClass288_33) {
			Static229.aClass288_33.method6742();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIBIIII)V")
	public static void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static398.anInt7144 && arg0 <= Static71.anInt4958 && Static4.anInt6709 <= arg5 && arg2 <= Static492.anInt8451) {
			if (arg4 == 1) {
				Static533.method7271(arg1, arg5, arg3, arg0, arg2);
			} else {
				Static451.method6360(arg4, arg3, arg1, arg2, arg0, arg5);
			}
		} else if (arg4 == 1) {
			Static11.method323(arg2, arg5, arg3, arg1, arg0);
		} else {
			Static174.method3035(arg5, arg3, arg2, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)I")
	public static int method621(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(39) int local39 = (arg0 & 0x7F) * 96 >> 7;
			if (local39 < 2) {
				local39 = 2;
			} else if (local39 > 126) {
				local39 = 126;
			}
			return (arg0 & 0xFF80) + local39;
		}
	}
}
