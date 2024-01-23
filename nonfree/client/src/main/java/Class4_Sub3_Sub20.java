import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class4_Sub3_Sub20 extends Class4_Sub3 {

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([B)V")
	public Class4_Sub3_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray69 = arg0;
	}
}
