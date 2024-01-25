import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class22_Sub1_Sub1 extends Class22_Sub1 {

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_22;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!vk;")
	private final Class124_Sub3 aClass124_Sub3_1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ao;I)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass4_Sub1_22 = arg0;
		this.aClass124_Sub3_1 = new Class124_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)I")
	public int method3652() {
		return this.aClass124_Sub3_1.anInt6710;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!vk;Lclient!vk;FB)V")
	public void method3653(@OriginalArg(0) Class124_Sub3 arg0, @OriginalArg(1) Class124_Sub3 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) opengl local3 = this.aClass4_Sub1_22.anOpengl1;
		@Pc(7) Class128 local7 = this.aClass4_Sub1_22.aClass128_1;
		if (arg1.anInt6710 != this.aClass4_Sub1_22.aClass124_Sub2_3.anInt5593 || arg1.anInt6710 != this.aClass4_Sub1_22.aClass124_Sub2_3.anInt5592) {
			this.aClass4_Sub1_22.aClass124_Sub2_3 = new Class124_Sub2(this.aClass4_Sub1_22, 3553, 6408, arg1.anInt6710, arg1.anInt6710);
		}
		if (this.aClass4_Sub1_22.aClass124_Sub2_2.anInt5593 != arg0.anInt6710 || this.aClass4_Sub1_22.aClass124_Sub2_2.anInt5592 != arg0.anInt6710) {
			this.aClass4_Sub1_22.aClass124_Sub2_2 = new Class124_Sub2(this.aClass4_Sub1_22, 3553, 6408, arg0.anInt6710, arg0.anInt6710);
		}
		this.aClass4_Sub1_22.method4235(Static204.anIntArray316);
		this.aClass4_Sub1_22.method4299();
		this.aClass4_Sub1_22.method597(local7);
		this.aClass4_Sub1_22.method583();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass124_Sub3_1.anInt6710, this.aClass124_Sub3_1.anInt6710);
		this.aClass4_Sub1_22.method547(false);
		this.aClass4_Sub1_22.method568(false);
		this.aClass4_Sub1_22.method608(false);
		this.aClass4_Sub1_22.method558(false);
		this.aClass4_Sub1_22.method578();
		this.aClass4_Sub1_22.method600(1);
		this.aClass4_Sub1_22.method599(0.0F, 0.0F, 0.0F, arg2);
		this.aClass4_Sub1_22.method580(34165, 34165);
		this.aClass4_Sub1_22.method600(0);
		this.aClass4_Sub1_22.method574(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(174) int local174 = local167 + 34069;
			local7.method3566(arg1, local174);
			this.aClass4_Sub1_22.aClass124_Sub2_3.method4992(0, 0, arg1.anInt6710, arg1.anInt6710);
			local7.method3566(arg0, local174);
			this.aClass4_Sub1_22.aClass124_Sub2_2.method4992(0, 0, arg0.anInt6710, arg0.anInt6710);
			local7.method3566(this.aClass124_Sub3_1, local174);
			this.aClass4_Sub1_22.method600(1);
			this.aClass4_Sub1_22.method602(this.aClass4_Sub1_22.aClass124_Sub2_2);
			this.aClass4_Sub1_22.method600(0);
			this.aClass4_Sub1_22.method602(this.aClass4_Sub1_22.aClass124_Sub2_3);
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
			this.aClass4_Sub1_22.method600(1);
			this.aClass4_Sub1_22.method602(null);
			this.aClass4_Sub1_22.method600(0);
			this.aClass4_Sub1_22.method602(null);
		}
		this.aClass4_Sub1_22.method600(1);
		this.aClass4_Sub1_22.method580(8448, 8448);
		this.aClass4_Sub1_22.method600(0);
		local7.method3565(0);
		local3.glPopAttrib();
		this.aClass4_Sub1_22.method546(local7);
		this.aClass4_Sub1_22.method4252(Static204.anIntArray316[0], Static204.anIntArray316[1], Static204.anIntArray316[2], Static204.anIntArray316[3]);
		this.aClass124_Sub3_1.method5901();
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)Lclient!vk;")
	@Override
	public Class124_Sub3 method5765() {
		return this.aClass124_Sub3_1;
	}
}
