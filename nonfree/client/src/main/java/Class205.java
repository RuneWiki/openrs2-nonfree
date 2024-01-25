import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class205 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!ci;")
	private final Class38 aClass38_67;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public final int anInt5868;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class205(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		new Class83(64);
		this.aClass38_67 = arg2;
		this.anInt5868 = this.aClass38_67.method1032(15);
	}
}
