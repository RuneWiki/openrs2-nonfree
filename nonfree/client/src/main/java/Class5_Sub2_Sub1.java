import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
	public final int anInt9021;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!pha;")
	public final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!pha;I)V")
	protected Class5_Sub2_Sub1(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) int arg1) {
		this.anInt9021 = arg1;
		this.anInterface20_3 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Z")
	public abstract boolean method7594();

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7595();
}
