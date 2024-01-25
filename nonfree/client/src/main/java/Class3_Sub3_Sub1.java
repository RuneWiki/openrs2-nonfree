import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
	public final int anInt5653;

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "Lclient!s;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!s;I)V")
	protected Class3_Sub3_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInt5653 = arg1;
		this.anInterface11_3 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)Z")
	public abstract boolean method4558();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method4560();
}
