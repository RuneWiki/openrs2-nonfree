import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class112_Sub5 extends Class112 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!ud;")
	private Class294 aClass294_3;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "[Lclient!nm;")
	private Class79_Sub4[] aClass79_Sub4Array1;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class112_Sub5(@OriginalArg(0) Class42_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean299) {
			this.aBoolean478 = arg0.anInt3695 < 3;
			@Pc(28) int local28 = this.aBoolean478 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(100) float local100;
						if (local93 == 0) {
							local100 = -local91;
						} else if (local93 == 1) {
							local100 = local91;
						} else if (local93 == 2) {
							local100 = local87;
						} else if (local93 == 3) {
							local100 = -local87;
						} else if (local93 == 4) {
							local100 = local83;
						} else {
							local100 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local100 > 0.0F) {
							local148 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local147 = (int) (Math.pow((double) local100, 36.0D) * (double) local28);
							local145 = (int) ((double) local28 * Math.pow((double) local100, 12.0D));
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
			this.aClass79_Sub4Array1 = new Class79_Sub4[3];
			this.aClass79_Sub4Array1[0] = new Class79_Sub4(super.aClass42_Sub3_39, 6406, 64, false, local36, 6406);
			this.aClass79_Sub4Array1[1] = new Class79_Sub4(super.aClass42_Sub3_39, 6406, 64, false, local40, 6406);
			this.aClass79_Sub4Array1[2] = new Class79_Sub4(super.aClass42_Sub3_39, 6406, 64, false, local32, 6406);
			this.method5432();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub3_39.method3250(8448, 7681);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (this.aBoolean477) {
			if (!this.aBoolean478) {
				super.aClass42_Sub3_39.method3259(2);
				super.aClass42_Sub3_39.method3219(null);
			}
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3219(null);
			super.aClass42_Sub3_39.method3259(0);
			this.aClass294_3.method7284('\u0001');
			this.aBoolean477 = false;
		} else {
			super.aClass42_Sub3_39.method3201(0, 5890);
		}
		super.aClass42_Sub3_39.method3250(8448, 8448);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	private void method5432() {
		this.aClass294_3 = new Class294(super.aClass42_Sub3_39, 2);
		this.aClass294_3.method7287(0);
		super.aClass42_Sub3_39.method3259(1);
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
		if (this.aBoolean478) {
			super.aClass42_Sub3_39.method3250(260, 7681);
			super.aClass42_Sub3_39.method3268(0, 770, 5890);
			super.aClass42_Sub3_39.method3201(0, 34167);
		} else {
			super.aClass42_Sub3_39.method3250(7681, 8448);
			super.aClass42_Sub3_39.method3268(0, 768, 34168);
			super.aClass42_Sub3_39.method3259(2);
			super.aClass42_Sub3_39.method3250(260, 7681);
			super.aClass42_Sub3_39.method3268(0, 768, 34168);
			super.aClass42_Sub3_39.method3268(1, 770, 34168);
			super.aClass42_Sub3_39.method3201(0, 34167);
		}
		super.aClass42_Sub3_39.method3259(0);
		this.aClass294_3.method7288();
		this.aClass294_3.method7287(1);
		super.aClass42_Sub3_39.method3259(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean478) {
			super.aClass42_Sub3_39.method3250(8448, 8448);
			super.aClass42_Sub3_39.method3268(0, 768, 5890);
			super.aClass42_Sub3_39.method3201(0, 5890);
		} else {
			super.aClass42_Sub3_39.method3250(8448, 8448);
			super.aClass42_Sub3_39.method3268(0, 768, 5890);
			super.aClass42_Sub3_39.method3259(2);
			super.aClass42_Sub3_39.method3250(8448, 8448);
			super.aClass42_Sub3_39.method3268(0, 768, 5890);
			super.aClass42_Sub3_39.method3268(1, 768, 34168);
			super.aClass42_Sub3_39.method3201(0, 5890);
		}
		super.aClass42_Sub3_39.method3259(0);
		this.aClass294_3.method7288();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean477) {
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3219(this.aClass79_Sub4Array1[arg1 - 1]);
			super.aClass42_Sub3_39.method3259(0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		if (this.aClass294_3 == null || !arg0) {
			super.aClass42_Sub3_39.method3201(0, 34168);
			return;
		}
		if (!this.aBoolean478) {
			super.aClass42_Sub3_39.method3259(2);
			super.aClass42_Sub3_39.method3219(super.aClass42_Sub3_39.aClass79_Sub2_2);
			super.aClass42_Sub3_39.method3259(0);
		}
		this.aClass294_3.method7284('\u0000');
		this.aBoolean477 = true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub3_39.method3219(arg0);
		super.aClass42_Sub3_39.method3257(arg1);
	}
}
