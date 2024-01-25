import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class362 {

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
	public final int anInt10155;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	private final int anInt10152;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(II)V")
	public Class362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10155 = arg1;
		this.anInt10152 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
	public int method8310() {
		return this.anInt10152;
	}
}
