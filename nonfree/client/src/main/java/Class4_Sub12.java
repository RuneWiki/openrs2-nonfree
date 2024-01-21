import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
	public Class4_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray10 = arg0;
	}
}
