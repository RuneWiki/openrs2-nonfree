import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[S")
	public final short[] aShortArray149;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "[B")
	public final byte[] aByteArray65;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub37(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray149 = arg0;
		this.aByteArray65 = arg1;
	}
}
