import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!rc;")
	public final Interface22 anInterface22_3;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	public final int anInt8757;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!rc;I)V")
	protected Class6_Sub2_Sub7(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) int arg1) {
		this.anInterface22_3 = arg0;
		this.anInt8757 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7670();

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Z")
	public abstract boolean method7671();
}
