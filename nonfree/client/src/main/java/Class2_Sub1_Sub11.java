import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	public final int anInt5640;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "Lclient!dd;")
	public final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!dd;I)V")
	protected Class2_Sub1_Sub11(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		this.anInt5640 = arg1;
		this.anInterface3_3 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4480();

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Z")
	public abstract boolean method4481();
}
