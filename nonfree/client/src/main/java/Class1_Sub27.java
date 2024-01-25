import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "([B)V")
	public Class1_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray71 = arg0;
	}
}
