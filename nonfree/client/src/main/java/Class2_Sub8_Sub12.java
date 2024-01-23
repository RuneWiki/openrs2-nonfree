import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class2_Sub8_Sub12 extends Class2_Sub8 {

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V")
	public Class2_Sub8_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = arg0;
	}
}
