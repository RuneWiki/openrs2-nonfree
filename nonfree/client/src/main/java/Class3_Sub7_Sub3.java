import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class Class3_Sub7_Sub3 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "Lclient!wt;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
	public final int anInt3654;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!wt;I)V")
	protected Class3_Sub7_Sub3(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInterface11_3 = arg0;
		this.anInt3654 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method3205();

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(B)Z")
	public abstract boolean method3208();
}
