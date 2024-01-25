import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray46 = new boolean[100];

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Z")
	public static boolean aBoolean440 = true;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ul;III)Lclient!qr;")
	public static Class1_Sub2_Sub11 method5232(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class1_Sub5 local14 = new Class1_Sub5(arg0.method5477(arg2, arg1));
		@Pc(45) Class1_Sub2_Sub11 local45 = new Class1_Sub2_Sub11(arg1, local14.method5401(), local14.method5401(), local14.method5407(), local14.method5407(), local14.method5366() == 1, local14.method5366(), local14.method5366());
		@Pc(57) int local57 = local14.method5366();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local45.aClass181_55.method4102(new Class1_Sub21(local14.method5366(), local14.method5362(), local14.method5362(), local14.method5362(), local14.method5362(), local14.method5362(), local14.method5362(), local14.method5362(), local14.method5362()));
		}
		local45.method4712();
		return local45;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public static void method5233(@OriginalArg(1) int arg0) {
		Static161.anInt3016 = -1;
		Static129.anInt3956 = -1;
		Static307.anInt5296 = arg0;
		Static397.method5305();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)I")
	public static int method5234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(27) int local27 = (arg2 & 0x7F) * local13 + (arg1 & 0x7F) * arg0 >> 7;
		@Pc(41) int local41 = (arg1 & 0x380) * arg0 + local13 * (arg2 & 0x380) >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * arg0 + local13 * (arg2 & 0xFC00) >> 7;
		return local64 & 0xFC00 | local41 & 0x380 | local27 & 0x7F;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!hp;Z)Lclient!hg;")
	public static Class85_Sub1 method5235(@OriginalArg(0) Class1_Sub5 arg0) {
		return new Class85_Sub1(arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5399(), arg0.method5399(), arg0.method5366());
	}
}
