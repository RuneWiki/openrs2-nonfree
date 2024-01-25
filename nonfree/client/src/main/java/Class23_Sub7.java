import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class23_Sub7 extends Class23 {

	@OriginalMember(owner = "client!lda", name = "o", descriptor = "Lclient!dga;")
	private final Class75_Sub1_Sub1 aClass75_Sub1_Sub1_10;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "Lclient!jd;")
	private final Class184 aClass184_5;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "Lclient!nh;")
	private final Class250 aClass250_5;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!dga;Lclient!lga;Lclient!jd;)V")
	public Class23_Sub7(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class184 arg2) {
		super(arg0);
		this.aClass75_Sub1_Sub1_10 = arg0;
		this.aClass184_5 = arg2;
		if (arg1 != null && this.aClass184_5.method4632() && this.aClass75_Sub1_Sub1_10.aBoolean170) {
			this.aClass250_5 = Static658.method8771(arg1.method5284("gl", "transparent_water"), this.aClass75_Sub1_Sub1_10);
		} else {
			this.aClass250_5 = null;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass184_5.aBoolean386) {
			@Pc(48) float local48 = (float) (super.aClass75_Sub1_22.anInt7673 % 4000) / 4000.0F;
			super.aClass75_Sub1_22.method6814(this.aClass184_5.anInterface13_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local48, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(22) int local22 = super.aClass75_Sub1_22.anInt7673 % 4000 * 16 / 4000;
			super.aClass75_Sub1_22.method6814(this.aClass184_5.anInterface7Array1[local22]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return this.aClass250_5 != null;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass250_5.anInt6875);
		OpenGL.glEnable(34336);
		super.aClass75_Sub1_22.method6795(0, Static110.aClass261_3);
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		super.aClass75_Sub1_22.method6795(0, Static24.aClass261_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub1_22.method6743(Static571.aClass344_5, Static421.aClass344_4);
	}
}
