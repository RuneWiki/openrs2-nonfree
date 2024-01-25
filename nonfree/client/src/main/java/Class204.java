import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class204 {

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
	public final int anInt5719;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
	public final int anInt5716;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
	public final int anInt5720;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	public final int anInt5718;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIII)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5719 = arg2;
		this.anInt5716 = arg0;
		this.anInt5720 = arg1;
		this.anInt5718 = arg3;
	}

	@OriginalMember(owner = "client!qu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
