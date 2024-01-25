import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gga", name = "u", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray49 = arg0;
	}
}
