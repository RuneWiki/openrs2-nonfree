import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class2_Sub7_Sub18 extends Class2_Sub7 {

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[B")
	public final byte[] aByteArray89;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub7_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray89 = arg0;
	}
}
