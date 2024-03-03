import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "Lclient!iq;")
	public final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
	public final int anInt5030;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!iq;I)V", line = 8)
	protected Class2_Sub2_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		this.anInterface7_3 = arg0;
		this.anInt5030 = arg1;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Z")
	public abstract boolean method4626();

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4627();
}
