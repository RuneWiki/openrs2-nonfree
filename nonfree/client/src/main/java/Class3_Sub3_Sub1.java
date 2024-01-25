import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "Ljava/lang/String;")
	private String aString1 = null;

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!wr;B)V")
	@Override
	public void method5915(@OriginalArg(0) Class3_Sub56 arg0) {
		@Pc(7) Class407 local7 = new Class407();
		local7.aString133 = this.aString1;
		local7.anInt11258 = this.anInt104;
		local7.aByte147 = this.aByte1;
		arg0.method9417(local7);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method5916(@OriginalArg(0) Class3_Sub28 arg0) {
		if (arg0.method5322(-108) != 255) {
			arg0.anInt6241--;
			this.aLong9 = arg0.method5287();
		}
		this.aString1 = arg0.method5306();
		this.anInt104 = arg0.method5272();
		this.aByte1 = arg0.method5288();
		arg0.method5287();
		if (Static29.aBoolean16) {
			System.out.println("memberhash:" + this.aLong9 + " membername:" + this.aString1);
		}
	}
}
