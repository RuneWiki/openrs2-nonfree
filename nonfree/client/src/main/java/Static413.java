import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "Lclient!mu;")
	public static Class243 aClass243_3;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "Lclient!rg;")
	public static Class310 aClass310_89;

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject16 = null;

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "Z")
	public static boolean aBoolean501 = true;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBILjava/awt/Component;Lclient!iha;)Lclient!bh;")
	public static Class37 method6231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class173 arg3) {
		if (Static157.anInt2396 == 0) {
			throw new IllegalStateException();
		} else if (arg0 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(34) Class37 local34 = (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
				local34.anInt4907 = arg1;
				local34.anIntArray247 = new int[(Static583.aBoolean664 ? 2 : 1) * 256];
				local34.method4373(arg2);
				local34.anInt4903 = (arg1 & 0xFFFFFC00) + 1024;
				if (local34.anInt4903 > 16384) {
					local34.anInt4903 = 16384;
				}
				local34.method4372(local34.anInt4903);
				if (Static541.anInt9210 > 0 && Static333.aClass177_6 == null) {
					Static333.aClass177_6 = new Class177();
					Static333.aClass177_6.aClass173_3 = arg3;
					arg3.method4250(Static541.anInt9210, Static333.aClass177_6);
				}
				if (Static333.aClass177_6 != null) {
					if (Static333.aClass177_6.aClass37Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static333.aClass177_6.aClass37Array1[arg0] = local34;
				}
				return local34;
			} catch (@Pc(119) Throwable local119) {
				try {
					@Pc(125) Class37_Sub2 local125 = new Class37_Sub2(arg3, arg0);
					local125.anIntArray247 = new int[(Static583.aBoolean664 ? 2 : 1) * 256];
					local125.anInt4907 = arg1;
					local125.method4373(arg2);
					local125.anInt4903 = 16384;
					local125.method4372(local125.anInt4903);
					if (Static541.anInt9210 > 0 && Static333.aClass177_6 == null) {
						Static333.aClass177_6 = new Class177();
						Static333.aClass177_6.aClass173_3 = arg3;
						arg3.method4250(Static541.anInt9210, Static333.aClass177_6);
					}
					if (Static333.aClass177_6 != null) {
						if (Static333.aClass177_6.aClass37Array1[arg0] != null) {
							throw new IllegalArgumentException();
						}
						Static333.aClass177_6.aClass37Array1[arg0] = local125;
					}
					return local125;
				} catch (@Pc(199) Throwable local199) {
					return new Class37();
				}
			}
		}
	}
}
