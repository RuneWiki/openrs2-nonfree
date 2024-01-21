import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
	public Class4_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
	}
}
