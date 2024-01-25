import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class Class8_Sub5_Sub3 extends Class8_Sub5 {

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
	public final int anInt9632;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "Lclient!on;")
	public final Interface19 anInterface19_3;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!on;I)V")
	protected Class8_Sub5_Sub3(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		this.anInt9632 = arg1;
		this.anInterface19_3 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Z")
	public abstract boolean method7784();

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7785();
}
