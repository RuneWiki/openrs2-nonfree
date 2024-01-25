import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class108_Sub5 extends Class108 {

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "F")
	private float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!wda;")
	private final Class373 aClass373_2;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!rv;Lclient!wda;)V")
	public Class108_Sub5(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class373 arg1) {
		super(arg0);
		this.aClass373_2 = arg1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		super.aClass126_Sub2_23.method5449(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static140.aClass10_3);
		super.aClass126_Sub2_23.method5537(0, Static256.aClass294_4, false, true);
		super.aClass126_Sub2_23.method5471(Static131.aClass294_2, 0);
		super.aClass126_Sub2_23.method5541(0);
		super.aClass126_Sub2_23.method5560(0);
		super.aClass126_Sub2_23.method5496(-16777216);
		super.aClass126_Sub2_23.method5471(Static645.aClass294_5, 0);
		this.method8698();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.aClass373_2.method8675();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
		super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
		super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
		super.aClass126_Sub2_23.method5541(1);
		super.aClass126_Sub2_23.method5449((Interface27) null);
		super.aClass126_Sub2_23.method5560(0);
		super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
		super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static101.aClass10_2);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	@Override
	public void method8698() {
		if (super.aClass126_Sub2_23.method5483() != 0) {
			return;
		}
		@Pc(15) Class117_Sub2 local15 = super.aClass126_Sub2_23.method5499();
		super.aClass126_Sub2_23.method5560(1);
		@Pc(25) Class117_Sub2 local25 = super.aClass126_Sub2_23.method5542();
		local25.method7253(local15);
		local25.method3860(0.125F, 0.125F, 1.0F);
		local25.method3865(0.0F, this.aFloat67, 0.0F);
		super.aClass126_Sub2_23.method5504(Static530.aClass52_5);
		super.aClass126_Sub2_23.method5560(0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass126_Sub2_23.method5560(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass126_Sub2_23.method5449((Interface27) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass373_2.aBoolean823) {
				this.aFloat67 = (float) (super.aClass126_Sub2_23.anInt6264 % 4000) / 4000.0F;
				super.aClass126_Sub2_23.method5449(this.aClass373_2.anInterface19_2);
			} else {
				@Pc(64) int local64 = super.aClass126_Sub2_23.anInt6264 % 4000 * 16 / 4000;
				super.aClass126_Sub2_23.method5449(this.aClass373_2.anInterface25Array1[local64]);
			}
		} else if (this.aClass373_2.aBoolean823) {
			super.aClass126_Sub2_23.method5449(this.aClass373_2.anInterface19_2);
		} else {
			super.aClass126_Sub2_23.method5449(this.aClass373_2.anInterface25Array1[0]);
		}
		super.aClass126_Sub2_23.method5560(0);
	}
}
