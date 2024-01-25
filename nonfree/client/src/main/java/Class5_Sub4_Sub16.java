import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public abstract class Class5_Sub4_Sub16 extends Class5_Sub4 {

	@OriginalMember(owner = "client!rba", name = "D", descriptor = "Lclient!ek;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
	public final int anInt9639;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!ek;I)V")
	protected Class5_Sub4_Sub16(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInterface11_3 = arg0;
		this.anInt9639 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method8271();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
	public abstract boolean method8275();
}
