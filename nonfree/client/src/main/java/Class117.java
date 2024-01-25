import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public final class Class117 {

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
	public final int anInt3283;

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
	public final int anInt3288;

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
	public final int anInt3284;

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
	public final int anInt3286;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(IIII)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3283 = arg3;
		this.anInt3288 = arg2;
		this.anInt3284 = arg0;
		this.anInt3286 = arg1;
	}

	@OriginalMember(owner = "client!fia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
