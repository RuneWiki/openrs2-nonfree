import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Lclient!bia;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "[Lclient!od;")
	private Class32_Sub3[] aClass32_Sub3Array1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class99_Sub2(@OriginalArg(0) Class57_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean230) {
			this.aBoolean199 = arg0.anInt2775 < 3;
			@Pc(30) int local30 = this.aBoolean199 ? 48 : 127;
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(42) byte[][] local42 = new byte[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local70 * local85;
					@Pc(93) float local93 = local61 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(107) float local107;
						if (local95 == 0) {
							local107 = -local89;
						} else if (local95 == 1) {
							local107 = local89;
						} else if (local95 == 2) {
							local107 = local93;
						} else if (local95 == 3) {
							local107 = -local93;
						} else if (local95 == 4) {
							local107 = local85;
						} else {
							local107 = -local85;
						}
						@Pc(163) int local163;
						@Pc(162) int local162;
						@Pc(160) int local160;
						if (local107 > 0.0F) {
							local163 = (int) (Math.pow((double) local107, 96.0D) * (double) local30);
							local162 = (int) ((double) local30 * Math.pow((double) local107, 36.0D));
							local160 = (int) ((double) local30 * Math.pow((double) local107, 12.0D));
						} else {
							local160 = 0;
							local162 = 0;
							local163 = 0;
						}
						local38[local95][local44] = (byte) local163;
						local42[local95][local44] = (byte) local162;
						local34[local95][local44] = (byte) local160;
					}
					local44++;
				}
			}
			this.aClass32_Sub3Array1 = new Class32_Sub3[3];
			this.aClass32_Sub3Array1[0] = new Class32_Sub3(super.aClass57_Sub2_38, 6406, 64, false, local38, 6406);
			this.aClass32_Sub3Array1[1] = new Class32_Sub3(super.aClass57_Sub2_38, 6406, 64, false, local42, 6406);
			this.aClass32_Sub3Array1[2] = new Class32_Sub3(super.aClass57_Sub2_38, 6406, 64, false, local34, 6406);
			this.method2057();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
		super.aClass57_Sub2_38.method2313(7681, 8448);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		super.aClass57_Sub2_38.method2362(arg1);
		super.aClass57_Sub2_38.method2382(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		if (this.aBoolean198) {
			if (!this.aBoolean199) {
				super.aClass57_Sub2_38.method2345(2);
				super.aClass57_Sub2_38.method2362((Class32) null);
			}
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2362((Class32) null);
			super.aClass57_Sub2_38.method2345(0);
			this.aClass42_2.method758('\u0001');
			this.aBoolean198 = false;
		} else {
			super.aClass57_Sub2_38.method2312(5890, 0);
		}
		super.aClass57_Sub2_38.method2313(8448, 8448);
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	private void method2057() {
		this.aClass42_2 = new Class42(super.aClass57_Sub2_38, 2);
		this.aClass42_2.method759(0);
		super.aClass57_Sub2_38.method2345(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean199) {
			super.aClass57_Sub2_38.method2313(7681, 260);
			super.aClass57_Sub2_38.method2368(5890, 0, 770);
			super.aClass57_Sub2_38.method2312(34167, 0);
		} else {
			super.aClass57_Sub2_38.method2313(8448, 7681);
			super.aClass57_Sub2_38.method2368(34168, 0, 768);
			super.aClass57_Sub2_38.method2345(2);
			super.aClass57_Sub2_38.method2313(7681, 260);
			super.aClass57_Sub2_38.method2368(34168, 0, 768);
			super.aClass57_Sub2_38.method2368(34168, 1, 770);
			super.aClass57_Sub2_38.method2312(34167, 0);
		}
		super.aClass57_Sub2_38.method2345(0);
		this.aClass42_2.method760();
		this.aClass42_2.method759(1);
		super.aClass57_Sub2_38.method2345(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean199) {
			super.aClass57_Sub2_38.method2313(8448, 8448);
			super.aClass57_Sub2_38.method2368(5890, 0, 768);
			super.aClass57_Sub2_38.method2312(5890, 0);
		} else {
			super.aClass57_Sub2_38.method2313(8448, 8448);
			super.aClass57_Sub2_38.method2368(5890, 0, 768);
			super.aClass57_Sub2_38.method2345(2);
			super.aClass57_Sub2_38.method2313(8448, 8448);
			super.aClass57_Sub2_38.method2368(5890, 0, 768);
			super.aClass57_Sub2_38.method2368(34168, 1, 768);
			super.aClass57_Sub2_38.method2312(5890, 0);
		}
		super.aClass57_Sub2_38.method2345(0);
		this.aClass42_2.method760();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		if (this.aClass42_2 == null || !arg0) {
			super.aClass57_Sub2_38.method2312(34168, 0);
			return;
		}
		if (!this.aBoolean199) {
			super.aClass57_Sub2_38.method2345(2);
			super.aClass57_Sub2_38.method2362(super.aClass57_Sub2_38.aClass32_Sub1_2);
			super.aClass57_Sub2_38.method2345(0);
		}
		this.aClass42_2.method758('\u0000');
		this.aBoolean198 = true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean198) {
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2362(this.aClass32_Sub3Array1[arg1 - 1]);
			super.aClass57_Sub2_38.method2345(0);
		}
	}
}
