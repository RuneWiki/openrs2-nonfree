import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "J")
	public static long aLong84;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!ha;IBIIIII)V")
	public static void method2410(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Interface20 local16 = (Interface20) Static572.method7588(arg0, arg6, arg4);
		@Pc(25) Class342 local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(51) int local51;
		if (local16 != null) {
			local25 = Static441.aClass74_169.method2075(local16.method7087());
			local31 = local16.method7088() & 0x3;
			local35 = local16.method7086();
			if (local25.anInt8713 == -1) {
				local51 = arg2;
				if (local25.anInt8742 > 0) {
					local51 = arg7;
				}
				if (local35 == 0 || local35 == 2) {
					if (local31 == 0) {
						arg1.method8097(local51, arg3, arg5, 4);
					} else if (local31 == 1) {
						arg1.method8082(arg3, arg5, local51, 4);
					} else if (local31 == 2) {
						arg1.method8097(local51, arg3 + 3, arg5, 4);
					} else if (local31 == 3) {
						arg1.method8082(arg3, arg5 + 3, local51, 4);
					}
				}
				if (local35 == 3) {
					if (local31 == 0) {
						arg1.method8103(arg3, arg5, local51, 1, 1);
					} else if (local31 == 1) {
						arg1.method8103(arg3 + 3, arg5, local51, 1, 1);
					} else if (local31 == 2) {
						arg1.method8103(arg3 + 3, arg5 + 3, local51, 1, 1);
					} else if (local31 == 3) {
						arg1.method8103(arg3, arg5 + 3, local51, 1, 1);
					}
				}
				if (local35 == 2) {
					if (local31 == 0) {
						arg1.method8082(arg3, arg5, local51, 4);
					} else if (local31 == 1) {
						arg1.method8097(local51, arg3 + 3, arg5, 4);
					} else if (local31 == 2) {
						arg1.method8082(arg3, arg5 + 3, local51, 4);
					} else if (local31 == 3) {
						arg1.method8097(local51, arg3, arg5, 4);
					}
				}
			} else {
				Static129.method2319(arg1, arg3, local31, local25, arg5);
			}
		}
		local16 = (Interface20) Static130.method2321(arg0, arg6, arg4, qb.class);
		if (local16 != null) {
			local25 = Static441.aClass74_169.method2075(local16.method7087());
			local31 = local16.method7088() & 0x3;
			local35 = local16.method7086();
			if (local25.anInt8713 != -1) {
				Static129.method2319(arg1, arg3, local31, local25, arg5);
			} else if (local35 == 9) {
				local51 = -1118482;
				if (local25.anInt8742 > 0) {
					local51 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg1.method8139(arg5 + 3, arg3 + 3, arg5, arg3, local51);
				} else {
					arg1.method8139(arg5, arg3 + 3, arg5 + 3, arg3, local51);
				}
			}
		}
		local16 = (Interface20) Static191.method2972(arg0, arg6, arg4);
		if (local16 == null) {
			return;
		}
		local25 = Static441.aClass74_169.method2075(local16.method7087());
		local31 = local16.method7088() & 0x3;
		if (local25.anInt8713 != -1) {
			Static129.method2319(arg1, arg3, local31, local25, arg5);
			return;
		}
	}
}
