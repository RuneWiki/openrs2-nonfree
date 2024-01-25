import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class Class2_Sub6_Sub5 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gv", name = "w", descriptor = "Lclient!tm;")
	public final Interface23 anInterface23_3;

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
	public final int anInt9203;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!tm;I)V")
	protected Class2_Sub6_Sub5(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		this.anInterface23_3 = arg0;
		this.anInt9203 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
	public abstract boolean method8119();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method8120();
}
