import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class228 {

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
	public final int anInt6088;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	public final int anInt6086;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public final int anInt6087;

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
	public final int anInt6094;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIII)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6088 = arg1;
		this.anInt6086 = arg0;
		this.anInt6087 = arg3;
		this.anInt6094 = arg2;
	}

	@OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
