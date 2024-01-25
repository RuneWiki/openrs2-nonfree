import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class8_Sub10 extends Class8 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	public final int anInt8943;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(I)V")
	public Class8_Sub10(@OriginalArg(0) int arg0) {
		this.anInt8943 = arg0;
	}
}
