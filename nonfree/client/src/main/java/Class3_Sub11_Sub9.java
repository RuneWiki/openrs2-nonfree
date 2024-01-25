import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public abstract class Class3_Sub11_Sub9 extends Class3_Sub11 {

	@OriginalMember(owner = "client!it", name = "A", descriptor = "I")
	public final int anInt4399;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "Lclient!pj;")
	public final Interface23 anInterface23_3;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!pj;I)V")
	protected Class3_Sub11_Sub9(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		this.anInt4399 = arg1;
		this.anInterface23_3 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method4006();

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Z")
	public abstract boolean method4007();
}
