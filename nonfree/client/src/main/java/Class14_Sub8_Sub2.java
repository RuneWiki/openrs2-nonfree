import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class14_Sub8_Sub2 extends Class14_Sub8 {

	@OriginalMember(owner = "client!du", name = "p", descriptor = "B")
	private byte aByte46;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	private int anInt2308;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	private int anInt2307 = -1;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method8405(@OriginalArg(0) Class14_Sub29 arg0) {
		this.anInt2307 = arg0.method5900();
		this.aByte46 = arg0.method5845();
		this.anInt2308 = arg0.method5900();
		arg0.method5907();
		this.aString28 = arg0.method5898();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!hs;Z)V")
	@Override
	public void method8406(@OriginalArg(0) Class14_Sub25 arg0) {
		@Pc(9) Class336 local9 = arg0.aClass336Array1[this.anInt2307];
		local9.anInt9809 = this.anInt2308;
		local9.aByte135 = this.aByte46;
		local9.aString102 = this.aString28;
	}
}
