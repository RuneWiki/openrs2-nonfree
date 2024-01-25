import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_166 = new Class194(3, 4);

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "[I")
	public static final int[] anIntArray303 = new int[4096];

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_167 = new Class194(64, 2);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZII)Z")
	public static boolean method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)Lclient!dga;")
	public static Class69 method4743() {
		return new Class69(1, false);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Lclient!fe;")
	public static Class105 method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass105_3;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	public static void method4747() {
		Static550.anInt9147 = -1;
		Static201.anInt3739 = 1;
		if (Static111.aString13 == null) {
			Static191.method3070(35);
		} else {
			@Pc(25) Class3_Sub9 local25 = new Class3_Sub9(Static609.method8339(Static38.method703(Static111.aString13)));
			@Pc(31) long local31 = local25.method5603();
			Static248.aLong127 = local25.method5603();
			Static63.method1054(Static23.method325(local31), true, "");
		}
	}
}
