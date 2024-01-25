import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class225 {

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
	public final int anInt6501;

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
	public final int anInt6502;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
	public final int anInt6500;

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
	public final int anInt6503;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIII)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6501 = arg2;
		this.anInt6502 = arg3;
		this.anInt6500 = arg0;
		this.anInt6503 = arg1;
	}

	@OriginalMember(owner = "client!oca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
