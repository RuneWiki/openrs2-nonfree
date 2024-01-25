import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "Lclient!ci;")
	public static Class38 aClass38_43;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!wn;I)V")
	public static void method3457(@OriginalArg(0) Class4_Sub20 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static406.anInt6632; local8++) {
			@Pc(16) int local16 = arg0.method4575();
			@Pc(20) int local20 = arg0.method4560();
			if (local20 == 65535) {
				local20 = -1;
			}
			if (Static128.aClass82_Sub1Array5[local16] != null) {
				Static128.aClass82_Sub1Array5[local16].anInt7693 = local20;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)V")
	public static void method3458(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static398.aByteArrayArrayArray17 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIZ)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(11, arg2);
		local8.method521();
		local8.anInt614 = arg0;
		local8.anInt621 = arg1;
	}
}
