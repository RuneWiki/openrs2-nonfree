import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
	public static int anInt2915;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!df;")
	public static Class33 aClass33_6 = new Class33(128);

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!fk;")
	public static Class56 aClass56_10 = new Class56();

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!l;")
	public static Class98 aClass98_22 = new Class98(64);

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
	public static int anInt2919 = 0;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)Lclient!kl;")
	public static Class95 method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass95_1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)Z")
	public static boolean method2592(@OriginalArg(0) int arg0) {
		@Pc(12) Class87_Sub1 local12 = Static102.method1627(arg0);
		if (local12 == null) {
			return false;
		} else if (Static275.anInt5563 == 1 || Static275.anInt5563 == 2 || Static252.anInt5207 == 2) {
			Static307.aString230 = local12.aString157;
			Static203.anInt3980 = local12.anInt4366;
			if (Static252.anInt5207 != 0) {
				Static152.anInt2881 = Static203.anInt3980 + 50000;
				Static203.anInt3974 = Static203.anInt3980 + 40000;
				Static51.anInt995 = Static203.anInt3974;
			}
			return true;
		} else {
			@Pc(57) String local57 = "";
			if (Static252.anInt5207 != 0) {
				local57 = ":" + (local12.anInt4366 + 7000);
			}
			@Pc(75) String local75 = "";
			if (Static62.aString50 != null) {
				local75 = "/p=" + Static62.aString50;
			}
			@Pc(133) String local133 = "http://" + local12.aString157 + local57 + "/l=" + Static134.anInt4352 + "/a=" + Static60.anInt723 + local75 + "/j" + (Static109.aBoolean207 ? "1" : "0") + ",o" + (Static35.aBoolean54 ? "1" : "0") + ",a2,m" + (Static206.aBoolean289 ? "1" : "0");
			try {
				Static110.aClient1.getAppletContext().showDocument(new URL(local133), "_self");
				return true;
			} catch (@Pc(143) Exception local143) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method2593() {
		for (@Pc(20) Class3_Sub3 local20 = (Class3_Sub3) Static205.aClass30_23.method664(); local20 != null; local20 = (Class3_Sub3) Static205.aClass30_23.method671()) {
			@Pc(26) int local26 = local20.anInt183;
			if (Static245.method4932(local26)) {
				@Pc(33) boolean local33 = true;
				@Pc(37) Class151[] local37 = Static96.aClass151ArrayArray1[local26];
				@Pc(39) int local39;
				for (local39 = 0; local39 < local37.length; local39++) {
					if (local37[local39] != null) {
						local33 = local37[local39].aBoolean328;
						break;
					}
				}
				if (!local33) {
					local39 = (int) local20.aLong243;
					@Pc(70) Class151 local70 = Static243.method4115(local39);
					if (local70 != null) {
						Static134.method3639(local70);
					}
				}
			}
		}
	}
}
