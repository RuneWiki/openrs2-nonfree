import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class3_Sub11_Sub10 extends Class3_Sub11 {

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
