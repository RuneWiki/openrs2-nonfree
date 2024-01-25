import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "F")
	private float aFloat10 = 0.0F;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "Lclient!lo;")
	private final Class224 aClass224_1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!wk;Lclient!lo;)V")
	public Class14_Sub2(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class224 arg1) {
		super(arg0);
		this.aClass224_1 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	@Override
	public void method8616() {
		if (super.aClass143_Sub1_22.method6298() != 0) {
			return;
		}
		@Pc(12) Class56_Sub2 local12 = super.aClass143_Sub1_22.method6399();
		super.aClass143_Sub1_22.method6374(1);
		@Pc(22) Class56_Sub2 local22 = super.aClass143_Sub1_22.method6277();
		local22.method8393(local12);
		local22.method6828(1.0F, 0.125F, 0.125F);
		local22.method6811(this.aFloat10, 0.0F, 0.0F);
		super.aClass143_Sub1_22.method6307(Static357.aClass270_5);
		super.aClass143_Sub1_22.method6374(0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		super.aClass143_Sub1_22.method6338(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6370(Static346.aClass6_1, Static371.aClass6_2);
		super.aClass143_Sub1_22.method6291(0, false, Static663.aClass90_4, true);
		super.aClass143_Sub1_22.method6391(0, Static85.aClass90_2);
		super.aClass143_Sub1_22.method6303(0);
		super.aClass143_Sub1_22.method6374(0);
		super.aClass143_Sub1_22.method6293(-16777216);
		super.aClass143_Sub1_22.method6391(0, Static85.aClass90_1);
		this.method8616();
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return this.aClass224_1.method5207();
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
		super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
		super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
		super.aClass143_Sub1_22.method6303(1);
		super.aClass143_Sub1_22.method6338((Interface4) null);
		super.aClass143_Sub1_22.method6374(0);
		super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass143_Sub1_22.method6374(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass143_Sub1_22.method6338((Interface4) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass224_1.aBoolean454) {
				this.aFloat10 = (float) (super.aClass143_Sub1_22.anInt7410 % 4000) / 4000.0F;
				super.aClass143_Sub1_22.method6338(this.aClass224_1.anInterface21_1);
			} else {
				@Pc(46) int local46 = super.aClass143_Sub1_22.anInt7410 % 4000 * 16 / 4000;
				super.aClass143_Sub1_22.method6338(this.aClass224_1.anInterface12Array1[local46]);
			}
		} else if (this.aClass224_1.aBoolean454) {
			super.aClass143_Sub1_22.method6338(this.aClass224_1.anInterface21_1);
		} else {
			super.aClass143_Sub1_22.method6338(this.aClass224_1.anInterface12Array1[0]);
		}
		super.aClass143_Sub1_22.method6374(0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static371.aClass6_2);
	}
}
