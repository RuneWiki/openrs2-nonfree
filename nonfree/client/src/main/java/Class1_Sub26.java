import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "[S")
	public final short[] aShortArray77;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub26(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray77 = arg0;
		this.aByteArray53 = arg1;
	}
}
