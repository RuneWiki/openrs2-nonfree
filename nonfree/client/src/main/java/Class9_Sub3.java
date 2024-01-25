import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Z")
	private boolean aBoolean113;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Lclient!ar;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Lclient!ar;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Lclient!ar;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Lclient!ar;")
	private Class19 aClass19_4;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "Lclient!dca;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!ad;Lclient!vo;)V")
	public Class9_Sub3(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class348 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean75) {
			this.aClass19_2 = Static202.method3285(arg1.method7956("uw_ground_unlit", "gl"), arg0);
			this.aClass19_3 = Static202.method3285(arg1.method7956("uw_ground_lit", "gl"), arg0);
			this.aClass19_1 = Static202.method3285(arg1.method7956("uw_model_unlit", "gl"), arg0);
			this.aClass19_4 = Static202.method3285(arg1.method7956("uw_model_lit", "gl"), arg0);
			if (this.aClass19_4 != null & this.aClass19_3 != null & this.aClass19_2 != null & this.aClass19_1 != null) {
				this.anInterface4_2 = super.aClass7_Sub1_23.method5699(1, false, 2, new int[] { 0, -1 });
				this.anInterface4_2.method7375(false, false);
				this.aBoolean112 = true;
			} else {
				this.aBoolean112 = false;
			}
		} else {
			this.aBoolean112 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (!this.aBoolean113) {
			return;
		}
		@Pc(16) int local16 = super.aClass7_Sub1_23.U();
		@Pc(20) int local20 = super.aClass7_Sub1_23.BA();
		@Pc(31) float local31 = (float) local16 - (float) (local16 - local20) * 0.125F;
		@Pc(42) float local42 = (float) local16 - (float) (local16 - local20) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local42, local31, 1.0F / (float) super.aClass7_Sub1_23.method5775(), (float) super.aClass7_Sub1_23.method5658() / 255.0F);
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5712(super.aClass7_Sub1_23.method5663());
		super.aClass7_Sub1_23.method5746(0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.aBoolean112;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5694(null);
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
		super.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		super.aClass7_Sub1_23.method5681(2, Static18.aClass61_1);
		super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
		super.aClass7_Sub1_23.method5746(0);
		if (this.aBoolean113) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean113 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		this.aBoolean114 = arg0;
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5694(this.anInterface4_2);
		super.aClass7_Sub1_23.method5764(Static509.aClass95_4, Static563.aClass95_5);
		super.aClass7_Sub1_23.method5681(0, Static18.aClass61_1);
		super.aClass7_Sub1_23.method5741(true, Static411.aClass61_5, false, 2);
		super.aClass7_Sub1_23.method5713(Static410.aClass61_6, 0);
		super.aClass7_Sub1_23.method5746(0);
		this.method8027();
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
	@Override
	public void method8027() {
		@Pc(8) int local8 = super.aClass7_Sub1_23.method5685();
		@Pc(19) Class81_Sub1 local19 = super.aClass7_Sub1_23.method5766();
		if (this.aBoolean114) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass19_3.anInt954 : this.aClass19_4.anInt954);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass19_2.anInt954 : this.aClass19_1.anInt954);
		}
		OpenGL.glEnable(34336);
		this.aBoolean113 = true;
		local19.method1972(this.aFloatArray23, -1.0F, 0.0F, 0.0F, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray23[0], this.aFloatArray23[1], this.aFloatArray23[2], this.aFloatArray23[3]);
		this.method8031();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass7_Sub1_23.method5694(arg0);
		super.aClass7_Sub1_23.method5757(arg1);
	}
}
