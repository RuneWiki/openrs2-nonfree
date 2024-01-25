import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	public static int anInt8549;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "[Lclient!sn;")
	public static final Class300[] aClass300Array1 = new Class300[100];

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "[I")
	public static final int[] anIntArray519 = new int[1];

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "[I")
	public static final int[] anIntArray520 = new int[1];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)Z")
	public static boolean method7006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
