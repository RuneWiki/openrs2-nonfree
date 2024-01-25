import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class179 {

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	public final int anInt5217;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	public final int anInt5215;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
	public final int anInt5216;

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
	public final int anInt5214;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIII)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5217 = arg0;
		this.anInt5215 = arg2;
		this.anInt5216 = arg1;
		this.anInt5214 = arg3;
	}

	@OriginalMember(owner = "client!laa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
