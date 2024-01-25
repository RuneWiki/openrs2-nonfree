import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	private final int anInt275;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	private final int anInt276;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	private final int anInt274;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	private final int anInt273;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub1(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt275 = arg0.method5272();
		this.anInt276 = arg0.method5322(-17);
		this.anInt274 = arg0.method5322(-16);
		this.anInt273 = arg0.method5322(-42);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static700.method9158(this.anInt273, this.anInt275, 0, this.anInt274, this.anInt276);
	}
}
