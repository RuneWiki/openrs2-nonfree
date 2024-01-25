import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
	public static int anInt10031;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_256 = new Class160(45, -2);

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
	public static int anInt10035 = 0;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_67 = new Class317(64);

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)Lclient!cea;")
	public static Class58 method8606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass58_2;
	}
}
