import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class80 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public int anInt2412;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public int anInt2415;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class80() {
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class80(@OriginalArg(0) Class80 arg0) {
		this.anInt2415 = arg0.anInt2415;
		this.anInt2413 = arg0.anInt2413;
		this.anInt2412 = arg0.anInt2412;
		this.anInt2414 = arg0.anInt2414;
	}
}
