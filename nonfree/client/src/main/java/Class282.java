import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class282 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public final int anInt7330;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public final int anInt7327;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public final int anInt7328;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	public final int anInt7329;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIII)V")
	public Class282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7330 = arg3;
		this.anInt7327 = arg1;
		this.anInt7328 = arg0;
		this.anInt7329 = arg2;
	}

	@OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
