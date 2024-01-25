import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class3_Sub11_Sub3 extends Class3_Sub11 {

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "Ljava/lang/String;")
	private String aString30 = null;

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
	private int anInt1603 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5840(this.aLong78, this.anInt1603, this.aString30);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		if (arg0.method5322(-10) != 255) {
			arg0.anInt6241--;
			this.aLong78 = arg0.method5287();
		}
		this.aString30 = arg0.method5306();
		this.anInt1603 = arg0.method5272();
		if (Static125.aBoolean201) {
			System.out.println("memberhash:" + this.aLong78 + " membername:" + this.aString30);
		}
	}
}
