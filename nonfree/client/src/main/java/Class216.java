import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class216 {

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!sr;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "Lclient!oe;")
	private Class92_Sub4 aClass92_Sub4_7;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	private int anInt6651 = -1;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	private int anInt6653 = 0;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	private int anInt6652 = 0;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	private int anInt6654 = -1;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!fi;")
	private final Class74 aClass74_38 = new Class74();

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	private int anInt6655 = 0;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Z")
	private boolean aBoolean486 = true;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
	private int anInt6656 = -1;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
	private boolean aBoolean485 = true;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Z")
	private boolean aBoolean488 = true;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[Lclient!oe;")
	private Class92_Sub4[] aClass92_Sub4Array4 = new Class92_Sub4[2];

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_40;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!gm;")
	private Class85 aClass85_4;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class216(@OriginalArg(0) Class89_Sub1 arg0) {
		this.aClass89_Sub1_40 = arg0;
		if (this.aClass89_Sub1_40.aBoolean197 && this.aClass89_Sub1_40.aBoolean203) {
			this.aClass85_4 = new Class85(this.aClass89_Sub1_40);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
	public void method5652() {
		if (!this.method5654()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass89_Sub1_40.anOpengl2;
		this.aClass89_Sub1_40.method2441();
		this.aClass89_Sub1_40.method2403(0);
		this.aClass89_Sub1_40.method5425();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class7_Sub6 local35;
		for (@Pc(27) Class7_Sub6 local27 = (Class7_Sub6) this.aClass74_38.method1793(); local27 != null; local27 = local35) {
			local35 = (Class7_Sub6) this.aClass74_38.method1798();
			@Pc(39) int local39 = local27.method863();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method865(local41, this.aClass92_Sub4Array4[local19], this.aClass92_Sub4_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass89_Sub1_40.method2447(this.aClass85_4);
					this.aClass89_Sub1_40.method2416(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt6654);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt6652, this.anInt6653);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt6652, this.anInt6653 + this.anInt6654);
					local7.glTexCoord2f((float) this.anInt6651, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt6652 + this.anInt6651, this.anInt6653 + this.anInt6654);
					local7.glTexCoord2f((float) this.anInt6651, (float) this.anInt6654);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt6652 + this.anInt6651, this.anInt6653);
					local7.glEnd();
				} else {
					this.aClass85_4.method2071(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt6654);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt6654);
					local7.glTexCoord2f((float) this.anInt6651, (float) this.anInt6654);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt6651, this.anInt6654);
					local7.glTexCoord2f((float) this.anInt6651, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt6651, 0);
					local7.glEnd();
				}
				local27.method856(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!pq;)Z")
	public boolean method5653(@OriginalArg(0) Class7_Sub6 arg0) {
		if (this.aClass85_4 != null) {
			if (arg0.method859() || arg0.method857()) {
				if (this.anInt6651 != -1 && this.anInt6654 != -1) {
					arg0.method864(this.anInt6651, this.anInt6654);
				}
				arg0.aBoolean82 = true;
				this.aClass74_38.method1802(arg0);
				this.method5655();
				return true;
			}
			arg0.method860();
		}
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()Z")
	private boolean method5654() {
		return this.aClass89_Sub1_40.method2452() == this.aClass85_4;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()V")
	private void method5655() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class7_Sub6 local11 = (Class7_Sub6) this.aClass74_38.method1793(); local11 != null; local11 = (Class7_Sub6) this.aClass74_38.method1798()) {
			local16 = local11.method858();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method863();
			local5 |= local11.method861();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt6656) {
			this.anInt6656 = local45;
			this.aBoolean486 = true;
		}
		local16 = this.anInt6655 > 2 ? 2 : this.anInt6655;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean488 = this.aBoolean486 = true;
		}
		if (local5 != this.aBoolean487) {
			this.aBoolean487 = local5;
			this.aBoolean485 = true;
		}
		this.anInt6655 = local3;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
	public void method5656() {
		if (this.aClass85_4 != null) {
			this.aClass85_4 = null;
			this.aClass92_Sub4Array4 = null;
			this.aClass186_1 = null;
			this.aClass92_Sub4_7 = null;
			this.aBoolean486 = true;
			this.aBoolean485 = true;
			this.aBoolean488 = true;
			if (!this.aClass74_38.method1800()) {
				for (@Pc(33) Class7 local33 = this.aClass74_38.method1793(); local33 != this.aClass74_38.aClass7_72; local33 = local33.aClass7_247) {
					((Class7_Sub6) local33).method860();
				}
			}
		}
		this.anInt6651 = this.anInt6654 = -1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!pq;Z)V")
	private void method5657(@OriginalArg(0) Class7_Sub6 arg0) {
		arg0.method860();
		arg0.aBoolean82 = false;
		arg0.method5648();
		this.method5655();
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Lclient!pq;)V")
	public void method5658(@OriginalArg(0) Class7_Sub6 arg0) {
		this.method5657(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z")
	public boolean method5659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass85_4 == null || this.aClass74_38.method1800()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt6651 != arg2 || this.anInt6654 != arg3) {
			this.anInt6651 = arg2;
			this.anInt6654 = arg3;
			for (@Pc(30) Class7 local30 = this.aClass74_38.method1793(); local30 != this.aClass74_38.aClass7_72; local30 = local30.aClass7_247) {
				((Class7_Sub6) local30).method864(this.anInt6651, this.anInt6654);
			}
			this.aBoolean486 = true;
			this.aBoolean485 = true;
		}
		if (this.aBoolean485) {
			if (this.aClass186_1 != null) {
				this.aClass186_1.method4831();
				this.aClass186_1 = null;
			}
			if (this.aClass92_Sub4_7 != null) {
				this.aClass92_Sub4_7.method3519();
				this.aClass92_Sub4_7 = null;
			}
			if (this.aBoolean487) {
				this.aClass92_Sub4_7 = new Class92_Sub4(this.aClass89_Sub1_40, 34037, 6402, this.anInt6651, this.anInt6654);
			} else {
				this.aClass186_1 = new Class186(this.aClass89_Sub1_40, 6402, this.anInt6651, this.anInt6654);
			}
			this.aBoolean488 = true;
			this.aBoolean485 = false;
			local11 = true;
		}
		if (this.aBoolean486) {
			if (this.aClass92_Sub4Array4[0] != null) {
				this.aClass92_Sub4Array4[0].method3519();
				this.aClass92_Sub4Array4[0] = null;
			}
			if (this.aClass92_Sub4Array4[1] != null) {
				this.aClass92_Sub4Array4[1].method3519();
				this.aClass92_Sub4Array4[1] = null;
			}
			this.aClass92_Sub4Array4[0] = new Class92_Sub4(this.aClass89_Sub1_40, 34037, this.anInt6656, this.anInt6651, this.anInt6654);
			this.aClass92_Sub4Array4[1] = this.anInt6655 > 1 ? new Class92_Sub4(this.aClass89_Sub1_40, 34037, this.anInt6656, this.anInt6651, this.anInt6654) : null;
			this.aBoolean488 = true;
			this.aBoolean486 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass89_Sub1_40.method2452().method2391();
		this.aClass89_Sub1_40.method2468(this.aClass85_4);
		if (this.aBoolean488) {
			this.aClass85_4.method2072(0);
			this.aClass85_4.method2072(1);
			this.aClass85_4.method2072(8);
			if (this.aClass92_Sub4Array4[0] != null) {
				this.aClass85_4.method2074(0, this.aClass92_Sub4Array4[0]);
			}
			if (this.aClass92_Sub4Array4[1] != null) {
				this.aClass85_4.method2074(1, this.aClass92_Sub4Array4[1]);
			}
			if (this.aClass92_Sub4_7 != null) {
				this.aClass85_4.method2074(8, this.aClass92_Sub4_7);
			}
			if (this.aClass186_1 != null) {
				this.aClass85_4.method2068(this.aClass186_1);
			}
			this.aClass85_4.method2071(0);
			this.aBoolean488 = false;
			local11 = true;
		}
		if (!local11 || this.aClass85_4.method2069()) {
			this.anInt6652 = arg0;
			this.anInt6653 = arg1;
			this.aClass89_Sub1_40.method2416(-this.anInt6652, this.anInt6653 + this.anInt6654 - local194);
			return true;
		}
		this.aClass89_Sub1_40.method2447(this.aClass85_4);
		this.aBoolean486 = true;
		this.aBoolean485 = true;
		this.aBoolean488 = true;
		return false;
	}
}
