import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!ut;")
	public final Interface26 anInterface26_3;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	public final int anInt4355;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!ut;I)V")
	protected Class3_Sub4_Sub6(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) int arg1) {
		this.anInterface26_3 = arg0;
		this.anInt4355 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)Z")
	public abstract boolean method3848();

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3849();
}
