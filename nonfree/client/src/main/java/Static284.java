import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Z")
	public static boolean aBoolean432 = true;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_79 = new Class242(35, -1);

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "[I")
	public static final int[] anIntArray359 = new int[200];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!wm;BLjava/lang/String;)I")
	public static int method3783(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt3698;
		@Pc(10) byte[] local10 = Static392.method5094(arg1);
		arg0.method2895(local10.length);
		arg0.anInt3698 += Static304.aClass189_2.method4079(local10, local10.length, 0, arg0.anInt3698, arg0.aByteArray38);
		return arg0.anInt3698 - local6;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3785(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static299.aCharArray4[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}
