import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "S")
	public static short aShort82 = 1;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_56 = new Class269(4, 3);

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
	public static final int[] anIntArray363 = new int[8];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;Lclient!ud;)I")
	public static int method4471(@OriginalArg(1) String arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		@Pc(6) int local6 = arg1.anInt8188;
		@Pc(10) byte[] local10 = Static313.method4758(arg0);
		arg1.method6888(local10.length);
		arg1.anInt8188 += Static407.aClass193_1.method4640(arg1.anInt8188, 0, local10, local10.length, arg1.aByteArray77);
		return arg1.anInt8188 - local6;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!rea;")
	public static Class291 method4472(@OriginalArg(1) int arg0) {
		@Pc(10) Class291 local10 = (Class291) Static179.aClass233_17.method5669((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static88.aClass97_97.method2545(arg0, 0);
		local10 = new Class291();
		if (local27 != null) {
			local10.method6944(new Class2_Sub34(local27), arg0);
		}
		Static179.aClass233_17.method5662(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	public static int method4473() {
		return Static487.method6993(false);
	}
}
