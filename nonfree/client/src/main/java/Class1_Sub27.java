import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "[B")
	public byte[] aByteArray149;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([B)V")
	public Class1_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray149 = arg0;
	}
}
