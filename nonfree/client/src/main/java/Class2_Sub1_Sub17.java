import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[B")
	public final byte[] aByteArray44;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray44 = arg0;
	}
}
