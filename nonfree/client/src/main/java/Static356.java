import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt6401;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_120 = new Class126(68, -1);

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!ul;")
	public static final Class361 aClass361_9 = new Class361(1);

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!bba;")
	public static final Class30 aClass30_3 = new Class30(16);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5367(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static569.aClass335_34.method7694(Static319.anInt5939) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static569.aClass335_36.method7694(Static319.anInt5939) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!od;I)V")
	public static void method5369(@OriginalArg(0) Class3_Sub6_Sub16 arg0) {
		if (arg0 == null) {
			return;
		}
		Static362.aClass193_32.method4462(arg0);
		Static37.anInt1104++;
		@Pc(43) Class3_Sub6_Sub20 local43;
		if (arg0.aBoolean535 || "".equals(arg0.aString97)) {
			local43 = new Class3_Sub6_Sub20(arg0.aString97);
			Static661.anInt10221++;
		} else {
			@Pc(37) long local37 = arg0.aLong203;
			for (local43 = (Class3_Sub6_Sub20) Static654.aClass62_51.method1682(local37); local43 != null && !local43.aString123.equals(arg0.aString97); local43 = (Class3_Sub6_Sub20) Static654.aClass62_51.method1689()) {
			}
			if (local43 == null) {
				local43 = (Class3_Sub6_Sub20) Static438.aClass279_42.method6631(local37);
				if (local43 != null && !local43.aString123.equals(arg0.aString97)) {
					local43 = null;
				}
				if (local43 == null) {
					local43 = new Class3_Sub6_Sub20(arg0.aString97);
				}
				Static654.aClass62_51.method1686(local37, local43);
				Static661.anInt10221++;
			}
		}
		if (local43.method8242(arg0)) {
			Static82.method1755(local43);
		}
	}
}
