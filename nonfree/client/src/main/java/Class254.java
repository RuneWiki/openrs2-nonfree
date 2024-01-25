import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class254 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public final int anInt7355;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7355 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
