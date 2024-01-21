import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static final int[] anIntArray306 = new int[200];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1691 = Static187.method3089(")4l");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)V")
	public static void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) long local18 = (long) (arg0 + (arg1 << 16));
		@Pc(24) Class1_Sub3_Sub23 local24 = (Class1_Sub3_Sub23) Static153.aClass97_18.method3375(local18);
		if (local24 != null) {
			Static143.aClass86_2.method2886(local24);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)I")
	public static int method2630(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ka;Z)Lclient!fh;")
	public static Class33_Sub1 method2631(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class33_Sub1(arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3049(), arg0.method3049(), arg0.method3010());
	}
}
