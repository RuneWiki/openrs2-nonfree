import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class1_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
