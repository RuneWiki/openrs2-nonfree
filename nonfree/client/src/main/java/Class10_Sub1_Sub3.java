import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class10_Sub1_Sub3 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
	public final int anInt7190;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	protected Class10_Sub1_Sub3(@OriginalArg(0) int arg0) {
		this.anInt7190 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Z")
	public abstract boolean method5667();

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5668();
}
