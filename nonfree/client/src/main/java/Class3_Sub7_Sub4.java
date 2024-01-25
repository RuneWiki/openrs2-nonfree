import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "Lclient!kw;")
	public final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	public final int anInt6674;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!kw;I)V")
	protected Class3_Sub7_Sub4(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		this.anInterface10_3 = arg0;
		this.anInt6674 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Z")
	public abstract boolean method5376();

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5377();
}
