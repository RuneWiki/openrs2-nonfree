import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	public final int anInt8463;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "Lclient!ada;")
	public final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!ada;I)V")
	protected Class1_Sub2_Sub4(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1) {
		this.anInt8463 = arg1;
		this.anInterface2_3 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Z")
	public abstract boolean method7396();

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7397();
}
