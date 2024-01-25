import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class48 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public final int anInt1208;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString8;

	static {
		new Class221(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class48(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1208 = arg1;
		this.aString8 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
