import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
	public static int anInt10857;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "[I")
	public static final int[] anIntArray960 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!d;ZILjava/awt/Canvas;)Lclient!ha;")
	public static Class13 method9348(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class13_Sub2(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	public static int method9349(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
	public static int method9352() {
		return 16;
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)I")
	public static int method9353() {
		if (Static442.aFrame3 == null) {
			return Static632.aBoolean764 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lclient!wea;II)V")
	public static void method9355(@OriginalArg(0) Class28_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class28_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10726;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10726 > local27 + (local29 & 0x1)) {
				@Pc(44) Class28_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method9355(arg0, arg1, local10 - 1);
		method9355(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)Z")
	public static boolean method9356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}
}
