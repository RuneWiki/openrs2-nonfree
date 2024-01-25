import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class Class3_Sub7_Sub3 extends Class3_Sub7 {

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
	public final int anInt6634;

	@OriginalMember(owner = "client!mha", name = "u", descriptor = "Lclient!cr;")
	public final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!cr;I)V")
	protected Class3_Sub7_Sub3(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1) {
		this.anInt6634 = arg1;
		this.anInterface4_3 = arg0;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5774();

	@OriginalMember(owner = "client!mha", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5775();
}
