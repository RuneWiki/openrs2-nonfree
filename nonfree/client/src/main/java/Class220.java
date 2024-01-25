import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class220 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public final int anInt6171;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public final int anInt6165;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public final int anInt6169;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public final int anInt6163;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIII)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6171 = arg0;
		this.anInt6165 = arg3;
		this.anInt6169 = arg1;
		this.anInt6163 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
