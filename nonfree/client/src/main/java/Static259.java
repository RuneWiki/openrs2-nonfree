import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public static int anInt4765;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public static int anInt4761 = 0;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_85 = new Class319(25, -1);

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public static int anInt4764 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!io;)V")
	public static void method4058(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static355.aClass259_5 != null) {
			@Pc(24) int local24;
			try {
				Static355.aClass259_5.method5774(0L);
				Static355.aClass259_5.method5773(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method4412(local12, 24);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method4059(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static229.method7250(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static34.method817(local7);
			local7 = Static443.method6341("%3a", ":", local7);
			local7 = Static443.method6341("%40", "@", local7);
			local7 = Static443.method6341("%26", "&", local7);
			local7 = Static443.method6341("%23", "#", local7);
			if (Static568.anApplet2 != null) {
				@Pc(105) Class23 local105 = Static271.aClass114_5.method2508(new URL(Static568.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static581.anInt9414 + "&u=" + Static349.aLong266 + "&v1=" + Static162.aString32 + "&v2=" + Static162.aString30 + "&e=" + local7));
				while (local105.anInt875 == 0) {
					Static423.method5918(1L);
				}
				if (local105.anInt875 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local105.anObject1;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}
}
