import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public abstract class Class6_Sub4_Sub5 extends Class6_Sub4 {

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
	public final int anInt7586;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub4_Sub5(@OriginalArg(0) int arg0) {
		this.anInt7586 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6327();

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "(B)Z")
	public abstract boolean method6328();
}
