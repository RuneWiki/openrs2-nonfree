import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class263 {

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public final int anInt7389;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	public final int anInt7387;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public final int anInt7388;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
	public final int anInt7392;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(IIII)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7389 = arg2;
		this.anInt7387 = arg1;
		this.anInt7388 = arg3;
		this.anInt7392 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
