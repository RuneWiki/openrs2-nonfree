import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!uja", name = "E", descriptor = "Lclient!fia;")
	public static Class126 aClass126_3;

	@OriginalMember(owner = "client!uja", name = "H", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_58 = new Class391(8);

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!mca;Ljava/awt/Frame;I)V")
	public static void method8452(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(6) Class366 local6 = arg0.method5360(arg1);
			while (local6.anInt10206 == 0) {
				Static351.method5279(10L);
			}
			if (local6.anInt10206 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static351.method5279(100L);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(B[B)Lclient!nf;")
	public static Class5_Sub5_Sub17 method8453(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class5_Sub5_Sub17 local9 = new Class5_Sub5_Sub17();
		@Pc(14) Class5_Sub23 local14 = new Class5_Sub23(arg0);
		local14.anInt9869 = local14.aByteArray102.length - 2;
		@Pc(34) int local34 = local14.method8519();
		@Pc(45) int local45 = local14.aByteArray102.length - local34 - 2 - 16;
		local14.anInt9869 = local45;
		@Pc(52) int local52 = local14.method8527();
		local9.anInt6687 = local14.method8519();
		local9.anInt6682 = local14.method8519();
		local9.anInt6686 = local14.method8519();
		local9.anInt6683 = local14.method8519();
		local9.anInt6681 = local14.method8519();
		local9.anInt6685 = local14.method8519();
		@Pc(86) int local86 = local14.method8529();
		@Pc(94) int local94;
		@Pc(100) int local100;
		if (local86 > 0) {
			local9.aClass291Array1 = new Class291[local86];
			for (local94 = 0; local94 < local86; local94++) {
				local100 = local14.method8519();
				@Pc(107) Class291 local107 = new Class291(Static94.method1393(local100));
				local9.aClass291Array1[local94] = local107;
				while (local100-- > 0) {
					@Pc(118) int local118 = local14.method8527();
					@Pc(122) int local122 = local14.method8527();
					local107.method6984((long) local118, new Class5_Sub29(local122));
				}
			}
		}
		local14.anInt9869 = 0;
		local9.aString91 = local14.method8475();
		local9.anIntArray382 = new int[local52];
		local94 = 0;
		while (local45 > local14.anInt9869) {
			local100 = local14.method8519();
			if (local100 == 3) {
				if (local9.aStringArray46 == null) {
					local9.aStringArray46 = new String[local52];
				}
				local9.aStringArray46[local94] = local14.method8497().intern();
			} else if (local100 == 54) {
				if (local9.aLongArray21 == null) {
					local9.aLongArray21 = new long[local52];
				}
				local9.aLongArray21[local94] = local14.method8509();
			} else {
				if (local9.anIntArray381 == null) {
					local9.anIntArray381 = new int[local52];
				}
				if (local100 >= 150 || local100 == 21 || local100 == 38 || local100 == 39) {
					local9.anIntArray381[local94] = local14.method8529();
				} else {
					local9.anIntArray381[local94] = local14.method8527();
				}
			}
			local9.anIntArray382[local94++] = local100;
		}
		return local9;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ljava/lang/String;Lclient!mca;IILjava/lang/String;)Lclient!vd;")
	public static Class366 method8454(@OriginalArg(0) String arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg2 == 0) {
			return arg1.method5350(arg0);
		}
		@Pc(57) Class366 local57;
		if (arg2 == 1) {
			try {
				@Pc(36) Object local36 = Static681.method742(arg3, new Object[] { (new URL(Static492.anApplet2.getCodeBase(), arg0)).toString() }, Static492.anApplet2);
				if (local36 == null) {
					throw new RuntimeException();
				}
				@Pc(47) Class366 local47 = new Class366();
				local47.anInt10206 = 1;
				return local47;
			} catch (@Pc(53) Throwable local53) {
				local57 = new Class366();
				local57.anInt10206 = 2;
				return local57;
			}
		} else if (arg2 == 2) {
			try {
				Static492.anApplet2.getAppletContext().showDocument(new URL(Static492.anApplet2.getCodeBase(), arg0), "_blank");
				local57 = new Class366();
				local57.anInt10206 = 1;
				return local57;
			} catch (@Pc(89) Exception local89) {
				local57 = new Class366();
				local57.anInt10206 = 2;
				return local57;
			}
		} else if (arg2 == 3) {
			try {
				Static681.method743(Static492.anApplet2, "loggedout");
			} catch (@Pc(112) Throwable local112) {
			}
			try {
				Static492.anApplet2.getAppletContext().showDocument(new URL(Static492.anApplet2.getCodeBase(), arg0), "_top");
				local57 = new Class366();
				local57.anInt10206 = 1;
				return local57;
			} catch (@Pc(134) Exception local134) {
				local57 = new Class366();
				local57.anInt10206 = 2;
				return local57;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BI)I")
	public static int method8457(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
