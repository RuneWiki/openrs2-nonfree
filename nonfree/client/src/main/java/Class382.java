import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class382 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public final int anInt10735;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public final int anInt10734;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
	public final int anInt10733;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
	public final int anInt10732;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIII)V")
	public Class382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10735 = arg1;
		this.anInt10734 = arg2;
		this.anInt10733 = arg3;
		this.anInt10732 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
