import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "([B)V")
	public Class2_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray8 = arg0;
	}
}
