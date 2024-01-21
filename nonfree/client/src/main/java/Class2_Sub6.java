import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!de", name = "t", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([B)V")
	public Class2_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray10 = arg0;
	}
}
