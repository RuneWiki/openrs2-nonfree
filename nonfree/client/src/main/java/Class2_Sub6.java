import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
	public Class2_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
	}
}
