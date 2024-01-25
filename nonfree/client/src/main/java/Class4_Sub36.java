import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
	public Class4_Sub36(@OriginalArg(0) byte[] arg0) {
		this.aByteArray74 = arg0;
	}
}
