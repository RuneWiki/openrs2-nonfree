import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([B)V")
	public Class4_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray3 = arg0;
	}
}
