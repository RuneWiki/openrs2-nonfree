import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!pe;")
	public static Class254 aClass254_45;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "Lclient!kv;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_41 = new Class276(53, 0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
	public static int method2889(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(14) String local14 = arg2[arg0];
			return local14 == null ? "null" : local14.toString();
		} else {
			@Pc(31) int local31 = arg1 + arg0;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg0; local35 < local31; local35++) {
				@Pc(40) String local40 = arg2[local35];
				if (local40 == null) {
					local33 += 4;
				} else {
					local33 += local40.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local33);
			for (@Pc(64) int local64 = arg0; local64 < local31; local64++) {
				@Pc(69) String local69 = arg2[local64];
				if (local69 == null) {
					local62.append("null");
				} else {
					local62.append(local69);
				}
			}
			return local62.toString();
		}
	}
}
