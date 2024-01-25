import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class354 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public final int anInt10174;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class354(@OriginalArg(0) int arg0) {
		this.anInt10174 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
