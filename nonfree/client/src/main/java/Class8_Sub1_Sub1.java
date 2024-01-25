import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_4;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!nq;")
	private final Class30_Sub4 aClass30_Sub4_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!mi;I)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass155_Sub1_4 = arg0;
		this.aClass30_Sub4_1 = new Class30_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
	public int method141() {
		return this.aClass30_Sub4_1.anInt4237;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Lclient!nq;")
	@Override
	public Class30_Sub4 method2306() {
		return this.aClass30_Sub4_1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FLclient!nq;Lclient!nq;I)V")
	public void method142(@OriginalArg(0) float arg0, @OriginalArg(1) Class30_Sub4 arg1, @OriginalArg(2) Class30_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_4.anOpengl1;
		@Pc(7) Class141 local7 = this.aClass155_Sub1_4.aClass141_2;
		if (arg2.anInt4237 != this.aClass155_Sub1_4.aClass30_Sub3_4.anInt5158 || arg2.anInt4237 != this.aClass155_Sub1_4.aClass30_Sub3_4.anInt5157) {
			this.aClass155_Sub1_4.aClass30_Sub3_4 = new Class30_Sub3(this.aClass155_Sub1_4, 3553, 6408, arg2.anInt4237, arg2.anInt4237);
		}
		if (arg1.anInt4237 != this.aClass155_Sub1_4.aClass30_Sub3_2.anInt5158 || this.aClass155_Sub1_4.aClass30_Sub3_2.anInt5157 != arg1.anInt4237) {
			this.aClass155_Sub1_4.aClass30_Sub3_2 = new Class30_Sub3(this.aClass155_Sub1_4, 3553, 6408, arg1.anInt4237, arg1.anInt4237);
		}
		this.aClass155_Sub1_4.method4941(Static9.anIntArray18);
		this.aClass155_Sub1_4.method4902();
		this.aClass155_Sub1_4.method3587(local7);
		this.aClass155_Sub1_4.method3597();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass30_Sub4_1.anInt4237, this.aClass30_Sub4_1.anInt4237);
		this.aClass155_Sub1_4.method3612(false);
		this.aClass155_Sub1_4.method3568(false);
		this.aClass155_Sub1_4.method3573(false);
		this.aClass155_Sub1_4.method3584(false);
		this.aClass155_Sub1_4.method3620();
		this.aClass155_Sub1_4.method3590(1);
		this.aClass155_Sub1_4.method3578(0.0F, 0.0F, 0.0F, arg0);
		this.aClass155_Sub1_4.method3610(34165, 34165);
		this.aClass155_Sub1_4.method3590(0);
		this.aClass155_Sub1_4.method3580(0);
		for (@Pc(159) int local159 = 0; local159 < 6; local159++) {
			@Pc(166) int local166 = local159 + 34069;
			local7.method3091(arg2, local166);
			this.aClass155_Sub1_4.aClass30_Sub3_4.method4614(0, 0, arg2.anInt4237, arg2.anInt4237);
			local7.method3091(arg1, local166);
			this.aClass155_Sub1_4.aClass30_Sub3_2.method4614(0, 0, arg1.anInt4237, arg1.anInt4237);
			local7.method3091(this.aClass30_Sub4_1, local166);
			this.aClass155_Sub1_4.method3590(1);
			this.aClass155_Sub1_4.method3585(this.aClass155_Sub1_4.aClass30_Sub3_2);
			this.aClass155_Sub1_4.method3590(0);
			this.aClass155_Sub1_4.method3585(this.aClass155_Sub1_4.aClass30_Sub3_4);
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
			this.aClass155_Sub1_4.method3590(1);
			this.aClass155_Sub1_4.method3585(null);
			this.aClass155_Sub1_4.method3590(0);
			this.aClass155_Sub1_4.method3585(null);
		}
		this.aClass155_Sub1_4.method3590(1);
		this.aClass155_Sub1_4.method3610(8448, 8448);
		this.aClass155_Sub1_4.method3590(0);
		local7.method3094(0);
		local3.glPopAttrib();
		this.aClass155_Sub1_4.method3627(local7);
		this.aClass155_Sub1_4.method4867(Static9.anIntArray18[0], Static9.anIntArray18[1], Static9.anIntArray18[2], Static9.anIntArray18[3]);
		this.aClass30_Sub4_1.method4602();
	}
}
