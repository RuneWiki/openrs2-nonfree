import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class269 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
	public final int anInt7912;

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
	private final int anInt7917;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(II)V")
	public Class269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7912 = arg1;
		this.anInt7917 = arg0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)I")
	public int method6631() {
		return this.anInt7917;
	}

	@OriginalMember(owner = "client!qaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
