import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class116 {

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
	public final int anInt3330;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
	public final int anInt3324;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
	public final int anInt3326;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
	public final int anInt3327;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIII)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3330 = arg2;
		this.anInt3324 = arg3;
		this.anInt3326 = arg0;
		this.anInt3327 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
