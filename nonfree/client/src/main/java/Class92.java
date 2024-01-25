import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class92 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	private final int anInt3264;

	static {
		new Class175("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3264 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
	public int method2663() {
		return this.anInt3264;
	}

	@OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
