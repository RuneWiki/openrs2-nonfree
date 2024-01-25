import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class307 {

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public final int anInt8539;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public final int anInt8536;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public final int anInt8535;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public final int anInt8534;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIII)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8539 = arg2;
		this.anInt8536 = arg3;
		this.anInt8535 = arg0;
		this.anInt8534 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
