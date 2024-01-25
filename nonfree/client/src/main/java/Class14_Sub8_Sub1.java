import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class14_Sub8_Sub1 extends Class14_Sub8 {

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "B")
	private byte aByte37;

	@OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "J")
	private long aLong35 = -1L;

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "Ljava/lang/String;")
	private String aString13 = null;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method8405(@OriginalArg(0) Class14_Sub29 arg0) {
		if (arg0.method5866() != 255) {
			arg0.anInt7264--;
			this.aLong35 = arg0.method5907();
		}
		this.aString13 = arg0.method5886();
		this.anInt1520 = arg0.method5900();
		this.aByte37 = arg0.method5845();
		arg0.method5907();
		if (Static450.aBoolean540) {
			System.out.println("memberhash:" + this.aLong35 + " membername:" + this.aString13);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!hs;Z)V")
	@Override
	public void method8406(@OriginalArg(0) Class14_Sub25 arg0) {
		@Pc(7) Class336 local7 = new Class336();
		local7.aByte135 = this.aByte37;
		local7.anInt9809 = this.anInt1520;
		local7.aString102 = this.aString13;
		arg0.method3488(local7);
	}
}
