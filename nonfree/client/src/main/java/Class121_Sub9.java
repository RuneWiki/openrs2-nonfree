import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class121_Sub9 extends Class121 {

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "F")
	private float aFloat178 = 0.0F;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!dma;")
	private final Class76 aClass76_7;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!nb;Lclient!dma;)V")
	public Class121_Sub9(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) Class76 arg1) {
		super(arg0);
		this.aClass76_7 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
		super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
		super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
		super.aClass67_Sub1_23.method5638(1);
		super.aClass67_Sub1_23.method5612((Interface12) null);
		super.aClass67_Sub1_23.method5687(0);
		super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.aClass76_7.method2072();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass67_Sub1_23.method5612(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static573.aClass37_3);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass67_Sub1_23.method5687(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass67_Sub1_23.method5612((Interface12) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass76_7.aBoolean190) {
				this.aFloat178 = (float) (super.aClass67_Sub1_23.anInt6654 % 4000) / 4000.0F;
				super.aClass67_Sub1_23.method5612(this.aClass76_7.anInterface1_1);
			} else {
				@Pc(72) int local72 = super.aClass67_Sub1_23.anInt6654 % 4000 * 16 / 4000;
				super.aClass67_Sub1_23.method5612(this.aClass76_7.anInterface6Array2[local72]);
			}
		} else if (this.aClass76_7.aBoolean190) {
			super.aClass67_Sub1_23.method5612(this.aClass76_7.anInterface1_1);
		} else {
			super.aClass67_Sub1_23.method5612(this.aClass76_7.anInterface6Array2[0]);
		}
		super.aClass67_Sub1_23.method5687(0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	@Override
	public void method9237() {
		if (super.aClass67_Sub1_23.method5643() != 0) {
			return;
		}
		@Pc(12) Class181_Sub1 local12 = super.aClass67_Sub1_23.method5566();
		super.aClass67_Sub1_23.method5687(1);
		@Pc(22) Class181_Sub1 local22 = super.aClass67_Sub1_23.method5601();
		local22.method6355(local12);
		local22.method4932(0.125F, 1.0F, 0.125F);
		local22.method4915(0.0F, this.aFloat178, 0.0F);
		super.aClass67_Sub1_23.method5666(Static234.aClass96_3);
		super.aClass67_Sub1_23.method5687(0);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5686(Static722.aClass37_5, Static573.aClass37_3);
		super.aClass67_Sub1_23.method5641(true, false, Static143.aClass58_1, 0);
		super.aClass67_Sub1_23.method5674(0, Static273.aClass58_2);
		super.aClass67_Sub1_23.method5638(0);
		super.aClass67_Sub1_23.method5687(0);
		super.aClass67_Sub1_23.method5588(-16777216);
		super.aClass67_Sub1_23.method5674(0, Static472.aClass58_3);
		this.method9237();
	}
}
