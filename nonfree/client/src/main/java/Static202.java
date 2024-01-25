import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
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

public final class Static202 {

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
	public static final boolean aBoolean237 = false;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
	public static int[] anIntArray312 = new int[1];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!ia;)V")
	public static void method3183(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15_Sub1 arg1) {
		while (true) {
			@Pc(18) Class6_Sub32 local18 = (Class6_Sub32) Static44.aClass88_10.method1882();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt5923; local25++) {
				if (local18.aClass249Array2[local25] != null) {
					if (local18.aClass249Array2[local25].anInt6929 == 2) {
						local18.anIntArray522[local25] = -5;
					}
					if (local18.aClass249Array2[local25].anInt6929 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass249Array1[local25] != null) {
					if (local18.aClass249Array1[local25].anInt6929 == 2) {
						local18.anIntArray522[local25] = -6;
					}
					if (local18.aClass249Array1[local25].anInt6929 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method2605(arg0);
			arg1.method3075(0);
			@Pc(101) int local101 = arg1.anInt3487;
			arg1.method3107(local18.anInt5922);
			for (@Pc(108) int local108 = 0; local108 < local18.anInt5923; local108++) {
				if (local18.anIntArray522[local108] == 0) {
					try {
						@Pc(129) int local129 = local18.anIntArray521[local108];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local129 == 0) {
							local141 = (Field) local18.aClass249Array2[local108].anObject10;
							local145 = local141.getInt(null);
							arg1.method3075(0);
							arg1.method3107(local145);
						} else if (local129 == 1) {
							local141 = (Field) local18.aClass249Array2[local108].anObject10;
							local141.setInt(null, local18.anIntArray520[local108]);
							arg1.method3075(0);
						} else if (local129 == 2) {
							local141 = (Field) local18.aClass249Array2[local108].anObject10;
							local145 = local141.getModifiers();
							arg1.method3075(0);
							arg1.method3107(local145);
						}
						@Pc(215) Method local215;
						if (local129 == 3) {
							local215 = (Method) local18.aClass249Array1[local108].anObject10;
							@Pc(220) byte[][] local220 = local18.aByteArrayArrayArray17[local108];
							@Pc(224) Object[] local224 = new Object[local220.length];
							for (@Pc(226) int local226 = 0; local226 < local220.length; local226++) {
								@Pc(238) ObjectInputStream local238 = new ObjectInputStream(new ByteArrayInputStream(local220[local226]));
								local224[local226] = local238.readObject();
							}
							@Pc(253) Object local253 = local215.invoke(null, local224);
							if (local253 == null) {
								arg1.method3075(0);
							} else if (local253 instanceof Number) {
								arg1.method3075(1);
								arg1.method3115(((Number) local253).longValue());
							} else if (local253 instanceof String) {
								arg1.method3075(2);
								arg1.method3094((String) local253);
							} else {
								arg1.method3075(4);
							}
						} else if (local129 == 4) {
							local215 = (Method) local18.aClass249Array1[local108].anObject10;
							local145 = local215.getModifiers();
							arg1.method3075(0);
							arg1.method3107(local145);
						}
					} catch (@Pc(319) ClassNotFoundException local319) {
						arg1.method3075(-10);
					} catch (@Pc(325) InvalidClassException local325) {
						arg1.method3075(-11);
					} catch (@Pc(331) StreamCorruptedException local331) {
						arg1.method3075(-12);
					} catch (@Pc(337) OptionalDataException local337) {
						arg1.method3075(-13);
					} catch (@Pc(343) IllegalAccessException local343) {
						arg1.method3075(-14);
					} catch (@Pc(349) IllegalArgumentException local349) {
						arg1.method3075(-15);
					} catch (@Pc(355) InvocationTargetException local355) {
						arg1.method3075(-16);
					} catch (@Pc(361) SecurityException local361) {
						arg1.method3075(-17);
					} catch (@Pc(367) IOException local367) {
						arg1.method3075(-18);
					} catch (@Pc(373) NullPointerException local373) {
						arg1.method3075(-19);
					} catch (@Pc(379) Exception local379) {
						arg1.method3075(-20);
					} catch (@Pc(385) Throwable local385) {
						arg1.method3075(-21);
					}
				} else {
					arg1.method3075(local18.anIntArray522[local108]);
				}
			}
			arg1.method3105(local101);
			arg1.method3118(arg1.anInt3487 - local101);
			local18.method5977();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method3184() {
		if (Static238.anInt4074 != 0) {
			Static59.anInt1234 -= Static238.anInt4074 * 5;
			if (Static59.anInt1234 >= Static371.anInt6171) {
				Static59.anInt1234 = Static371.anInt6171 - 1;
			}
			Static238.anInt4074 = 0;
			if (Static59.anInt1234 < 0) {
				Static59.anInt1234 = 0;
			}
		}
		if (Static42.anInt908 < 102) {
			Static42.anInt908 += 6;
		}
		for (@Pc(35) int local35 = 0; local35 < Static203.anInt3583; local35++) {
			@Pc(48) int local48 = Static370.aClass139Array1[local35].method3202();
			@Pc(54) char local54 = Static370.aClass139Array1[local35].method3201();
			if (local48 == 84) {
				Static14.method212();
			} else if (Static326.aClass86_1.method1867(82) && local48 == 66) {
				if (Static15.aClipboard1 != null) {
					@Pc(353) String local353 = "";
					for (@Pc(358) int local358 = Static183.aStringArray40.length - 1; local358 >= 0; local358--) {
						if (Static183.aStringArray40[local358] != null && Static183.aStringArray40[local358].length() > 0) {
							local353 = local353 + Static183.aStringArray40[local358] + '\n';
						}
					}
					Static15.aClipboard1.setContents(new StringSelection(local353), null);
				}
			} else if (Static326.aClass86_1.method1867(82) && local48 == 67) {
				if (Static15.aClipboard1 != null) {
					@Pc(295) Transferable local295 = Static15.aClipboard1.getContents(null);
					if (local295 != null) {
						try {
							@Pc(302) String local302 = (String) local295.getTransferData(DataFlavor.stringFlavor);
							if (local302 != null) {
								@Pc(309) String[] local309 = Static109.method1808('\n', local302);
								if (local309.length > 1) {
									for (@Pc(317) int local317 = 0; local317 < local309.length; local317++) {
										Static427.aString67 = local309[local317];
										Static14.method212();
									}
								} else {
									Static427.aString67 = Static427.aString67 + local302;
								}
							}
						} catch (@Pc(347) Exception local347) {
						}
					}
				}
			} else if (local48 == 85 && Static255.anInt4369 > 0) {
				Static427.aString67 = Static427.aString67.substring(0, Static255.anInt4369 - 1) + Static427.aString67.substring(Static255.anInt4369);
				Static255.anInt4369--;
			} else if (local48 == 101 && Static255.anInt4369 < Static427.aString67.length()) {
				Static427.aString67 = Static427.aString67.substring(0, Static255.anInt4369) + Static427.aString67.substring(Static255.anInt4369 + 1);
			} else if (local48 == 96 && Static255.anInt4369 > 0) {
				Static255.anInt4369--;
			} else if (local48 == 97 && Static255.anInt4369 < Static427.aString67.length()) {
				Static255.anInt4369++;
			} else if (local48 == 102) {
				Static255.anInt4369 = 0;
			} else if (local48 == 103) {
				Static255.anInt4369 = Static427.aString67.length();
			} else if (local48 == 104 && Static336.anInt5655 < Static183.aStringArray40.length) {
				Static336.anInt5655++;
				Static139.method3102();
				Static255.anInt4369 = Static427.aString67.length();
			} else if (local48 == 105 && Static336.anInt5655 > 0) {
				Static336.anInt5655--;
				Static139.method3102();
				Static255.anInt4369 = Static427.aString67.length();
			} else if (Static284.method4265(local54) || local54 == ':' || local54 == ',' || local54 == ' ' || local54 == '_' || local54 == '-' || local54 == '+' || local54 == '[' || local54 == ']') {
				Static427.aString67 = Static427.aString67.substring(0, Static255.anInt4369) + Static370.aClass139Array1[local35].method3201() + Static427.aString67.substring(Static255.anInt4369);
				Static255.anInt4369++;
			}
		}
		Static203.anInt3583 = 0;
		Static207.method3239();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method3187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local19;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZIZ)V")
	public static void method3188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static118.method1905(arg3, Static148.aClass184_Sub1Array1.length - 1, arg0, arg1, 0, arg2);
		Static311.anInt5063 = 0;
		Static141.aClass6_Sub22_1 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
	public static void method3190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static449.aClass6_Sub15_Sub1_2.method3107(arg0);
		Static449.aClass6_Sub15_Sub1_2.method3117(arg1);
		Static449.aClass6_Sub15_Sub1_2.method3106(arg2);
	}
}
