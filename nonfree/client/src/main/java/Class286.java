import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public final class Class286 {

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
	public final int anInt8234;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class286(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8234 = arg1;
	}

	@OriginalMember(owner = "client!qha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)I")
	public int method7017() {
		return this.anInt8234;
	}
}
