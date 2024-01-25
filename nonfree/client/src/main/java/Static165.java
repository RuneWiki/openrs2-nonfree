import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public static int anInt3548 = 7000;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	public static int anInt3552 = anInt3548;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_22 = new Class271();

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_9 = new Class368(4, 19);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIIII)V")
	public static void method3317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static206.anInt4305 = arg0;
		Static193.anInt4099 = arg2;
		Static438.anInt7970 = arg3;
		Static57.anInt1107 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method3319(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static466.method7482(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static305.method5018(local7);
			local7 = Static630.method7149(":", "%3a", local7);
			local7 = Static630.method7149("@", "%40", local7);
			local7 = Static630.method7149("&", "%26", local7);
			local7 = Static630.method7149("#", "%23", local7);
			if (Static318.anApplet1 != null) {
				@Pc(102) Class268 local102 = Static222.aClass48_4.method1321(new URL(Static318.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static67.anInt1288 + "&u=" + (Static541.aString111 == null ? String.valueOf(Static501.aLong260) : Static541.aString111) + "&v1=" + Static72.aString14 + "&v2=" + Static72.aString15 + "&e=" + local7));
				while (local102.anInt8008 == 0) {
					Static650.method9565(1L);
				}
				if (local102.anInt8008 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local102.anObject19;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}
}
