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

public final class Static192 {

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "Lclient!gh;")
	public static Class106 aClass106_6;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
	public static int anInt4400;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)I")
	public static int method3681(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BILclient!qf;)Ljava/lang/String;")
	public static String method3682(@OriginalArg(1) int arg0, @OriginalArg(2) Class245 arg1) {
		if (!Static63.method1295(arg1).method1759(arg0) && arg1.anObjectArray24 == null) {
			return null;
		} else if (arg1.aStringArray44 == null || arg0 >= arg1.aStringArray44.length || arg1.aStringArray44[arg0] == null || arg1.aStringArray44[arg0].trim().length() == 0) {
			return Static362.aBoolean430 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray44[arg0];
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public static void method3683() {
		Static236.aClass5_4.ha(Static456.aFloat260 * ((float) Static7.aClass3_Sub15_Sub1_1.anInt8374 * 0.1F + 0.7F));
		Static236.aClass5_4.YA(Static309.anInt108, Static241.aFloat261, Static159.aFloat130, (float) (Static190.anInt4325 << 2), (float) (Static421.anInt7832 << 2), (float) (Static265.anInt5514 << 2));
		Static236.aClass5_4.method7485(Static401.aClass66_3);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	public static void method3684() {
		for (@Pc(10) Class3_Sub38 local10 = (Class3_Sub38) Static230.aClass71_39.method2089(); local10 != null; local10 = (Class3_Sub38) Static230.aClass71_39.method2086()) {
			if (Static279.aClass290ArrayArrayArray7 == null) {
				local10.method7820();
			} else {
				@Pc(30) int local30;
				@Pc(87) Class6_Sub3 local87;
				@Pc(100) Class6_Sub3_Sub1 local100;
				@Pc(130) Class6_Sub1 local130;
				@Pc(45) Class6_Sub4 local45;
				@Pc(169) Class6_Sub2 local169;
				@Pc(58) Class6_Sub4_Sub2 local58;
				@Pc(182) Class6_Sub2_Sub1 local182;
				if (Static223.anInt4829 >= local10.anInt6986) {
					local30 = Static447.anIntArray696[local10.anInt6976];
					if (local30 == 0) {
						local169 = Static542.method7740(local10.anInt6984, local10.anInt6973, local10.anInt6977);
						if (local169 instanceof Class6_Sub2_Sub1) {
							Static296.method4950(local10.anInt6984, local10.anInt6973, local10.anInt6977);
							local182 = (Class6_Sub2_Sub1) local169;
							if (local182.aClass6_Sub2_1 != null) {
								Static314.method5091(local10.anInt6984, local10.anInt6973, local10.anInt6977, local182.aClass6_Sub2_1, null);
							}
						}
					} else if (local30 == 1) {
						local45 = Static183.method4959(local10.anInt6984, local10.anInt6973, local10.anInt6977);
						if (local45 instanceof Class6_Sub4_Sub2) {
							Static488.method7162(local10.anInt6984, local10.anInt6973, local10.anInt6977);
							local58 = (Class6_Sub4_Sub2) local45;
							if (local58.aClass6_Sub4_1 != null) {
								Static509.method7291(local10.anInt6984, local10.anInt6973, local10.anInt6977, local58.aClass6_Sub4_1, null);
							}
						}
					} else if (local30 == 2) {
						local130 = Static420.method6482(local10.anInt6984, local10.anInt6973, local10.anInt6977, qn.class);
						if (local130 instanceof Class6_Sub1_Sub4) {
							Static146.method2510(local10.anInt6984, local10.anInt6973, local10.anInt6977, qn.class);
							@Pc(151) Class6_Sub1_Sub4 local151 = (Class6_Sub1_Sub4) local130;
							if (local151.aClass6_Sub1_2 != null) {
								Static483.method7135(local151.aClass6_Sub1_2, false);
							}
						}
					} else if (local30 == 3) {
						local87 = Static72.method1464(local10.anInt6984, local10.anInt6973, local10.anInt6977);
						if (local87 instanceof Class6_Sub3_Sub1) {
							Static509.method7293(local10.anInt6984, local10.anInt6973, local10.anInt6977);
							local100 = (Class6_Sub3_Sub1) local87;
							if (local100.aClass6_Sub3_1 != null) {
								Static266.method4658(local10.anInt6984, local10.anInt6973, local10.anInt6977, local100.aClass6_Sub3_1);
							}
						}
					}
					local10.method7820();
				} else if (local10.anInt6985 == Static223.anInt4829) {
					local30 = Static447.anIntArray696[local10.anInt6976];
					if (local30 == 0) {
						local169 = Static542.method7740(local10.anInt6984, local10.anInt6973, local10.anInt6977);
						if (local169 instanceof Class6_Sub2_Sub1) {
							local10.method7820();
						} else if (Static92.method1829(local10.anInt6984, local10.anInt6973, local10.anInt6977) == null) {
							local182 = new Class6_Sub2_Sub1(local10.anInt6976, local10.anInt6971, local10.anInt6983, local10.anInt6969, local10.anInt6980, local169);
							Static314.method5091(local10.anInt6984, local10.anInt6973, local10.anInt6977, local182, null);
						} else {
							local10.method7820();
						}
					} else if (local30 == 1) {
						local45 = Static183.method4959(local10.anInt6984, local10.anInt6973, local10.anInt6977);
						if (local45 instanceof Class6_Sub4_Sub2) {
							local10.method7820();
						} else if (Static444.method6750(local10.anInt6984, local10.anInt6973, local10.anInt6977) == null) {
							local58 = new Class6_Sub4_Sub2(local10.anInt6976, local10.anInt6971, local10.anInt6983, local10.anInt6969, local10.anInt6980, local45);
							Static509.method7291(local10.anInt6984, local10.anInt6973, local10.anInt6977, local58, null);
						} else {
							local10.method7820();
						}
					} else if (local30 == 2) {
						local130 = Static420.method6482(local10.anInt6984, local10.anInt6973, local10.anInt6977, qn.class);
						if (local130 instanceof Class6_Sub1_Sub4) {
							local10.method7820();
						} else {
							Static146.method2510(local10.anInt6984, local10.anInt6973, local10.anInt6977, qn.class);
							@Pc(382) Class242 local382 = Static454.aClass298_3.method7185(local10.anInt6981);
							@Pc(398) int local398;
							@Pc(395) int local395;
							if (local10.anInt6971 == 1 || local10.anInt6971 == 3) {
								local395 = local382.anInt7195;
								local398 = local382.anInt7193;
							} else {
								local395 = local382.anInt7193;
								local398 = local382.anInt7195;
							}
							@Pc(439) Class6_Sub1_Sub4 local439 = new Class6_Sub1_Sub4(local10.anInt6976, local10.anInt6971, local10.anInt6984, local10.anInt6983, local10.anInt6969, local10.anInt6980, local10.anInt6973, local10.anInt6973 + local398 - 1, local10.anInt6977, local395 + local10.anInt6977 - 1, local130);
							Static483.method7135(local439, false);
						}
					} else if (local30 == 3) {
						local87 = Static72.method1464(local10.anInt6984, local10.anInt6973, local10.anInt6977);
						if (local87 instanceof Class6_Sub3_Sub1) {
							local10.method7820();
						} else {
							local100 = new Class6_Sub3_Sub1(local10.anInt6983, local10.anInt6969, local10.anInt6980, local87);
							Static266.method4658(local10.anInt6984, local10.anInt6973, local10.anInt6977, local100);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	public static void method3685() {
		if (Static258.aFrame2 != null) {
			return;
		}
		@Pc(12) int local12 = Static493.anInt9484;
		@Pc(14) int local14 = Static531.anInt9232;
		@Pc(21) int local21 = Static265.anInt5511 - Static480.anInt8652 - local12;
		@Pc(29) int local29 = Static211.anInt4645 - local14 - Static412.anInt7547;
		if (local12 <= 0 && local21 <= 0 && local14 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static107.aFrame1 == null) {
				local47 = Static370.anApplet1;
			} else {
				local47 = Static107.aFrame1;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (local47 == Static107.aFrame1) {
				@Pc(61) Insets local61 = Static107.aFrame1.getInsets();
				local55 = local61.top;
				local53 = local61.left;
			}
			@Pc(70) Graphics local70 = local47.getGraphics();
			local70.setColor(Color.black);
			if (local12 > 0) {
				local70.fillRect(local53, local55, local12, Static211.anInt4645);
			}
			if (local14 > 0) {
				local70.fillRect(local53, local55, Static265.anInt5511, local14);
			}
			if (local21 > 0) {
				local70.fillRect(local53 + Static265.anInt5511 - local21, local55, local21, Static211.anInt4645);
			}
			if (local29 > 0) {
				local70.fillRect(local53, local55 + Static211.anInt4645 - local29, Static265.anInt5511, local29);
				return;
			}
		} catch (@Pc(125) Exception local125) {
			return;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!kr;II)V")
	public static void method3686(@OriginalArg(0) Class3_Sub27_Sub1 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) Class3_Sub17 local14 = (Class3_Sub17) Static47.aClass71_68.method2089();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2908; local21++) {
				if (local14.aClass212Array1[local21] != null) {
					if (local14.aClass212Array1[local21].anInt6547 == 2) {
						local14.anIntArray285[local21] = -5;
					}
					if (local14.aClass212Array1[local21].anInt6547 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass212Array2[local21] != null) {
					if (local14.aClass212Array2[local21].anInt6547 == 2) {
						local14.anIntArray285[local21] = -6;
					}
					if (local14.aClass212Array2[local21].anInt6547 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method4542(arg1);
			arg0.method7576(0);
			@Pc(102) int local102 = arg0.anInt9191;
			arg0.method7594(local14.anInt2910);
			for (@Pc(109) int local109 = 0; local109 < local14.anInt2908; local109++) {
				if (local14.anIntArray285[local109] == 0) {
					try {
						@Pc(130) int local130 = local14.anIntArray283[local109];
						@Pc(150) Field local150;
						@Pc(153) int local153;
						if (local130 == 0) {
							local150 = (Field) local14.aClass212Array1[local109].anObject13;
							local153 = local150.getInt(null);
							arg0.method7576(0);
							arg0.method7594(local153);
						} else if (local130 == 1) {
							local150 = (Field) local14.aClass212Array1[local109].anObject13;
							local150.setInt(null, local14.anIntArray284[local109]);
							arg0.method7576(0);
						} else if (local130 == 2) {
							local150 = (Field) local14.aClass212Array1[local109].anObject13;
							local153 = local150.getModifiers();
							arg0.method7576(0);
							arg0.method7594(local153);
						}
						@Pc(212) Method local212;
						if (local130 == 3) {
							local212 = (Method) local14.aClass212Array2[local109].anObject13;
							@Pc(217) byte[][] local217 = local14.aByteArrayArrayArray17[local109];
							@Pc(221) Object[] local221 = new Object[local217.length];
							for (@Pc(223) int local223 = 0; local223 < local217.length; local223++) {
								@Pc(235) ObjectInputStream local235 = new ObjectInputStream(new ByteArrayInputStream(local217[local223]));
								local221[local223] = local235.readObject();
							}
							@Pc(254) Object local254 = local212.invoke(null, local221);
							if (local254 == null) {
								arg0.method7576(0);
							} else if (local254 instanceof Number) {
								arg0.method7576(1);
								arg0.method7577(((Number) local254).longValue());
							} else if (local254 instanceof String) {
								arg0.method7576(2);
								arg0.method7608((String) local254);
							} else {
								arg0.method7576(4);
							}
						} else if (local130 == 4) {
							local212 = (Method) local14.aClass212Array2[local109].anObject13;
							local153 = local212.getModifiers();
							arg0.method7576(0);
							arg0.method7594(local153);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method7576(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method7576(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method7576(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method7576(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method7576(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method7576(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method7576(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method7576(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method7576(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method7576(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method7576(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method7576(-21);
					}
				} else {
					arg0.method7576(local14.anIntArray285[local109]);
				}
			}
			arg0.method7545(local102);
			arg0.method7559(arg0.anInt9191 - local102);
			local14.method7820();
		}
	}
}
