import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "([B)V")
	public Class2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray42 = arg0;
	}
}
