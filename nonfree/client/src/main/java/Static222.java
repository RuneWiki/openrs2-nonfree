import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public static int anInt4928;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array16;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
	public static int[] anIntArray512 = new int[1000];

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!kn;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_3 = new Class1_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt4932 = 0;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
	public static int[] anIntArray513 = new int[50];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3915(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) long local33 = arg0;
			@Pc(35) int local35 = 0;
			while (local33 != 0L) {
				local33 /= 37L;
				local35++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				local57.append(Static33.aCharArray1[(int) (local63 - arg0 * 37L)]);
			}
			return local57.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Lclient!td;")
	public static Class140_Sub1 method3917() {
		Static152.anInt3531 = 0;
		return Static160.method3003();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Lclient!mk;")
	public static Class1_Sub2_Sub15 method3919(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub15 local11 = (Class1_Sub2_Sub15) Static258.aClass125_6.method3669((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static290.aClass83_200.method2306(26, arg0);
		local11 = new Class1_Sub2_Sub15();
		if (local25 != null) {
			local11.method3096(new Class1_Sub16(local25));
		}
		Static258.aClass125_6.method3671(local11, (long) arg0);
		return local11;
	}
}
