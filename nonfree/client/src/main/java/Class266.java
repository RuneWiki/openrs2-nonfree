import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class266 {

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public final int anInt7576;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public final int anInt7570;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int anInt7572;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public final int anInt7574;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIII)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7576 = arg2;
		this.anInt7570 = arg1;
		this.anInt7572 = arg3;
		this.anInt7574 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
