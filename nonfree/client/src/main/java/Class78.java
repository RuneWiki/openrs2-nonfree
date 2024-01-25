import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class78 {

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Lclient!hf;")
	private Class52_Sub1 aClass52_Sub1_4;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!rr;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	private int anInt2648 = -1;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	private int anInt2650 = 0;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	private int anInt2649 = 0;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	private int anInt2651 = -1;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!kn;")
	private final Class116 aClass116_13 = new Class116();

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "[Lclient!hf;")
	private Class52_Sub1[] aClass52_Sub1Array4 = new Class52_Sub1[2];

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
	private boolean aBoolean191 = true;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	private int anInt2653 = -1;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	private int anInt2652 = 0;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_16;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!gg;")
	private Class77 aClass77_3;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class78(@OriginalArg(0) Class47_Sub2 arg0) {
		this.aClass47_Sub2_16 = arg0;
		if (this.aClass47_Sub2_16.aBoolean228 && this.aClass47_Sub2_16.aBoolean236) {
			this.aClass77_3 = new Class77(this.aClass47_Sub2_16);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Z")
	public boolean method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass77_3 == null || this.aClass116_13.method3277()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt2651 != arg2 || this.anInt2648 != arg3) {
			this.anInt2651 = arg2;
			this.anInt2648 = arg3;
			for (@Pc(30) Class4 local30 = this.aClass116_13.method3270(); local30 != this.aClass116_13.aClass4_121; local30 = local30.aClass4_252) {
				((Class4_Sub14) local30).method1263(this.anInt2651, this.anInt2648);
			}
			this.aBoolean191 = true;
			this.aBoolean190 = true;
		}
		if (this.aBoolean190) {
			if (this.aClass179_1 != null) {
				this.aClass179_1.method4776();
				this.aClass179_1 = null;
			}
			if (this.aClass52_Sub1_4 != null) {
				this.aClass52_Sub1_4.method5612();
				this.aClass52_Sub1_4 = null;
			}
			if (this.aBoolean192) {
				this.aClass52_Sub1_4 = new Class52_Sub1(this.aClass47_Sub2_16, 34037, 6402, this.anInt2651, this.anInt2648);
			} else {
				this.aClass179_1 = new Class179(this.aClass47_Sub2_16, 6402, this.anInt2651, this.anInt2648);
			}
			this.aBoolean189 = true;
			this.aBoolean190 = false;
			local11 = true;
		}
		if (this.aBoolean191) {
			if (this.aClass52_Sub1Array4[0] != null) {
				this.aClass52_Sub1Array4[0].method5612();
				this.aClass52_Sub1Array4[0] = null;
			}
			if (this.aClass52_Sub1Array4[1] != null) {
				this.aClass52_Sub1Array4[1].method5612();
				this.aClass52_Sub1Array4[1] = null;
			}
			this.aClass52_Sub1Array4[0] = new Class52_Sub1(this.aClass47_Sub2_16, 34037, this.anInt2653, this.anInt2651, this.anInt2648);
			this.aClass52_Sub1Array4[1] = this.anInt2652 > 1 ? new Class52_Sub1(this.aClass47_Sub2_16, 34037, this.anInt2653, this.anInt2651, this.anInt2648) : null;
			this.aBoolean189 = true;
			this.aBoolean191 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass47_Sub2_16.method2815().method2761();
		this.aClass47_Sub2_16.method2767(this.aClass77_3);
		if (this.aBoolean189) {
			this.aClass77_3.method2289(0);
			this.aClass77_3.method2289(1);
			this.aClass77_3.method2289(8);
			if (this.aClass52_Sub1Array4[0] != null) {
				this.aClass77_3.method2291(0, this.aClass52_Sub1Array4[0]);
			}
			if (this.aClass52_Sub1Array4[1] != null) {
				this.aClass77_3.method2291(1, this.aClass52_Sub1Array4[1]);
			}
			if (this.aClass52_Sub1_4 != null) {
				this.aClass77_3.method2291(8, this.aClass52_Sub1_4);
			}
			if (this.aClass179_1 != null) {
				this.aClass77_3.method2292(this.aClass179_1);
			}
			this.aClass77_3.method2295(0);
			this.aBoolean189 = false;
			local11 = true;
		}
		if (!local11 || this.aClass77_3.method2293()) {
			this.anInt2650 = arg0;
			this.anInt2649 = arg1;
			this.aClass47_Sub2_16.method2791(-this.anInt2650, this.anInt2649 + this.anInt2648 - local194);
			return true;
		}
		this.aClass47_Sub2_16.method2808(this.aClass77_3);
		this.aBoolean191 = true;
		this.aBoolean190 = true;
		this.aBoolean189 = true;
		return false;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	private void method2339() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class4_Sub14 local11 = (Class4_Sub14) this.aClass116_13.method3270(); local11 != null; local11 = (Class4_Sub14) this.aClass116_13.method3272()) {
			local16 = local11.method1257();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method1258();
			local5 |= local11.method1254();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt2653) {
			this.anInt2653 = local45;
			this.aBoolean191 = true;
		}
		local16 = this.anInt2652 > 2 ? 2 : this.anInt2652;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean189 = this.aBoolean191 = true;
		}
		if (local5 != this.aBoolean192) {
			this.aBoolean192 = local5;
			this.aBoolean190 = true;
		}
		this.anInt2652 = local3;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()Z")
	private boolean method2340() {
		return this.aClass47_Sub2_16.method2815() == this.aClass77_3;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!gs;)Z")
	public boolean method2341(@OriginalArg(0) Class4_Sub14 arg0) {
		if (this.aClass77_3 != null) {
			if (arg0.method1255() || arg0.method1262()) {
				if (this.anInt2651 != -1 && this.anInt2648 != -1) {
					arg0.method1263(this.anInt2651, this.anInt2648);
				}
				arg0.aBoolean113 = true;
				this.aClass116_13.method3274(arg0);
				this.method2339();
				return true;
			}
			arg0.method1256();
		}
		return false;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "()V")
	public void method2342() {
		if (this.aClass77_3 != null) {
			this.aClass77_3 = null;
			this.aClass52_Sub1Array4 = null;
			this.aClass179_1 = null;
			this.aClass52_Sub1_4 = null;
			this.aBoolean191 = true;
			this.aBoolean190 = true;
			this.aBoolean189 = true;
			if (!this.aClass116_13.method3277()) {
				for (@Pc(33) Class4 local33 = this.aClass116_13.method3270(); local33 != this.aClass116_13.aClass4_121; local33 = local33.aClass4_252) {
					((Class4_Sub14) local33).method1256();
				}
			}
		}
		this.anInt2651 = this.anInt2648 = -1;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lclient!gs;)V")
	public void method2343(@OriginalArg(0) Class4_Sub14 arg0) {
		this.method2344(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!gs;Z)V")
	private void method2344(@OriginalArg(0) Class4_Sub14 arg0) {
		arg0.method1256();
		arg0.aBoolean113 = false;
		arg0.method5687();
		this.method2339();
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "()V")
	public void method2345() {
		if (!this.method2340()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass47_Sub2_16.anOpengl2;
		this.aClass47_Sub2_16.method2773();
		this.aClass47_Sub2_16.method2811(0);
		this.aClass47_Sub2_16.method2722();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class4_Sub14 local35;
		for (@Pc(27) Class4_Sub14 local27 = (Class4_Sub14) this.aClass116_13.method3270(); local27 != null; local27 = local35) {
			local35 = (Class4_Sub14) this.aClass116_13.method3272();
			@Pc(39) int local39 = local27.method1258();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method1259(local41, this.aClass52_Sub1Array4[local19], this.aClass52_Sub1_4);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass47_Sub2_16.method2808(this.aClass77_3);
					this.aClass47_Sub2_16.method2791(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt2648);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt2650, this.anInt2649);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt2650, this.anInt2649 + this.anInt2648);
					local7.glTexCoord2f((float) this.anInt2651, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt2650 + this.anInt2651, this.anInt2649 + this.anInt2648);
					local7.glTexCoord2f((float) this.anInt2651, (float) this.anInt2648);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt2650 + this.anInt2651, this.anInt2649);
					local7.glEnd();
				} else {
					this.aClass77_3.method2295(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt2648);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt2648);
					local7.glTexCoord2f((float) this.anInt2651, (float) this.anInt2648);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt2651, this.anInt2648);
					local7.glTexCoord2f((float) this.anInt2651, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt2651, 0);
					local7.glEnd();
				}
				local27.method1260(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}
}
