import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = arg0;
	}
}
