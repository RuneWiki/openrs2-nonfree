import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
	}
}
