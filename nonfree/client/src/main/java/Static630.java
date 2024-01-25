import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "Z")
	public static boolean aBoolean747 = false;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Lclient!wm;")
	public static Class2_Sub52 method9132() {
		return Static426.anInt8022 == 0 ? new Class2_Sub52() : Static439.aClass2_Sub52Array1[--Static426.anInt8022];
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method9133(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static604.anInt10620; local16++) {
			if (arg0.equalsIgnoreCase(Static314.aStringArray29[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!in;II)Lclient!bh;")
	public static Class32 method9136(@OriginalArg(1) Class157 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method4564(arg1, 0);
		return local14 == null ? null : new Class32(local14);
	}
}
