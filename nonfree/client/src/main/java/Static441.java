import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "[[Lclient!vfa;")
	public static Class357[][] aClass357ArrayArray1;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "Lclient!hda;")
	public static Class136 aClass136_148;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!vm;")
	public static final Class363 aClass363_8 = new Class363();

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6571(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local42.append("<lt>");
			} else if (local55 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local55);
			}
		}
		return local42.toString();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	public static void method6572(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub4_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class40 local8 = Static492.aClass40Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static150.anInt2400; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static129.anInt6336; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static162.anInt2830;
							@Pc(32) int local32 = local12 << Static162.anInt2830;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class40 local41 = Static492.aClass40Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8442(local15, local12) - local41.method8442(local15, local12);
									@Pc(71) int local71 = local8.method8442(local15 + 1, local12) - local41.method8442(local15 + 1, local12);
									@Pc(91) int local91 = local8.method8442(local15 + 1, local12 + 1) - local41.method8442(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method8442(local15, local12 + 1) - local41.method8442(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
