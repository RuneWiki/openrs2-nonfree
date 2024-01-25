import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class387 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public final int anInt10227;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public final int anInt10231;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public final int anInt10234;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public final int anInt10232;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIII)V")
	public Class387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10227 = arg3;
		this.anInt10231 = arg1;
		this.anInt10234 = arg0;
		this.anInt10232 = arg2;
	}

	@OriginalMember(owner = "client!wg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
