import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "[S")
	public final short[] aShortArray72;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub27(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray72 = arg0;
		this.aByteArray59 = arg1;
	}
}
