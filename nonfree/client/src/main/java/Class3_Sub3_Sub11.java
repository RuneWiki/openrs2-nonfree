import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class Class3_Sub3_Sub11 extends Class3_Sub3 {

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "Lclient!bga;")
	public final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
	public final int anInt7643;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!bga;I)V")
	protected Class3_Sub3_Sub11(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_3 = arg0;
		this.anInt7643 = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6452();

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "(I)Z")
	public abstract boolean method6453();
}
