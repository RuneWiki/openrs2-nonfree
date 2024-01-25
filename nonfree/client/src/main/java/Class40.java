import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class40 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	private final int anInt859;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public final int anInt858;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt859 = arg0;
		this.anInt858 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public int method683() {
		return this.anInt859;
	}
}
