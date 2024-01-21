import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
	}
}
