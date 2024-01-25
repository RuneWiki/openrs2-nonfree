import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class220 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public final int anInt5969;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public final int anInt5966;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public final int anInt5968;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public final int anInt5967;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIII)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5969 = arg0;
		this.anInt5966 = arg3;
		this.anInt5968 = arg2;
		this.anInt5967 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
