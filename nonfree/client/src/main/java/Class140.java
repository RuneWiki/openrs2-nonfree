import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class140 {

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!g;")
	private final Class83 aClass83_74;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public final int anInt4110;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class140(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		new Class41(64);
		this.aClass83_74 = arg2;
		this.anInt4110 = this.aClass83_74.method1955(15);
	}
}
