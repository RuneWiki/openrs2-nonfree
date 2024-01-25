import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class67 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	static {
		new Class67("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class67(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray13 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1934(@OriginalArg(0) int arg0) {
		return this.aStringArray13[arg0];
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
