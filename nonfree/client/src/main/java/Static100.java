import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "[Lclient!sba;")
	public static final Class298[] aClass298Array1 = new Class298[6];

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[4];

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "J")
	public static long aLong55 = 0L;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	public static void method2541() {
		for (@Pc(16) Class3_Sub38 local16 = (Class3_Sub38) Static165.aClass276_29.method6907(); local16 != null; local16 = (Class3_Sub38) Static165.aClass276_29.method6912()) {
			if (local16.anInt8087 == -1) {
				local16.anInt8094 = 0;
				if (local16.anInt8095 >= 0 && local16.anInt8088 >= 0 && local16.anInt8095 < Static394.anInt7540 && Static462.anInt8391 > local16.anInt8088) {
					Static499.method7289(local16);
				}
			} else {
				local16.method8671();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[Ljava/lang/Object;I[J)V")
	public static void method2542(@OriginalArg(1) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg0];
		arg3[arg0] = local25;
		@Pc(39) Object local39 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg0; local61++) {
			if (local25 + (long) (local59 & local61) > arg3[local61]) {
				@Pc(78) long local78 = arg3[local61];
				arg3[local61] = arg3[local21];
				arg3[local21] = local78;
				@Pc(92) Object local92 = arg1[local61];
				arg1[local61] = arg1[local21];
				arg1[local21++] = local92;
			}
		}
		arg3[arg0] = arg3[local21];
		arg3[local21] = local25;
		arg1[arg0] = arg1[local21];
		arg1[local21] = local39;
		method2542(local21 - 1, arg1, arg2, arg3);
		method2542(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)Z")
	public static boolean method2543() {
		@Pc(12) boolean local12 = true;
		if (Static482.aClass28_4 == null) {
			if (Static150.aClass181_34.method5040(Static263.anInt5752)) {
				Static482.aClass28_4 = Static649.method605(Static150.aClass181_34, Static263.anInt5752);
			} else {
				local12 = false;
			}
		}
		if (Static125.aClass28_3 == null) {
			if (Static150.aClass181_34.method5040(Static636.anInt5234)) {
				Static125.aClass28_3 = Static649.method605(Static150.aClass181_34, Static636.anInt5234);
			} else {
				local12 = false;
			}
		}
		if (Static174.aClass28_2 == null) {
			if (Static150.aClass181_34.method5040(Static643.anInt10529)) {
				Static174.aClass28_2 = Static649.method605(Static150.aClass181_34, Static643.anInt10529);
			} else {
				local12 = false;
			}
		}
		if (Static618.aClass315_17 == null) {
			if (Static340.aClass181_62.method5040(Static115.anInt9247)) {
				Static618.aClass315_17 = Static494.method7247(Static340.aClass181_62, Static115.anInt9247);
			} else {
				local12 = false;
			}
		}
		if (Static534.aClass28Array1 == null) {
			if (Static150.aClass181_34.method5040(Static115.anInt9247)) {
				Static534.aClass28Array1 = Static649.method617(Static150.aClass181_34, Static115.anInt9247);
			} else {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!nt;")
	public static Class238 method2544(@OriginalArg(0) Component arg0) {
		return new Class238_Sub1(arg0);
	}
}
