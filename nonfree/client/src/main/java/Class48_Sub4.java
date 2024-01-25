import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class48_Sub4 extends Class48 {

	@OriginalMember(owner = "client!is", name = "m", descriptor = "Lclient!tia;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_6;

	@OriginalMember(owner = "client!is", name = "u", descriptor = "Lclient!b;")
	private final Class24 aClass24_4;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Lclient!wja;")
	private final Class394 aClass394_1;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!tia;Lclient!gda;Lclient!b;)V")
	public Class48_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class24 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub2_6 = arg0;
		this.aClass24_4 = arg2;
		if (arg1 != null && this.aClass24_4.method393() && this.aClass100_Sub1_Sub2_6.aBoolean636) {
			this.aClass394_1 = Static37.method8304(arg1.method3073("transparent_water", "gl"), this.aClass100_Sub1_Sub2_6);
		} else {
			this.aClass394_1 = null;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass24_4.aBoolean19) {
			@Pc(16) float local16 = (float) (super.aClass100_Sub1_23.anInt9259 % 4000) / 4000.0F;
			super.aClass100_Sub1_23.method7923(this.aClass24_4.anInterface14_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local16, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(42) int local42 = super.aClass100_Sub1_23.anInt9259 % 4000 * 16 / 4000;
			super.aClass100_Sub1_23.method7923(this.aClass24_4.anInterface2Array1[local42]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.aClass394_1 != null;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass394_1.anInt10800);
		OpenGL.glEnable(34336);
		super.aClass100_Sub1_23.method7970(Static237.aClass93_3, 0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method7904(Static618.aClass94_4, Static164.aClass94_1);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
