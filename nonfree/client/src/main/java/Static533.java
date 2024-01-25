import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt6729 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!tq;Ljava/lang/String;II)Lclient!oc;")
	public static Class212 method5628(@OriginalArg(0) Class285 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method7040(arg1);
		}
		@Pc(34) Class212 local34;
		if (arg2 == 1) {
			try {
				Static562.method7814(Static370.anApplet1, new Object[] { (new URL(Static370.anApplet1.getCodeBase(), arg1)).toString() }, "openjs");
				local34 = new Class212();
				local34.anInt6547 = 1;
				return local34;
			} catch (@Pc(40) Throwable local40) {
				local34 = new Class212();
				local34.anInt6547 = 2;
				return local34;
			}
		} else if (arg2 == 2) {
			try {
				Static370.anApplet1.getAppletContext().showDocument(new URL(Static370.anApplet1.getCodeBase(), arg1), "_blank");
				local34 = new Class212();
				local34.anInt6547 = 1;
				return local34;
			} catch (@Pc(74) Exception local74) {
				local34 = new Class212();
				local34.anInt6547 = 2;
				return local34;
			}
		} else if (arg2 == 3) {
			try {
				Static562.method7815("loggedout", Static370.anApplet1);
			} catch (@Pc(95) Throwable local95) {
			}
			try {
				Static370.anApplet1.getAppletContext().showDocument(new URL(Static370.anApplet1.getCodeBase(), arg1), "_top");
				local34 = new Class212();
				local34.anInt6547 = 1;
				return local34;
			} catch (@Pc(115) Exception local115) {
				local34 = new Class212();
				local34.anInt6547 = 2;
				return local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!rd;")
	public static Class41 method5630(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class41_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z")
	public static boolean method5631(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!pt;IIIII)V")
	public static void method5632(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5751 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub30Array5[local4] != null) {
				arg0.anInt5751++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5751; local22++) {
			@Pc(31) long local31 = Static329.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class103 local41;
			while (local31 != 0L) {
				local41 = Static513.aClass103Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub30_1 == arg0.aClass3_Sub30Array5[local22]) {
					continue label51;
				}
			}
			local31 = Static329.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static513.aClass103Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub30_1 == arg0.aClass3_Sub30Array5[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5751 - 1; local93++) {
				arg0.aClass3_Sub30Array5[local93] = arg0.aClass3_Sub30Array5[local93 + 1];
			}
			arg0.anInt5751--;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public static void method5633(@OriginalArg(0) int arg0) {
		Static509.anInt8870 = arg0;
		Static376.aClass125_63.method3521();
	}
}
