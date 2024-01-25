import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "([B)V")
	public Class3_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
	}
}
