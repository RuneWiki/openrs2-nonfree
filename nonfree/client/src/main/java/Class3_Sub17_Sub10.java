import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class3_Sub17_Sub10 extends Class3_Sub17 {

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "J")
	private long aLong280 = -1L;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Ljava/lang/String;")
	private String aString106 = null;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.method2321(this.aString106, this.aLong280);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.method2048(255) != 255) {
			arg0.anInt2178--;
			this.aLong280 = arg0.method2063();
		}
		this.aString106 = arg0.method2066();
	}
}
