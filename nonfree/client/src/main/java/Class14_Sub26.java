import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class14_Sub26 extends Class14 {

	@OriginalMember(owner = "client!iga", name = "o", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "([B)V")
	public Class14_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray57 = arg0;
	}
}
