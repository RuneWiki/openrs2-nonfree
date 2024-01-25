import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[B")
	public final byte[] aByteArray66;

	static {
		new Class151("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66 = arg0;
	}
}
