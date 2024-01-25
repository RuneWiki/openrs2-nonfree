import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class3_Sub17_Sub3 extends Class3_Sub17 {

	@OriginalMember(owner = "client!du", name = "p", descriptor = "J")
	private long aLong93 = -1L;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "Ljava/lang/String;")
	private String aString44 = null;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	private int anInt2526 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2334(this.anInt2526, this.aLong93, this.aString44);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.method2048(255) != 255) {
			arg0.anInt2178--;
			this.aLong93 = arg0.method2063();
		}
		this.aString44 = arg0.method2066();
		this.anInt2526 = arg0.method2028(-14795);
		if (Static35.aBoolean85) {
			System.out.println("memberhash:" + this.aLong93 + " membername:" + this.aString44);
		}
	}
}
