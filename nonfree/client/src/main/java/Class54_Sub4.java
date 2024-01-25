import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class54_Sub4 extends Class54 {

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!fr;")
	private Class76 aClass76_4;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "[Lclient!ca;")
	private Class28_Sub1[] aClass28_Sub1Array1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class54_Sub4(@OriginalArg(0) Class81_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean139) {
			this.aBoolean229 = arg0.anInt1841 < 3;
			@Pc(24) int local24 = this.aBoolean229 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(57) float local57 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(99) float local99;
						if (local91 == 0) {
							local99 = -local85;
						} else if (local91 == 1) {
							local99 = local85;
						} else if (local91 == 2) {
							local99 = local89;
						} else if (local91 == 3) {
							local99 = -local89;
						} else if (local91 == 4) {
							local99 = local81;
						} else {
							local99 = -local81;
						}
						@Pc(141) int local141;
						@Pc(150) int local150;
						@Pc(159) int local159;
						if (local99 > 0.0F) {
							local141 = (int) (Math.pow((double) local99, 96.0D) * (double) local24);
							local150 = (int) (Math.pow((double) local99, 36.0D) * (double) local24);
							local159 = (int) (Math.pow((double) local99, 12.0D) * (double) local24);
						} else {
							local159 = 0;
							local150 = 0;
							local141 = 0;
						}
						local32[local91][local38] = (byte) local141;
						local36[local91][local38] = (byte) local150;
						local28[local91][local38] = (byte) local159;
					}
					local38++;
				}
			}
			this.aClass28_Sub1Array1 = new Class28_Sub1[3];
			this.aClass28_Sub1Array1[0] = new Class28_Sub1(this.aClass81_Sub1_37, 6406, 64, false, local32, 6406);
			this.aClass28_Sub1Array1[1] = new Class28_Sub1(this.aClass81_Sub1_37, 6406, 64, false, local36, 6406);
			this.aClass28_Sub1Array1[2] = new Class28_Sub1(this.aClass81_Sub1_37, 6406, 64, false, local28, 6406);
			this.method3224();
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()V")
	private void method3224() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass76_4 = new Class76(this.aClass81_Sub1_37, 2);
		this.aClass76_4.method1585(0);
		this.aClass81_Sub1_37.method1953(1);
		local3.glTexGeni(8192, 9472, 34065);
		local3.glTexGeni(8193, 9472, 34065);
		local3.glTexGeni(8194, 9472, 34065);
		local3.glEnable(3168);
		local3.glEnable(3169);
		local3.glEnable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		local3.glMatrixMode(5888);
		if (this.aBoolean229) {
			this.aClass81_Sub1_37.method1965(260, 7681);
			this.aClass81_Sub1_37.method1986(0, 5890, 770);
			this.aClass81_Sub1_37.method1984(0, 34167);
		} else {
			this.aClass81_Sub1_37.method1965(7681, 8448);
			this.aClass81_Sub1_37.method1986(0, 34168, 768);
			this.aClass81_Sub1_37.method1953(2);
			this.aClass81_Sub1_37.method1965(260, 7681);
			this.aClass81_Sub1_37.method1986(0, 34168, 768);
			this.aClass81_Sub1_37.method1986(1, 34168, 770);
			this.aClass81_Sub1_37.method1984(0, 34167);
		}
		this.aClass81_Sub1_37.method1953(0);
		this.aClass76_4.method1584();
		this.aClass76_4.method1585(1);
		this.aClass81_Sub1_37.method1953(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean229) {
			this.aClass81_Sub1_37.method1965(8448, 8448);
			this.aClass81_Sub1_37.method1986(0, 5890, 768);
			this.aClass81_Sub1_37.method1984(0, 5890);
		} else {
			this.aClass81_Sub1_37.method1965(8448, 8448);
			this.aClass81_Sub1_37.method1986(0, 5890, 768);
			this.aClass81_Sub1_37.method1953(2);
			this.aClass81_Sub1_37.method1965(8448, 8448);
			this.aClass81_Sub1_37.method1986(0, 5890, 768);
			this.aClass81_Sub1_37.method1986(1, 34168, 768);
			this.aClass81_Sub1_37.method1984(0, 5890);
		}
		this.aClass81_Sub1_37.method1953(0);
		this.aClass76_4.method1584();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		if (this.aClass76_4 == null || !arg0) {
			this.aClass81_Sub1_37.method1984(0, 34168);
			return;
		}
		if (!this.aBoolean229) {
			this.aClass81_Sub1_37.method1953(2);
			this.aClass81_Sub1_37.method2022(this.aClass81_Sub1_37.aClass28_Sub3_2);
			this.aClass81_Sub1_37.method1953(0);
		}
		this.aClass76_4.method1586('\u0000');
		this.aBoolean228 = true;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!mo;)V")
	@Override
	public void method5296(@OriginalArg(0) Class28 arg0) {
		this.aClass81_Sub1_37.method2022(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		if (this.aBoolean228) {
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method2022(this.aClass28_Sub1Array1[arg0 - 1]);
			this.aClass81_Sub1_37.method1953(0);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5299(@OriginalArg(0) boolean arg0) {
		this.aClass81_Sub1_37.method1965(8448, 7681);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
	@Override
	public void method5298() {
		if (this.aBoolean228) {
			if (!this.aBoolean229) {
				this.aClass81_Sub1_37.method1953(2);
				this.aClass81_Sub1_37.method2022(null);
			}
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method2022(null);
			this.aClass81_Sub1_37.method1953(0);
			this.aClass76_4.method1586('\u0001');
			this.aBoolean228 = false;
		} else {
			this.aClass81_Sub1_37.method1984(0, 5890);
		}
		this.aClass81_Sub1_37.method1965(8448, 8448);
	}
}
