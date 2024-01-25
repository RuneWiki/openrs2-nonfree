import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class199 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
	public final int anInt5939;

	static {
		new Class114("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class199(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5939 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
