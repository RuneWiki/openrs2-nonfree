import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "[F")
	private final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!aw", name = "H", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "Lclient!kfa;")
	private Class193 aClass193_1;

	@OriginalMember(owner = "client!aw", name = "I", descriptor = "Lclient!kfa;")
	private Class193 aClass193_4;

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "Lclient!kfa;")
	private Class193 aClass193_3;

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "Lclient!kfa;")
	private Class193 aClass193_2;

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "Z")
	private final boolean aBoolean50;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "Lclient!fk;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!sha;Lclient!uq;)V")
	public Class4_Sub2(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class362 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean623) {
			this.aClass193_1 = Static371.method5296(arg1.method8369("uw_ground_unlit", "gl"), arg0);
			this.aClass193_4 = Static371.method5296(arg1.method8369("uw_ground_lit", "gl"), arg0);
			this.aClass193_3 = Static371.method5296(arg1.method8369("uw_model_unlit", "gl"), arg0);
			this.aClass193_2 = Static371.method5296(arg1.method8369("uw_model_lit", "gl"), arg0);
			if (this.aClass193_3 != null & this.aClass193_4 != null & this.aClass193_1 != null & this.aClass193_2 != null) {
				this.anInterface8_2 = super.aClass95_Sub1_23.method8103(1, 2, new int[] { 0, -1 }, false);
				this.anInterface8_2.method7068(false, false);
				this.aBoolean50 = true;
			} else {
				this.aBoolean50 = false;
			}
		} else {
			this.aBoolean50 = false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean52) {
				super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
				super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
				this.aBoolean52 = false;
			}
			super.aClass95_Sub1_23.method8147(arg0);
			super.aClass95_Sub1_23.method8129(arg1);
		} else if (!this.aBoolean52) {
			super.aClass95_Sub1_23.method8147(super.aClass95_Sub1_23.anInterface1_3);
			super.aClass95_Sub1_23.method8129(1);
			super.aClass95_Sub1_23.method8108(0, Static383.aClass235_2);
			super.aClass95_Sub1_23.method8122(Static383.aClass235_2, 0);
			this.aBoolean52 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8147((Interface1) null);
		super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
		super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
		super.aClass95_Sub1_23.method8108(2, Static576.aClass235_3);
		super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
		super.aClass95_Sub1_23.method8153(0);
		if (this.aBoolean52) {
			super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
			super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
			this.aBoolean52 = false;
		}
		if (this.aBoolean51) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean51 = false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V")
	@Override
	public void method8490() {
		@Pc(8) int local8 = super.aClass95_Sub1_23.method8187();
		@Pc(18) Class17_Sub2 local18 = super.aClass95_Sub1_23.method8124();
		if (this.aBoolean53) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass193_4.anInt5132 : this.aClass193_2.anInt5132);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass193_1.anInt5132 : this.aClass193_3.anInt5132);
		}
		OpenGL.glEnable(34336);
		this.aBoolean51 = true;
		local18.method5858(this.aFloatArray4, -1.0F, (float) local8, 0.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray4[0], this.aFloatArray4[1], this.aFloatArray4[2], this.aFloatArray4[3]);
		this.method8486();
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
	@Override
	public void method8486() {
		if (!this.aBoolean51) {
			return;
		}
		@Pc(6) int local6 = super.aClass95_Sub1_23.XA();
		@Pc(10) int local10 = super.aClass95_Sub1_23.i();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(33) float local33 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local22, 1.0F / (float) super.aClass95_Sub1_23.method8079(), (float) super.aClass95_Sub1_23.method8158() / 255.0F);
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8078(super.aClass95_Sub1_23.method8096());
		super.aClass95_Sub1_23.method8153(0);
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.aBoolean50;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		this.aBoolean53 = arg0;
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8147(this.anInterface8_2);
		super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static315.aClass112_22);
		super.aClass95_Sub1_23.method8108(0, Static576.aClass235_3);
		super.aClass95_Sub1_23.method8101(2, false, Static665.aClass235_4, true);
		super.aClass95_Sub1_23.method8122(Static383.aClass235_2, 0);
		super.aClass95_Sub1_23.method8153(0);
		this.method8490();
	}
}
