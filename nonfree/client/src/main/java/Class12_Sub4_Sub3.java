import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class12_Sub4_Sub3 extends Class12_Sub4 {

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([B)V")
	public Class12_Sub4_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
	}
}
