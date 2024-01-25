import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_68 = new Class196(124, 8);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB[Lclient!wq;)V")
	public static void method1663(@OriginalArg(0) int arg0, @OriginalArg(2) Class394[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class394 local6 = arg1[local1];
			if (local6 != null) {
				if (local6.anInt10479 == 0) {
					if (local6.aClass394Array2 != null) {
						method1663(arg0, local6.aClass394Array2);
					}
					@Pc(27) Class5_Sub4 local27 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local6.anInt10490);
					if (local27 != null) {
						Static416.method6119(local27.anInt257, arg0);
					}
				}
				@Pc(43) Class5_Sub28 local43;
				if (arg0 == 0 && local6.anObjectArray10 != null) {
					local43 = new Class5_Sub28();
					local43.aClass394_2 = local6;
					local43.anObjectArray2 = local6.anObjectArray10;
					Static497.method7205(local43);
				}
				if (arg0 == 1 && local6.anObjectArray33 != null) {
					if (local6.anInt10502 >= 0) {
						@Pc(66) Class394 local66 = Static238.method3422(local6.anInt10490);
						if (local66 == null || local66.aClass394Array2 == null || local66.aClass394Array2.length <= local6.anInt10502 || local66.aClass394Array2[local6.anInt10502] != local6) {
							continue;
						}
					}
					local43 = new Class5_Sub28();
					local43.aClass394_2 = local6;
					local43.anObjectArray2 = local6.anObjectArray33;
					Static497.method7205(local43);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1665(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(32) long local32 = arg0; local32 != 0L; local32 /= 37L) {
				local25++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static278.aCharArray5[(int) (local52 - arg0 * 37L)];
				if (local66 == '_') {
					@Pc(74) int local74 = local49.length() - 1;
					local66 = ' ';
					local49.setCharAt(local74, Character.toUpperCase(local49.charAt(local74)));
				}
				local49.append(local66);
			}
			local49.reverse();
			local49.setCharAt(0, Character.toUpperCase(local49.charAt(0)));
			return local49.toString();
		}
	}
}
