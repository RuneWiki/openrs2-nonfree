import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class145_Sub1 extends Class145 {

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[I")
	public final int[] anIntArray339;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "[I")
	public final int[] anIntArray340;

	static {
		new Class88(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II[I[I)V")
	public Class145_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray339 = arg2;
		this.anIntArray340 = arg3;
	}
}
