import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!up", name = "y", descriptor = "I")
	public final int anInt7656;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "Lclient!oga;")
	public final Interface18 anInterface18_3;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!oga;I)V")
	protected Class1_Sub8_Sub2(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1) {
		this.anInt7656 = arg1;
		this.anInterface18_3 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6115();

	@OriginalMember(owner = "client!up", name = "h", descriptor = "(I)Z")
	public abstract boolean method6118();
}
