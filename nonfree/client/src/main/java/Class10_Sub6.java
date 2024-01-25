import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	private final int anInt2386;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	private final int anInt2383;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub6(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt2386 = arg0.method5272();
		this.anInt2383 = arg0.method5312();
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static166.anInt3107 = Static134.anInt2500;
		Static540.anInt9067 = Static445.anInt7716;
		Static552.anInt9237 = Static134.anInt2496;
		Static215.anInt4179 = this.anInt2386 + Static269.anInt4883;
		Static424.anInt7466 = Static23.anInt402;
		Static46.anInt800 = Static269.anInt4883;
		Static134.anInt2500 = this.anInt2383 >>> 24;
		Static445.anInt7716 = this.anInt2383 >>> 8 & 0xFF;
		Static134.anInt2496 = this.anInt2383 >>> 16 & 0xFF;
		Static23.anInt402 = this.anInt2383 & 0xFF;
	}
}
