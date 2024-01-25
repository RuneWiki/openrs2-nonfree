import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class10_Sub2_Sub2 extends Class10_Sub2 {

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	private final int anInt6410;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
	private final int anInt6405;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private final int anInt6412;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub2_Sub2(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt6410 = arg0.method5272();
		this.anInt6405 = arg0.method5322(-9);
		this.anInt6412 = arg0.method5272();
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass11Array1[this.anInt6410].method295().method6585(super.anInt6402 << 16, this.anInt6405, super.anInt6404, false, this.anInt6412, super.anInt6403);
	}
}
