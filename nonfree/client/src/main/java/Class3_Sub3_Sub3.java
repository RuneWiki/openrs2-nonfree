import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ika", name = "l", descriptor = "B")
	private byte aByte73;

	@OriginalMember(owner = "client!ika", name = "n", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!ika", name = "u", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lclient!fca;Z)V")
	@Override
	public void method5404(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aString61 = arg0.method4897();
		if (this.aString61 != null) {
			arg0.method4888();
			this.aByte73 = arg0.method4861();
			this.aByte74 = arg0.method4861();
		}
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZLclient!gca;)V")
	@Override
	public void method5405(@OriginalArg(1) Class3_Sub20 arg0) {
		arg0.aString43 = this.aString61;
		if (this.aString61 != null) {
			arg0.aByte56 = this.aByte74;
			arg0.aByte57 = this.aByte73;
		}
	}
}
