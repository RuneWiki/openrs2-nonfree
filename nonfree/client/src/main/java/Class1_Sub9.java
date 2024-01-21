import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "[B")
	public final byte[] aByteArray5;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray5 = arg0;
	}
}
