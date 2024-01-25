import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class40_Sub6 extends Class40 {

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
	public int anInt5080;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
	public int anInt5082;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
	public int anInt5083;

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
	public int anInt5084;

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
	public int anInt5085;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public int anInt5078 = 0;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!tn;")
	private Class240 aClass240_3 = new Class240();

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	private int anInt5079 = 0;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Lclient!mf;")
	public Class163 aClass163_33 = new Class163();

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
	private int anInt5081 = 0;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Lclient!ip;")
	public final Class121 aClass121_2 = new Class121();

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "[Lclient!du;")
	public Class40_Sub2_Sub1_Sub1[] aClass40_Sub2_Sub1_Sub1Array2 = new Class40_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
	public Class40_Sub6(@OriginalArg(0) int arg0) {
		Static364.aClass240_5.method5225(this);
		this.aLong176 = arg0;
		this.aLong175 = arg0;
		this.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()Lclient!ip;")
	public Class121 method4088() {
		return this.aClass121_2;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()V")
	public void method4090() {
		this.aBoolean346 = true;
		for (@Pc(8) Class10_Sub1_Sub10 local8 = (Class10_Sub1_Sub10) this.aClass163_33.method3620(); local8 != null; local8 = (Class10_Sub1_Sub10) this.aClass163_33.method3621()) {
			if (local8.aClass236_1.anInt6616 == 1) {
				local8.method5897();
			}
		}
		this.aClass40_Sub2_Sub1_Sub1Array2 = new Class40_Sub2_Sub1_Sub1[8192];
		this.anInt5078 = 0;
		this.aClass240_3 = new Class240();
		this.anInt5079 = 0;
		this.aClass163_33 = new Class163();
		this.anInt5081 = 0;
		this.method4364();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
	public void method4091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5085 = arg0;
		this.anInt5082 = arg1;
		this.anInt5080 = arg2;
		this.anInt5083 = arg3;
		this.anInt5084 = arg4;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method4092(@OriginalArg(0) Class50 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong176 == this.aLong175) {
			this.method4100();
		} else {
			this.method4097();
		}
		if (arg1 - this.aLong176 > 750L) {
			this.method4090();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong175);
		@Pc(36) Class40_Sub7 local36;
		if (this.aBoolean347) {
			for (local36 = (Class40_Sub7) this.aClass240_3.method5227(); local36 != null; local36 = (Class40_Sub7) this.aClass240_3.method5230()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass70_1.anInt2056; local39++) {
					local36.method4325(1, !this.aBoolean345, arg0, arg1);
				}
			}
			this.aBoolean347 = false;
		}
		for (local36 = (Class40_Sub7) this.aClass240_3.method5227(); local36 != null; local36 = (Class40_Sub7) this.aClass240_3.method5230()) {
			local36.method4325(local27, !this.aBoolean345, arg0, arg1);
		}
		this.aLong175 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()V")
	public void method4093() {
		this.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(J)V")
	public void method4094(@OriginalArg(0) long arg0) {
		this.aLong176 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!za;[Lclient!fi;Z)V")
	private void method4095(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class78[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static291.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class40_Sub7 local16 = (Class40_Sub7) this.aClass240_3.method5227(); local16 != null; local16 = (Class40_Sub7) this.aClass240_3.method5230()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass78_2 == arg1[local21] || local16.aClass78_2 == arg1[local21].aClass78_1) {
						Static291.aBooleanArray14[local21] = true;
						local16.method4324();
						local16.aBoolean358 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5419 == 0) {
				local16.method4364();
				this.anInt5079--;
			} else {
				local16.aBoolean358 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt5079 != 8; local21++) {
			if (!Static291.aBooleanArray14[local21]) {
				@Pc(101) Class40_Sub7 local101 = new Class40_Sub7(arg0, arg1[local21], this, this.aLong176);
				this.aClass240_3.method5225(local101);
				this.anInt5079++;
				Static291.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([Lclient!kh;Z)V")
	private void method4096(@OriginalArg(0) Class141[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static291.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class10_Sub1_Sub10 local16 = (Class10_Sub1_Sub10) this.aClass163_33.method3620(); local16 != null; local16 = (Class10_Sub1_Sub10) this.aClass163_33.method3621()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass141_2 == arg0[local21] || local16.aClass141_2 == arg0[local21].aClass141_1) {
						Static291.aBooleanArray13[local21] = true;
						local16.method3554();
						continue label68;
					}
				}
			}
			local16.method6033();
			this.anInt5081--;
			if (local16.method5894()) {
				local16.method5897();
				Static217.anInt4140--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt5081 != 8; local21++) {
			if (!Static291.aBooleanArray13[local21]) {
				@Pc(93) Class10_Sub1_Sub10 local93 = null;
				if (arg0[local21].method3256().anInt6616 == 1 && Static217.anInt4140 < 32) {
					local93 = new Class10_Sub1_Sub10(arg0[local21], this);
					Static265.aClass265_1.method5936((long) arg0[local21].anInt4096, local93);
					Static217.anInt4140++;
				}
				if (local93 == null) {
					local93 = new Class10_Sub1_Sub10(arg0[local21], this);
				}
				this.aClass163_33.method3613(local93);
				this.anInt5081++;
				Static291.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "()V")
	public void method4097() {
		this.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "()V")
	public void method4098() {
		this.aClass121_2.aClass197_1.method4419();
		for (@Pc(10) Class40_Sub7 local10 = (Class40_Sub7) this.aClass240_3.method5227(); local10 != null; local10 = (Class40_Sub7) this.aClass240_3.method5230()) {
			local10.method4322(this.aLong175);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!za;J[Lclient!fi;[Lclient!kh;Z)V")
	public void method4099(@OriginalArg(0) Class50 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class78[] arg2, @OriginalArg(3) Class141[] arg3) {
		if (!this.aBoolean346) {
			this.method4095(arg0, arg2);
			this.method4096(arg3);
			this.aLong176 = arg1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "()V")
	private void method4100() {
		this.aBoolean345 = false;
	}
}
