import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
	public static int anInt9200;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_19 = new Class382(7, 0, 1, 1);

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
	public static int anInt9199 = 0;

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "[[B")
	public static final byte[][] aByteArrayArray25 = new byte[50][];

	@OriginalMember(owner = "client!rr", name = "J", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_218 = new Class251(53, 11);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!jc;I)Ljava/lang/String;")
	public static String method7932(@OriginalArg(1) Class14_Sub21 arg0) {
		try {
			@Pc(7) int local7 = arg0.method7728(-129);
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(22) byte[] local22 = new byte[local7];
			arg0.anInt8936 += Static234.aClass296_1.method7357(local22, arg0.aByteArray99, arg0.anInt8936, local7, 0);
			return Static490.method7391(local7, 0, local22);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!qga;B)V")
	public static void method7933(@OriginalArg(0) Class299 arg0) {
		if (arg0.anInt8539 == Static511.anInt8868) {
			Static415.aBooleanArray17[arg0.anInt8555] = true;
		}
	}
}
