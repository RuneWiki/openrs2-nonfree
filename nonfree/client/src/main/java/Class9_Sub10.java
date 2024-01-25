import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class9_Sub10 extends Class9 {

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public final int anInt8224;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
	public Class9_Sub10(@OriginalArg(0) int arg0) {
		this.anInt8224 = arg0;
	}
}
