import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray82 = arg0;
	}
}
