import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class Class6_Sub4_Sub8 extends Class6_Sub4 {

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
	public final int anInt5381;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "Lclient!lo;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!lo;I)V")
	protected Class6_Sub4_Sub8(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInt5381 = arg1;
		this.anInterface11_3 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z")
	public abstract boolean method4614();

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4615();
}
