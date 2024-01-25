import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class121_Sub3 extends Class121 {

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!lt;")
	private final Class67_Sub1_Sub2 aClass67_Sub1_Sub2_8;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!dma;")
	private final Class76 aClass76_3;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!mn;")
	private final Class242 aClass242_1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!lt;Lclient!lb;Lclient!dma;)V")
	public Class121_Sub3(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class76 arg2) {
		super(arg0);
		this.aClass67_Sub1_Sub2_8 = arg0;
		this.aClass76_3 = arg2;
		if (arg1 != null && this.aClass76_3.method2072() && this.aClass67_Sub1_Sub2_8.aBoolean531) {
			this.aClass242_1 = Static16.method289(arg1.method5076("transparent_water", "gl"), this.aClass67_Sub1_Sub2_8);
		} else {
			this.aClass242_1 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub1_23.method5686(Static573.aClass37_3, Static722.aClass37_5);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.aClass242_1 != null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass242_1.anInt7166);
		OpenGL.glEnable(34336);
		super.aClass67_Sub1_23.method5590(0, Static273.aClass58_2);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass76_3.aBoolean190) {
			@Pc(12) float local12 = (float) (super.aClass67_Sub1_23.anInt6654 % 4000) / 4000.0F;
			super.aClass67_Sub1_23.method5612(this.aClass76_3.anInterface1_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass67_Sub1_23.anInt6654 % 4000 * 16 / 4000;
			super.aClass67_Sub1_23.method5612(this.aClass76_3.anInterface6Array2[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
