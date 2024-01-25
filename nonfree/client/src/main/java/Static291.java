import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Lclient!tv;")
	public static Class241 aClass241_8;

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_108 = new Class253(1, -1);

	@OriginalMember(owner = "client!om", name = "O", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZLclient!ok;)Lclient!ag;")
	public static Class7_Sub1 method3867(@OriginalArg(0) int arg0, @OriginalArg(2) Class178 arg1) {
		@Pc(8) byte[] local8 = arg1.method3823(arg0);
		return local8 == null ? null : new Class7_Sub1(local8);
	}
}
