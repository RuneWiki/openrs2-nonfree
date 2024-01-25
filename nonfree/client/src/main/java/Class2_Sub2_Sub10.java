import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Lclient!kr;")
	public final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	public final int anInt6787;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!kr;I)V")
	protected Class2_Sub2_Sub10(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1) {
		this.anInterface6_3 = arg0;
		this.anInt6787 = arg1;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)Z")
	public abstract boolean method5325();

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5326();
}
