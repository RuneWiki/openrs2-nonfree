import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "J")
	private long aLong137 = -1L;

	@OriginalMember(owner = "client!jaa", name = "z", descriptor = "Ljava/lang/String;")
	private String aString61 = null;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6015(this.aString61, this.aLong137);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		if (arg0.method5203() != 255) {
			arg0.anInt5725--;
			this.aLong137 = arg0.method5213();
		}
		this.aString61 = arg0.method5224();
		if (Static656.aBoolean799) {
			System.out.println("memberhash:" + this.aLong137 + " membername:" + this.aString61);
		}
	}
}
