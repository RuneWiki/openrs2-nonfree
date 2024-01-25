import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class3_Sub17_Sub2 extends Class3_Sub17 {

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	private int anInt2354;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt2354 = arg0.method2036();
		this.aString43 = arg0.method2014();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2337(this.anInt2354, this.aString43);
	}
}
