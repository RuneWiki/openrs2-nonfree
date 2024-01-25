import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "([B)V")
	public Class1_Sub34(@OriginalArg(0) byte[] arg0) {
		this.aByteArray56 = arg0;
	}
}
