import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "[B")
	public final byte[] aByteArray75;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray75 = arg0;
	}
}
