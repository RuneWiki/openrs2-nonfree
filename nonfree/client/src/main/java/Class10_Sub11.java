import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class10_Sub11 extends Class10 {

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
	private final int anInt6865;

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
	private final int anInt6864;

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
	private final int anInt6860;

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
	private final int anInt6863;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub11(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt6865 = arg0.method5272();
		this.anInt6864 = arg0.method5322(-64);
		this.anInt6860 = arg0.method5322(-18);
		this.anInt6863 = arg0.method5322(-64);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static146.method2412(this.anInt6860, this.anInt6864, 0, false, this.anInt6863, this.anInt6865);
	}
}
