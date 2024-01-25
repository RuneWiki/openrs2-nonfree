import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "F")
	private float aFloat141 = 0.0F;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Lclient!jo;")
	private final Class174 aClass174_4;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!pga;Lclient!jo;)V")
	public Class7_Sub6(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class174 arg1) {
		super(arg0);
		this.aClass174_4 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method8131() {
		if (super.aClass95_Sub3_23.method7146() != 0) {
			return;
		}
		@Pc(19) Class177_Sub1 local19 = super.aClass95_Sub3_23.method7053();
		super.aClass95_Sub3_23.method7145(1);
		@Pc(31) Class177_Sub1 local31 = super.aClass95_Sub3_23.method7017();
		local31.method7879(local19);
		local31.method3835(1.0F, 0.125F, 0.125F);
		local31.method3842(0.0F, this.aFloat141, 0.0F);
		super.aClass95_Sub3_23.method7099(Static55.aClass85_2);
		super.aClass95_Sub3_23.method7145(0);
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return this.aClass174_4.method3797();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static483.aClass136_6);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
		super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
		super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
		super.aClass95_Sub3_23.method7030(1);
		super.aClass95_Sub3_23.method7112(null);
		super.aClass95_Sub3_23.method7145(0);
		super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass95_Sub3_23.method7112(arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static248.aClass136_4);
		super.aClass95_Sub3_23.method7028(0, true, Static634.aClass291_4, false);
		super.aClass95_Sub3_23.method7095(0, Static10.aClass291_1);
		super.aClass95_Sub3_23.method7030(0);
		super.aClass95_Sub3_23.method7145(0);
		super.aClass95_Sub3_23.method7079(-16777216);
		super.aClass95_Sub3_23.method7095(0, Static185.aClass291_3);
		this.method8131();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass95_Sub3_23.method7145(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass95_Sub3_23.method7112(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass174_4.aBoolean302) {
				this.aFloat141 = (float) (super.aClass95_Sub3_23.anInt8347 % 4000) / 4000.0F;
				super.aClass95_Sub3_23.method7112(this.aClass174_4.anInterface5_2);
			} else {
				@Pc(59) int local59 = super.aClass95_Sub3_23.anInt8347 % 4000 * 16 / 4000;
				super.aClass95_Sub3_23.method7112(this.aClass174_4.anInterface19Array2[local59]);
			}
		} else if (this.aClass174_4.aBoolean302) {
			super.aClass95_Sub3_23.method7112(this.aClass174_4.anInterface5_2);
		} else {
			super.aClass95_Sub3_23.method7112(this.aClass174_4.anInterface19Array2[0]);
		}
		super.aClass95_Sub3_23.method7145(0);
	}
}
