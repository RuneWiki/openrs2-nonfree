import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
	public static int anInt10800;

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "[I")
	public static final int[] anIntArray622 = new int[3];

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Z")
	public static boolean aBoolean794 = false;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Lclient!el;")
	public static final Class109 aClass109_225 = new Class109(27, 10);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([Lclient!df;II)V")
	public static void method9296(@OriginalArg(0) Class8_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class8_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10361;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10361 < local27 + (local29 & 0x1)) {
				@Pc(44) Class8_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method9296(arg0, arg1, local10 - 1);
		method9296(arg0, local10 + 1, arg2);
	}
}
