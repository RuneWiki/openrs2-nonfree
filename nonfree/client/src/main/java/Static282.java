import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "Lclient!eq;")
	public static Class97 aClass97_70;

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "Lclient!fs;")
	public static final Class117 aClass117_4 = new Class117(128);

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_82 = new Class274(21, 7);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!vk;BIIII)Ljava/awt/Frame;")
	public static Frame method4460(@OriginalArg(0) Class359 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method8272()) {
			return null;
		}
		@Pc(15) Class38[] local15 = Static229.method3859(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
			if (arg1 == local15[local23].anInt978 && arg2 == local15[local23].anInt972 && (!local21 || local15[local23].anInt973 > arg3)) {
				local21 = true;
				arg3 = local15[local23].anInt973;
			}
		}
		if (!local21) {
			return null;
		}
		@Pc(87) Class26 local87 = arg0.method8276(arg1, arg3, arg2);
		while (local87.anInt762 == 0) {
			Static57.method1062(10L);
		}
		@Pc(101) Frame local101 = (Frame) local87.anObject3;
		if (local101 == null) {
			return null;
		} else if (local87.anInt762 == 2) {
			Static360.method5509(arg0, local101);
			return null;
		} else {
			return local101;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method4461() {
		return Static642.aBoolean757 || Static220.aClass2_Sub5_Sub20_17 == null ? "" : Static220.aClass2_Sub5_Sub20_17.aString100;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4462(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local13 = (local13 << 5) - (local13 - arg0.charAt(local15));
		}
		return local13;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!eq;JIIIIZ)V")
	public static void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		Static493.aBoolean629 = false;
		Static1.aLong187 = arg2;
		Static119.anInt2867 = arg0;
		Static14.anInt259 = 0;
		Static43.anInt969 = 10000;
		Static629.anInt10135 = arg3;
		Static189.aClass2_Sub2_Sub1_1 = null;
		Static157.anInt3573 = 0;
		Static192.aClass97_53 = arg1;
		Static158.anInt3597 = 1;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)Lclient!wr;")
	public static Class11_Sub1_Sub2 method4466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BII)Lclient!jn;")
	public static Class179 method4468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class179 local7 = new Class179();
		local7.anInt5208 = arg0 + 5 + 1;
		local7.anInt5199 = -1;
		local7.anInt5197 = arg1 + 6;
		local7.anInt5187 = -1;
		local7.anIntArrayArray44 = new int[local7.anInt5208][local7.anInt5197];
		local7.method4349();
		return local7;
	}
}
