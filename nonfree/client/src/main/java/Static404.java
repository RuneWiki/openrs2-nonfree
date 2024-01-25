import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray23 = new byte[1000][];

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	public static int anInt7178 = 0;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	public static int anInt7179 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public static void method5924(@OriginalArg(0) int arg0) {
		Static286.anInt5387 = arg0;
		@Pc(13) Class136 local13 = Static183.aClass136_44;
		synchronized (Static183.aClass136_44) {
			Static183.aClass136_44.method3470();
		}
		local13 = Static367.aClass136_73;
		synchronized (Static367.aClass136_73) {
			Static367.aClass136_73.method3470();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)Z")
	public static boolean method5927(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5929(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static391.aCharArray7[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
