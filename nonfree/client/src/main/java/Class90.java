import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class90 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class90() {
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!el;)V")
	public Class90(@OriginalArg(0) Class90 arg0) {
		this.anInt2324 = arg0.anInt2324;
		this.anInt2323 = arg0.anInt2323;
		this.anInt2321 = arg0.anInt2321;
		this.anInt2322 = arg0.anInt2322;
	}
}
