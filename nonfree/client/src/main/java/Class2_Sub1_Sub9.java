import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray49 = arg0;
	}
}
