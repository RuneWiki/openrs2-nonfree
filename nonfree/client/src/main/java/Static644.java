import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	public static int anInt11134;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "Lclient!jp;")
	public static Class186 aClass186_2;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V")
	public static void method9520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(6, (long) arg1);
		local9.method2486();
		local9.anInt2680 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!lga;")
	public static Class207 method9522(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class207_Sub1(arg0, 15000);
	}
}
