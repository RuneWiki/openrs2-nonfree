import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	private final int anInt3;

	static {
		new Class55("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(II)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)I")
	public int method6() {
		return this.anInt3;
	}
}
