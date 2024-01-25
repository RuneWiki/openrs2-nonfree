import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!me", name = "l", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	private int anInt6434;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Ljava/lang/String;")
	private String aString87 = null;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "J")
	private long aLong170 = -1L;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!fca;Z)V")
	@Override
	public void method5404(@OriginalArg(0) Class3_Sub17 arg0) {
		if (arg0.method4888() != 255) {
			arg0.lb--;
			this.aLong170 = arg0.method4865();
		}
		this.aString87 = arg0.method4897();
		this.anInt6434 = arg0.method4858();
		this.aByte90 = arg0.method4861();
		arg0.method4865();
		if (Static164.aBoolean238) {
			System.out.println("memberhash:" + this.aLong170 + " membername:" + this.aString87);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!gca;)V")
	@Override
	public void method5405(@OriginalArg(1) Class3_Sub20 arg0) {
		@Pc(14) Class170 local14 = new Class170();
		local14.aString55 = this.aString87;
		local14.aByte66 = this.aByte90;
		local14.anInt4576 = this.anInt6434;
		arg0.method3035(local14);
	}
}
