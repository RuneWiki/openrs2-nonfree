import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class Class12_Sub4_Sub4 extends Class12_Sub4 {

	@OriginalMember(owner = "client!nu", name = "y", descriptor = "Lclient!fw;")
	public final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
	public final int anInt2903;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!fw;I)V")
	protected Class12_Sub4_Sub4(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		this.anInterface5_3 = arg0;
		this.anInt2903 = arg1;
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z")
	public abstract boolean method2650();

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2653();
}
