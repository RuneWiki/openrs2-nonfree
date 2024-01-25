import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public final int anInt5648;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!sv;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!sv;I)V")
	protected Class3_Sub3_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInt5648 = arg1;
		this.anInterface11_3 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4695();

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Z")
	public abstract boolean method4696();
}
