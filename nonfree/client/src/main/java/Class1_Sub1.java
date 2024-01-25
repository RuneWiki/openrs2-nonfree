import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}
