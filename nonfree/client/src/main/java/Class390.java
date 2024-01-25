import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class390 {

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public final int anInt10629;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V")
	public Class390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10629 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
