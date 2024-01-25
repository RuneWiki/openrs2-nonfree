import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
	public final int anInt5084;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub1_Sub8(@OriginalArg(0) int arg0) {
		this.anInt5084 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(B)Z")
	public abstract boolean method3883();

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3885();
}
