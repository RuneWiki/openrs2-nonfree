import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "[[Lclient!kea;")
	public static Class208[][] aClass208ArrayArray1;

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
	public static final int anInt5498 = Static462.method6277(1600);

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method4887(@OriginalArg(1) int[] arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer();
		@Pc(17) int local17 = Static519.anInt8147;
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			@Pc(28) Class202 local28 = Static642.aClass358_1.method8255(arg0[local19]);
			if (local28.anInt5320 != -1) {
				@Pc(40) Class178 local40 = (Class178) Static576.aClass307_94.method7002((long) local28.anInt5320);
				if (local40 == null) {
					@Pc(48) Class361 local48 = Static735.method8269(Static218.aClass182_59, local28.anInt5320, 0);
					if (local48 != null) {
						local40 = Static153.aClass22_4.method9363(local48, true);
						Static576.aClass307_94.method7000(local40, (long) local28.anInt5320);
					}
				}
				if (local40 != null) {
					Static413.aClass178Array13[local17] = local40;
					local15.append(" <img=").append(local17).append(">");
					local17++;
				}
			}
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4888(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
