import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class13_Sub5 extends Class13 {

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "F")
	private float aFloat83 = 0.0F;

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "Lclient!nc;")
	private final Class242 aClass242_5;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Lclient!mj;Lclient!nc;)V")
	public Class13_Sub5(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Class242 arg1) {
		super(arg0);
		this.aClass242_5 = arg1;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub1_22.method5862(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass101_Sub1_22.method5909((Interface5) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass242_5.aBoolean552) {
				this.aFloat83 = (float) (super.aClass101_Sub1_22.anInt6645 % 4000) / 4000.0F;
				super.aClass101_Sub1_22.method5909(this.aClass242_5.anInterface13_2);
			} else {
				@Pc(96) int local96 = super.aClass101_Sub1_22.anInt6645 % 4000 * 16 / 4000;
				super.aClass101_Sub1_22.method5909(this.aClass242_5.anInterface10Array1[local96]);
			}
		} else if (this.aClass242_5.aBoolean552) {
			super.aClass101_Sub1_22.method5909(this.aClass242_5.anInterface13_2);
		} else {
			super.aClass101_Sub1_22.method5909(this.aClass242_5.anInterface10Array1[0]);
		}
		super.aClass101_Sub1_22.method5862(0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub1_22.method5909(arg0);
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V")
	@Override
	public void method8493() {
		if (super.aClass101_Sub1_22.method5874() != 0) {
			return;
		}
		@Pc(9) Class76_Sub2 local9 = super.aClass101_Sub1_22.method5936();
		super.aClass101_Sub1_22.method5862(1);
		@Pc(19) Class76_Sub2 local19 = super.aClass101_Sub1_22.method5832();
		local19.method9629(local9);
		local19.method7349(0.125F, 1.0F, 0.125F);
		local19.method7332(0.0F, this.aFloat83, 0.0F);
		super.aClass101_Sub1_22.method5902(Static647.aClass327_5);
		super.aClass101_Sub1_22.method5862(0);
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
		super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
		super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
		super.aClass101_Sub1_22.method5867(1);
		super.aClass101_Sub1_22.method5909((Interface5) null);
		super.aClass101_Sub1_22.method5862(0);
		super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5891(Static238.aClass381_4, Static512.aClass381_5);
		super.aClass101_Sub1_22.method5922(0, false, true, Static44.aClass118_1);
		super.aClass101_Sub1_22.method5890(0, Static175.aClass118_2);
		super.aClass101_Sub1_22.method5867(0);
		super.aClass101_Sub1_22.method5862(0);
		super.aClass101_Sub1_22.method5933(-16777216);
		super.aClass101_Sub1_22.method5890(0, Static660.aClass118_5);
		this.method8493();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static512.aClass381_5);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.aClass242_5.method6564();
	}
}
