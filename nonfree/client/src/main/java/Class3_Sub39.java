import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "[B")
	public final byte[] aByteArray72;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "([B)V")
	public Class3_Sub39(@OriginalArg(0) byte[] arg0) {
		this.aByteArray72 = arg0;
	}
}
