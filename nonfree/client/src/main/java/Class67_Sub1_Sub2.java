import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class67_Sub1_Sub2 extends Class67_Sub1 {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_40;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!rj;")
	private final Class8_Sub4 aClass8_Sub4_2;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!sq;I)V")
	public Class67_Sub1_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass46_Sub2_40 = arg0;
		this.aClass8_Sub4_2 = new Class8_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)I")
	public int method5495() {
		return this.aClass8_Sub4_2.anInt5321;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lclient!rj;")
	@Override
	public Class8_Sub4 method5494() {
		return this.aClass8_Sub4_2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!rj;Lclient!rj;FI)V")
	public void method5496(@OriginalArg(0) Class8_Sub4 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) opengl local3 = this.aClass46_Sub2_40.anOpengl1;
		@Pc(7) Class171 local7 = this.aClass46_Sub2_40.aClass171_4;
		if (this.aClass46_Sub2_40.aClass8_Sub1_5.anInt3574 != arg1.anInt5321 || arg1.anInt5321 != this.aClass46_Sub2_40.aClass8_Sub1_5.anInt3575) {
			this.aClass46_Sub2_40.aClass8_Sub1_5 = new Class8_Sub1(this.aClass46_Sub2_40, 3553, 6408, arg1.anInt5321, arg1.anInt5321);
		}
		if (arg0.anInt5321 != this.aClass46_Sub2_40.aClass8_Sub1_4.anInt3574 || this.aClass46_Sub2_40.aClass8_Sub1_4.anInt3575 != arg0.anInt5321) {
			this.aClass46_Sub2_40.aClass8_Sub1_4 = new Class8_Sub1(this.aClass46_Sub2_40, 3553, 6408, arg0.anInt5321, arg0.anInt5321);
		}
		this.aClass46_Sub2_40.method5133(Static320.anIntArray548);
		this.aClass46_Sub2_40.method5139();
		this.aClass46_Sub2_40.method5247(local7);
		this.aClass46_Sub2_40.method5262();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, (double) 1, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass8_Sub4_2.anInt5321, this.aClass8_Sub4_2.anInt5321);
		this.aClass46_Sub2_40.method5266(false);
		this.aClass46_Sub2_40.method5241(false);
		this.aClass46_Sub2_40.method5235(false);
		this.aClass46_Sub2_40.method5208(false);
		this.aClass46_Sub2_40.method5226();
		this.aClass46_Sub2_40.method5225(1);
		this.aClass46_Sub2_40.method5209(0.0F, 0.0F, 0.0F, arg2);
		this.aClass46_Sub2_40.method5248(34165, 34165);
		this.aClass46_Sub2_40.method5225(0);
		this.aClass46_Sub2_40.method5252(0);
		for (@Pc(165) int local165 = 0; local165 < 6; local165++) {
			@Pc(172) int local172 = local165 + 34069;
			local7.method4521(arg1, local172);
			this.aClass46_Sub2_40.aClass8_Sub1_5.method3369(0, 0, arg1.anInt5321, arg1.anInt5321);
			local7.method4521(arg0, local172);
			this.aClass46_Sub2_40.aClass8_Sub1_4.method3369(0, 0, arg0.anInt5321, arg0.anInt5321);
			local7.method4521(this.aClass8_Sub4_2, local172);
			this.aClass46_Sub2_40.method5225(1);
			this.aClass46_Sub2_40.method5251(this.aClass46_Sub2_40.aClass8_Sub1_4);
			this.aClass46_Sub2_40.method5225(0);
			this.aClass46_Sub2_40.method5251(this.aClass46_Sub2_40.aClass8_Sub1_5);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glVertex2f(0.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			local3.glVertex2f(1.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			local3.glVertex2f(1.0F, 1.0F);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			local3.glVertex2f(0.0F, 1.0F);
			local3.glEnd();
			this.aClass46_Sub2_40.method5225(1);
			this.aClass46_Sub2_40.method5251(null);
			this.aClass46_Sub2_40.method5225(0);
			this.aClass46_Sub2_40.method5251(null);
		}
		this.aClass46_Sub2_40.method5225(1);
		this.aClass46_Sub2_40.method5248(8448, 8448);
		this.aClass46_Sub2_40.method5225(0);
		local7.method4522(0);
		local3.glPopAttrib();
		this.aClass46_Sub2_40.method5255(local7);
		this.aClass46_Sub2_40.method5172(Static320.anIntArray548[0], Static320.anIntArray548[1], Static320.anIntArray548[2], Static320.anIntArray548[3]);
		this.aClass8_Sub4_2.method4739();
	}
}
