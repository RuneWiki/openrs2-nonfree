import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "[[[Lclient!jj;")
	public static Class1_Sub16[][][] aClass1_Sub16ArrayArrayArray2;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "[I")
	public static int[] anIntArray402 = new int[2500];

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	public static int anInt3756 = 10;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString128 = "Drop";

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)I")
	public static int method3322() {
		return Static17.aBoolean36 && Static1.aBooleanArray1[81] && Static241.anInt4470 > 2 ? Static4.anIntArray16[Static241.anInt4470 - 2] : Static4.anIntArray16[Static241.anInt4470 - 1];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!fh;)Lclient!mh;")
	public static Class94_Sub3 method3323(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class94_Sub3(arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1878(), arg0.method1853());
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)Z")
	public static boolean method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static183.anInt3512; local1++) {
			@Pc(8) Class59 local8 = Static173.aClass59Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt1798 == 1) {
				local17 = local8.anInt1779 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt1791 + (local8.anInt1778 * local17 >> 8);
					local39 = local8.anInt1786 + (local8.anInt1788 * local17 >> 8);
					local49 = local8.anInt1796 + (local8.anInt1780 * local17 >> 8);
					local59 = local8.anInt1777 + (local8.anInt1785 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1798 == 2) {
				local17 = arg0 - local8.anInt1779;
				if (local17 > 0) {
					local29 = local8.anInt1791 + (local8.anInt1778 * local17 >> 8);
					local39 = local8.anInt1786 + (local8.anInt1788 * local17 >> 8);
					local49 = local8.anInt1796 + (local8.anInt1780 * local17 >> 8);
					local59 = local8.anInt1777 + (local8.anInt1785 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1798 == 3) {
				local17 = local8.anInt1791 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt1779 + (local8.anInt1793 * local17 >> 8);
					local39 = local8.anInt1797 + (local8.anInt1782 * local17 >> 8);
					local49 = local8.anInt1796 + (local8.anInt1780 * local17 >> 8);
					local59 = local8.anInt1777 + (local8.anInt1785 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1798 == 4) {
				local17 = arg2 - local8.anInt1791;
				if (local17 > 0) {
					local29 = local8.anInt1779 + (local8.anInt1793 * local17 >> 8);
					local39 = local8.anInt1797 + (local8.anInt1782 * local17 >> 8);
					local49 = local8.anInt1796 + (local8.anInt1780 * local17 >> 8);
					local59 = local8.anInt1777 + (local8.anInt1785 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1798 == 5) {
				local17 = arg1 - local8.anInt1796;
				if (local17 > 0) {
					local29 = local8.anInt1779 + (local8.anInt1793 * local17 >> 8);
					local39 = local8.anInt1797 + (local8.anInt1782 * local17 >> 8);
					local49 = local8.anInt1791 + (local8.anInt1778 * local17 >> 8);
					local59 = local8.anInt1786 + (local8.anInt1788 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)Lclient!oe;")
	public static Class124 method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class124 local14 = local7.aClass124_1;
			local7.aClass124_1 = null;
			return local14;
		}
	}
}
