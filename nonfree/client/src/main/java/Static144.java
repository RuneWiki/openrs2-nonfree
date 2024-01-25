import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_21 = new Class288(8);

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
	public static int anInt3037 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIII)V")
	public static void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class160 local3 = new Class160();
		local3.anInt4416 = arg1 >> Static270.anInt5288;
		local3.anInt4420 = arg2 >> Static270.anInt5288;
		local3.anInt4415 = arg3 >> Static270.anInt5288;
		local3.anInt4410 = arg4 >> Static270.anInt5288;
		local3.anInt4402 = arg0;
		local3.anInt4404 = arg1;
		local3.anInt4409 = arg2;
		local3.anInt4408 = arg3;
		local3.anInt4405 = arg4;
		local3.anInt4411 = arg5;
		local3.anInt4412 = arg6;
		Static491.aClass160Array2[Static88.anInt2110++] = local3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)Lclient!cn;")
	public static Class5_Sub2_Sub7 method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class5_Sub2_Sub7 local20 = (Class5_Sub2_Sub7) Static197.aClass42_13.method1109((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class5_Sub2_Sub7(arg1, arg0);
			Static197.aClass42_13.method1106(local20.aLong253, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method2730(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local8 + local10);
		for (@Pc(47) int local47 = 0; local47 < local8; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local45.append("<lt>");
			} else if (local53 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local53);
			}
		}
		return local45.toString();
	}
}
