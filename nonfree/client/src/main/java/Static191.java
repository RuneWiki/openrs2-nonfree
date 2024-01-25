import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "J")
	public static long aLong293;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "[S")
	private static final short[] aShortArray156 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "[S")
	private static final short[] aShortArray157 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "[S")
	private static final short[] aShortArray158 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "[S")
	private static final short[] aShortArray159 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	public static int anInt10376 = 0;

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "[[S")
	public static final short[][] aShortArrayArray26 = new short[][] { aShortArray156, aShortArray159, aShortArray158, aShortArray157 };

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BZIII)Lclient!nc;")
	public static Class5_Sub38 method8803(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class5_Sub38 local7 = new Class5_Sub38();
		local7.anInt6418 = arg2;
		local7.anInt6419 = arg3;
		Static438.aClass306_31.method6944(local7, (long) arg1, -12002);
		Static498.method6949(arg2);
		@Pc(35) Class238 local35 = Static305.method4761(arg1);
		if (local35 != null) {
			Static333.method5032(local35);
		}
		if (Static64.aClass238_1 != null) {
			Static333.method5032(Static64.aClass238_1);
			Static64.aClass238_1 = null;
		}
		Static292.method4638(-119);
		if (local35 != null) {
			Static374.method5569(local35, !arg0);
		}
		if (!arg0) {
			Static247.method3963(arg2);
		}
		if (!arg0 && Static381.anInt6411 != -1) {
			Static194.method8970(Static381.anInt6411, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!oi;I)V")
	public static void method8804(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt6837 != -1) {
			@Pc(16) Class264 local16 = Static315.aClass14_1.method227(arg0.anInt6837);
			if (local16 == null || local16.anIntArray423 == null) {
				arg0.aBoolean456 = false;
				arg0.anInt6837 = -1;
			} else {
				label277: {
					arg0.anInt6879++;
					if (local16.anIntArray423.length > arg0.anInt6854 && local16.anIntArray425[arg0.anInt6854] < arg0.anInt6879) {
						arg0.anInt6867++;
						arg0.anInt6854++;
						arg0.anInt6879 = 1;
						if (!arg0.aBoolean455) {
							Static628.method8566(local16, arg0.anInt6854, arg0);
						}
					}
					if (arg0.anInt6854 >= local16.anIntArray423.length) {
						arg0.anInt6854 = 0;
						arg0.anInt6879 = 0;
						if (arg0.aBoolean456) {
							arg0.anInt6837 = arg0.method5930().method1746();
							if (arg0.anInt6837 == -1) {
								arg0.aBoolean456 = false;
								break label277;
							}
							local16 = Static315.aClass14_1.method227(arg0.anInt6837);
						}
						if (!arg0.aBoolean455) {
							Static628.method8566(local16, arg0.anInt6854, arg0);
						}
					}
					arg0.anInt6867 = arg0.anInt6854 + 1;
					if (local16.anIntArray423 == null) {
						arg0.anInt6837 = -1;
						arg0.aBoolean456 = false;
					} else if (local16.anIntArray423.length <= arg0.anInt6867) {
						arg0.anInt6867 = 0;
					}
				}
			}
		}
		@Pc(240) Class264 local240;
		for (@Pc(185) int local185 = 0; local185 < arg0.aClass337Array3.length; local185++) {
			if (arg0.aClass337Array3[local185].anInt8754 != -1 && arg0.aClass337Array3[local185].anInt8756 <= Static565.anInt8921) {
				@Pc(219) Class295 local219 = Static463.aClass352_1.method8006(arg0.aClass337Array3[local185].anInt8754);
				@Pc(222) int local222 = local219.anInt7610;
				if (local222 == -1) {
					arg0.aClass337Array3[local185].anInt8754 = -1;
				} else {
					local240 = Static315.aClass14_1.method227(local222);
					if (local219.aBoolean514) {
						if (local240.anInt7041 == 3) {
							if (arg0.anInt6897 > 0 && Static565.anInt8921 >= arg0.anInt6893 && arg0.anInt6835 < Static565.anInt8921) {
								arg0.aClass337Array3[local185].anInt8754 = -1;
								continue;
							}
						} else if (local240.anInt7041 == 1 && arg0.anInt6897 > 0 && Static565.anInt8921 >= arg0.anInt6893 && Static565.anInt8921 > arg0.anInt6835) {
							arg0.aClass337Array3[local185].anInt8756 = Static565.anInt8921 + 1;
							continue;
						}
					}
					if (local240 == null || local240.anIntArray423 == null) {
						arg0.aClass337Array3[local185].anInt8754 = -1;
					} else {
						if (arg0.aClass337Array3[local185].anInt8753 < 0) {
							arg0.aClass337Array3[local185].anInt8753 = 0;
							if (!arg0.aBoolean455) {
								Static628.method8566(local240, 0, arg0);
							}
						}
						arg0.aClass337Array3[local185].anInt8760++;
						if (arg0.aClass337Array3[local185].anInt8753 < local240.anIntArray423.length && local240.anIntArray425[arg0.aClass337Array3[local185].anInt8753] < arg0.aClass337Array3[local185].anInt8760) {
							arg0.aClass337Array3[local185].anInt8760 = 1;
							arg0.aClass337Array3[local185].anInt8753++;
							if (!arg0.aBoolean455) {
								Static628.method8566(local240, arg0.aClass337Array3[local185].anInt8753, arg0);
							}
						}
						if (local240.anIntArray423.length <= arg0.aClass337Array3[local185].anInt8753) {
							if (local219.aBoolean514) {
								arg0.aClass337Array3[local185].anInt8753 -= local240.anInt7050;
								arg0.aClass337Array3[local185].anInt8750++;
								if (arg0.aClass337Array3[local185].anInt8750 >= local240.anInt7033) {
									arg0.aClass337Array3[local185].anInt8754 = -1;
								} else if (arg0.aClass337Array3[local185].anInt8753 < 0 || local240.anIntArray423.length <= arg0.aClass337Array3[local185].anInt8753) {
									arg0.aClass337Array3[local185].anInt8754 = -1;
								} else if (!arg0.aBoolean455) {
									Static628.method8566(local240, arg0.aClass337Array3[local185].anInt8753, arg0);
								}
							} else {
								arg0.aClass337Array3[local185].anInt8754 = -1;
							}
						}
						arg0.aClass337Array3[local185].anInt8759 = arg0.aClass337Array3[local185].anInt8753 + 1;
						if (local240.anIntArray423.length <= arg0.aClass337Array3[local185].anInt8759) {
							if (local219.aBoolean514) {
								arg0.aClass337Array3[local185].anInt8759 -= local240.anInt7050;
								if (arg0.aClass337Array3[local185].anInt8750 + 1 >= local240.anInt7033) {
									arg0.aClass337Array3[local185].anInt8759 = -1;
								} else if (arg0.aClass337Array3[local185].anInt8759 < 0 || local240.anIntArray423.length <= arg0.aClass337Array3[local185].anInt8759) {
									arg0.aClass337Array3[local185].anInt8759 = -1;
								}
							} else {
								arg0.aClass337Array3[local185].anInt8759 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(685) Class264 local685;
		if (arg0.anInt6872 != -1 && arg0.anInt6886 <= 1) {
			local685 = Static315.aClass14_1.method227(arg0.anInt6872);
			if (local685.anInt7041 == 3) {
				if (arg0.anInt6897 > 0 && arg0.anInt6893 <= Static565.anInt8921 && Static565.anInt8921 > arg0.anInt6835) {
					arg0.anInt6872 = -1;
					arg0.anIntArray403 = null;
				}
			} else if (local685.anInt7041 == 1 && arg0.anInt6897 > 0 && Static565.anInt8921 >= arg0.anInt6893 && arg0.anInt6835 < Static565.anInt8921) {
				arg0.anInt6886 = 2;
			}
		}
		if (arg0.anInt6872 != -1 && arg0.anInt6886 == 0) {
			local685 = Static315.aClass14_1.method227(arg0.anInt6872);
			if (local685 == null || local685.anIntArray423 == null) {
				arg0.anInt6872 = -1;
				arg0.anIntArray403 = null;
			} else {
				arg0.anInt6869++;
				if (local685.anIntArray423.length > arg0.anInt6839 && local685.anIntArray425[arg0.anInt6839] < arg0.anInt6869) {
					arg0.anInt6839++;
					arg0.anInt6869 = 1;
					if (!arg0.aBoolean455) {
						Static628.method8566(local685, arg0.anInt6839, arg0);
					}
				}
				if (local685.anIntArray423.length <= arg0.anInt6839) {
					arg0.anInt6844++;
					arg0.anInt6839 -= local685.anInt7050;
					if (arg0.anInt6844 >= local685.anInt7033) {
						arg0.anInt6872 = -1;
						arg0.anIntArray403 = null;
					} else if (arg0.anInt6839 < 0 || arg0.anInt6839 >= local685.anIntArray423.length) {
						arg0.anIntArray403 = null;
						arg0.anInt6872 = -1;
					} else if (!arg0.aBoolean455) {
						Static628.method8566(local685, arg0.anInt6839, arg0);
					}
				}
				arg0.anInt6836 = arg0.anInt6839 + 1;
				if (arg0.anInt6836 >= local685.anIntArray423.length) {
					arg0.anInt6836 -= local685.anInt7050;
					if (arg0.anInt6844 + 1 >= local685.anInt7033) {
						arg0.anInt6836 = -1;
					} else if (arg0.anInt6836 < 0 || arg0.anInt6836 >= local685.anIntArray423.length) {
						arg0.anInt6836 = -1;
					}
				}
			}
		}
		if (arg0.anInt6886 > 0) {
			arg0.anInt6886--;
		}
		for (@Pc(1015) int local1015 = 0; local1015 < arg0.aClass64Array3.length; local1015++) {
			@Pc(1022) Class64 local1022 = arg0.aClass64Array3[local1015];
			if (local1022 != null) {
				if (local1022.anInt1380 > 0) {
					local1022.anInt1380--;
				} else {
					local240 = Static315.aClass14_1.method227(local1022.anInt1376);
					if (local240 == null || local240.anIntArray423 == null) {
						arg0.aClass64Array3[local1015] = null;
					} else {
						local1022.anInt1378++;
						if (local1022.anInt1384 < local240.anIntArray423.length && local1022.anInt1378 > local240.anIntArray425[local1022.anInt1384]) {
							local1022.anInt1378 = 1;
							local1022.anInt1384++;
							if (!arg0.aBoolean455) {
								Static628.method8566(local240, local1022.anInt1384, arg0);
							}
						}
						if (local1022.anInt1384 >= local240.anIntArray423.length) {
							local1022.anInt1383++;
							local1022.anInt1384 -= local240.anInt7050;
							if (local240.anInt7033 <= local1022.anInt1383) {
								arg0.aClass64Array3[local1015] = null;
							} else if (local1022.anInt1384 < 0 || local240.anIntArray423.length <= local1022.anInt1384) {
								arg0.aClass64Array3[local1015] = null;
							} else if (!arg0.aBoolean455) {
								Static628.method8566(local240, local1022.anInt1384, arg0);
							}
						}
						local1022.anInt1377 = local1022.anInt1384 + 1;
						if (local240.anIntArray423.length <= local1022.anInt1377) {
							local1022.anInt1377 -= local240.anInt7050;
							if (local1022.anInt1383 + 1 >= local240.anInt7033) {
								local1022.anInt1377 = -1;
							} else if (local1022.anInt1377 < 0 || local240.anIntArray423.length <= local1022.anInt1377) {
								local1022.anInt1377 = -1;
							}
						}
					}
				}
			}
		}
	}
}
