import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!ok;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray24 = new byte[250][];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method5008() {
		@Pc(1) Class139 local1 = Static92.aClass139_1;
		synchronized (Static92.aClass139_1) {
			Static92.aClass139_1.method3704();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BJ)V")
	public static void method5010(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}
}
