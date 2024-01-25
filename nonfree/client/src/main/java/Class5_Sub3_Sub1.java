import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}
