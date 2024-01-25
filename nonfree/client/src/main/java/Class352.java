import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class352 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public final int anInt10185;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public final int anInt10186;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public final int anInt10188;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	public final int anInt10184;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIII)V")
	public Class352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10185 = arg1;
		this.anInt10186 = arg3;
		this.anInt10188 = arg2;
		this.anInt10184 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
