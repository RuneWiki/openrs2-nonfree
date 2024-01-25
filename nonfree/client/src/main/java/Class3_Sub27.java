import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V")
	public Class3_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = arg0;
	}
}
