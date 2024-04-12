import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_84 = Static12.method257("Could not complete login)3");

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static final int anInt311 = 7759444;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[104][104];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_85 = Static12.method257("@gre@Classic");

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 139)
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString7 = arg1;
		this.aThrowable1 = arg0;
	}
}
