import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Lclient!cs;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "[Lclient!hg;")
	private Class8_Sub3[] aClass8_Sub3Array1;

	static {
		new Class158("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		new Class158("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
		new Class158(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class100_Sub1(@OriginalArg(0) Class106_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean210) {
			this.aBoolean187 = arg0.anInt3771 < 3;
			@Pc(24) int local24 = this.aBoolean187 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local62 * local62 + local53 * local53 + 1.0F)));
					@Pc(81) float local81 = local62 * local77;
					@Pc(85) float local85 = local53 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(96) float local96;
						if (local87 == 0) {
							local96 = -local81;
						} else if (local87 == 1) {
							local96 = local81;
						} else if (local87 == 2) {
							local96 = local85;
						} else if (local87 == 3) {
							local96 = -local85;
						} else if (local87 == 4) {
							local96 = local77;
						} else {
							local96 = -local77;
						}
						@Pc(141) int local141;
						@Pc(140) int local140;
						@Pc(138) int local138;
						if (local96 > 0.0F) {
							local141 = (int) ((double) local24 * Math.pow((double) local96, 96.0D));
							local140 = (int) ((double) local24 * Math.pow((double) local96, 36.0D));
							local138 = (int) ((double) local24 * Math.pow((double) local96, 12.0D));
						} else {
							local138 = 0;
							local140 = 0;
							local141 = 0;
						}
						local32[local87][local38] = (byte) local141;
						local36[local87][local38] = (byte) local140;
						local28[local87][local38] = (byte) local138;
					}
					local38++;
				}
			}
			this.aClass8_Sub3Array1 = new Class8_Sub3[3];
			this.aClass8_Sub3Array1[0] = new Class8_Sub3(super.aClass106_Sub2_43, 6406, 64, false, local32, 6406);
			this.aClass8_Sub3Array1[1] = new Class8_Sub3(super.aClass106_Sub2_43, 6406, 64, false, local36, 6406);
			this.aClass8_Sub3Array1[2] = new Class8_Sub3(super.aClass106_Sub2_43, 6406, 64, false, local28, 6406);
			this.method2317();
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		if (this.aBoolean188) {
			if (!this.aBoolean187) {
				super.aClass106_Sub2_43.method2881(2);
				super.aClass106_Sub2_43.method2912(null);
			}
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2912(null);
			super.aClass106_Sub2_43.method2881(0);
			this.aClass49_2.method1153('\u0001');
			this.aBoolean188 = false;
		} else {
			super.aClass106_Sub2_43.method2925(5890, 0);
		}
		super.aClass106_Sub2_43.method2923(8448, 8448);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
		super.aClass106_Sub2_43.method2912(arg1);
		super.aClass106_Sub2_43.method2851(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		if (this.aClass49_2 == null || !arg0) {
			super.aClass106_Sub2_43.method2925(34168, 0);
			return;
		}
		if (!this.aBoolean187) {
			super.aClass106_Sub2_43.method2881(2);
			super.aClass106_Sub2_43.method2912(super.aClass106_Sub2_43.aClass8_Sub1_1);
			super.aClass106_Sub2_43.method2881(0);
		}
		this.aClass49_2.method1153('\u0000');
		this.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
		super.aClass106_Sub2_43.method2923(8448, 7681);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	private void method2317() {
		this.aClass49_2 = new Class49(super.aClass106_Sub2_43, 2);
		this.aClass49_2.method1154(0);
		super.aClass106_Sub2_43.method2881(1);
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
		if (this.aBoolean187) {
			super.aClass106_Sub2_43.method2923(260, 7681);
			super.aClass106_Sub2_43.method2915(0, 5890, 770);
			super.aClass106_Sub2_43.method2925(34167, 0);
		} else {
			super.aClass106_Sub2_43.method2923(7681, 8448);
			super.aClass106_Sub2_43.method2915(0, 34168, 768);
			super.aClass106_Sub2_43.method2881(2);
			super.aClass106_Sub2_43.method2923(260, 7681);
			super.aClass106_Sub2_43.method2915(0, 34168, 768);
			super.aClass106_Sub2_43.method2915(1, 34168, 770);
			super.aClass106_Sub2_43.method2925(34167, 0);
		}
		super.aClass106_Sub2_43.method2881(0);
		this.aClass49_2.method1151();
		this.aClass49_2.method1154(1);
		super.aClass106_Sub2_43.method2881(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean187) {
			super.aClass106_Sub2_43.method2923(8448, 8448);
			super.aClass106_Sub2_43.method2915(0, 5890, 768);
			super.aClass106_Sub2_43.method2925(5890, 0);
		} else {
			super.aClass106_Sub2_43.method2923(8448, 8448);
			super.aClass106_Sub2_43.method2915(0, 5890, 768);
			super.aClass106_Sub2_43.method2881(2);
			super.aClass106_Sub2_43.method2923(8448, 8448);
			super.aClass106_Sub2_43.method2915(0, 5890, 768);
			super.aClass106_Sub2_43.method2915(1, 34168, 768);
			super.aClass106_Sub2_43.method2925(5890, 0);
		}
		super.aClass106_Sub2_43.method2881(0);
		this.aClass49_2.method1151();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean188) {
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2912(this.aClass8_Sub3Array1[arg1 - 1]);
			super.aClass106_Sub2_43.method2881(0);
		}
	}
}
