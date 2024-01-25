import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public static int anInt3087;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	public static int anInt3089;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!oi;")
	public static Class150 aClass150_1;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	public static int anInt3090;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_57 = new Class117("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!nq;Lclient!nq;BLclient!nq;)V")
	public static void method2605(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(3) Class144 arg2) {
		Static27.aClass144_7 = arg1;
		Static70.method1053(arg2, arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	public static int method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static303.anIntArrayArray55 == null ? 0 : Static303.anIntArrayArray55[arg0][arg1] & 0xFFFFFF;
	}
}
