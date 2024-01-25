import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!is", name = "k", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "([B)V")
	public Class5_Sub22(@OriginalArg(0) byte[] arg0) {
		this.aByteArray35 = arg0;
	}
}
