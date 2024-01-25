import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class351 {

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Z")
	private boolean aBoolean779;

	@OriginalMember(owner = "client!vaa", name = "C", descriptor = "Lclient!dw;")
	private Class5_Sub4_Sub5 aClass5_Sub4_Sub5_1;

	@OriginalMember(owner = "client!vaa", name = "D", descriptor = "Lclient!dw;")
	private Class5_Sub4_Sub5 aClass5_Sub4_Sub5_2;

	@OriginalMember(owner = "client!vaa", name = "I", descriptor = "Lclient!sia;")
	private Class24_Sub4 aClass24_Sub4_5;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
	private int anInt9684 = 0;

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
	private int anInt9687 = 1;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
	private int anInt9685 = 1;

	@OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
	private int anInt9695 = 0;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "Lclient!ro;")
	private final Class306 aClass306_61 = new Class306();

	@OriginalMember(owner = "client!vaa", name = "y", descriptor = "Z")
	private boolean aBoolean780 = true;

	@OriginalMember(owner = "client!vaa", name = "B", descriptor = "Z")
	private boolean aBoolean782 = true;

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
	private int anInt9696 = 0;

	@OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
	private int anInt9697 = -1;

	@OriginalMember(owner = "client!vaa", name = "F", descriptor = "Z")
	private boolean aBoolean783 = true;

	@OriginalMember(owner = "client!vaa", name = "G", descriptor = "Z")
	private boolean aBoolean784 = false;

	@OriginalMember(owner = "client!vaa", name = "A", descriptor = "Z")
	private boolean aBoolean781 = true;

	@OriginalMember(owner = "client!vaa", name = "H", descriptor = "[Lclient!sia;")
	private Class24_Sub4[] aClass24_Sub4Array4 = new Class24_Sub4[2];

	@OriginalMember(owner = "client!vaa", name = "n", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_35;

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "Lclient!nh;")
	private Class243 aClass243_5;

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "Lclient!nh;")
	private Class243 aClass243_7;

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "Lclient!nh;")
	private Class243 aClass243_6;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class351(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aClass126_Sub3_35 = arg0;
		if (this.aClass126_Sub3_35.aBoolean666 && this.aClass126_Sub3_35.aBoolean667) {
			this.aClass243_7 = this.aClass243_5 = new Class243(this.aClass126_Sub3_35);
			if (this.aClass126_Sub3_35.anInt8254 > 1 && this.aClass126_Sub3_35.aBoolean669 && this.aClass126_Sub3_35.aBoolean683) {
				this.aClass243_7 = this.aClass243_6 = new Class243(this.aClass126_Sub3_35);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII)Z")
	public boolean method8310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass243_7 == null || this.aClass306_61.method7309()) {
			return false;
		}
		if (this.anInt9685 != arg3 || arg0 != this.anInt9687) {
			this.anInt9685 = arg3;
			this.anInt9687 = arg0;
			for (@Pc(44) Class5 local44 = this.aClass306_61.method7313(); local44 != this.aClass306_61.aClass5_235; local44 = local44.aClass5_299) {
				((Class5_Sub14) local44).method7408(this.anInt9687, this.anInt9685);
			}
			this.aBoolean783 = true;
			this.aBoolean780 = true;
			this.aBoolean781 = true;
		}
		if (!this.method8311()) {
			return false;
		}
		this.aBoolean779 = true;
		this.anInt9695 = arg2;
		this.anInt9684 = arg1;
		this.aClass126_Sub3_35.method7097(this.aClass243_7);
		this.aClass243_7.method5840(0);
		this.aClass126_Sub3_35.method7074(-this.anInt9684, this.anInt9687 + this.anInt9695 - this.aClass126_Sub3_35.anInt8084);
		return true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Z")
	private boolean method8311() {
		if (this.aBoolean783) {
			if (this.aClass5_Sub4_Sub5_2 != null) {
				this.aClass5_Sub4_Sub5_2.method1636();
				this.aClass5_Sub4_Sub5_2 = null;
			}
			if (this.aClass24_Sub4_5 != null) {
				this.aClass24_Sub4_5.method6786();
				this.aClass24_Sub4_5 = null;
			}
			if (this.aClass243_6 != null) {
				this.aClass5_Sub4_Sub5_2 = new Class5_Sub4_Sub5(this.aClass126_Sub3_35, 6402, this.anInt9685, this.anInt9687, this.aClass126_Sub3_35.anInt8254);
			}
			if (this.aBoolean784) {
				this.aClass24_Sub4_5 = new Class24_Sub4(this.aClass126_Sub3_35, 34037, 6402, this.anInt9685, this.anInt9687);
			} else if (this.aClass5_Sub4_Sub5_2 == null) {
				this.aClass5_Sub4_Sub5_2 = new Class5_Sub4_Sub5(this.aClass126_Sub3_35, 6402, this.anInt9685, this.anInt9687);
			}
			this.aBoolean783 = false;
			this.aBoolean782 = true;
			this.aBoolean780 = true;
		}
		if (this.aBoolean781) {
			if (this.aClass5_Sub4_Sub5_1 != null) {
				this.aClass5_Sub4_Sub5_1.method1636();
				this.aClass5_Sub4_Sub5_1 = null;
			}
			if (this.aClass24_Sub4Array4[0] != null) {
				this.aClass24_Sub4Array4[0].method6786();
				this.aClass24_Sub4Array4[0] = null;
			}
			if (this.aClass24_Sub4Array4[1] != null) {
				this.aClass24_Sub4Array4[1].method6786();
				this.aClass24_Sub4Array4[1] = null;
			}
			if (this.aClass243_6 != null) {
				this.aClass5_Sub4_Sub5_1 = new Class5_Sub4_Sub5(this.aClass126_Sub3_35, this.anInt9697, this.anInt9685, this.anInt9687, this.aClass126_Sub3_35.anInt8254);
			}
			this.aClass24_Sub4Array4[0] = new Class24_Sub4(this.aClass126_Sub3_35, 34037, this.anInt9697, this.anInt9685, this.anInt9687);
			this.aClass24_Sub4Array4[1] = this.anInt9696 > 1 ? new Class24_Sub4(this.aClass126_Sub3_35, 34037, this.anInt9697, this.anInt9685, this.anInt9687) : null;
			this.aBoolean781 = false;
			this.aBoolean780 = true;
			this.aBoolean782 = true;
		}
		if (this.aBoolean780) {
			if (this.aClass243_6 == null) {
				this.aClass126_Sub3_35.method7097(this.aClass243_5);
				this.aClass243_5.method5839(0);
				this.aClass243_5.method5839(1);
				this.aClass243_5.method5839(8);
				this.aClass243_5.method5834(0, this.aClass24_Sub4Array4[0]);
				if (this.anInt9696 > 1) {
					this.aClass243_5.method5834(1, this.aClass24_Sub4Array4[1]);
				}
				if (this.aBoolean784) {
					this.aClass243_5.method5834(8, this.aClass24_Sub4_5);
				} else {
					this.aClass243_5.method5833(this.aClass5_Sub4_Sub5_2, 8);
				}
				this.aClass126_Sub3_35.method7111(this.aClass243_5);
			} else {
				this.aClass126_Sub3_35.method7097(this.aClass243_5);
				this.aClass243_5.method5839(0);
				this.aClass243_5.method5839(1);
				this.aClass243_5.method5839(8);
				this.aClass243_5.method5834(0, this.aClass24_Sub4Array4[0]);
				if (this.anInt9696 > 1) {
					this.aClass243_5.method5834(1, this.aClass24_Sub4Array4[1]);
				}
				if (this.aBoolean784) {
					this.aClass243_5.method5834(8, this.aClass24_Sub4_5);
				}
				this.aClass126_Sub3_35.method7111(this.aClass243_5);
				this.aClass126_Sub3_35.method7097(this.aClass243_6);
				this.aClass243_6.method5839(0);
				this.aClass243_6.method5839(8);
				this.aClass243_6.method5833(this.aClass5_Sub4_Sub5_1, 0);
				this.aClass243_6.method5833(this.aClass5_Sub4_Sub5_2, 8);
				this.aClass126_Sub3_35.method7111(this.aClass243_6);
			}
			this.aBoolean782 = true;
			this.aBoolean780 = false;
		}
		if (this.aBoolean782) {
			this.aClass126_Sub3_35.method7097(this.aClass243_7);
			this.aBoolean782 = !this.aClass243_7.method5826();
			this.aClass126_Sub3_35.method7111(this.aClass243_7);
		}
		return !this.aBoolean782;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public void method8312() {
		if (!this.aBoolean779) {
			return;
		}
		if (this.aClass243_6 != null) {
			this.aClass126_Sub3_35.method7107(this.aClass243_6);
			@Pc(20) short local20 = 16384;
			this.aClass126_Sub3_35.method7089(this.aClass243_5);
			this.aClass243_6.method5831();
			this.aClass243_5.method5840(0);
			if (this.aBoolean784) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9685, this.anInt9687, 0, 0, this.anInt9685, this.anInt9687, local20, 9728);
			this.aClass126_Sub3_35.method7084(this.aClass243_6);
			this.aClass126_Sub3_35.method7130(this.aClass243_5);
		}
		this.aClass126_Sub3_35.method7088();
		this.aClass126_Sub3_35.method7109(0);
		this.aClass126_Sub3_35.method7105(1);
		this.aClass126_Sub3_35.la();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(111) Class5_Sub14 local111;
		for (@Pc(103) Class5_Sub14 local103 = (Class5_Sub14) this.aClass306_61.method7313(); local103 != null; local103 = local111) {
			local111 = (Class5_Sub14) this.aClass306_61.method7301();
			@Pc(115) int local115 = local103.method7406();
			for (@Pc(117) int local117 = 0; local117 < local115; local117++) {
				local103.method7399(this.aClass24_Sub4Array4[local95], this.aClass24_Sub4_5, local117);
				if (local111 == null && local117 == local115 - 1) {
					this.aClass126_Sub3_35.method7111(this.aClass243_5);
					this.aClass126_Sub3_35.method7074(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9687);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9684, this.anInt9695);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9684, this.anInt9687 + this.anInt9695);
					OpenGL.glTexCoord2f((float) this.anInt9685, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9684 + this.anInt9685, this.anInt9687 + this.anInt9695);
					OpenGL.glTexCoord2f((float) this.anInt9685, (float) this.anInt9687);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9684 + this.anInt9685, this.anInt9695);
					OpenGL.glEnd();
				} else {
					this.aClass243_5.method5840(local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9687);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt9687);
					OpenGL.glTexCoord2f((float) this.anInt9685, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9685, this.anInt9687);
					OpenGL.glTexCoord2f((float) this.anInt9685, (float) this.anInt9687);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9685, 0);
					OpenGL.glEnd();
				}
				local103.method7407(local117);
				local95 = local95 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
			}
		}
		this.aBoolean779 = false;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)Z")
	public boolean method8315() {
		return this.aClass243_7 != null;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V")
	private void method8316() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class5_Sub14 local17 = (Class5_Sub14) this.aClass306_61.method7313(); local17 != null; local17 = (Class5_Sub14) this.aClass306_61.method7301()) {
			local23 = local17.method7404();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method7406();
			local7 |= local17.method7397();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt9697) {
			this.anInt9697 = local23;
			this.aBoolean781 = true;
		}
		@Pc(85) int local85 = this.anInt9696 > 2 ? 2 : this.anInt9696;
		@Pc(94) int local94 = local11 > 2 ? 2 : local11;
		if (local94 != local85) {
			this.aBoolean780 = this.aBoolean781 = true;
		}
		this.anInt9696 = local11;
		if (local7 != this.aBoolean784) {
			this.aBoolean783 = true;
			this.aBoolean784 = local7;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLclient!faa;)V")
	public void method8317(@OriginalArg(1) Class5_Sub14 arg0) {
		arg0.aBoolean707 = false;
		arg0.method7403();
		arg0.method8911();
		this.method8316();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLclient!faa;)Z")
	public boolean method8318(@OriginalArg(1) Class5_Sub14 arg0) {
		if (this.aClass243_7 != null) {
			if (arg0.method7400() || arg0.method7398()) {
				this.aClass306_61.method7303(arg0);
				this.method8316();
				if (this.method8311()) {
					if (this.anInt9685 != -1 && this.anInt9687 != -1) {
						arg0.method7408(this.anInt9687, this.anInt9685);
					}
					arg0.aBoolean707 = true;
					return true;
				}
			}
			this.method8317(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	public void method8319() {
		this.aClass5_Sub4_Sub5_1 = null;
		this.aClass5_Sub4_Sub5_2 = null;
		this.aClass24_Sub4Array4 = null;
		this.aClass243_7 = this.aClass243_6 = this.aClass243_5 = null;
		this.aClass24_Sub4_5 = null;
		if (!this.aClass306_61.method7309()) {
			for (@Pc(36) Class5 local36 = this.aClass306_61.method7313(); local36 != this.aClass306_61.aClass5_235; local36 = local36.aClass5_299) {
				((Class5_Sub14) local36).method7403();
			}
		}
		this.anInt9685 = this.anInt9687 = 1;
	}
}
