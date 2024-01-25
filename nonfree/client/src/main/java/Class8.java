import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class8 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public final int anInt254;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class8(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt254 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)I")
	public int method206() {
		return this.anInt254;
	}

	@OriginalMember(owner = "client!ag", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
