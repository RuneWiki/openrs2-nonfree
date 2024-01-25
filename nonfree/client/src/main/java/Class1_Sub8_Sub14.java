import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public abstract class Class1_Sub8_Sub14 extends Class1_Sub8 {

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public final int anInt8693;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub8_Sub14(@OriginalArg(0) int arg0) {
		this.anInt8693 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7008();

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)Z")
	public abstract boolean method7012();
}
