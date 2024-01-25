import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public final class Class3_Sub17_Sub9 extends Class3_Sub17 {

	@OriginalMember(owner = "client!mka", name = "l", descriptor = "I")
	private int anInt6354;

	@OriginalMember(owner = "client!mka", name = "r", descriptor = "I")
	private int anInt6356;

	@OriginalMember(owner = "client!mka", name = "s", descriptor = "I")
	private int anInt6357;

	@OriginalMember(owner = "client!mka", name = "k", descriptor = "I")
	private int anInt6358;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt6354 = arg0.method2036();
		this.anInt6358 = arg0.method2036();
		this.anInt6356 = arg0.method2048(255);
		this.anInt6357 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2339(this.anInt6357, this.anInt6356, this.anInt6358, this.anInt6354);
	}
}
