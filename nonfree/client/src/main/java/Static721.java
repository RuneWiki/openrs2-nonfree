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

public final class Static721 {

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Z")
	public static boolean aBoolean939 = false;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(CII)I")
	public static int method9619(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(26) char local26 = Character.toLowerCase(arg0);
			local15 = (local26 << 4) + 1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIII)I")
	public static int method9620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class145_Sub1.anIntArray760[arg0 * 8192 / arg3] >> 1;
		return ((65536 - local24) * arg2 >> 16) + (local24 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BZ)V")
	public static void method9621(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static610.anInt10725;
		@Pc(7) int local7 = Static371.anInt5923;
		if (arg0 && Static591.aBoolean812) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static396.aClass145_6.f(local7, local5);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!tw;)V")
	public static void method9622(@OriginalArg(1) Class2_Sub20_Sub2 arg0) {
		@Pc(10) Class2_Sub52 local10 = (Class2_Sub52) Static49.aClass60_17.method1226(7);
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local10.anInt9333; local18++) {
			if (local10.aClass163Array2[local18] != null) {
				if (local10.aClass163Array2[local18].anInt3843 == 2) {
					local10.anIntArray682[local18] = -5;
				}
				if (local10.aClass163Array2[local18].anInt3843 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass163Array1[local18] != null) {
				if (local10.aClass163Array1[local18].anInt3843 == 2) {
					local10.anIntArray682[local18] = -6;
				}
				if (local10.aClass163Array1[local18].anInt3843 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(104) int local104 = arg0.anInt9723;
		arg0.method8577(local10.anInt9332);
		for (@Pc(111) int local111 = 0; local111 < local10.anInt9333; local111++) {
			if (local10.anIntArray682[local111] == 0) {
				try {
					@Pc(144) int local144 = local10.anIntArray683[local111];
					@Pc(156) Field local156;
					@Pc(160) int local160;
					if (local144 == 0) {
						local156 = (Field) local10.aClass163Array2[local111].anObject5;
						local160 = local156.getInt((Object) null);
						arg0.method8584(0);
						arg0.method8577(local160);
					} else if (local144 == 1) {
						local156 = (Field) local10.aClass163Array2[local111].anObject5;
						local156.setInt((Object) null, local10.anIntArray681[local111]);
						arg0.method8584(0);
					} else if (local144 == 2) {
						local156 = (Field) local10.aClass163Array2[local111].anObject5;
						local160 = local156.getModifiers();
						arg0.method8584(0);
						arg0.method8577(local160);
					}
					@Pc(239) Method local239;
					if (local144 == 3) {
						local239 = (Method) local10.aClass163Array1[local111].anObject5;
						@Pc(264) byte[][] local264 = local10.aByteArrayArrayArray18[local111];
						@Pc(268) Object[] local268 = new Object[local264.length];
						for (@Pc(270) int local270 = 0; local270 < local264.length; local270++) {
							@Pc(282) ObjectInputStream local282 = new ObjectInputStream(new ByteArrayInputStream(local264[local270]));
							local268[local270] = local282.readObject();
						}
						@Pc(297) Object local297 = local239.invoke((Object) null, local268);
						if (local297 == null) {
							arg0.method8584(0);
						} else if (local297 instanceof Number) {
							arg0.method8584(1);
							arg0.method8580(((Number) local297).longValue());
						} else if (local297 instanceof String) {
							arg0.method8584(2);
							arg0.method8541((String) local297);
						} else {
							arg0.method8584(4);
						}
					} else if (local144 == 4) {
						local239 = (Method) local10.aClass163Array1[local111].anObject5;
						local160 = local239.getModifiers();
						arg0.method8584(0);
						arg0.method8577(local160);
					}
				} catch (@Pc(350) ClassNotFoundException local350) {
					arg0.method8584(-10);
				} catch (@Pc(356) InvalidClassException local356) {
					arg0.method8584(-11);
				} catch (@Pc(362) StreamCorruptedException local362) {
					arg0.method8584(-12);
				} catch (@Pc(368) OptionalDataException local368) {
					arg0.method8584(-13);
				} catch (@Pc(374) IllegalAccessException local374) {
					arg0.method8584(-14);
				} catch (@Pc(380) IllegalArgumentException local380) {
					arg0.method8584(-15);
				} catch (@Pc(386) InvocationTargetException local386) {
					arg0.method8584(-16);
				} catch (@Pc(392) SecurityException local392) {
					arg0.method8584(-17);
				} catch (@Pc(398) IOException local398) {
					arg0.method8584(-18);
				} catch (@Pc(404) NullPointerException local404) {
					arg0.method8584(-19);
				} catch (@Pc(410) Exception local410) {
					arg0.method8584(-20);
				} catch (@Pc(416) Throwable local416) {
					arg0.method8584(-21);
				}
			} else {
				arg0.method8584(local10.anIntArray682[local111]);
			}
		}
		arg0.method8586(local104);
		local10.method9872();
	}
}
