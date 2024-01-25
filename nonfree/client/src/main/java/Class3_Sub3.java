import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!au", name = "q", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
	}
}
