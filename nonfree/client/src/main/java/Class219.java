import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class219 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public final int anInt6953;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
	public final int anInt6951;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
	public final int anInt6952;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
	public final int anInt6954;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIII)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6953 = arg0;
		this.anInt6951 = arg3;
		this.anInt6952 = arg1;
		this.anInt6954 = arg2;
	}

	@OriginalMember(owner = "client!mv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
