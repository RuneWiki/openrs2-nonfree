import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class108_Sub1_Sub1 extends Class108_Sub1 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_13;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!gfa;")
	private final Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ji;I)V")
	public Class108_Sub1_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass15_Sub3_13 = arg0;
		this.aClass11_Sub3_1 = new Class11_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)I")
	public int method2899() {
		return this.aClass11_Sub3_1.anInt3455;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Lclient!gfa;")
	@Override
	public Class11_Sub3 method7913() {
		return this.aClass11_Sub3_1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!gfa;BFLclient!gfa;)Z")
	public boolean method2902(@OriginalArg(0) Class11_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class11_Sub3 arg2) {
		@Pc(14) boolean local14 = true;
		@Pc(18) Class269 local18 = this.aClass15_Sub3_13.aClass269_4;
		this.aClass15_Sub3_13.A(Static95.anIntArray118);
		this.aClass15_Sub3_13.F();
		this.aClass15_Sub3_13.method4396();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass11_Sub3_1.anInt3455, this.aClass11_Sub3_1.anInt3455);
		this.aClass15_Sub3_13.method4382(false);
		this.aClass15_Sub3_13.method4414(false);
		this.aClass15_Sub3_13.method4428(false);
		this.aClass15_Sub3_13.method4413(false);
		this.aClass15_Sub3_13.method4448(-2);
		this.aClass15_Sub3_13.method4458(1);
		this.aClass15_Sub3_13.method4417(arg1, 0.0F, 0.0F, 0.0F);
		this.aClass15_Sub3_13.method4451(34165, 34165);
		this.aClass15_Sub3_13.method4377(arg0);
		this.aClass15_Sub3_13.method4458(0);
		this.aClass15_Sub3_13.method4432(1);
		this.aClass15_Sub3_13.method4377(arg2);
		this.aClass15_Sub3_13.method4384(local18);
		for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
			@Pc(132) int local132 = local126 + 34069;
			local18.method6777(local132, this.aClass11_Sub3_1);
			local18.method6780(0);
			if (!local18.method6773()) {
				local14 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local132 == 34069) {
				OpenGL.glTexCoord3i(65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34070) {
				OpenGL.glTexCoord3i(-65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34071) {
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34072) {
				OpenGL.glTexCoord3i(-65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34073) {
				OpenGL.glTexCoord3i(-65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34074) {
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local18.method6783(0);
		this.aClass15_Sub3_13.method4379(local18);
		this.aClass15_Sub3_13.method4458(1);
		this.aClass15_Sub3_13.method4377(null);
		this.aClass15_Sub3_13.method4451(8448, 8448);
		this.aClass15_Sub3_13.method4458(0);
		this.aClass15_Sub3_13.method4377(null);
		OpenGL.glPopAttrib();
		this.aClass15_Sub3_13.ca(Static95.anIntArray118[0], Static95.anIntArray118[1], Static95.anIntArray118[2], Static95.anIntArray118[3]);
		if (local14 && !this.aClass15_Sub3_13.aBoolean448) {
			this.aClass11_Sub3_1.method7413();
		}
		return local14;
	}
}
