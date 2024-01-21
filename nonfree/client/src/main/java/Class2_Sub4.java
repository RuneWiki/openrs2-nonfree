import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray2 = arg0;
	}
}
