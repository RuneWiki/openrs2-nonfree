import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "[S")
	public final short[] aShortArray54;

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub26(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray54 = arg0;
		this.aByteArray55 = arg1;
	}
}
