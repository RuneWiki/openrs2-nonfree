import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static533 {

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
	public static int anInt8302;

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
	public static int anInt8307 = 0;

	@OriginalMember(owner = "client!qm", name = "V", descriptor = "Z")
	public static boolean aBoolean559 = false;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)Z")
	public static boolean method7099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static407.method5470(arg1, arg0) || Static493.method6693(arg1, arg0);
	}
}
