import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class12_Sub39 extends Class12 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Class12_Sub39(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
	}
}
