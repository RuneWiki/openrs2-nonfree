import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray82 = arg0;
	}
}
