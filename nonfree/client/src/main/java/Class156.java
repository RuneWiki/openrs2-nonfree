import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class156 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public final int anInt4524;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	public final int anInt4527;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "I")
	public final int anInt4530;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public final int anInt4526;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIII)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4524 = arg2;
		this.anInt4527 = arg3;
		this.anInt4530 = arg1;
		this.anInt4526 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
