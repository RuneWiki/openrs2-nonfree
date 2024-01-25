import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class11_Sub9 extends Class11 {

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "F")
	private float aFloat178 = 0.0F;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!wt;")
	private final Class376 aClass376_7;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ln;Lclient!wt;)V")
	public Class11_Sub9(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class376 arg1) {
		super(arg0);
		this.aClass376_7 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static402.aClass34_4);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.aClass376_7.method8618();
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
	@Override
	public void method7365() {
		if (super.aClass16_Sub1_21.method3958() != 0) {
			return;
		}
		@Pc(12) Class54_Sub3 local12 = super.aClass16_Sub1_21.method3940();
		super.aClass16_Sub1_21.method3899(1);
		@Pc(22) Class54_Sub3 local22 = super.aClass16_Sub1_21.method3906();
		local22.method5137(local12);
		local22.method5167(0.125F, 1.0F, 0.125F);
		local22.method5161(this.aFloat178, 0.0F, 0.0F);
		super.aClass16_Sub1_21.method3908(Static222.aClass207_5);
		super.aClass16_Sub1_21.method3899(0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
		super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
		super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
		super.aClass16_Sub1_21.method3934(1);
		super.aClass16_Sub1_21.method3889(null);
		super.aClass16_Sub1_21.method3899(0);
		super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static125.aClass34_3);
		super.aClass16_Sub1_21.method4000(false, true, 0, Static625.aClass265_10);
		super.aClass16_Sub1_21.method3950(0, Static613.aClass265_9);
		super.aClass16_Sub1_21.method3934(0);
		super.aClass16_Sub1_21.method3899(0);
		super.aClass16_Sub1_21.method3939(-16777216);
		super.aClass16_Sub1_21.method3950(0, Static190.aClass265_8);
		this.method7365();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub1_21.method3899(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass16_Sub1_21.method3889(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass376_7.aBoolean762) {
				this.aFloat178 = (float) (super.aClass16_Sub1_21.anInt4932 % 4000) / 4000.0F;
				super.aClass16_Sub1_21.method3889(this.aClass376_7.anInterface1_2);
			} else {
				@Pc(33) int local33 = super.aClass16_Sub1_21.anInt4932 % 4000 * 16 / 4000;
				super.aClass16_Sub1_21.method3889(this.aClass376_7.anInterface20Array1[local33]);
			}
		} else if (this.aClass376_7.aBoolean762) {
			super.aClass16_Sub1_21.method3889(this.aClass376_7.anInterface1_2);
		} else {
			super.aClass16_Sub1_21.method3889(this.aClass376_7.anInterface20Array1[0]);
		}
		super.aClass16_Sub1_21.method3899(0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_21.method3889(arg0);
	}
}
