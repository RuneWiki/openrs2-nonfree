import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class234 {

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
	public final int anInt7475;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
	public final int anInt7477;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public final int anInt7474;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	public final int anInt7476;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIII)V")
	public Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7475 = arg2;
		this.anInt7477 = arg1;
		this.anInt7474 = arg0;
		this.anInt7476 = arg3;
	}

	@OriginalMember(owner = "client!oaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
