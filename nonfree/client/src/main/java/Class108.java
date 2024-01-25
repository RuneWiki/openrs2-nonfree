import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class108 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public final int anInt2697;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(II)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2697 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
