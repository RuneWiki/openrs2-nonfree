import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class156 {

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public final int anInt3842;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	private final int anInt3844;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3842 = arg1;
		this.anInt3844 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
	public int method3528() {
		return this.anInt3844;
	}

	@OriginalMember(owner = "client!hl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
