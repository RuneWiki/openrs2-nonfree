import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class236 {

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "Lclient!dn;")
	private final Class69 aClass69_75;

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
	public final int anInt6908;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class236(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		new Class277(64);
		this.aClass69_75 = arg2;
		this.anInt6908 = this.aClass69_75.method1884(15);
	}
}
