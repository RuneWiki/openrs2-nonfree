import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "J")
	public static long aLong117;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
	public static int anInt3589 = 0;

	@OriginalMember(owner = "client!kd", name = "Md", descriptor = "I")
	public static final int anInt3758 = 2;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)Lclient!sr;")
	public static Class31_Sub4 method3177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass31_Sub4_2;
	}

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "(I)I")
	public static int method3230() {
		return 2;
	}
}
