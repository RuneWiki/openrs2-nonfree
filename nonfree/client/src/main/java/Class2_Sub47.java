import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "[S")
	public final short[] aShortArray129;

	@OriginalMember(owner = "client!sha", name = "p", descriptor = "[B")
	public final byte[] aByteArray122;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub47(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray129 = arg0;
		this.aByteArray122 = arg1;
	}
}
