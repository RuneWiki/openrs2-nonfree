import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "([B)V")
	public Class2_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
	}
}
