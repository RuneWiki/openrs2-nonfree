import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ew", name = "F", descriptor = "Lclient!n;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "Lclient!of;")
	public static final Class174 aClass174_60 = new Class174("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)[Lclient!pa;")
	public static Class183[] method1719() {
		return new Class183[] { Static217.aClass183_7, Static248.aClass183_12, Static217.aClass183_6, Static350.aClass183_14, Static145.aClass183_10, Static364.aClass183_17, Static359.aClass183_16, Static181.aClass183_13, Static10.aClass183_1, Static441.aClass183_21, Static372.aClass183_18, Static84.aClass183_15, Static386.aClass183_20, Static149.aClass183_11, Static379.aClass183_19 };
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!dq;III)Ljava/awt/Frame;")
	public static Frame method1720(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method1367()) {
			return null;
		}
		@Pc(22) Class219[] local22 = Static423.method5774(arg1);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (local22[local30].anInt6272 == arg0 && local22[local30].anInt6273 == arg2 && (!local28 || local22[local30].anInt6274 > arg3)) {
				local28 = true;
				arg3 = local22[local30].anInt6274;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(95) Class181 local95 = arg1.method1384(arg0, arg3, arg2);
		while (local95.anInt5298 == 0) {
			Static83.method1499(10L);
		}
		@Pc(110) Frame local110 = (Frame) local95.anObject7;
		if (local110 == null) {
			return null;
		} else if (local95.anInt5298 == 2) {
			Static442.method6045(arg1, local110);
			return null;
		} else {
			return local110;
		}
	}
}
