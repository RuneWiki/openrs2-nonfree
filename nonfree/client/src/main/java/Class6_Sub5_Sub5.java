import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class6_Sub5_Sub5 extends Class6_Sub5 {

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
	public final int anInt3924;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!wea;")
	public final Interface23 anInterface23_3;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!wea;I)V")
	protected Class6_Sub5_Sub5(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		this.anInt3924 = arg1;
		this.anInterface23_3 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Z")
	public abstract boolean method3391();

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3392();
}
