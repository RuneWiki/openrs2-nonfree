import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!kh;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
	public static boolean method3261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class145 method3263(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3) {
		return new Class145_Sub2(arg3, arg1, arg0, arg2);
	}
}
