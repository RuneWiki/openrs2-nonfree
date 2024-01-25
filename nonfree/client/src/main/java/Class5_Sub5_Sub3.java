import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public abstract class Class5_Sub5_Sub3 extends Class5_Sub5 {

	@OriginalMember(owner = "client!lia", name = "w", descriptor = "Lclient!eq;")
	public final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "I")
	public final int anInt6780;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!eq;I)V")
	protected Class5_Sub5_Sub3(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		this.anInterface5_3 = arg0;
		this.anInt6780 = arg1;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6059();

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)Z")
	public abstract boolean method6061();
}
