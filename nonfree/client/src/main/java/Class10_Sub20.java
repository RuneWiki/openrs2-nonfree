import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class10_Sub20 extends Class10 {

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
	private final int anInt9223;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "[I")
	private final int[] anIntArray507;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	private final int anInt9228;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	private final int anInt9222;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub20(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt9223 = arg0.method5272();
		this.anIntArray507 = new int[4];
		this.anInt9228 = arg0.method5275();
		Static735.method9184(this.anIntArray507, 0, this.anIntArray507.length, this.anInt9228);
		this.anInt9222 = arg0.method5312();
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		@Pc(18) Class19_Sub1_Sub3_Sub2 local18 = Static154.aClass11Array1[this.anInt9223].method295();
		if (this.anInt9222 == 0) {
			Static192.method2903(local18, false, 0, this.anIntArray507);
		} else {
			Static363.method5199(new int[] { this.anInt9222 }, new int[1], new int[] { this.anInt9228 }, local18);
		}
	}
}
