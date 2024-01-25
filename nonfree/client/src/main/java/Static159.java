import java.applet.Applet;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass12;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "()V")
	public static void method2583() {
		for (@Pc(1) int local1 = 0; local1 < Static309.anInt4982; local1++) {
			if (!Static677.aBooleanArray33[local1]) {
				@Pc(10) Class8 local10 = Static660.aClass8Array1[local1];
				@Pc(13) Class3_Sub5 local13 = local10.aClass3_Sub5_1;
				@Pc(16) int local16 = local10.anInt245;
				@Pc(22) int local22 = local13.method7173() - Static434.anInt10639;
				@Pc(30) int local30 = (local22 * 2 >> Static626.anInt9669) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7174() - local22 >> Static626.anInt9669;
				@Pc(53) int local53 = local13.method7177() - local22 >> Static626.anInt9669;
				@Pc(61) int local61 = local13.method7177() + local22 >> Static626.anInt9669;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static448.anInt6835) {
					local61 = Static448.anInt6835 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray1[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static128.anInt2531) {
						local108 = Static128.anInt2531 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class9_Sub1_Sub1 local144 = Static405.method5449(local16, local125, local78, aClass12 == null ? (aClass12 = Class105.a("mga")) : aClass12);
						if (local144 != null && local144.aByte141 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte141 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray1[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray1[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray1[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray1[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static677.aBooleanArray33[local1] = true;
				Static477.aClass259Array3[local16].method9296(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/io/File;ZI[B)V")
	public static void method2585(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg2, 0, arg1);
		} catch (@Pc(28) EOFException local28) {
		}
		local14.close();
	}
}
