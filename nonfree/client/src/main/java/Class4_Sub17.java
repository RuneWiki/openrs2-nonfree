import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
	public Class4_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
