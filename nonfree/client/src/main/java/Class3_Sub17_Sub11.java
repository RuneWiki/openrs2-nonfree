import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public final class Class3_Sub17_Sub11 extends Class3_Sub17 {

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
	private int anInt8504;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	private int anInt8506;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt8504 = arg0.method2036();
		this.anInt8506 = arg0.method2036();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2319(this.anInt8504, this.anInt8506);
	}
}
