import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class136 {

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
	public final int anInt3597;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	private final int anInt3592;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(II)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3597 = arg1;
		this.anInt3592 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
	public int method3174() {
		return this.anInt3592;
	}
}
