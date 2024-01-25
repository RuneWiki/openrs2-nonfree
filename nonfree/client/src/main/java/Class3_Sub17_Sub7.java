import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public final class Class3_Sub17_Sub7 extends Class3_Sub17 {

	@OriginalMember(owner = "client!kia", name = "l", descriptor = "Ljava/lang/String;")
	private String aString66 = null;

	@OriginalMember(owner = "client!kia", name = "j", descriptor = "J")
	private long aLong188 = -1L;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2334(0, this.aLong188, this.aString66);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.method2048(255) != 255) {
			arg0.anInt2178--;
			this.aLong188 = arg0.method2063();
		}
		this.aString66 = arg0.method2066();
		if (Static35.aBoolean85) {
			System.out.println("memberhash:" + this.aLong188 + " membername:" + this.aString66);
		}
	}
}
