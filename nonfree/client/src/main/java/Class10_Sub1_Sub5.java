import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public abstract class Class10_Sub1_Sub5 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "Lclient!ws;")
	public final Interface12 anInterface12_3;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	public final int anInt4234;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!ws;I)V")
	protected Class10_Sub1_Sub5(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1) {
		this.anInterface12_3 = arg0;
		this.anInt4234 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3394();

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)Z")
	public abstract boolean method3395();
}
