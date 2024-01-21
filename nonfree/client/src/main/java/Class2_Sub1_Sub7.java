import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}
}
