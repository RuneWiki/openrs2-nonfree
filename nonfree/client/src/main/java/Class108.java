import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class108 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
	public final int anInt2675;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2675 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
