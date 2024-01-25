import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([B)V")
	public Class4_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
	}
}
