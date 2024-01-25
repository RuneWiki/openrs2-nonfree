import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class3_Sub10_Sub9 extends Class3_Sub10 {

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "[B")
	public final byte[] aByteArray47;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
	public Class3_Sub10_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray47 = arg0;
	}
}
