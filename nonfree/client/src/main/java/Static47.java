import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!df", name = "s", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public static int anInt952;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
	public static int[] anIntArray58 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString52 = " more options";

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[B")
	public static byte[] method897(@OriginalArg(0) int arg0) {
		@Pc(20) Class1_Sub2_Sub15 local20 = (Class1_Sub2_Sub15) Static36.aClass148_1.method3600((long) arg0);
		if (local20 == null) {
			@Pc(27) byte[] local27 = new byte[512];
			@Pc(33) Random local33 = new Random((long) arg0);
			@Pc(35) int local35;
			for (local35 = 0; local35 < 255; local35++) {
				local27[local35] = (byte) local35;
			}
			for (local35 = 0; local35 < 255; local35++) {
				@Pc(60) int local60 = 255 - local35;
				@Pc(65) int local65 = Static151.method2554(local60, local33);
				@Pc(69) byte local69 = local27[local65];
				local27[local65] = local27[local60];
				local27[local60] = local27[511 - local35] = local69;
			}
			local20 = new Class1_Sub2_Sub15(local27);
			Static36.aClass148_1.method3602(local20, (long) arg0);
		}
		return local20.aByteArray48;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
	public static int method898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub7 local10 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && local10.anIntArray23.length > arg1) {
			return local10.anIntArray23[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method899() {
		Static37.aClass187_23.method4530();
		Static227.aClass187_116.method4530();
	}
}
