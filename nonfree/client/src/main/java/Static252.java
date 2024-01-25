import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "Lclient!wt;")
	public static Class4_Sub55 aClass4_Sub55_3;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLjava/net/Socket;I)Lclient!kfa;")
	public static Class192 method3669(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class192_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)I")
	public static int method3670(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)Z")
	public static boolean method3671(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIZLclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class33 method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface9 arg2, @OriginalArg(4) Canvas arg3) {
		return new Class33_Sub1(arg3, arg2, arg1, arg0);
	}
}
