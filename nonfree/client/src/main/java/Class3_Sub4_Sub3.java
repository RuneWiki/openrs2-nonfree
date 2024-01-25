import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "B")
	private byte aByte58;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	private int anInt2947;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Ljava/lang/String;")
	private String aString46 = null;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "J")
	private long aLong119 = -1L;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ika;B)V")
	@Override
	public void method4957(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.method2048(255) != 255) {
			arg0.anInt2178--;
			this.aLong119 = arg0.method2063();
		}
		this.aString46 = arg0.method2066();
		this.anInt2947 = arg0.method2028(-14795);
		this.aByte58 = arg0.method2022();
		arg0.method2063();
		if (Static331.aBoolean353) {
			System.out.println("memberhash:" + this.aLong119 + " membername:" + this.aString46);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!cg;)V")
	@Override
	public void method4954(@OriginalArg(1) Class3_Sub14 arg0) {
		@Pc(7) Class54 local7 = new Class54();
		local7.aString30 = this.aString46;
		local7.aByte42 = this.aByte58;
		local7.anInt1629 = this.anInt2947;
		arg0.method1636(local7);
	}
}
