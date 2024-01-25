import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class34_Sub9 extends Class34 {

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "F")
	private float aFloat186 = 0.0F;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Lclient!db;")
	private final Class66 aClass66_5;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!gj;Lclient!db;)V")
	public Class34_Sub9(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Class66 arg1) {
		super(arg0);
		this.aClass66_5 = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass90_Sub3_19.method7609(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass90_Sub3_19.method7624(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass66_5.aBoolean112) {
				this.aFloat186 = (float) (super.aClass90_Sub3_19.anInt9563 % 4000) / 4000.0F;
				super.aClass90_Sub3_19.method7624(this.aClass66_5.anInterface11_1);
			} else {
				@Pc(59) int local59 = super.aClass90_Sub3_19.anInt9563 % 4000 * 16 / 4000;
				super.aClass90_Sub3_19.method7624(this.aClass66_5.anInterface7Array1[local59]);
			}
		} else if (this.aClass66_5.aBoolean112) {
			super.aClass90_Sub3_19.method7624(this.aClass66_5.anInterface11_1);
		} else {
			super.aClass90_Sub3_19.method7624(this.aClass66_5.anInterface7Array1[0]);
		}
		super.aClass90_Sub3_19.method7609(0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		super.aClass90_Sub3_19.method7609(1);
		super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
		super.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
		super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
		super.aClass90_Sub3_19.method7662(1);
		super.aClass90_Sub3_19.method7624(null);
		super.aClass90_Sub3_19.method7609(0);
		super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	@Override
	public void method7272() {
		if (super.aClass90_Sub3_19.method7543() != 0) {
			return;
		}
		@Pc(14) Class93_Sub3 local14 = super.aClass90_Sub3_19.method7527();
		super.aClass90_Sub3_19.method7609(1);
		@Pc(24) Class93_Sub3 local24 = super.aClass90_Sub3_19.method7585();
		local24.la(local14);
		local24.method3771(0.125F, 1.0F, 0.125F);
		local24.method3762(this.aFloat186, 0.0F, 0.0F);
		super.aClass90_Sub3_19.method7580(Static232.aClass172_10);
		super.aClass90_Sub3_19.method7609(0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass90_Sub3_19.method7624(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return this.aClass66_5.method1373();
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static140.aClass214_2);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub3_19.method7609(1);
		super.aClass90_Sub3_19.method7570(Static74.aClass214_1, Static140.aClass214_2);
		super.aClass90_Sub3_19.method7557(false, Static393.aClass150_6, true, 0);
		super.aClass90_Sub3_19.method7630(Static422.aClass150_7, 0);
		super.aClass90_Sub3_19.method7662(0);
		super.aClass90_Sub3_19.method7609(0);
		super.aClass90_Sub3_19.method7650(-16777216);
		super.aClass90_Sub3_19.method7630(Static20.aClass150_1, 0);
		this.method7272();
	}
}
