import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "[B")
	public final byte[] aByteArray41;

	static {
		new Class242("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray41 = arg0;
	}
}
