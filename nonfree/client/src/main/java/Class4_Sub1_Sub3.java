import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Lclient!wa;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!wa;)V")
	protected Class4_Sub1_Sub3(@OriginalArg(0) Interface9 arg0) {
		this.anInterface9_3 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)Z")
	public abstract boolean method3143();

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3144();
}
