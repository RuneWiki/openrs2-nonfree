import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}
