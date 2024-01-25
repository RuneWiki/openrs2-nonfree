import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!eo;")
	public static final Class101 aClass101_7 = new Class101();

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_162 = new Class200(114, -1);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(FFIIFFBLclient!sb;FII)[B")
	public static byte[] method6259(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) Class310 arg4, @OriginalArg(8) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static424.method6181(local10, arg4, arg3, arg0, arg5, arg2, 0, arg1);
		return local10;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
	public static int method6261() {
		return Static113.aClass23_1.method624();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[B")
	public static byte[] method6263(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub7_Sub18 local10 = (Class2_Sub7_Sub18) Static2.aClass280_1.method6424((long) arg0);
		if (local10 == null) {
			@Pc(15) byte[] local15 = new byte[512];
			@Pc(21) Random local21 = new Random((long) arg0);
			for (@Pc(23) int local23 = 0; local23 < 255; local23++) {
				local15[local23] = (byte) local23;
			}
			for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
				@Pc(40) int local40 = 255 - local35;
				@Pc(45) int local45 = Static142.method2572(local40, local21);
				@Pc(49) byte local49 = local15[local45];
				local15[local45] = local15[local40];
				local15[local40] = local15[511 - local35] = local49;
			}
			local10 = new Class2_Sub7_Sub18(local15);
			Static2.aClass280_1.method6428((long) arg0, local10);
		}
		return local10.aByteArray89;
	}
}
