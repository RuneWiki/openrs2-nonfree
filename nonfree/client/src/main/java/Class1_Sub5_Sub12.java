import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class1_Sub5_Sub12 extends Class1_Sub5 {

	@OriginalMember(owner = "client!le", name = "u", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray49 = arg0;
	}
}
