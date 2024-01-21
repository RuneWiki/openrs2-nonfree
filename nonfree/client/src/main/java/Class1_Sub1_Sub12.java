import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qb", name = "ib", descriptor = "[B")
	public final byte[] aByteArray23;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray23 = arg0;
	}
}
