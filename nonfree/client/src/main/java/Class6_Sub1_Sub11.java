import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class Class6_Sub1_Sub11 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "Lclient!ah;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	public final int anInt7039;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ah;I)V")
	protected Class6_Sub1_Sub11(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		this.anInterface1_3 = arg0;
		this.anInt7039 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5718();

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)Z")
	public abstract boolean method5719();
}
