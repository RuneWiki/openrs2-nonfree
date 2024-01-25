import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class74 {

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "Lclient!qca;")
	private Class5_Sub5_Sub17 aClass5_Sub5_Sub17_1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "Lclient!wo;")
	private Class167_Sub3 aClass167_Sub3_2;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Lclient!qca;")
	private Class5_Sub5_Sub17 aClass5_Sub5_Sub17_2;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	private int anInt1955 = 1;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	private int anInt1962 = 0;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	private int anInt1952 = 1;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "I")
	private int anInt1963 = 0;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!tg;")
	private final Class330 aClass330_7 = new Class330();

	@OriginalMember(owner = "client!di", name = "x", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "[Lclient!wo;")
	private Class167_Sub3[] aClass167_Sub3Array3 = new Class167_Sub3[2];

	@OriginalMember(owner = "client!di", name = "w", descriptor = "I")
	private int anInt1965 = -1;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "Z")
	private boolean aBoolean152 = true;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "I")
	private int anInt1966 = 0;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_6;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!ju;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Lclient!ju;")
	private Class186 aClass186_3;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!ju;")
	private Class186 aClass186_2;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class74(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aClass133_Sub3_6 = arg0;
		if (this.aClass133_Sub3_6.aBoolean615 && this.aClass133_Sub3_6.aBoolean622) {
			this.aClass186_3 = this.aClass186_1 = new Class186(this.aClass133_Sub3_6);
			if (this.aClass133_Sub3_6.anInt8526 > 1 && this.aClass133_Sub3_6.aBoolean623 && this.aClass133_Sub3_6.aBoolean618) {
				this.aClass186_3 = this.aClass186_2 = new Class186(this.aClass133_Sub3_6);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	private void method1612() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class5_Sub46 local17 = (Class5_Sub46) this.aClass330_7.method7908(); local17 != null; local17 = (Class5_Sub46) this.aClass330_7.method7914()) {
			local23 = local17.method7580();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method7571();
			local7 |= local17.method7576();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt1965) {
			this.aBoolean152 = true;
			this.anInt1965 = local23;
		}
		@Pc(91) int local91 = this.anInt1966 > 2 ? 2 : this.anInt1966;
		@Pc(100) int local100 = local11 <= 2 ? local11 : 2;
		this.anInt1966 = local11;
		if (local7 != this.aBoolean153) {
			this.aBoolean153 = local7;
			this.aBoolean150 = true;
		}
		if (local91 != local100) {
			this.aBoolean151 = this.aBoolean152 = true;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
	public void method1613() {
		this.aClass167_Sub3Array3 = null;
		this.aClass186_3 = this.aClass186_2 = this.aClass186_1 = null;
		this.aClass5_Sub5_Sub17_1 = null;
		this.aClass5_Sub5_Sub17_2 = null;
		this.aClass167_Sub3_2 = null;
		if (!this.aClass330_7.method7918()) {
			for (@Pc(36) Class5 local36 = this.aClass330_7.method7908(); local36 != this.aClass330_7.aClass5_257; local36 = local36.aClass5_300) {
				((Class5_Sub46) local36).method7581();
			}
		}
		this.anInt1955 = this.anInt1952 = 1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
	private boolean method1616() {
		if (this.aBoolean150) {
			if (this.aClass5_Sub5_Sub17_1 != null) {
				this.aClass5_Sub5_Sub17_1.method6752();
				this.aClass5_Sub5_Sub17_1 = null;
			}
			if (this.aClass167_Sub3_2 != null) {
				this.aClass167_Sub3_2.method8011();
				this.aClass167_Sub3_2 = null;
			}
			if (this.aClass186_2 != null) {
				this.aClass5_Sub5_Sub17_1 = new Class5_Sub5_Sub17(this.aClass133_Sub3_6, 6402, this.anInt1955, this.anInt1952, this.aClass133_Sub3_6.anInt8526);
			}
			if (this.aBoolean153) {
				this.aClass167_Sub3_2 = new Class167_Sub3(this.aClass133_Sub3_6, 34037, 6402, this.anInt1955, this.anInt1952);
			} else if (this.aClass5_Sub5_Sub17_1 == null) {
				this.aClass5_Sub5_Sub17_1 = new Class5_Sub5_Sub17(this.aClass133_Sub3_6, 6402, this.anInt1955, this.anInt1952);
			}
			this.aBoolean151 = true;
			this.aBoolean150 = false;
			this.aBoolean154 = true;
		}
		if (this.aBoolean152) {
			if (this.aClass5_Sub5_Sub17_2 != null) {
				this.aClass5_Sub5_Sub17_2.method6752();
				this.aClass5_Sub5_Sub17_2 = null;
			}
			if (this.aClass167_Sub3Array3[0] != null) {
				this.aClass167_Sub3Array3[0].method8011();
				this.aClass167_Sub3Array3[0] = null;
			}
			if (this.aClass167_Sub3Array3[1] != null) {
				this.aClass167_Sub3Array3[1].method8011();
				this.aClass167_Sub3Array3[1] = null;
			}
			if (this.aClass186_2 != null) {
				this.aClass5_Sub5_Sub17_2 = new Class5_Sub5_Sub17(this.aClass133_Sub3_6, this.anInt1965, this.anInt1955, this.anInt1952, this.aClass133_Sub3_6.anInt8526);
			}
			this.aClass167_Sub3Array3[0] = new Class167_Sub3(this.aClass133_Sub3_6, 34037, this.anInt1965, this.anInt1955, this.anInt1952);
			this.aClass167_Sub3Array3[1] = this.anInt1966 <= 1 ? null : new Class167_Sub3(this.aClass133_Sub3_6, 34037, this.anInt1965, this.anInt1955, this.anInt1952);
			this.aBoolean154 = true;
			this.aBoolean151 = true;
			this.aBoolean152 = false;
		}
		if (this.aBoolean151) {
			if (this.aClass186_2 == null) {
				this.aClass133_Sub3_6.method7390(this.aClass186_1);
				this.aClass186_1.method4345(0);
				this.aClass186_1.method4345(1);
				this.aClass186_1.method4345(8);
				this.aClass186_1.method4346(this.aClass167_Sub3Array3[0], 0);
				if (this.anInt1966 > 1) {
					this.aClass186_1.method4346(this.aClass167_Sub3Array3[1], 1);
				}
				if (this.aBoolean153) {
					this.aClass186_1.method4346(this.aClass167_Sub3_2, 8);
				} else {
					this.aClass186_1.method4339(8, this.aClass5_Sub5_Sub17_1);
				}
				this.aClass133_Sub3_6.method7363(this.aClass186_1);
			} else {
				this.aClass133_Sub3_6.method7390(this.aClass186_1);
				this.aClass186_1.method4345(0);
				this.aClass186_1.method4345(1);
				this.aClass186_1.method4345(8);
				this.aClass186_1.method4346(this.aClass167_Sub3Array3[0], 0);
				if (this.anInt1966 > 1) {
					this.aClass186_1.method4346(this.aClass167_Sub3Array3[1], 1);
				}
				if (this.aBoolean153) {
					this.aClass186_1.method4346(this.aClass167_Sub3_2, 8);
				}
				this.aClass133_Sub3_6.method7363(this.aClass186_1);
				this.aClass133_Sub3_6.method7390(this.aClass186_2);
				this.aClass186_2.method4345(0);
				this.aClass186_2.method4345(8);
				this.aClass186_2.method4339(0, this.aClass5_Sub5_Sub17_2);
				this.aClass186_2.method4339(8, this.aClass5_Sub5_Sub17_1);
				this.aClass133_Sub3_6.method7363(this.aClass186_2);
			}
			this.aBoolean154 = true;
			this.aBoolean151 = false;
		}
		if (this.aBoolean154) {
			this.aClass133_Sub3_6.method7390(this.aClass186_3);
			this.aBoolean154 = !this.aClass186_3.method4344();
			this.aClass133_Sub3_6.method7363(this.aClass186_3);
		}
		return !this.aBoolean154;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	public void method1617() {
		if (!this.aBoolean149) {
			return;
		}
		if (this.aClass186_2 != null) {
			@Pc(22) short local22 = 16384;
			this.aClass133_Sub3_6.method7402(this.aClass186_2);
			this.aClass133_Sub3_6.method7360(this.aClass186_1);
			this.aClass186_2.method4340();
			this.aClass186_1.method4342(0);
			if (this.aBoolean153) {
				local22 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1955, this.anInt1952, 0, 0, this.anInt1955, this.anInt1952, local22, 9728);
			this.aClass133_Sub3_6.method7394(this.aClass186_2);
			this.aClass133_Sub3_6.method7337(this.aClass186_1);
		}
		this.aClass133_Sub3_6.method7369();
		this.aClass133_Sub3_6.method7388(0);
		this.aClass133_Sub3_6.method7401(1);
		this.aClass133_Sub3_6.la();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class5_Sub46 local113;
		for (@Pc(105) Class5_Sub46 local105 = (Class5_Sub46) this.aClass330_7.method7908(); local105 != null; local105 = local113) {
			local113 = (Class5_Sub46) this.aClass330_7.method7914();
			@Pc(117) int local117 = local105.method7571();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method7572(local119, this.aClass167_Sub3Array3[local97], this.aClass167_Sub3_2);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass133_Sub3_6.method7363(this.aClass186_1);
					this.aClass133_Sub3_6.method7385(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1952);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1962, this.anInt1963);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1962, this.anInt1963 + this.anInt1952);
					OpenGL.glTexCoord2f((float) this.anInt1955, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1962 + this.anInt1955, this.anInt1952 + this.anInt1963);
					OpenGL.glTexCoord2f((float) this.anInt1955, (float) this.anInt1952);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1962 + this.anInt1955, this.anInt1963);
					OpenGL.glEnd();
				} else {
					this.aClass186_1.method4342(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1952);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt1952);
					OpenGL.glTexCoord2f((float) this.anInt1955, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1955, this.anInt1952);
					OpenGL.glTexCoord2f((float) this.anInt1955, (float) this.anInt1952);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1955, 0);
					OpenGL.glEnd();
				}
				local105.method7579(local119);
				local99 = local99 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
			}
		}
		this.aBoolean149 = false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!vl;)Z")
	public boolean method1618(@OriginalArg(1) Class5_Sub46 arg0) {
		if (this.aClass186_3 != null) {
			if (arg0.method7578() || arg0.method7573()) {
				this.aClass330_7.method7917(arg0);
				this.method1612();
				if (this.method1616()) {
					if (this.anInt1955 != -1 && this.anInt1952 != -1) {
						arg0.method7577(this.anInt1955, this.anInt1952);
					}
					arg0.aBoolean647 = true;
					return true;
				}
			}
			this.method1619(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!vl;I)V")
	public void method1619(@OriginalArg(0) Class5_Sub46 arg0) {
		arg0.aBoolean647 = false;
		arg0.method7581();
		arg0.method9047();
		this.method1612();
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Z")
	public boolean method1620() {
		return this.aClass186_3 != null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)Z")
	public boolean method1621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass186_3 == null || this.aClass330_7.method7918()) {
			return false;
		}
		if (this.anInt1955 != arg3 || arg0 != this.anInt1952) {
			this.anInt1955 = arg3;
			this.anInt1952 = arg0;
			for (@Pc(46) Class5 local46 = this.aClass330_7.method7908(); local46 != this.aClass330_7.aClass5_257; local46 = local46.aClass5_300) {
				((Class5_Sub46) local46).method7577(this.anInt1955, this.anInt1952);
			}
			this.aBoolean151 = true;
			this.aBoolean152 = true;
			this.aBoolean150 = true;
		}
		if (!this.method1616()) {
			return false;
		}
		this.aBoolean149 = true;
		this.anInt1963 = arg1;
		this.anInt1962 = arg2;
		this.aClass133_Sub3_6.method7390(this.aClass186_3);
		this.aClass186_3.method4342(0);
		this.aClass133_Sub3_6.method7385(-this.anInt1962, this.anInt1952 + this.anInt1963 - this.aClass133_Sub3_6.anInt8481);
		return true;
	}
}
