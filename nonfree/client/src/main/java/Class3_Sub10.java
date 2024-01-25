import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public final int anInt10676;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	public Class3_Sub10(@OriginalArg(0) int arg0) {
		this.anInt10676 = arg0;
	}
}
