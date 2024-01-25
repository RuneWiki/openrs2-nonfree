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

public final class Static361 {

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_162 = new Class140("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_163 = new Class140("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "[I")
	public static final int[] anIntArray528 = new int[200];

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "Z")
	public static final boolean aBoolean610 = false;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public static void method5747() {
		Static193.aClass41_20.method907();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!jk;II)V")
	public static void method5748(@OriginalArg(0) Class2_Sub12_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) Class2_Sub22 local14 = (Class2_Sub22) Static122.aClass180_17.method4919();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt3154; local21++) {
				if (local14.aClass26Array2[local21] != null) {
					if (local14.aClass26Array2[local21].anInt484 == 2) {
						local14.anIntArray250[local21] = -5;
					}
					if (local14.aClass26Array2[local21].anInt484 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass26Array1[local21] != null) {
					if (local14.aClass26Array1[local21].anInt484 == 2) {
						local14.anIntArray250[local21] = -6;
					}
					if (local14.aClass26Array1[local21].anInt484 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method3171(arg1);
			arg0.method3147(0);
			@Pc(96) int local96 = arg0.anInt3606;
			arg0.method3162(local14.anInt3155);
			for (@Pc(103) int local103 = 0; local103 < local14.anInt3154; local103++) {
				if (local14.anIntArray250[local103] == 0) {
					try {
						@Pc(124) int local124 = local14.anIntArray251[local103];
						@Pc(139) Field local139;
						@Pc(165) int local165;
						if (local124 == 0) {
							local139 = (Field) local14.aClass26Array2[local103].anObject1;
							local165 = local139.getInt(null);
							arg0.method3147(0);
							arg0.method3162(local165);
						} else if (local124 == 1) {
							local139 = (Field) local14.aClass26Array2[local103].anObject1;
							local139.setInt(null, local14.anIntArray252[local103]);
							arg0.method3147(0);
						} else if (local124 == 2) {
							local139 = (Field) local14.aClass26Array2[local103].anObject1;
							local165 = local139.getModifiers();
							arg0.method3147(0);
							arg0.method3162(local165);
						}
						@Pc(209) Method local209;
						if (local124 == 3) {
							local209 = (Method) local14.aClass26Array1[local103].anObject1;
							@Pc(234) byte[][] local234 = local14.aByteArrayArrayArray5[local103];
							@Pc(238) Object[] local238 = new Object[local234.length];
							for (@Pc(240) int local240 = 0; local240 < local234.length; local240++) {
								@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local234[local240]));
								local238[local240] = local252.readObject();
							}
							@Pc(271) Object local271 = local209.invoke(null, local238);
							if (local271 == null) {
								arg0.method3147(0);
							} else if (local271 instanceof Number) {
								arg0.method3147(1);
								arg0.method3130(((Number) local271).longValue());
							} else if (local271 instanceof String) {
								arg0.method3147(2);
								arg0.method3156((String) local271);
							} else {
								arg0.method3147(4);
							}
						} else if (local124 == 4) {
							local209 = (Method) local14.aClass26Array1[local103].anObject1;
							local165 = local209.getModifiers();
							arg0.method3147(0);
							arg0.method3162(local165);
						}
					} catch (@Pc(314) ClassNotFoundException local314) {
						arg0.method3147(-10);
					} catch (@Pc(320) InvalidClassException local320) {
						arg0.method3147(-11);
					} catch (@Pc(326) StreamCorruptedException local326) {
						arg0.method3147(-12);
					} catch (@Pc(332) OptionalDataException local332) {
						arg0.method3147(-13);
					} catch (@Pc(338) IllegalAccessException local338) {
						arg0.method3147(-14);
					} catch (@Pc(344) IllegalArgumentException local344) {
						arg0.method3147(-15);
					} catch (@Pc(350) InvocationTargetException local350) {
						arg0.method3147(-16);
					} catch (@Pc(356) SecurityException local356) {
						arg0.method3147(-17);
					} catch (@Pc(362) IOException local362) {
						arg0.method3147(-18);
					} catch (@Pc(368) NullPointerException local368) {
						arg0.method3147(-19);
					} catch (@Pc(374) Exception local374) {
						arg0.method3147(-20);
					} catch (@Pc(380) Throwable local380) {
						arg0.method3147(-21);
					}
				} else {
					arg0.method3147(local14.anIntArray250[local103]);
				}
			}
			arg0.method3129(local96);
			arg0.method3112(arg0.anInt3606 - local96);
			local14.method5723();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!ef;Lclient!sc;)V")
	public static void method5749(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub12 arg1, @OriginalArg(3) Class179 arg2) {
		@Pc(17) Class2_Sub22 local17 = new Class2_Sub22();
		local17.anInt3154 = arg1.method3124();
		local17.anInt3155 = arg1.method3135();
		local17.anIntArray250 = new int[local17.anInt3154];
		local17.aClass26Array2 = new Class26[local17.anInt3154];
		local17.anIntArray251 = new int[local17.anInt3154];
		local17.anIntArray252 = new int[local17.anInt3154];
		local17.aByteArrayArrayArray5 = new byte[local17.anInt3154][][];
		local17.aClass26Array1 = new Class26[local17.anInt3154];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt3154; local59++) {
			try {
				@Pc(65) int local65 = arg1.method3124();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(85) int local85;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local79 = arg1.method3113();
					local83 = arg1.method3113();
					local85 = 0;
					if (local65 == 1) {
						local85 = arg1.method3135();
					}
					local17.anIntArray251[local59] = local65;
					local17.anIntArray252[local59] = local85;
					local17.aClass26Array2[local59] = arg2.method4899(local83, Static280.method4788(local79));
				} else if (local65 == 3 || local65 == 4) {
					local79 = arg1.method3113();
					local83 = arg1.method3113();
					local85 = arg1.method3124();
					@Pc(140) String[] local140 = new String[local85];
					for (@Pc(142) int local142 = 0; local142 < local85; local142++) {
						local140[local142] = arg1.method3113();
					}
					@Pc(157) byte[][] local157 = new byte[local85][];
					@Pc(170) int local170;
					if (local65 == 3) {
						for (@Pc(164) int local164 = 0; local164 < local85; local164++) {
							local170 = arg1.method3135();
							local157[local164] = new byte[local170];
							arg1.method3137(local157[local164], local170);
						}
					}
					local17.anIntArray251[local59] = local65;
					@Pc(199) Class[] local199 = new Class[local85];
					for (local170 = 0; local170 < local85; local170++) {
						local199[local170] = Static280.method4788(local140[local170]);
					}
					local17.aClass26Array1[local59] = arg2.method4882(local83, local199, Static280.method4788(local79));
					local17.aByteArrayArrayArray5[local59] = local157;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local17.anIntArray250[local59] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local17.anIntArray250[local59] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local17.anIntArray250[local59] = -3;
			} catch (@Pc(255) Exception local255) {
				local17.anIntArray250[local59] = -4;
			} catch (@Pc(262) Throwable local262) {
				local17.anIntArray250[local59] = -5;
			}
		}
		Static122.aClass180_17.method4909(local17);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V")
	public static void method5751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static241.anInt5136 * arg1 >> 8;
		if (local9 != 0 && arg0 != -1) {
			Static271.method4700(arg0, Static207.aClass104_115, local9);
			Static97.aBoolean179 = true;
		}
	}
}
