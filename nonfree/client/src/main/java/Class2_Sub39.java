import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "[B")
	public final byte[] aByteArray116;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V")
	public Class2_Sub39(@OriginalArg(0) byte[] arg0) {
		this.aByteArray116 = arg0;
	}
}
