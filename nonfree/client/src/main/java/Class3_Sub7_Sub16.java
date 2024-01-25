import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class3_Sub7_Sub16 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "Lclient!qaa;")
	public final Interface17 anInterface17_3;

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
	public final int anInt7701;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!qaa;I)V")
	protected Class3_Sub7_Sub16(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		this.anInterface17_3 = arg0;
		this.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z")
	public abstract boolean method6645();

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6647();
}
