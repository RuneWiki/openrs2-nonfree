import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray43 = arg0;
	}
}
