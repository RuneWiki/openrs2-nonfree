import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
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

public final class Static256 {

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
	public static int anInt5074;

	@OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
	public static int anInt5079;

	@OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
	public static int anInt5068 = 0;

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_93 = new Class93("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!qj", name = "X", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_157 = new Class119(64);

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "[I")
	public static final int[] anIntArray386 = new int[4096];

	@OriginalMember(owner = "client!qj", name = "eb", descriptor = "I")
	public static int anInt5081 = -1;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)I")
	public static int method4641() {
		@Pc(10) Class119 local10 = Static162.aClass119_99;
		synchronized (Static162.aClass119_99) {
			return Static162.aClass119_99.method3314();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;)V")
	public static void method4642(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(14) Graphics local14 = Static240.aCanvas4.getGraphics();
			if (Static74.aFont2 == null) {
				Static74.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local14.setColor(Color.black);
				local14.fillRect(0, 0, Static136.anInt2829, Static198.anInt3876);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static133.anImage2 == null) {
					Static133.anImage2 = Static240.aCanvas4.createImage(304, 34);
				}
				@Pc(71) Graphics local71 = Static133.anImage2.getGraphics();
				local71.setColor(arg2);
				local71.drawRect(0, 0, 303, 33);
				local71.setColor(arg5);
				local71.fillRect(2, 2, arg1 * 3, 30);
				local71.setColor(Color.black);
				local71.drawRect(1, 1, 301, 31);
				local71.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local71.setFont(Static74.aFont2);
				local71.setColor(arg3);
				local71.drawString(arg0, (304 - arg0.length() * 6) / 2, 22);
				local14.drawImage(Static133.anImage2, Static136.anInt2829 / 2 - 152, Static198.anInt3876 / 2 + -18, null);
			} catch (@Pc(151) Exception local151) {
				@Pc(157) int local157 = Static136.anInt2829 / 2 - 152;
				@Pc(163) int local163 = Static198.anInt3876 / 2 - 18;
				local14.setColor(arg2);
				local14.drawRect(0, 0, 303, 33);
				local14.setColor(arg5);
				local14.fillRect(local157 + 2, local163 + 2, arg1 * 3, 30);
				local14.setColor(Color.black);
				local14.drawRect(local157 + 1, local163 + 1, 301, 31);
				local14.fillRect(local157 + arg1 * 3 + 2, local163 + 2, 300 - arg1 * 3, 30);
				local14.setFont(Static74.aFont2);
				local14.setColor(arg3);
				local14.drawString(arg0, local157 + (304 - arg0.length() * 6) / 2, local163 - -22);
			}
			if (Static333.aString62 != null) {
				local14.setFont(Static74.aFont2);
				local14.setColor(arg3);
				local14.drawString(Static333.aString62, Static136.anInt2829 / 2 - Static333.aString62.length() * 6 / 2, Static198.anInt3876 / 2 + -26);
			}
		} catch (@Pc(269) Exception local269) {
			Static240.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)V")
	public static void method4643() {
		Static113.anInt2542 = -1;
		Static201.anInt3909 = -1;
		Static260.anInt5271 = 0;
		Static116.anInt2576 = -1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!fi;)V")
	public static void method4644(@OriginalArg(2) Class2_Sub10_Sub1 arg0) {
		while (true) {
			@Pc(14) Class2_Sub37 local14 = (Class2_Sub37) Static240.aClass216_38.method5992();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt5454; local21++) {
				if (local14.aClass193Array1[local21] != null) {
					if (local14.aClass193Array1[local21].anInt6293 == 2) {
						local14.anIntArray399[local21] = -5;
					}
					if (local14.aClass193Array1[local21].anInt6293 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass193Array2[local21] != null) {
					if (local14.aClass193Array2[local21].anInt6293 == 2) {
						local14.anIntArray399[local21] = -6;
					}
					if (local14.aClass193Array2[local21].anInt6293 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2049(163);
			arg0.method4430(0);
			@Pc(101) int local101 = arg0.anInt4807;
			arg0.method4450(local14.anInt5455);
			for (@Pc(108) int local108 = 0; local108 < local14.anInt5454; local108++) {
				if (local14.anIntArray399[local108] == 0) {
					try {
						@Pc(129) int local129 = local14.anIntArray403[local108];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local129 == 0) {
							local141 = (Field) local14.aClass193Array1[local108].anObject7;
							local145 = local141.getInt(null);
							arg0.method4430(0);
							arg0.method4450(local145);
						} else if (local129 == 1) {
							local141 = (Field) local14.aClass193Array1[local108].anObject7;
							local141.setInt(null, local14.anIntArray401[local108]);
							arg0.method4430(0);
						} else if (local129 == 2) {
							local141 = (Field) local14.aClass193Array1[local108].anObject7;
							local145 = local141.getModifiers();
							arg0.method4430(0);
							arg0.method4450(local145);
						}
						@Pc(211) Method local211;
						if (local129 == 3) {
							local211 = (Method) local14.aClass193Array2[local108].anObject7;
							@Pc(216) byte[][] local216 = local14.aByteArrayArrayArray8[local108];
							@Pc(220) Object[] local220 = new Object[local216.length];
							for (@Pc(222) int local222 = 0; local222 < local216.length; local222++) {
								@Pc(234) ObjectInputStream local234 = new ObjectInputStream(new ByteArrayInputStream(local216[local222]));
								local220[local222] = local234.readObject();
							}
							@Pc(249) Object local249 = local211.invoke(null, local220);
							if (local249 == null) {
								arg0.method4430(0);
							} else if (local249 instanceof Number) {
								arg0.method4430(1);
								arg0.method4462(((Number) local249).longValue());
							} else if (local249 instanceof String) {
								arg0.method4430(2);
								arg0.method4443((String) local249);
							} else {
								arg0.method4430(4);
							}
						} else if (local129 == 4) {
							local211 = (Method) local14.aClass193Array2[local108].anObject7;
							local145 = local211.getModifiers();
							arg0.method4430(0);
							arg0.method4450(local145);
						}
					} catch (@Pc(319) ClassNotFoundException local319) {
						arg0.method4430(-10);
					} catch (@Pc(325) InvalidClassException local325) {
						arg0.method4430(-11);
					} catch (@Pc(331) StreamCorruptedException local331) {
						arg0.method4430(-12);
					} catch (@Pc(337) OptionalDataException local337) {
						arg0.method4430(-13);
					} catch (@Pc(343) IllegalAccessException local343) {
						arg0.method4430(-14);
					} catch (@Pc(349) IllegalArgumentException local349) {
						arg0.method4430(-15);
					} catch (@Pc(355) InvocationTargetException local355) {
						arg0.method4430(-16);
					} catch (@Pc(361) SecurityException local361) {
						arg0.method4430(-17);
					} catch (@Pc(367) IOException local367) {
						arg0.method4430(-18);
					} catch (@Pc(373) NullPointerException local373) {
						arg0.method4430(-19);
					} catch (@Pc(379) Exception local379) {
						arg0.method4430(-20);
					} catch (@Pc(385) Throwable local385) {
						arg0.method4430(-21);
					}
				} else {
					arg0.method4430(local14.anIntArray399[local108]);
				}
			}
			arg0.method4442(local101);
			arg0.method4431(arg0.anInt4807 - local101);
			local14.method5945();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!tq;ILjava/lang/String;Z)Lclient!ns;")
	public static Class142 method4648(@OriginalArg(0) Class191 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method5446(arg1);
		if (local10 == -1) {
			return new Class142(0);
		}
		@Pc(24) int[] local24 = arg0.method5447(local10);
		@Pc(30) Class142 local30 = new Class142(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local30.anInt4249 > local37) {
				@Pc(53) Class2_Sub10 local53 = new Class2_Sub10(arg0.method5459(local10, local24[local39++]));
				@Pc(57) int local57 = local53.method4444();
				@Pc(61) int local61 = local53.method4464();
				@Pc(65) int local65 = local53.method4421();
				if (!arg2 && local65 == 1) {
					local30.anInt4249--;
				} else {
					local30.anIntArray334[local37] = local57;
					local30.anIntArray335[local37] = local61;
					local37++;
				}
			}
			return local30;
		}
	}
}
