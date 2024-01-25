import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class376 {

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public final int anInt9895;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	private final int anInt9892;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(II)V")
	public Class376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9895 = arg1;
		this.anInt9892 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
	public int method8427() {
		return this.anInt9892;
	}
}
