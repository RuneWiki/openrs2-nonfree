import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "[B")
	public final byte[] aByteArray70;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray70 = arg0;
	}
}
