import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jl", name = "N", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!jl", name = "Q", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_100 = new Class34("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_101 = new Class34("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ki;)V")
	public static void method2868(@OriginalArg(1) Class17_Sub1_Sub1 arg0) {
		arg0.aBoolean472 = false;
		@Pc(18) Class24 local18;
		if (arg0.anInt4824 != -1) {
			local18 = Static110.method5411(arg0.anInt4824);
			if (local18 == null || local18.anIntArray90 == null) {
				arg0.anInt4824 = -1;
				arg0.aBoolean471 = false;
			} else {
				label297: {
					arg0.anInt4874++;
					if (local18.anIntArray90.length > arg0.anInt4847 && arg0.anInt4874 > local18.anIntArray89[arg0.anInt4847]) {
						arg0.anInt4847++;
						arg0.anInt4876++;
						arg0.anInt4874 = 1;
						Static318.method5216(arg0.anInt5109, arg0.anInt5108, arg0 == Static198.aClass17_Sub1_Sub1_Sub1_3, local18, arg0.anInt4847);
					}
					if (arg0.anInt4847 >= local18.anIntArray90.length) {
						arg0.anInt4874 = 0;
						arg0.anInt4847 = 0;
						if (arg0.aBoolean471) {
							arg0.anInt4824 = arg0.method4319().method3397();
							if (arg0.anInt4824 == -1) {
								arg0.aBoolean471 = false;
								break label297;
							}
							local18 = Static110.method5411(arg0.anInt4824);
						}
						Static318.method5216(arg0.anInt5109, arg0.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg0, local18, arg0.anInt4847);
					}
					arg0.anInt4876 = arg0.anInt4847 + 1;
					if (local18.anIntArray90.length <= arg0.anInt4876) {
						arg0.anInt4876 = 0;
					}
				}
			}
		}
		@Pc(192) Class24 local192;
		if (arg0.anInt4884 != -1 && Static5.anInt208 >= arg0.anInt4845) {
			@Pc(176) Class67 local176 = Static265.method5633(arg0.anInt4884);
			@Pc(179) int local179 = local176.anInt2088;
			if (local179 == -1) {
				arg0.anInt4884 = -1;
			} else {
				label299: {
					local192 = Static110.method5411(local179);
					if (local176.aBoolean193) {
						if (local192.anInt1046 == 3) {
							if (arg0.anInt4897 > 0 && Static5.anInt208 >= arg0.anInt4873 && arg0.anInt4868 < Static5.anInt208) {
								arg0.anInt4884 = -1;
								break label299;
							}
						} else if (local192.anInt1046 == 1 && arg0.anInt4897 > 0 && arg0.anInt4873 <= Static5.anInt208 && Static5.anInt208 > arg0.anInt4868) {
							arg0.anInt4845 = Static5.anInt208 + 1;
							break label299;
						}
					}
					if (local192 == null || local192.anIntArray90 == null) {
						arg0.anInt4884 = -1;
					} else {
						if (arg0.anInt4881 < 0) {
							arg0.anInt4881 = 0;
							Static318.method5216(arg0.anInt5109, arg0.anInt5108, arg0 == Static198.aClass17_Sub1_Sub1_Sub1_3, local192, 0);
						}
						arg0.anInt4855++;
						if (local192.anIntArray90.length > arg0.anInt4881 && local192.anIntArray89[arg0.anInt4881] < arg0.anInt4855) {
							arg0.anInt4855 = 1;
							arg0.anInt4881++;
							Static318.method5216(arg0.anInt5109, arg0.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg0, local192, arg0.anInt4881);
						}
						if (arg0.anInt4881 >= local192.anIntArray90.length) {
							if (local176.aBoolean193) {
								arg0.anInt4832++;
								arg0.anInt4881 -= local192.anInt1034;
								if (arg0.anInt4832 >= local192.anInt1038) {
									arg0.anInt4884 = -1;
								} else if (arg0.anInt4881 >= 0 && local192.anIntArray90.length > arg0.anInt4881) {
									Static318.method5216(arg0.anInt5109, arg0.anInt5108, arg0 == Static198.aClass17_Sub1_Sub1_Sub1_3, local192, arg0.anInt4881);
								} else {
									arg0.anInt4884 = -1;
								}
							} else {
								arg0.anInt4884 = -1;
							}
						}
						arg0.anInt4833 = arg0.anInt4881 + 1;
						if (arg0.anInt4833 >= local192.anIntArray90.length) {
							if (local176.aBoolean193) {
								arg0.anInt4833 -= local192.anInt1034;
								if (arg0.anInt4832 + 1 >= local192.anInt1038) {
									arg0.anInt4833 = -1;
								} else if (arg0.anInt4833 < 0 || local192.anIntArray90.length <= arg0.anInt4833) {
									arg0.anInt4833 = -1;
								}
							} else {
								arg0.anInt4833 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4830 != -1 && arg0.anInt4856 <= 1) {
			local18 = Static110.method5411(arg0.anInt4830);
			if (local18.anInt1046 == 3) {
				if (arg0.anInt4897 > 0 && Static5.anInt208 >= arg0.anInt4873 && arg0.anInt4868 < Static5.anInt208) {
					arg0.anInt4830 = -1;
				}
			} else if (local18.anInt1046 == 1 && arg0.anInt4897 > 0 && arg0.anInt4873 <= Static5.anInt208 && arg0.anInt4868 < Static5.anInt208) {
				arg0.anInt4856 = 2;
			}
		}
		if (arg0.anInt4830 != -1 && arg0.anInt4856 == 0) {
			local18 = Static110.method5411(arg0.anInt4830);
			if (local18 == null || local18.anIntArray90 == null) {
				arg0.anInt4830 = -1;
			} else {
				arg0.anInt4840++;
				if (local18.anIntArray90.length > arg0.anInt4863 && local18.anIntArray89[arg0.anInt4863] < arg0.anInt4840) {
					arg0.anInt4863++;
					arg0.anInt4840 = 1;
					Static318.method5216(arg0.anInt5109, arg0.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg0, local18, arg0.anInt4863);
				}
				if (arg0.anInt4863 >= local18.anIntArray90.length) {
					arg0.anInt4863 -= local18.anInt1034;
					arg0.anInt4828++;
					if (local18.anInt1038 <= arg0.anInt4828) {
						arg0.anInt4830 = -1;
					} else if (arg0.anInt4863 >= 0 && arg0.anInt4863 < local18.anIntArray90.length) {
						Static318.method5216(arg0.anInt5109, arg0.anInt5108, arg0 == Static198.aClass17_Sub1_Sub1_Sub1_3, local18, arg0.anInt4863);
					} else {
						arg0.anInt4830 = -1;
					}
				}
				arg0.anInt4854 = arg0.anInt4863 + 1;
				if (arg0.anInt4854 >= local18.anIntArray90.length) {
					arg0.anInt4854 -= local18.anInt1034;
					if (local18.anInt1038 <= arg0.anInt4828 + 1) {
						arg0.anInt4854 = -1;
					} else if (arg0.anInt4854 < 0 || arg0.anInt4854 >= local18.anIntArray90.length) {
						arg0.anInt4854 = -1;
					}
				}
				arg0.aBoolean472 = local18.aBoolean100;
			}
		}
		if (arg0.anInt4856 > 0) {
			arg0.anInt4856--;
		}
		for (@Pc(727) int local727 = 0; local727 < arg0.aClass184Array3.length; local727++) {
			@Pc(734) Class184 local734 = arg0.aClass184Array3[local727];
			if (local734 != null) {
				if (local734.anInt5662 > 0) {
					local734.anInt5662--;
				} else {
					local192 = Static110.method5411(local734.anInt5656);
					if (local192 == null || local192.anIntArray90 == null) {
						arg0.aClass184Array3[local727] = null;
					} else {
						local734.anInt5659++;
						if (local192.anIntArray90.length > local734.anInt5658 && local192.anIntArray89[local734.anInt5658] < local734.anInt5659) {
							local734.anInt5659 = 1;
							local734.anInt5658++;
							Static318.method5216(arg0.anInt5109, arg0.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg0, local192, local734.anInt5658);
						}
						if (local192.anIntArray90.length <= local734.anInt5658) {
							local734.anInt5660++;
							local734.anInt5658 -= local192.anInt1034;
							if (local192.anInt1038 <= local734.anInt5660) {
								arg0.aClass184Array3[local727] = null;
							} else if (local734.anInt5658 >= 0 && local734.anInt5658 < local192.anIntArray90.length) {
								Static318.method5216(arg0.anInt5109, arg0.anInt5108, arg0 == Static198.aClass17_Sub1_Sub1_Sub1_3, local192, local734.anInt5658);
							} else {
								arg0.aClass184Array3[local727] = null;
							}
						}
						local734.anInt5657 = local734.anInt5658 + 1;
						if (local192.anIntArray90.length <= local734.anInt5657) {
							local734.anInt5657 -= local192.anInt1034;
							if (local192.anInt1038 <= local734.anInt5660 + 1) {
								local734.anInt5657 = -1;
							} else if (local734.anInt5657 < 0 || local734.anInt5657 >= local192.anIntArray90.length) {
								local734.anInt5657 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!aq;)Ljava/lang/String;")
	public static String method2869(@OriginalArg(1) Class12 arg0) {
		if (Static44.method1023(arg0).method5589() == 0) {
			return null;
		} else if (arg0.aString8 == null || arg0.aString8.trim().length() == 0) {
			return Static185.aBoolean369 ? "Hidden-use" : null;
		} else {
			return arg0.aString8;
		}
	}
}
