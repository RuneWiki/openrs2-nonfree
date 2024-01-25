import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Lclient!cp;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	public final int anInt7103;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!cp;I)V")
	protected Class1_Sub2_Sub5(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		this.anInterface1_3 = arg0;
		this.anInt7103 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z")
	public abstract boolean method5815();

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method5818();
}
