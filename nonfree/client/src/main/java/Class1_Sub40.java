import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "[S")
	public final short[] aShortArray123;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub40(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray123 = arg0;
		this.aByteArray106 = arg1;
	}
}
