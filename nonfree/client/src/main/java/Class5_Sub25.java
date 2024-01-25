import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class5_Sub25 extends Class5 {

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class5_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray42 = arg0;
	}
}
