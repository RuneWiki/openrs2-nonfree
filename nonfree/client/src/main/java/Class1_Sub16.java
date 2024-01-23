import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([B)V")
	public Class1_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
