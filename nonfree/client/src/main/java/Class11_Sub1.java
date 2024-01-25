import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!wt;")
	private final Class376 aClass376_1;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Lclient!ai;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_1;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!kca;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ai;Lclient!oh;Lclient!wt;)V")
	public Class11_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class376 arg2) {
		super(arg0);
		this.aClass376_1 = arg2;
		this.aClass16_Sub1_Sub1_1 = arg0;
		if (arg1 != null && this.aClass376_1.method8618() && this.aClass16_Sub1_Sub1_1.aBoolean70) {
			this.aClass171_1 = Static91.method2153(this.aClass16_Sub1_Sub1_1, arg1.method6304("gl", "transparent_water"));
		} else {
			this.aClass171_1 = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.aClass171_1 != null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass171_1.anInt5758);
		OpenGL.glEnable(34336);
		super.aClass16_Sub1_21.method3946(0, Static613.aClass265_9);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass376_1.aBoolean762) {
			@Pc(12) float local12 = (float) (super.aClass16_Sub1_21.anInt4932 % 4000) / 4000.0F;
			super.aClass16_Sub1_21.method3889(this.aClass376_1.anInterface1_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass16_Sub1_21.anInt4932 % 4000 * 16 / 4000;
			super.aClass16_Sub1_21.method3889(this.aClass376_1.anInterface20Array1[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub1_21.method3924(Static125.aClass34_3, Static428.aClass34_5);
	}
}
