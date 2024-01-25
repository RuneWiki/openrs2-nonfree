import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "Lclient!wt;")
	public final Interface27 anInterface27_3;

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
	public final int anInt6666;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!wt;I)V")
	protected Class6_Sub4_Sub1(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		this.anInterface27_3 = arg0;
		this.anInt6666 = arg1;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5714();

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5716();
}
