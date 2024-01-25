import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public static int anInt2745;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!la;")
	public static final Class136 aClass136_72 = new Class136(60, 7);

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_11 = new Class183(13, 5);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method2330() {
		Static271.anInt4534 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static278.aClass3_Sub25Array1[local14] = null;
			Static131.aByteArray47[local14] = 1;
			Static147.aClass197Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Lclient!dq;II)Lclient!ow;")
	public static Class181 method2335(@OriginalArg(0) String arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg1.method1380(arg0);
		}
		@Pc(37) Class181 local37;
		if (arg2 == 1) {
			try {
				Static473.method5058("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, arg1.anApplet1);
				local37 = new Class181();
				local37.anInt5298 = 1;
				return local37;
			} catch (@Pc(43) Throwable local43) {
				local37 = new Class181();
				local37.anInt5298 = 2;
				return local37;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local37 = new Class181();
				local37.anInt5298 = 1;
				return local37;
			} catch (@Pc(79) Exception local79) {
				local37 = new Class181();
				local37.anInt5298 = 2;
				return local37;
			}
		} else if (arg2 == 3) {
			try {
				Static473.method5059(arg1.anApplet1, "loggedout");
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local37 = new Class181();
				local37.anInt5298 = 1;
				return local37;
			} catch (@Pc(123) Exception local123) {
				local37 = new Class181();
				local37.anInt5298 = 2;
				return local37;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B[Lclient!ga;I)V")
	public static void method2336(@OriginalArg(1) Class82[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class82 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt2252 == 0) {
					if (local9.aClass82Array1 != null) {
						method2336(local9.aClass82Array1, arg1);
					}
					@Pc(33) Class3_Sub10 local33 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local9.anInt2208);
					if (local33 != null) {
						Static407.method5564(local33.anInt827, arg1);
					}
				}
				@Pc(49) Class3_Sub15 local49;
				if (arg1 == 0 && local9.anObjectArray15 != null) {
					local49 = new Class3_Sub15();
					local49.anObjectArray3 = local9.anObjectArray15;
					local49.aClass82_1 = local9;
					Static219.method3217(local49);
				}
				if (arg1 == 1 && local9.anObjectArray26 != null) {
					if (local9.anInt2209 >= 0) {
						@Pc(77) Class82 local77 = Static180.method2857(local9.anInt2208);
						if (local77 == null || local77.aClass82Array1 == null || local9.anInt2209 >= local77.aClass82Array1.length || local77.aClass82Array1[local9.anInt2209] != local9) {
							continue;
						}
					}
					local49 = new Class3_Sub15();
					local49.anObjectArray3 = local9.anObjectArray26;
					local49.aClass82_1 = local9;
					Static219.method3217(local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public static void method2337(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub3_Sub4 local17 = Static281.method3883(2, arg0);
		local17.method1006();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method2338() {
		Static367.aBoolean425 = false;
		Static208.method3163(Static100.anInt1814, Static368.anInt6234, Static242.anInt4125, Static348.anInt5871);
	}
}
