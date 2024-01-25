import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt9637 = -1;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!ke;")
	public static final Class189 aClass189_7 = new Class189(64);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_342 = new Class179(62, -2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIC)I")
	public static int method8134(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(16) char local16 = Character.toLowerCase(arg1);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!gga;)Lclient!le;")
	public static Class205 method8136(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(7) String local7 = arg0.method8354();
		@Pc(14) Class7 local14 = Static262.method5239()[arg0.method8374()];
		@Pc(23) Class249 local23 = Static119.method1848()[arg0.method8374()];
		@Pc(27) int local27 = arg0.method8395();
		@Pc(31) int local31 = arg0.method8395();
		@Pc(35) int local35 = arg0.method8374();
		@Pc(41) int local41 = arg0.method8374();
		@Pc(45) int local45 = arg0.method8374();
		@Pc(49) int local49 = arg0.method8363();
		@Pc(53) int local53 = arg0.method8363();
		@Pc(57) int local57 = arg0.method8369();
		@Pc(61) int local61 = arg0.method8369();
		@Pc(65) int local65 = arg0.method8369();
		return new Class205(local7, local14, local23, local27, local31, local35, local41, local45, local49, local53, local57, local61, local65);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method8137() {
		if (Static190.anInt3237 == 5) {
			Static190.anInt3237 = 6;
		}
	}
}
