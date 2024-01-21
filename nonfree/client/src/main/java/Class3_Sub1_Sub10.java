import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!p", name = "fb", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
