import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!gaa;")
	private final Class123 aClass123_1;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Lclient!sha;")
	private final Class95_Sub1_Sub1 aClass95_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!kfa;")
	private final Class193 aClass193_5;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!sha;Lclient!uq;Lclient!gaa;)V")
	public Class4_Sub3(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class123 arg2) {
		super(arg0);
		this.aClass123_1 = arg2;
		this.aClass95_Sub1_Sub1_1 = arg0;
		if (arg1 != null && this.aClass123_1.method2906() && this.aClass95_Sub1_Sub1_1.aBoolean623) {
			this.aClass193_5 = Static371.method5296(arg1.method8369("transparent_water", "gl"), this.aClass95_Sub1_Sub1_1);
		} else {
			this.aClass193_5 = null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass123_1.aBoolean250) {
			@Pc(49) float local49 = (float) (super.aClass95_Sub1_23.anInt10064 % 4000) / 4000.0F;
			super.aClass95_Sub1_23.method8147(this.aClass123_1.anInterface20_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local49, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(23) int local23 = super.aClass95_Sub1_23.anInt10064 % 4000 * 16 / 4000;
			super.aClass95_Sub1_23.method8147(this.aClass123_1.anInterface8Array1[local23]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.aClass193_5 != null;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_23.method8195(Static461.aClass112_52, Static134.aClass112_9);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass193_5.anInt5132);
		OpenGL.glEnable(34336);
		super.aClass95_Sub1_23.method8108(0, Static383.aClass235_2);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
	}
}
