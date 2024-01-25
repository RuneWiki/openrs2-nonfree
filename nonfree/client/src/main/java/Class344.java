import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class344 {

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	public final int anInt10156;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	private final int anInt10158;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10156 = arg1;
		this.anInt10158 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	public int method7893() {
		return this.anInt10158;
	}
}
