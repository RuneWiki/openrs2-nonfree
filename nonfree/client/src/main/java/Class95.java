import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class95 {

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Lclient!hb;")
	private Class99 aClass99_1;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!kh;")
	private Class30_Sub3 aClass30_Sub3_1;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	private int anInt2282 = -1;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt2285 = 0;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
	private int anInt2283 = -1;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
	private int anInt2284 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!kr;")
	private final Class138 aClass138_16 = new Class138();

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	private int anInt2286 = -1;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "[Lclient!kh;")
	private Class30_Sub3[] aClass30_Sub3Array1 = new Class30_Sub3[2];

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	private int anInt2287 = 0;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_13;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "Lclient!la;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class95(@OriginalArg(0) Class155_Sub1 arg0) {
		this.aClass155_Sub1_13 = arg0;
		if (this.aClass155_Sub1_13.aBoolean314 && this.aClass155_Sub1_13.aBoolean295) {
			this.aClass141_1 = new Class141(this.aClass155_Sub1_13);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ln;Z)V")
	private void method1920(@OriginalArg(0) Class3_Sub25 arg0) {
		arg0.method4752();
		arg0.aBoolean417 = false;
		arg0.method5700();
		this.method1922();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ln;)Z")
	public boolean method1921(@OriginalArg(0) Class3_Sub25 arg0) {
		if (this.aClass141_1 != null) {
			if (arg0.method4755() || arg0.method4757()) {
				if (this.anInt2282 != -1 && this.anInt2283 != -1) {
					arg0.method4760(this.anInt2282, this.anInt2283);
				}
				arg0.aBoolean417 = true;
				this.aClass138_16.method3053(arg0);
				this.method1922();
				return true;
			}
			arg0.method4752();
		}
		return false;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
	private void method1922() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class3_Sub25 local11 = (Class3_Sub25) this.aClass138_16.method3051(); local11 != null; local11 = (Class3_Sub25) this.aClass138_16.method3050()) {
			local16 = local11.method4759();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method4756();
			local5 |= local11.method4751();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt2286) {
			this.anInt2286 = local45;
			this.aBoolean175 = true;
		}
		local16 = this.anInt2287 > 2 ? 2 : this.anInt2287;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean174 = this.aBoolean175 = true;
		}
		if (local5 != this.aBoolean177) {
			this.aBoolean177 = local5;
			this.aBoolean176 = true;
		}
		this.anInt2287 = local3;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z")
	public boolean method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass141_1 == null || this.aClass138_16.method3059()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt2282 != arg2 || this.anInt2283 != arg3) {
			this.anInt2282 = arg2;
			this.anInt2283 = arg3;
			for (@Pc(30) Class3 local30 = this.aClass138_16.method3051(); local30 != this.aClass138_16.aClass3_137; local30 = local30.aClass3_243) {
				((Class3_Sub25) local30).method4760(this.anInt2282, this.anInt2283);
			}
			this.aBoolean175 = true;
			this.aBoolean176 = true;
		}
		if (this.aBoolean176) {
			if (this.aClass99_1 != null) {
				this.aClass99_1.method2046();
				this.aClass99_1 = null;
			}
			if (this.aClass30_Sub3_1 != null) {
				this.aClass30_Sub3_1.method4609();
				this.aClass30_Sub3_1 = null;
			}
			if (this.aBoolean177) {
				this.aClass30_Sub3_1 = new Class30_Sub3(this.aClass155_Sub1_13, 34037, 6402, this.anInt2282, this.anInt2283);
			} else {
				this.aClass99_1 = new Class99(this.aClass155_Sub1_13, 6402, this.anInt2282, this.anInt2283);
			}
			this.aBoolean174 = true;
			this.aBoolean176 = false;
			local11 = true;
		}
		if (this.aBoolean175) {
			if (this.aClass30_Sub3Array1[0] != null) {
				this.aClass30_Sub3Array1[0].method4609();
				this.aClass30_Sub3Array1[0] = null;
			}
			if (this.aClass30_Sub3Array1[1] != null) {
				this.aClass30_Sub3Array1[1].method4609();
				this.aClass30_Sub3Array1[1] = null;
			}
			this.aClass30_Sub3Array1[0] = new Class30_Sub3(this.aClass155_Sub1_13, 34037, this.anInt2286, this.anInt2282, this.anInt2283);
			this.aClass30_Sub3Array1[1] = this.anInt2287 > 1 ? new Class30_Sub3(this.aClass155_Sub1_13, 34037, this.anInt2286, this.anInt2282, this.anInt2283) : null;
			this.aBoolean174 = true;
			this.aBoolean175 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass155_Sub1_13.method3629().method3562();
		this.aClass155_Sub1_13.method3587(this.aClass141_1);
		if (this.aBoolean174) {
			this.aClass141_1.method3094(0);
			this.aClass141_1.method3094(1);
			this.aClass141_1.method3094(8);
			if (this.aClass30_Sub3Array1[0] != null) {
				this.aClass141_1.method3088(0, this.aClass30_Sub3Array1[0]);
			}
			if (this.aClass30_Sub3Array1[1] != null) {
				this.aClass141_1.method3088(1, this.aClass30_Sub3Array1[1]);
			}
			if (this.aClass30_Sub3_1 != null) {
				this.aClass141_1.method3088(8, this.aClass30_Sub3_1);
			}
			if (this.aClass99_1 != null) {
				this.aClass141_1.method3092(this.aClass99_1);
			}
			this.aClass141_1.method3089(0);
			this.aBoolean174 = false;
			local11 = true;
		}
		if (!local11 || this.aClass141_1.method3093()) {
			this.anInt2284 = arg0;
			this.anInt2285 = arg1;
			this.aClass155_Sub1_13.method3566(-this.anInt2284, this.anInt2285 + this.anInt2283 - local194);
			return true;
		}
		this.aClass155_Sub1_13.method3627(this.aClass141_1);
		this.aBoolean175 = true;
		this.aBoolean176 = true;
		this.aBoolean174 = true;
		return false;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "()Z")
	private boolean method1924() {
		return this.aClass155_Sub1_13.method3629() == this.aClass141_1;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "()V")
	public void method1925() {
		if (this.aClass141_1 != null) {
			this.aClass141_1 = null;
			this.aClass30_Sub3Array1 = null;
			this.aClass99_1 = null;
			this.aClass30_Sub3_1 = null;
			this.aBoolean175 = true;
			this.aBoolean176 = true;
			this.aBoolean174 = true;
			if (!this.aClass138_16.method3059()) {
				for (@Pc(33) Class3 local33 = this.aClass138_16.method3051(); local33 != this.aClass138_16.aClass3_137; local33 = local33.aClass3_243) {
					((Class3_Sub25) local33).method4752();
				}
			}
		}
		this.anInt2282 = this.anInt2283 = -1;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Lclient!ln;)V")
	public void method1926(@OriginalArg(0) Class3_Sub25 arg0) {
		this.method1920(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "()V")
	public void method1927() {
		if (!this.method1924()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass155_Sub1_13.anOpengl1;
		this.aClass155_Sub1_13.method3574();
		this.aClass155_Sub1_13.method3613(0);
		this.aClass155_Sub1_13.method4902();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class3_Sub25 local35;
		for (@Pc(27) Class3_Sub25 local27 = (Class3_Sub25) this.aClass138_16.method3051(); local27 != null; local27 = local35) {
			local35 = (Class3_Sub25) this.aClass138_16.method3050();
			@Pc(39) int local39 = local27.method4756();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method4758(local41, this.aClass30_Sub3Array1[local19], this.aClass30_Sub3_1);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass155_Sub1_13.method3627(this.aClass141_1);
					this.aClass155_Sub1_13.method3566(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt2283);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt2284, this.anInt2285);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt2284, this.anInt2285 + this.anInt2283);
					local7.glTexCoord2f((float) this.anInt2282, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt2284 + this.anInt2282, this.anInt2285 + this.anInt2283);
					local7.glTexCoord2f((float) this.anInt2282, (float) this.anInt2283);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt2284 + this.anInt2282, this.anInt2285);
					local7.glEnd();
				} else {
					this.aClass141_1.method3089(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt2283);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt2283);
					local7.glTexCoord2f((float) this.anInt2282, (float) this.anInt2283);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt2282, this.anInt2283);
					local7.glTexCoord2f((float) this.anInt2282, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt2282, 0);
					local7.glEnd();
				}
				local27.method4753(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}
}
