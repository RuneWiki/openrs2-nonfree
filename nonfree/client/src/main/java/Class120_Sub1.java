import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "F")
	private float aFloat138 = 0.0F;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!ki;")
	private final Class164 aClass164_3;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!tu;Lclient!ki;)V")
	public Class120_Sub1(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class164 arg1) {
		super(arg0);
		this.aClass164_3 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub3_20.method6388(1);
		super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static500.aClass289_4);
		super.aClass5_Sub3_20.method6358(true, 0, Static213.aClass166_3, false);
		super.aClass5_Sub3_20.method6314(Static28.aClass166_1, 0);
		super.aClass5_Sub3_20.method6316(0);
		super.aClass5_Sub3_20.method6388(0);
		super.aClass5_Sub3_20.method6363(-16777216);
		super.aClass5_Sub3_20.method6314(Static144.aClass166_2, 0);
		this.method7325();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass5_Sub3_20.method6416(arg1);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		super.aClass5_Sub3_20.method6388(1);
		super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
		super.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
		super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
		super.aClass5_Sub3_20.method6316(1);
		super.aClass5_Sub3_20.method6416(null);
		super.aClass5_Sub3_20.method6388(0);
		super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static130.aClass289_1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub3_20.method6388(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass5_Sub3_20.method6416(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass164_3.aBoolean349) {
				this.aFloat138 = (float) (super.aClass5_Sub3_20.anInt7766 % 4000) / 4000.0F;
				super.aClass5_Sub3_20.method6416(this.aClass164_3.anInterface13_1);
			} else {
				@Pc(52) int local52 = super.aClass5_Sub3_20.anInt7766 % 4000 * 16 / 4000;
				super.aClass5_Sub3_20.method6416(this.aClass164_3.anInterface9Array2[local52]);
			}
		} else if (this.aClass164_3.aBoolean349) {
			super.aClass5_Sub3_20.method6416(this.aClass164_3.anInterface13_1);
		} else {
			super.aClass5_Sub3_20.method6416(this.aClass164_3.anInterface9Array2[0]);
		}
		super.aClass5_Sub3_20.method6388(0);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return this.aClass164_3.method4287();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	@Override
	public void method7325() {
		if (super.aClass5_Sub3_20.method6417() != 0) {
			return;
		}
		@Pc(12) Class205_Sub1 local12 = super.aClass5_Sub3_20.method6359();
		super.aClass5_Sub3_20.method6388(1);
		@Pc(22) Class205_Sub1 local22 = super.aClass5_Sub3_20.method6348();
		local22.la(local12);
		local22.method5229(0.125F, 0.125F, 1.0F);
		local22.method5227(0.0F, 0.0F, this.aFloat138);
		super.aClass5_Sub3_20.method6355(Static25.aClass243_5);
		super.aClass5_Sub3_20.method6388(0);
	}
}
