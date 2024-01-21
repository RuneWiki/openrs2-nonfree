import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
	public Class5_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
	}
}
