import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)Z")
	public static boolean method217() {
		try {
			@Pc(7) Class346 local7 = new Class346();
			@Pc(12) byte[] local12 = local7.method8228(Static473.aByteArray79);
			Static289.method4754(local12);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZLclient!eea;)V")
	public static void method219(@OriginalArg(1) Class6_Sub15_Sub1 arg0) {
		@Pc(10) Class6_Sub42 local10 = (Class6_Sub42) Static336.aClass340_40.method8124();
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local10.anInt7710; local18++) {
			if (local10.aClass380Array2[local18] != null) {
				if (local10.aClass380Array2[local18].anInt10067 == 2) {
					local10.anIntArray489[local18] = -5;
				}
				if (local10.aClass380Array2[local18].anInt10067 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass380Array1[local18] != null) {
				if (local10.aClass380Array1[local18].anInt10067 == 2) {
					local10.anIntArray489[local18] = -6;
				}
				if (local10.aClass380Array1[local18].anInt10067 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(99) int local99 = arg0.anInt3174;
		arg0.method3029(local10.anInt7709);
		for (@Pc(111) int local111 = 0; local111 < local10.anInt7710; local111++) {
			if (local10.anIntArray489[local111] == 0) {
				try {
					@Pc(139) int local139 = local10.anIntArray487[local111];
					@Pc(155) Field local155;
					@Pc(183) int local183;
					if (local139 == 0) {
						local155 = (Field) local10.aClass380Array2[local111].anObject25;
						local183 = local155.getInt((Object) null);
						arg0.method3016(0);
						arg0.method3029(local183);
					} else if (local139 == 1) {
						local155 = (Field) local10.aClass380Array2[local111].anObject25;
						local155.setInt((Object) null, local10.anIntArray488[local111]);
						arg0.method3016(0);
					} else if (local139 == 2) {
						local155 = (Field) local10.aClass380Array2[local111].anObject25;
						local183 = local155.getModifiers();
						arg0.method3016(0);
						arg0.method3029(local183);
					}
					@Pc(222) Method local222;
					if (local139 == 3) {
						local222 = (Method) local10.aClass380Array1[local111].anObject25;
						@Pc(227) byte[][] local227 = local10.aByteArrayArrayArray19[local111];
						@Pc(231) Object[] local231 = new Object[local227.length];
						for (@Pc(233) int local233 = 0; local233 < local227.length; local233++) {
							@Pc(245) ObjectInputStream local245 = new ObjectInputStream(new ByteArrayInputStream(local227[local233]));
							local231[local233] = local245.readObject();
						}
						@Pc(260) Object local260 = local222.invoke((Object) null, local231);
						if (local260 == null) {
							arg0.method3016(0);
						} else if (local260 instanceof Number) {
							arg0.method3016(1);
							arg0.method2985(((Number) local260).longValue());
						} else if (local260 instanceof String) {
							arg0.method3016(2);
							arg0.method2991((String) local260);
						} else {
							arg0.method3016(4);
						}
					} else if (local139 == 4) {
						local222 = (Method) local10.aClass380Array1[local111].anObject25;
						local183 = local222.getModifiers();
						arg0.method3016(0);
						arg0.method3029(local183);
					}
				} catch (@Pc(342) ClassNotFoundException local342) {
					arg0.method3016(-10);
				} catch (@Pc(348) InvalidClassException local348) {
					arg0.method3016(-11);
				} catch (@Pc(354) StreamCorruptedException local354) {
					arg0.method3016(-12);
				} catch (@Pc(360) OptionalDataException local360) {
					arg0.method3016(-13);
				} catch (@Pc(366) IllegalAccessException local366) {
					arg0.method3016(-14);
				} catch (@Pc(372) IllegalArgumentException local372) {
					arg0.method3016(-15);
				} catch (@Pc(378) InvocationTargetException local378) {
					arg0.method3016(-16);
				} catch (@Pc(384) SecurityException local384) {
					arg0.method3016(-17);
				} catch (@Pc(390) IOException local390) {
					arg0.method3016(-18);
				} catch (@Pc(396) NullPointerException local396) {
					arg0.method3016(-19);
				} catch (@Pc(402) Exception local402) {
					arg0.method3016(-20);
				} catch (@Pc(408) Throwable local408) {
					arg0.method3016(-21);
				}
			} else {
				arg0.method3016(local10.anIntArray489[local111]);
			}
		}
		arg0.method3031(local99);
		local10.method9051();
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
	public static void method220() {
		if (Static221.aFrame1 != null) {
			return;
		}
		@Pc(11) int local11 = Static409.anInt7136;
		@Pc(13) int local13 = Static494.anInt4031;
		@Pc(21) int local21 = Static238.anInt4606 - Static535.anInt4128 - local11;
		@Pc(32) int local32 = Static542.anInt8800 - Static274.anInt3226 - local13;
		if (local11 <= 0 && local21 <= 0 && local13 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(59) Container local59;
			if (Static637.aFrame3 != null) {
				local59 = Static637.aFrame3;
			} else if (Static371.anApplet1 == null) {
				local59 = Static34.anApplet_Sub1_1;
			} else {
				local59 = Static371.anApplet1;
			}
			@Pc(73) int local73 = 0;
			@Pc(75) int local75 = 0;
			if (local59 == Static637.aFrame3) {
				@Pc(81) Insets local81 = Static637.aFrame3.getInsets();
				local73 = local81.left;
				local75 = local81.top;
			}
			@Pc(90) Graphics local90 = local59.getGraphics();
			local90.setColor(Color.black);
			if (local11 > 0) {
				local90.fillRect(local73, local75, local11, Static542.anInt8800);
			}
			if (local13 > 0) {
				local90.fillRect(local73, local75, Static238.anInt4606, local13);
			}
			if (local21 > 0) {
				local90.fillRect(Static238.anInt4606 + local73 - local21, local75, local21, Static542.anInt8800);
			}
			if (local32 > 0) {
				local90.fillRect(local73, local75 + Static542.anInt8800 - local32, Static238.anInt4606, local32);
				return;
			}
		} catch (@Pc(152) Exception local152) {
			return;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method223(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static277.aClass75_7 = arg0;
		Static261.anInt5003 = arg1;
		Static398.aBoolean515 = Static261.anInt5003 > 1 && Static277.aClass75_7.method6693();
		Static594.anInt9440 = 9;
		Static234.anInt4537 = 0x1 << Static594.anInt9440;
		Static430.anInt3928 = Static234.anInt4537 >> 1;
		Math.sqrt((double) (Static430.anInt3928 * Static430.anInt3928 + Static430.anInt3928 * Static430.anInt3928));
		Static66.anInt802 = 4;
		Static230.anInt4470 = arg2;
		Static63.anInt777 = arg3;
		Static382.anInt6636 = arg4;
		Static123.aClass114_1 = Static248.method4320();
		Static399.method6106();
		Static526.aClass243ArrayArrayArray3 = new Class243[4][Static230.anInt4470][Static63.anInt777];
		Static524.aClass96Array2 = new Class96[4];
		if (arg5) {
			Static130.anIntArrayArray10 = new int[Static230.anInt4470][Static63.anInt777];
			Static273.aByteArrayArray84 = new byte[Static230.anInt4470][Static63.anInt777];
			Static473.aShortArrayArray11 = new short[Static230.anInt4470][Static63.anInt777];
			Static104.aClass243ArrayArrayArray1 = new Class243[1][Static230.anInt4470][Static63.anInt777];
			Static216.aClass96Array1 = new Class96[1];
		} else {
			Static130.anIntArrayArray10 = null;
			Static273.aByteArrayArray84 = null;
			Static473.aShortArrayArray11 = null;
			Static104.aClass243ArrayArrayArray1 = null;
			Static216.aClass96Array1 = null;
		}
		if (arg6) {
			Static191.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static483.aClass256Array1 = new Class256[65535];
			Static78.aBooleanArray6 = new boolean[65535];
			Static259.anInt4979 = 0;
		} else {
			Static191.aLongArrayArrayArray1 = null;
			Static483.aClass256Array1 = null;
			Static78.aBooleanArray6 = null;
			Static259.anInt4979 = 0;
		}
		Static79.method1089(false);
		Static403.aClass60_Sub1Array5 = new Class60_Sub1[2];
		Static265.aClass60_Sub1Array4 = new Class60_Sub1[2];
		Static535.aClass60_Sub1Array3 = new Class60_Sub1[2];
		Static434.aClass60_Sub1Array6 = new Class60_Sub1[10000];
		Static261.anInt5002 = 0;
		Static580.aClass60_Sub1Array7 = new Class60_Sub1[5000];
		Static676.anInt10367 = 0;
		Static469.aClass60_Sub1_Sub1Array1 = new Class60_Sub1_Sub1[5000];
		Static243.anInt4671 = 0;
		Static488.aBooleanArrayArray4 = new boolean[Static382.anInt6636 + Static382.anInt6636 + 1][Static382.anInt6636 + Static382.anInt6636 + 1];
		Static544.aBooleanArrayArray6 = new boolean[Static382.anInt6636 + Static382.anInt6636 + 2][Static382.anInt6636 + Static382.anInt6636 + 2];
		Static427.anIntArray471 = new int[Static382.anInt6636 + Static382.anInt6636 + 2];
		Static667.aClass284_3 = Static667.aClass284_2;
		if (Static398.aBoolean515) {
			Static195.aBooleanArrayArrayArray1 = new boolean[4][Static382.anInt6636 + Static382.anInt6636 + 1][Static382.anInt6636 + Static382.anInt6636 + 1];
			Static225.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static630.aClass106Array2 != null) {
				Static578.method8058();
			}
			Static630.aClass106Array2 = new Class106[Static261.anInt5003];
			Static277.aClass75_7.method6694(Static630.aClass106Array2.length + 1);
			Static277.aClass75_7.method6696(0);
			for (@Pc(214) int local214 = 0; local214 < Static630.aClass106Array2.length; local214++) {
				Static630.aClass106Array2[local214] = new Class106(local214 + 1, Static277.aClass75_7);
				(new Thread(Static630.aClass106Array2[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static261.anInt5003 == 2) {
				local253 = 4;
				Static243.anInt4677 = 2;
			} else if (Static261.anInt5003 == 3) {
				local253 = 6;
				Static243.anInt4677 = 3;
			} else {
				local253 = 8;
				Static243.anInt4677 = 4;
			}
			Static489.aClass15Array1 = new Class15[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static489.aClass15Array1[local273] = new Class15(Static536.aStringArrayArray9[Static261.anInt5003 - 2][local273]);
			}
		} else {
			Static243.anInt4677 = 1;
		}
		Static7.anIntArray6 = new int[Static243.anInt4677 - 1];
		Static394.anIntArray409 = new int[Static243.anInt4677 - 1];
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIIIBILclient!ka;Lclient!qu;ILclient!ha;II)Lclient!ka;")
	public static Class54 method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class54 arg6, @OriginalArg(8) Class104 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class75 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg7 != null) {
			local12 = arg7.method9025() | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(45) long local45 = ((long) arg11 << 48) + (long) ((arg3 << 24) + (arg5 << 16) + arg0) + ((long) arg8 << 32);
		@Pc(47) Class359 local47 = Static307.aClass359_44;
		@Pc(55) Class54 local55;
		synchronized (Static307.aClass359_44) {
			local55 = (Class54) Static307.aClass359_44.method8517(local45);
		}
		if (local55 == null || arg9.method6712(local55.ua(), local12) != 0) {
			if (local55 != null) {
				local12 = arg9.method6686(local12, local55.ua());
			}
			@Pc(95) byte local95;
			if (arg0 == 1) {
				local95 = 9;
			} else if (arg0 == 2) {
				local95 = 12;
			} else if (arg0 == 3) {
				local95 = 15;
			} else if (arg0 == 4) {
				local95 = 18;
			} else {
				local95 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class316 local148 = new Class316(local95 * 3 + 1, -local95 + local95 * 3 * 2, 0);
			@Pc(157) int local157 = local148.method7549(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local95];
			@Pc(169) int local169;
			@Pc(173) int local173;
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (@Pc(163) int local163 = 0; local163 < 3; local163++) {
				local169 = local130[local163];
				local173 = local130[local163];
				for (local175 = 0; local175 < local95; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local95;
					@Pc(191) int local191 = Class6_Sub2_Sub12.anIntArray293[local183] * local169 >> 14;
					local199 = local173 * Class6_Sub2_Sub12.anIntArray292[local183] >> 14;
					local161[local163][local175] = local148.method7549(0, local191, local199);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(254) byte local254 = (byte) (arg3 * local173 + arg5 * local175 >> 8);
				@Pc(299) short local299 = (short) (((arg8 & 0x7F) * local175 + local173 * (arg11 & 0x7F) & 0x7F00) + ((arg11 & 0x380) * local173 + (arg8 & 0x380) * local175 & 0x38000) + ((arg8 & 0xFC00) * local175 + local173 * (arg11 & 0xFC00) & 0xFC0000) >> 8);
				for (local199 = 0; local199 < local95; local199++) {
					if (local169 == 0) {
						local148.method7535(local299, local161[0][local199], (byte) -1, local157, local254, (short) -1, (byte) 1, local161[0][(local199 + 1) % local95]);
					} else {
						local148.method7535(local299, local161[local169][(local199 + 1) % local95], (byte) -1, local161[local169 - 1][local199], local254, (short) -1, (byte) 1, local161[local169 - 1][(local199 + 1) % local95]);
						local148.method7535(local299, local161[local169][local199], (byte) -1, local161[local169 - 1][local199], local254, (short) -1, (byte) 1, local161[local169][(local199 + 1) % local95]);
					}
				}
			}
			local55 = arg9.method6688(local148, local12, Static366.anInt6173, 64, 768);
			@Pc(431) Class359 local431 = Static307.aClass359_44;
			synchronized (Static307.aClass359_44) {
				Static307.aClass359_44.method8515(local45, local55);
			}
		}
		@Pc(447) int local447 = arg6.V();
		@Pc(450) int local450 = arg6.RA();
		@Pc(453) int local453 = arg6.HA();
		@Pc(456) int local456 = arg6.G();
		if (arg7 == null) {
			local55 = local55.method7398((byte) 3, local12, true);
			local55.O(local450 - local447 >> 1, 128, local456 - local453 >> 1);
			local55.H(local447 + local450 >> 1, 0, local456 + local453 >> 1);
		} else {
			local55 = local55.method7398((byte) 3, local12, true);
			local55.O(local450 - local447 >> 1, 128, local456 - local453 >> 1);
			local55.H(local450 + local447 >> 1, 0, local456 + local453 >> 1);
			arg7.method9029(local55);
		}
		if (arg2 != 0) {
			local55.FA(arg2);
		}
		if (arg1 != 0) {
			local55.VA(arg1);
		}
		if (arg10 != 0) {
			local55.H(0, arg10, 0);
		}
		return local55;
	}
}
