import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public final class Class3_Sub6_Sub21 extends Class3_Sub6 {

	@OriginalMember(owner = "client!vfa", name = "w", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "([B)V")
	public Class3_Sub6_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = arg0;
	}
}
