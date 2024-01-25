import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class14_Sub23 extends Class14 {

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[B")
	public final byte[] aByteArray66;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
	public Class14_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66 = arg0;
	}
}
