import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!wf;")
	public final Interface27 anInterface27_3;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	public final int anInt7674;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!wf;I)V")
	protected Class2_Sub2_Sub6(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		this.anInterface27_3 = arg0;
		this.anInt7674 = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)Z")
	public abstract boolean method6485();

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6488();
}
