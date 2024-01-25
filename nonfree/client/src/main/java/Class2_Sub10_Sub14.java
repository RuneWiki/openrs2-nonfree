import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class2_Sub10_Sub14 extends Class2_Sub10 {

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "[B")
	public final byte[] aByteArray80;

	static {
		new Class32(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "([B)V")
	public Class2_Sub10_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
	}
}
