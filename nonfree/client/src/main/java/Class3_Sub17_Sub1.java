import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	private int anInt2259;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	private int anInt2262;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	private int anInt2264 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt2264 = arg0.method2028(-14795);
		this.anInt2262 = arg0.method2036();
		this.anInt2263 = arg0.method2048(255);
		this.anInt2259 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2335(this.anInt2263, this.anInt2259, this.anInt2262, this.anInt2264);
	}
}
