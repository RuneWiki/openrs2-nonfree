import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "[[[Lclient!sn;")
	public static Class227[][][] aClass227ArrayArrayArray4;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public static int anInt4288;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "[I")
	public static final int[] anIntArray282 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "[I")
	public static final int[] anIntArray283 = new int[1];

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	public static int anInt4287 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILclient!uq;)V")
	public static void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub5 arg4) {
		@Pc(4) Class227 local4 = Static361.method5054(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt5674 = (arg1 << Static437.anInt7308) + Static22.anInt382;
		arg4.anInt5671 = arg3;
		arg4.anInt5669 = (arg2 << Static437.anInt7308) + Static22.anInt382;
		for (@Pc(28) Class114 local28 = local4.aClass114_2; local28 != null; local28 = local28.aClass114_1) {
			if (local28.aClass1_Sub2_1.aBoolean506) {
				@Pc(38) int local38 = local28.aClass1_Sub2_1.method6184();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt5671 += local8;
			arg4.aBoolean405 = true;
		} else if (local4.aClass1_Sub4_2 != null) {
			arg4.anInt5671 -= local4.aClass1_Sub4_2.aShort64;
		}
		local4.aClass1_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
	public static int method3589(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method3590() {
		Static307.method4633(Static16.aClass163_15);
		Static243.aClass3_Sub25_Sub1_7.method4081(0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILclient!ga;)V")
	public static void method3591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2) {
		Static223.anInt3769 = arg0;
		Static455.anInt7670 = arg1;
		Static266.aClass82_15 = arg2;
	}
}
