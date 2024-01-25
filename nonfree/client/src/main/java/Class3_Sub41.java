import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "([B)V")
	public Class3_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray76 = arg0;
	}
}
