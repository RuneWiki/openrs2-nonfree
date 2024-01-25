import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class60_Sub4 extends Class60 {

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "F")
	private float aFloat110 = 0.0F;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient!uw;")
	private final Class367 aClass367_4;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!sf;Lclient!uw;)V")
	public Class60_Sub4(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class367 arg1) {
		super(arg0);
		this.aClass367_4 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static458.aClass11_4);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_23.method6197(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
		super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
		super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
		super.aClass16_Sub1_23.method6278(1);
		super.aClass16_Sub1_23.method6197((Interface3) null);
		super.aClass16_Sub1_23.method6234(0);
		super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	@Override
	public void method8292() {
		if (super.aClass16_Sub1_23.method6230() != 0) {
			return;
		}
		@Pc(16) Class25_Sub3 local16 = super.aClass16_Sub1_23.method6297();
		super.aClass16_Sub1_23.method6234(1);
		@Pc(26) Class25_Sub3 local26 = super.aClass16_Sub1_23.method6255();
		local26.method4297(local16);
		local26.method4320(1.0F, 0.125F, 0.125F);
		local26.method4322(0.0F, this.aFloat110, 0.0F);
		super.aClass16_Sub1_23.method6212(Static6.aClass20_1);
		super.aClass16_Sub1_23.method6234(0);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.aClass367_4.method8229();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static333.aClass11_3);
		super.aClass16_Sub1_23.method6277(Static70.aClass188_1, true, 0, false);
		super.aClass16_Sub1_23.method6326(0, Static622.aClass188_4);
		super.aClass16_Sub1_23.method6278(0);
		super.aClass16_Sub1_23.method6234(0);
		super.aClass16_Sub1_23.method6263(-16777216);
		super.aClass16_Sub1_23.method6326(0, Static262.aClass188_2);
		this.method8292();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub1_23.method6234(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass16_Sub1_23.method6197((Interface3) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass367_4.aBoolean714) {
				this.aFloat110 = (float) (super.aClass16_Sub1_23.anInt7468 % 4000) / 4000.0F;
				super.aClass16_Sub1_23.method6197(this.aClass367_4.anInterface24_1);
			} else {
				@Pc(65) int local65 = super.aClass16_Sub1_23.anInt7468 % 4000 * 16 / 4000;
				super.aClass16_Sub1_23.method6197(this.aClass367_4.anInterface11Array1[local65]);
			}
		} else if (this.aClass367_4.aBoolean714) {
			super.aClass16_Sub1_23.method6197(this.aClass367_4.anInterface24_1);
		} else {
			super.aClass16_Sub1_23.method6197(this.aClass367_4.anInterface11Array1[0]);
		}
		super.aClass16_Sub1_23.method6234(0);
	}
}
