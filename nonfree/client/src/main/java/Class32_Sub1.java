import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "F")
	private float aFloat42 = 0.0F;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!tj;")
	private final Class318 aClass318_3;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!rr;Lclient!tj;)V")
	public Class32_Sub1(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Class318 arg1) {
		super(arg0);
		this.aClass318_3 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static438.aClass266_2);
		super.aClass31_Sub1_22.method7083(Static402.aClass179_23, 0, false, true);
		super.aClass31_Sub1_22.method7185(Static415.aClass179_24, 0);
		super.aClass31_Sub1_22.method7176(0);
		super.aClass31_Sub1_22.method7092(0);
		super.aClass31_Sub1_22.method7160(-16777216);
		super.aClass31_Sub1_22.method7185(Static438.aClass179_14, 0);
		this.method7457();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return this.aClass318_3.method6940();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass31_Sub1_22.method7092(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass31_Sub1_22.method7129(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass318_3.aBoolean589) {
				this.aFloat42 = (float) (super.aClass31_Sub1_22.anInt9105 % 4000) / 4000.0F;
				super.aClass31_Sub1_22.method7129(this.aClass318_3.anInterface19_2);
			} else {
				@Pc(58) int local58 = super.aClass31_Sub1_22.anInt9105 % 4000 * 16 / 4000;
				super.aClass31_Sub1_22.method7129(this.aClass318_3.anInterface12Array2[local58]);
			}
		} else if (this.aClass318_3.aBoolean589) {
			super.aClass31_Sub1_22.method7129(this.aClass318_3.anInterface19_2);
		} else {
			super.aClass31_Sub1_22.method7129(this.aClass318_3.anInterface12Array2[0]);
		}
		super.aClass31_Sub1_22.method7092(0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
		super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static486.aClass266_5);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		if (super.aClass31_Sub1_22.method7138() != 0) {
			return;
		}
		@Pc(11) Class42_Sub3 local11 = super.aClass31_Sub1_22.method7075();
		super.aClass31_Sub1_22.method7092(1);
		@Pc(21) Class42_Sub3 local21 = super.aClass31_Sub1_22.method7146();
		local21.M(local11);
		local21.method7528(0.125F, 1.0F, 0.125F);
		local21.method7522(0.0F, this.aFloat42, 0.0F);
		super.aClass31_Sub1_22.method7161(Static82.aClass51_18);
		super.aClass31_Sub1_22.method7092(0);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
		super.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
		super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
		super.aClass31_Sub1_22.method7176(1);
		super.aClass31_Sub1_22.method7129(null);
		super.aClass31_Sub1_22.method7092(0);
		super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		super.aClass31_Sub1_22.method7129(arg1);
	}
}
