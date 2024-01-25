import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class94 {

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	private final int anInt3265;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public final int anInt3262;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(II)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3265 = arg0;
		this.anInt3262 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
	public int method3004() {
		return this.anInt3265;
	}
}
