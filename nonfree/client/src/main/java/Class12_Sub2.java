import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Lclient!hu;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "[Lclient!gh;")
	private Class19_Sub3[] aClass19_Sub3Array1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class12_Sub2(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean392) {
			this.aBoolean38 = arg0.anInt6164 < 3;
			@Pc(28) int local28 = this.aBoolean38 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(104) float local104;
						if (local93 == 0) {
							local104 = -local91;
						} else if (local93 == 1) {
							local104 = local91;
						} else if (local93 == 2) {
							local104 = local87;
						} else if (local93 == 3) {
							local104 = -local87;
						} else if (local93 == 4) {
							local104 = local83;
						} else {
							local104 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local104 > 0.0F) {
							local148 = (int) (Math.pow((double) local104, 96.0D) * (double) local28);
							local147 = (int) ((double) local28 * Math.pow((double) local104, 36.0D));
							local145 = (int) (Math.pow((double) local104, 12.0D) * (double) local28);
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local36[local93][local42] = (byte) local148;
						local40[local93][local42] = (byte) local147;
						local32[local93][local42] = (byte) local145;
					}
					local42++;
				}
			}
			this.aClass19_Sub3Array1 = new Class19_Sub3[3];
			this.aClass19_Sub3Array1[0] = new Class19_Sub3(super.aClass66_Sub2_41, 6406, 64, false, local36, 6406);
			this.aClass19_Sub3Array1[1] = new Class19_Sub3(super.aClass66_Sub2_41, 6406, 64, false, local40, 6406);
			this.aClass19_Sub3Array1[2] = new Class19_Sub3(super.aClass66_Sub2_41, 6406, 64, false, local32, 6406);
			this.method685();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		super.aClass66_Sub2_41.method5109(arg1);
		super.aClass66_Sub2_41.method5140(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		if (this.aBoolean37) {
			if (!this.aBoolean38) {
				super.aClass66_Sub2_41.method5075(2);
				super.aClass66_Sub2_41.method5109(null);
			}
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5109(null);
			super.aClass66_Sub2_41.method5075(0);
			this.aClass110_1.method2677('\u0001');
			this.aBoolean37 = false;
		} else {
			super.aClass66_Sub2_41.method5102(0, 5890);
		}
		super.aClass66_Sub2_41.method5145(8448, 8448);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	private void method685() {
		this.aClass110_1 = new Class110(super.aClass66_Sub2_41, 2);
		this.aClass110_1.method2674(0);
		super.aClass66_Sub2_41.method5075(1);
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
		if (this.aBoolean38) {
			super.aClass66_Sub2_41.method5145(7681, 260);
			super.aClass66_Sub2_41.method5081(0, 5890, 770);
			super.aClass66_Sub2_41.method5102(0, 34167);
		} else {
			super.aClass66_Sub2_41.method5145(8448, 7681);
			super.aClass66_Sub2_41.method5081(0, 34168, 768);
			super.aClass66_Sub2_41.method5075(2);
			super.aClass66_Sub2_41.method5145(7681, 260);
			super.aClass66_Sub2_41.method5081(0, 34168, 768);
			super.aClass66_Sub2_41.method5081(1, 34168, 770);
			super.aClass66_Sub2_41.method5102(0, 34167);
		}
		super.aClass66_Sub2_41.method5075(0);
		this.aClass110_1.method2676();
		this.aClass110_1.method2674(1);
		super.aClass66_Sub2_41.method5075(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean38) {
			super.aClass66_Sub2_41.method5145(8448, 8448);
			super.aClass66_Sub2_41.method5081(0, 5890, 768);
			super.aClass66_Sub2_41.method5102(0, 5890);
		} else {
			super.aClass66_Sub2_41.method5145(8448, 8448);
			super.aClass66_Sub2_41.method5081(0, 5890, 768);
			super.aClass66_Sub2_41.method5075(2);
			super.aClass66_Sub2_41.method5145(8448, 8448);
			super.aClass66_Sub2_41.method5081(0, 5890, 768);
			super.aClass66_Sub2_41.method5081(1, 34168, 768);
			super.aClass66_Sub2_41.method5102(0, 5890);
		}
		super.aClass66_Sub2_41.method5075(0);
		this.aClass110_1.method2676();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean37) {
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5109(this.aClass19_Sub3Array1[arg1 - 1]);
			super.aClass66_Sub2_41.method5075(0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub2_41.method5145(7681, 8448);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		if (this.aClass110_1 == null || !arg0) {
			super.aClass66_Sub2_41.method5102(0, 34168);
			return;
		}
		if (!this.aBoolean38) {
			super.aClass66_Sub2_41.method5075(2);
			super.aClass66_Sub2_41.method5109(super.aClass66_Sub2_41.aClass19_Sub4_5);
			super.aClass66_Sub2_41.method5075(0);
		}
		this.aClass110_1.method2677('\u0000');
		this.aBoolean37 = true;
	}
}
