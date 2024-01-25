import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class23_Sub9 extends Class23 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "F")
	private float aFloat176 = 0.0F;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!jd;")
	private final Class184 aClass184_7;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!jj;Lclient!jd;)V")
	public Class23_Sub9(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class184 arg1) {
		super(arg0);
		this.aClass184_7 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		super.aClass75_Sub1_22.method6814(arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6743(Static421.aClass344_4, Static571.aClass344_5);
		super.aClass75_Sub1_22.method6831(true, false, Static24.aClass261_1, 0);
		super.aClass75_Sub1_22.method6816(0, Static110.aClass261_3);
		super.aClass75_Sub1_22.method6832(0);
		super.aClass75_Sub1_22.method6805(0);
		super.aClass75_Sub1_22.method6801(-16777216);
		super.aClass75_Sub1_22.method6816(0, Static389.aClass261_8);
		this.method8170();
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		super.aClass75_Sub1_22.method6805(1);
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static257.aClass344_2);
		super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
		super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
		super.aClass75_Sub1_22.method6832(1);
		super.aClass75_Sub1_22.method6814((Interface1) null);
		super.aClass75_Sub1_22.method6805(0);
		super.aClass75_Sub1_22.method6816(0, Static24.aClass261_1);
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	@Override
	public void method8170() {
		if (super.aClass75_Sub1_22.method6762() != 0) {
			return;
		}
		@Pc(16) Class109_Sub3 local16 = super.aClass75_Sub1_22.method6836();
		super.aClass75_Sub1_22.method6805(1);
		@Pc(26) Class109_Sub3 local26 = super.aClass75_Sub1_22.method6775();
		local26.method4595(local16);
		local26.method4354(1.0F, 0.125F, 0.125F);
		local26.method4341(this.aFloat176, 0.0F, 0.0F);
		super.aClass75_Sub1_22.method6787(Static243.aClass211_3);
		super.aClass75_Sub1_22.method6805(0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.aClass184_7.method4632();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub1_22.method6743(Static257.aClass344_2, Static571.aClass344_5);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass75_Sub1_22.method6805(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass75_Sub1_22.method6814((Interface1) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass184_7.aBoolean386) {
				this.aFloat176 = (float) (super.aClass75_Sub1_22.anInt7673 % 4000) / 4000.0F;
				super.aClass75_Sub1_22.method6814(this.aClass184_7.anInterface13_1);
			} else {
				@Pc(112) int local112 = super.aClass75_Sub1_22.anInt7673 % 4000 * 16 / 4000;
				super.aClass75_Sub1_22.method6814(this.aClass184_7.anInterface7Array1[local112]);
			}
		} else if (this.aClass184_7.aBoolean386) {
			super.aClass75_Sub1_22.method6814(this.aClass184_7.anInterface13_1);
		} else {
			super.aClass75_Sub1_22.method6814(this.aClass184_7.anInterface7Array1[0]);
		}
		super.aClass75_Sub1_22.method6805(0);
	}
}
