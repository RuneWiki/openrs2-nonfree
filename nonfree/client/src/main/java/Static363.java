import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!iga;")
	public static Class159 aClass159_4;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_103 = new Class274(98, 6);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method5523(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static331.aClass112Array3 == Static164.aClass112Array1) {
			return;
		}
		@Pc(10) int local10 = Static178.aClass112Array2[arg1].method7826(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class112 local23 = Static178.aClass112Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7826(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method5524(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static328.aClass87_6 = arg0;
		Static621.anInt10092 = arg1;
		Static501.aBoolean631 = Static621.anInt10092 > 1 && Static328.aClass87_6.method7930();
		Static415.anInt7579 = 9;
		Static312.anInt5690 = 0x1 << Static415.anInt7579;
		Static290.anInt5464 = Static312.anInt5690 >> 1;
		Math.sqrt((double) (Static290.anInt5464 * Static290.anInt5464 + Static290.anInt5464 * Static290.anInt5464));
		Static330.anInt4381 = 4;
		Static347.anInt6411 = arg2;
		Static191.anInt6006 = arg3;
		Static319.anInt5795 = arg4;
		Static284.aClass13_33 = Static305.method4709();
		Static323.method4876();
		Static142.aClass217ArrayArrayArray1 = new Class217[4][Static347.anInt6411][Static191.anInt6006];
		Static178.aClass112Array2 = new Class112[4];
		if (arg5) {
			Static41.anIntArrayArray9 = new int[Static347.anInt6411][Static191.anInt6006];
			Static150.aByteArrayArray6 = new byte[Static347.anInt6411][Static191.anInt6006];
			Static588.aShortArrayArray31 = new short[Static347.anInt6411][Static191.anInt6006];
			Static204.aClass217ArrayArrayArray2 = new Class217[1][Static347.anInt6411][Static191.anInt6006];
			Static164.aClass112Array1 = new Class112[1];
		} else {
			Static41.anIntArrayArray9 = null;
			Static150.aByteArrayArray6 = null;
			Static588.aShortArrayArray31 = null;
			Static204.aClass217ArrayArrayArray2 = null;
			Static164.aClass112Array1 = null;
		}
		if (arg6) {
			Static192.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static302.aClass93Array1 = new Class93[65535];
			Static190.aBooleanArray49 = new boolean[65535];
			Static140.anInt3097 = 0;
		} else {
			Static192.aLongArrayArrayArray1 = null;
			Static302.aClass93Array1 = null;
			Static190.aBooleanArray49 = null;
			Static140.anInt3097 = 0;
		}
		Static364.method5552(false);
		Static317.aClass11_Sub1ArrayArray2 = new Class11_Sub1[2][];
		Static317.aClass11_Sub1ArrayArray2[0] = new Class11_Sub1[Static243.anIntArray331[0]];
		Static317.aClass11_Sub1ArrayArray2[1] = new Class11_Sub1[Static243.anIntArray331[1]];
		Static336.anIntArray411 = new int[2];
		Static146.aClass11_Sub1ArrayArray1 = new Class11_Sub1[2][];
		Static146.aClass11_Sub1ArrayArray1[0] = new Class11_Sub1[Static368.anIntArray275[0]];
		Static146.aClass11_Sub1ArrayArray1[1] = new Class11_Sub1[Static368.anIntArray275[1]];
		Static442.anIntArray535 = new int[2];
		Static483.aClass11_Sub1ArrayArray3 = new Class11_Sub1[2][];
		Static483.aClass11_Sub1ArrayArray3[0] = new Class11_Sub1[Static625.anIntArray722[0]];
		Static483.aClass11_Sub1ArrayArray3[1] = new Class11_Sub1[Static625.anIntArray722[1]];
		Static429.anIntArray527 = new int[2];
		Static244.aClass11_Sub1Array2 = new Class11_Sub1[10000];
		Static530.anInt8847 = 0;
		Static174.aClass11_Sub1Array1 = new Class11_Sub1[5000];
		Static539.anInt8993 = 0;
		Static310.aClass11_Sub1_Sub1Array1 = new Class11_Sub1_Sub1[5000];
		Static226.anInt4632 = 0;
		Static36.aBooleanArrayArray2 = new boolean[Static319.anInt5795 + Static319.anInt5795 + 1][Static319.anInt5795 + Static319.anInt5795 + 1];
		Static38.aBooleanArrayArray3 = new boolean[Static319.anInt5795 + Static319.anInt5795 + 2][Static319.anInt5795 + Static319.anInt5795 + 2];
		Static607.anIntArray692 = new int[Static319.anInt5795 + Static319.anInt5795 + 2];
		Static98.aClass329_2 = Static98.aClass329_1;
		if (Static501.aBoolean631) {
			Static295.aBooleanArrayArrayArray6 = new boolean[4][Static319.anInt5795 + Static319.anInt5795 + 1][Static319.anInt5795 + Static319.anInt5795 + 1];
			Static425.aBooleanArrayArrayArray5 = new boolean[4][][];
			if (Static408.aClass235Array1 != null) {
				Static563.method7792();
			}
			Static408.aClass235Array1 = new Class235[Static621.anInt10092];
			Static328.aClass87_6.method7938(Static408.aClass235Array1.length + 1);
			Static328.aClass87_6.method7890(0);
			for (@Pc(256) int local256 = 0; local256 < Static408.aClass235Array1.length; local256++) {
				Static408.aClass235Array1[local256] = new Class235(local256 + 1, Static328.aClass87_6);
				(new Thread(Static408.aClass235Array1[local256], "wr" + local256)).start();
			}
			@Pc(291) byte local291;
			if (Static621.anInt10092 == 2) {
				local291 = 4;
				Static37.anInt925 = 2;
			} else if (Static621.anInt10092 == 3) {
				local291 = 6;
				Static37.anInt925 = 3;
			} else {
				local291 = 8;
				Static37.anInt925 = 4;
			}
			Static328.aClass103Array1 = new Class103[local291];
			for (@Pc(311) int local311 = 0; local311 < local291; local311++) {
				Static328.aClass103Array1[local311] = new Class103(Static96.aStringArrayArray1[Static621.anInt10092 - 2][local311]);
			}
		} else {
			Static37.anInt925 = 1;
		}
		Static643.anIntArray750 = new int[Static37.anInt925 - 1];
		Static641.anIntArray741 = new int[Static37.anInt925 - 1];
	}
}
