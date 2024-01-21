import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
	}
}
