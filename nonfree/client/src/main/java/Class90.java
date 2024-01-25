import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class90 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public int anInt2673;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt2674;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt2675;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public int anInt2676;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class90() {
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!gr;)V")
	public Class90(@OriginalArg(0) Class90 arg0) {
		this.anInt2673 = arg0.anInt2673;
		this.anInt2674 = arg0.anInt2674;
		this.anInt2676 = arg0.anInt2676;
		this.anInt2675 = arg0.anInt2675;
	}
}
