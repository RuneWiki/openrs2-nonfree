import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class316 {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public final int anInt9105;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public final int anInt9108;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
	public final int anInt9106;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	public final int anInt9109;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIII)V")
	public Class316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9105 = arg3;
		this.anInt9108 = arg1;
		this.anInt9106 = arg0;
		this.anInt9109 = arg2;
	}

	@OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
