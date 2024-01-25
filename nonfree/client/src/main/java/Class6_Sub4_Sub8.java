import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public final class Class6_Sub4_Sub8 extends Class6_Sub4 {

	@OriginalMember(owner = "client!kha", name = "z", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "([B)V")
	public Class6_Sub4_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
	}
}
