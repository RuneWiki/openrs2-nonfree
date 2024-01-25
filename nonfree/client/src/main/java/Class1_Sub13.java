import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Ljava/lang/String;")
	public String aString10;

	static {
		new Class119("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	private Class1_Sub13() {
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString10 = arg0;
	}
}
