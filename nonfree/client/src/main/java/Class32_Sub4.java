import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class32_Sub4 extends Class32 {

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "F")
	private float aFloat16 = 0.0F;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!oca;")
	private final Class247 aClass247_2;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!lba;Lclient!oca;)V")
	public Class32_Sub4(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class247 arg1) {
		super(arg0);
		this.aClass247_2 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
		super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
		super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
		super.aClass132_Sub1_21.method7560(1);
		super.aClass132_Sub1_21.method7635((Interface17) null);
		super.aClass132_Sub1_21.method7616(0);
		super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	@Override
	public void method8321() {
		if (super.aClass132_Sub1_21.method7629() != 0) {
			return;
		}
		@Pc(12) Class207_Sub3 local12 = super.aClass132_Sub1_21.method7643();
		super.aClass132_Sub1_21.method7616(1);
		@Pc(22) Class207_Sub3 local22 = super.aClass132_Sub1_21.method7613();
		local22.method8211(local12);
		local22.method8229(0.125F, 0.125F, 1.0F);
		local22.method8215(this.aFloat16, 0.0F, 0.0F);
		super.aClass132_Sub1_21.method7618(Static336.aClass257_5);
		super.aClass132_Sub1_21.method7616(0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass132_Sub1_21.method7616(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass132_Sub1_21.method7635((Interface17) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass247_2.aBoolean481) {
				this.aFloat16 = (float) (super.aClass132_Sub1_21.anInt9000 % 4000) / 4000.0F;
				super.aClass132_Sub1_21.method7635(this.aClass247_2.anInterface1_1);
			} else {
				@Pc(88) int local88 = super.aClass132_Sub1_21.anInt9000 % 4000 * 16 / 4000;
				super.aClass132_Sub1_21.method7635(this.aClass247_2.anInterface2Array1[local88]);
			}
		} else if (this.aClass247_2.aBoolean481) {
			super.aClass132_Sub1_21.method7635(this.aClass247_2.anInterface1_1);
		} else {
			super.aClass132_Sub1_21.method7635(this.aClass247_2.anInterface2Array1[0]);
		}
		super.aClass132_Sub1_21.method7616(0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7637(Static116.aClass322_2, Static320.aClass322_5);
		super.aClass132_Sub1_21.method7612(false, 0, Static368.aClass378_1, true);
		super.aClass132_Sub1_21.method7598(0, Static648.aClass378_4);
		super.aClass132_Sub1_21.method7560(0);
		super.aClass132_Sub1_21.method7616(0);
		super.aClass132_Sub1_21.method7611(-16777216);
		super.aClass132_Sub1_21.method7598(0, Static583.aClass378_3);
		this.method8321();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass132_Sub1_21.method7635(arg1);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.aClass247_2.method6208();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static320.aClass322_5);
	}
}
