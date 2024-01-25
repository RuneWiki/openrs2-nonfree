import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class2_Sub7_Sub15 extends Class2_Sub7 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public final int anInt8800;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub7_Sub15(@OriginalArg(0) int arg0) {
		this.anInt8800 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Z")
	public abstract boolean method7543();

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7544();
}
