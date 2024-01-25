import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class3_Sub17_Sub4 extends Class3_Sub17 {

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "B")
	private byte aByte55;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	private int anInt2799 = -1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2331(this.anInt2799, this.aByte55);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt2799 = arg0.method2028(-14795);
		this.aByte55 = arg0.method2022();
	}
}
