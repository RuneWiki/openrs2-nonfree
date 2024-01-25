import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array5;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "F")
	public static float aFloat36 = 1024.0F;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_32 = new Class55("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_22 = new Class253(86, 6);

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "F")
	public static float aFloat38 = 0.25F;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!ga;)Lclient!ya;")
	public static Class51 method1135(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface4 arg2) {
		return new Class51_Sub1(arg1, arg0, arg2);
	}
}
