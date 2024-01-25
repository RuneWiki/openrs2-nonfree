import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class16_Sub10 extends Class16 {

	@OriginalMember(owner = "client!wfa", name = "A", descriptor = "F")
	private float aFloat280 = 0.0F;

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "Lclient!eb;")
	private final Class73 aClass73_8;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!bm;Lclient!eb;)V")
	public Class16_Sub10(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class73 arg1) {
		super(arg0);
		this.aClass73_8 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub1_23.method1987(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static25.aClass363_1);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
		super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
		super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
		super.aClass33_Sub1_23.method2075(1);
		super.aClass33_Sub1_23.method1987(null);
		super.aClass33_Sub1_23.method2010(0);
		super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static428.aClass363_4);
		super.aClass33_Sub1_23.method1988(false, 0, true, Static419.aClass371_4);
		super.aClass33_Sub1_23.method1991(Static25.aClass371_1, 0);
		super.aClass33_Sub1_23.method2075(0);
		super.aClass33_Sub1_23.method2010(0);
		super.aClass33_Sub1_23.method1996(-16777216);
		super.aClass33_Sub1_23.method1991(Static139.aClass371_3, 0);
		this.method8610();
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.aClass73_8.method2713();
	}

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "(B)V")
	@Override
	public void method8610() {
		if (super.aClass33_Sub1_23.method2093() != 0) {
			return;
		}
		@Pc(14) Class47_Sub3 local14 = super.aClass33_Sub1_23.method2041();
		super.aClass33_Sub1_23.method2010(1);
		@Pc(24) Class47_Sub3 local24 = super.aClass33_Sub1_23.method2020();
		local24.method7877(local14);
		local24.method7888(1.0F, 0.125F, 0.125F);
		local24.method7882(0.0F, 0.0F, this.aFloat280);
		super.aClass33_Sub1_23.method2088(Static310.aClass180_7);
		super.aClass33_Sub1_23.method2010(0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub1_23.method2010(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass33_Sub1_23.method1987(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass73_8.aBoolean236) {
				this.aFloat280 = (float) (super.aClass33_Sub1_23.anInt2179 % 4000) / 4000.0F;
				super.aClass33_Sub1_23.method1987(this.aClass73_8.anInterface17_2);
			} else {
				@Pc(89) int local89 = super.aClass33_Sub1_23.anInt2179 % 4000 * 16 / 4000;
				super.aClass33_Sub1_23.method1987(this.aClass73_8.anInterface2Array2[local89]);
			}
		} else if (this.aClass73_8.aBoolean236) {
			super.aClass33_Sub1_23.method1987(this.aClass73_8.anInterface17_2);
		} else {
			super.aClass33_Sub1_23.method1987(this.aClass73_8.anInterface2Array2[0]);
		}
		super.aClass33_Sub1_23.method2010(0);
	}
}
