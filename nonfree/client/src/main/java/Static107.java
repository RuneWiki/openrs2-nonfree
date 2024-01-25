import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
	public static int anInt2889;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public static int anInt2893 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIILclient!fl;)Ljava/awt/Frame;")
	public static Frame method2448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class104 arg3) {
		if (!arg3.method3129()) {
			return null;
		}
		@Pc(25) Class273[] local25 = Static105.method2436(arg3);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg1 == local25[local33].anInt8190 && arg2 == local25[local33].anInt8193 && (!local31 || local25[local33].anInt8192 > arg0)) {
				local31 = true;
				arg0 = local25[local33].anInt8192;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(95) Class159 local95 = arg3.method3138(arg0, arg1, arg2);
		while (local95.anInt5910 == 0) {
			Static344.method5698(10L);
		}
		@Pc(110) Frame local110 = (Frame) local95.anObject13;
		if (local110 == null) {
			return null;
		} else if (local95.anInt5910 == 2) {
			Static495.method7177(local110, arg3);
			return null;
		} else {
			return local110;
		}
	}
}
