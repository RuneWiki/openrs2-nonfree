import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[S")
	public final short[] aShortArray84;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "[B")
	public final byte[] aByteArray68;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub35(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray84 = arg0;
		this.aByteArray68 = arg1;
	}
}
