import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class72 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public int anInt2041;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public int anInt2042;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public int anInt2043;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public int anInt2044;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class72() {
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class72(@OriginalArg(0) Class72 arg0) {
		this.anInt2041 = arg0.anInt2041;
		this.anInt2043 = arg0.anInt2043;
		this.anInt2042 = arg0.anInt2042;
		this.anInt2044 = arg0.anInt2044;
	}
}
