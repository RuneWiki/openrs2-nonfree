import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class17_Sub6 extends Class17 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "F")
	private float aFloat153 = 0.0F;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Lclient!ur;")
	private final Class347 aClass347_6;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!wga;Lclient!ur;)V")
	public Class17_Sub6(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class347 arg1) {
		super(arg0);
		this.aClass347_6 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
		super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
		super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
		super.aClass20_Sub2_22.method1544(1);
		super.aClass20_Sub2_22.method1484(null);
		super.aClass20_Sub2_22.method1531(0);
		super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass20_Sub2_22.method1531(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass20_Sub2_22.method1484(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass347_6.aBoolean711) {
				this.aFloat153 = (float) (super.aClass20_Sub2_22.anInt1564 % 4000) / 4000.0F;
				super.aClass20_Sub2_22.method1484(this.aClass347_6.anInterface13_1);
			} else {
				@Pc(87) int local87 = super.aClass20_Sub2_22.anInt1564 % 4000 * 16 / 4000;
				super.aClass20_Sub2_22.method1484(this.aClass347_6.anInterface27Array2[local87]);
			}
		} else if (this.aClass347_6.aBoolean711) {
			super.aClass20_Sub2_22.method1484(this.aClass347_6.anInterface13_1);
		} else {
			super.aClass20_Sub2_22.method1484(this.aClass347_6.anInterface27Array2[0]);
		}
		super.aClass20_Sub2_22.method1531(0);
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.aClass347_6.method8640();
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V")
	@Override
	public void method8069() {
		if (super.aClass20_Sub2_22.method1511() != 0) {
			return;
		}
		@Pc(12) Class30_Sub2 local12 = super.aClass20_Sub2_22.method1482();
		super.aClass20_Sub2_22.method1531(1);
		@Pc(24) Class30_Sub2 local24 = super.aClass20_Sub2_22.method1454();
		local24.method4653(local12);
		local24.method4034(0.125F, 1.0F, 0.125F);
		local24.method4040(0.0F, this.aFloat153, 0.0F);
		super.aClass20_Sub2_22.method1487(Static155.aClass332_2);
		super.aClass20_Sub2_22.method1531(0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static425.aClass315_3);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static361.aClass315_2);
		super.aClass20_Sub2_22.method1558(true, 0, Static118.aClass177_1, false);
		super.aClass20_Sub2_22.method1519(0, Static154.aClass177_4);
		super.aClass20_Sub2_22.method1544(0);
		super.aClass20_Sub2_22.method1531(0);
		super.aClass20_Sub2_22.method1528(-16777216);
		super.aClass20_Sub2_22.method1519(0, Static165.aClass177_3);
		this.method8069();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super.aClass20_Sub2_22.method1484(arg1);
	}
}
