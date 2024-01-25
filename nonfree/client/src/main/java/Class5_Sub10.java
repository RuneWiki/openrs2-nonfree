import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!cha", name = "i", descriptor = "[S")
	public final short[] aShortArray20;

	@OriginalMember(owner = "client!cha", name = "j", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub10(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray20 = arg0;
		this.aByteArray16 = arg1;
	}
}
