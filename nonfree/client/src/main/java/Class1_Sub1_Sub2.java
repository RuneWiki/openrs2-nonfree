import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public final int anInt6704;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "Lclient!qo;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!qo;I)V")
	protected Class1_Sub1_Sub2(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1) {
		this.anInt6704 = arg1;
		this.anInterface9_3 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)Z")
	public abstract boolean method5251();

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5252();
}
