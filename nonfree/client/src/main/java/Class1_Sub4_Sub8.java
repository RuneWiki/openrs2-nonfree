import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class Class1_Sub4_Sub8 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "Lclient!ur;")
	public final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
	public final int anInt3289;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ur;I)V")
	protected Class1_Sub4_Sub8(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		this.anInterface10_3 = arg0;
		this.anInt3289 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3009();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Z")
	public abstract boolean method3010();
}
