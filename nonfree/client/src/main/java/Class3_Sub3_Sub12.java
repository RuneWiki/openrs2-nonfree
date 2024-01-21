import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class3_Sub3_Sub12 extends Class3_Sub3 {

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
	}
}
