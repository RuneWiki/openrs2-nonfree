import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Lclient!hq;")
	private Class149 aClass149_4;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "[Lclient!ifa;")
	private Class94_Sub4[] aClass94_Sub4Array1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class6_Sub5(@OriginalArg(0) Class82_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean191) {
			this.aBoolean554 = arg0.anInt2503 < 3;
			@Pc(28) int local28 = this.aBoolean554 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(113) float local113;
						if (local93 == 0) {
							local113 = -local91;
						} else if (local93 == 1) {
							local113 = local91;
						} else if (local93 == 2) {
							local113 = local87;
						} else if (local93 == 3) {
							local113 = -local87;
						} else if (local93 == 4) {
							local113 = local83;
						} else {
							local113 = -local83;
						}
						@Pc(149) int local149;
						@Pc(158) int local158;
						@Pc(167) int local167;
						if (local113 > 0.0F) {
							local149 = (int) (Math.pow((double) local113, 96.0D) * (double) local28);
							local158 = (int) ((double) local28 * Math.pow((double) local113, 36.0D));
							local167 = (int) ((double) local28 * Math.pow((double) local113, 12.0D));
						} else {
							local167 = 0;
							local158 = 0;
							local149 = 0;
						}
						local36[local93][local42] = (byte) local149;
						local40[local93][local42] = (byte) local158;
						local32[local93][local42] = (byte) local167;
					}
					local42++;
				}
			}
			this.aClass94_Sub4Array1 = new Class94_Sub4[3];
			this.aClass94_Sub4Array1[0] = new Class94_Sub4(super.aClass82_Sub1_41, 6406, 64, false, local36, 6406);
			this.aClass94_Sub4Array1[1] = new Class94_Sub4(super.aClass82_Sub1_41, 6406, 64, false, local40, 6406);
			this.aClass94_Sub4Array1[2] = new Class94_Sub4(super.aClass82_Sub1_41, 6406, 64, false, local32, 6406);
			this.method6685();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		if (this.aClass149_4 == null || !arg0) {
			super.aClass82_Sub1_41.method2063(34168, 0);
			return;
		}
		if (!this.aBoolean554) {
			super.aClass82_Sub1_41.method2086(2);
			super.aClass82_Sub1_41.method2029(super.aClass82_Sub1_41.aClass94_Sub2_1);
			super.aClass82_Sub1_41.method2086(0);
		}
		this.aClass149_4.method3804('\u0000');
		this.aBoolean553 = true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		super.aClass82_Sub1_41.method2029(arg0);
		super.aClass82_Sub1_41.method2068(arg1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub1_41.method2077(8448, 7681);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean553) {
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2029(this.aClass94_Sub4Array1[arg0 - 1]);
			super.aClass82_Sub1_41.method2086(0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(B)V")
	private void method6685() {
		this.aClass149_4 = new Class149(super.aClass82_Sub1_41, 2);
		this.aClass149_4.method3800(0);
		super.aClass82_Sub1_41.method2086(1);
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
		if (this.aBoolean554) {
			super.aClass82_Sub1_41.method2077(260, 7681);
			super.aClass82_Sub1_41.method2066(5890, 770, 0);
			super.aClass82_Sub1_41.method2063(34167, 0);
		} else {
			super.aClass82_Sub1_41.method2077(7681, 8448);
			super.aClass82_Sub1_41.method2066(34168, 768, 0);
			super.aClass82_Sub1_41.method2086(2);
			super.aClass82_Sub1_41.method2077(260, 7681);
			super.aClass82_Sub1_41.method2066(34168, 768, 0);
			super.aClass82_Sub1_41.method2066(34168, 770, 1);
			super.aClass82_Sub1_41.method2063(34167, 0);
		}
		super.aClass82_Sub1_41.method2086(0);
		this.aClass149_4.method3803();
		this.aClass149_4.method3800(1);
		super.aClass82_Sub1_41.method2086(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean554) {
			super.aClass82_Sub1_41.method2077(8448, 8448);
			super.aClass82_Sub1_41.method2066(5890, 768, 0);
			super.aClass82_Sub1_41.method2063(5890, 0);
		} else {
			super.aClass82_Sub1_41.method2077(8448, 8448);
			super.aClass82_Sub1_41.method2066(5890, 768, 0);
			super.aClass82_Sub1_41.method2086(2);
			super.aClass82_Sub1_41.method2077(8448, 8448);
			super.aClass82_Sub1_41.method2066(5890, 768, 0);
			super.aClass82_Sub1_41.method2066(34168, 768, 1);
			super.aClass82_Sub1_41.method2063(5890, 0);
		}
		super.aClass82_Sub1_41.method2086(0);
		this.aClass149_4.method3803();
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (this.aBoolean553) {
			if (!this.aBoolean554) {
				super.aClass82_Sub1_41.method2086(2);
				super.aClass82_Sub1_41.method2029((Class94) null);
			}
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2029((Class94) null);
			super.aClass82_Sub1_41.method2086(0);
			this.aClass149_4.method3804('\u0001');
			this.aBoolean553 = false;
		} else {
			super.aClass82_Sub1_41.method2063(5890, 0);
		}
		super.aClass82_Sub1_41.method2077(8448, 8448);
	}
}
