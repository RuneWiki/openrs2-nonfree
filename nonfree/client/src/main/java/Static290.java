import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	public static int anInt5373;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public static int anInt5374 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Lclient!tg;")
	public static Class4_Sub1_Sub18 method4476() {
		return Static425.aClass4_Sub1_Sub18_3;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!ci;I)Lclient!pb;")
	public static Class4_Sub32 method4477(@OriginalArg(1) Class38 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method1031(arg1);
		return local14 == null ? null : new Class4_Sub32(local14);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)I")
	public static int method4479() {
		@Pc(13) Class83 local13 = Static199.aClass83_5;
		synchronized (Static199.aClass83_5) {
			return Static199.aClass83_5.method2340();
		}
	}
}
