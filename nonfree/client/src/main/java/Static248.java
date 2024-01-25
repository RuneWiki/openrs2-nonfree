import java.awt.Color;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Lclient!up;")
	public static Class205 aClass205_2;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "Lclient!tj;")
	public static Class193 aClass193_88;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Lclient!ec;")
	public static Class50 aClass50_2;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	public static int anInt5060;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_182 = new Class198(4);

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	public static int anInt5059 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I")
	public static int method4392(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static325.method5275(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)Lclient!bf;")
	public static Class2_Sub2 method4393(@OriginalArg(1) int arg0) {
		@Pc(7) Class32[] local7 = Class9.aClass32Array1;
		synchronized (Class9.aClass32Array1) {
			@Pc(37) Class2_Sub2 local37;
			if (Class9.aClass32Array1.length <= arg0 || Class9.aClass32Array1[arg0].method839()) {
				local37 = new Class2_Sub2();
				local37.aClass2_Sub5Array1 = new Class2_Sub5[arg0];
				for (@Pc(59) int local59 = 0; local59 < arg0; local59++) {
					local37.aClass2_Sub5Array1[local59] = new Class2_Sub5();
				}
			} else {
				local37 = (Class2_Sub2) Class9.aClass32Array1[arg0].method847();
				local37.method5419();
				@Pc(44) int local44 = Static125.anIntArray260[arg0]--;
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ml;IILjava/lang/String;)Lclient!sm;")
	public static Class185 method4394(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method3748(arg2);
		}
		@Pc(36) Class185 local36;
		if (arg1 == 1) {
			try {
				Static366.method4254(arg0.anApplet1, "openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local36 = new Class185();
				local36.anInt5682 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class185();
				local36.anInt5682 = 2;
				return local36;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local36 = new Class185();
				local36.anInt5682 = 1;
				return local36;
			} catch (@Pc(83) Exception local83) {
				local36 = new Class185();
				local36.anInt5682 = 2;
				return local36;
			}
		} else if (arg1 == 3) {
			try {
				Static366.method4253("loggedout", arg0.anApplet1);
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local36 = new Class185();
				local36.anInt5682 = 1;
				return local36;
			} catch (@Pc(127) Exception local127) {
				local36 = new Class185();
				local36.anInt5682 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
