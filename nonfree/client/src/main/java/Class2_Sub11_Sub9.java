import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class2_Sub11_Sub9 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
	public Class2_Sub11_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray43 = arg0;
	}
}
