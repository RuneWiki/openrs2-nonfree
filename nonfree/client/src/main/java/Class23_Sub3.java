import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public int anInt3461;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	public int anInt3462;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
	public int anInt3463;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
	public int anInt3464;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
	public int anInt3465;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public int anInt3459 = 0;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!pw;")
	private Class194 aClass194_5 = new Class194();

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
	private int anInt3460 = 0;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!ps;")
	public Class193 aClass193_28 = new Class193();

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	private int anInt3466 = 0;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "Lclient!fq;")
	public final Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[Lclient!mr;")
	public Class23_Sub1_Sub2_Sub1[] aClass23_Sub1_Sub2_Sub1Array1 = new Class23_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "J")
	private long aLong121;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class23_Sub3(@OriginalArg(0) int arg0) {
		Static77.aClass194_2.method4582(this);
		this.aLong121 = arg0;
		this.aLong120 = arg0;
		this.aBoolean266 = true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method2965(@OriginalArg(0) Class167 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong121 == this.aLong120) {
			this.method2977();
		} else {
			this.method2967();
		}
		if (arg1 - this.aLong121 > 750L) {
			this.method2966();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong120);
		@Pc(36) Class23_Sub8 local36;
		if (this.aBoolean266) {
			for (local36 = (Class23_Sub8) this.aClass194_5.method4577(); local36 != null; local36 = (Class23_Sub8) this.aClass194_5.method4580()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass248_1.anInt7090; local39++) {
					local36.method5857(1, !this.aBoolean264, arg0, arg1);
				}
			}
			this.aBoolean266 = false;
		}
		for (local36 = (Class23_Sub8) this.aClass194_5.method4577(); local36 != null; local36 = (Class23_Sub8) this.aClass194_5.method4580()) {
			local36.method5857(local27, !this.aBoolean264, arg0, arg1);
		}
		this.aLong120 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	public void method2966() {
		this.aBoolean265 = true;
		for (@Pc(8) Class3_Sub3_Sub7 local8 = (Class3_Sub3_Sub7) this.aClass193_28.method4519(); local8 != null; local8 = (Class3_Sub3_Sub7) this.aClass193_28.method4525()) {
			if (local8.aClass69_1.anInt1949 == 1) {
				local8.method6102();
			}
		}
		this.aClass23_Sub1_Sub2_Sub1Array1 = new Class23_Sub1_Sub2_Sub1[8192];
		this.anInt3459 = 0;
		this.aClass194_5 = new Class194();
		this.anInt3460 = 0;
		this.aClass193_28 = new Class193();
		this.anInt3466 = 0;
		this.method5853();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
	public void method2967() {
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()V")
	public void method2968() {
		this.aClass77_1.aClass222_1.method5213();
		for (@Pc(10) Class23_Sub8 local10 = (Class23_Sub8) this.aClass194_5.method4577(); local10 != null; local10 = (Class23_Sub8) this.aClass194_5.method4580()) {
			local10.method5855(this.aLong120);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([Lclient!hd;Z)V")
	private void method2969(@OriginalArg(0) Class95[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static190.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class3_Sub3_Sub7 local16 = (Class3_Sub3_Sub7) this.aClass193_28.method4519(); local16 != null; local16 = (Class3_Sub3_Sub7) this.aClass193_28.method4525()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass95_1 == arg0[local21] || local16.aClass95_1 == arg0[local21].aClass95_2) {
						Static190.aBooleanArray13[local21] = true;
						local16.method1703();
						continue label68;
					}
				}
			}
			local16.method6288();
			this.anInt3466--;
			if (local16.method6104()) {
				local16.method6102();
				Static80.anInt1439--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3466 != 8; local21++) {
			if (!Static190.aBooleanArray13[local21]) {
				@Pc(93) Class3_Sub3_Sub7 local93 = null;
				if (arg0[local21].method2295().anInt1949 == 1 && Static80.anInt1439 < 32) {
					local93 = new Class3_Sub3_Sub7(arg0[local21], this);
					Static358.aClass243_1.method5561(local93, (long) arg0[local21].anInt2682);
					Static80.anInt1439++;
				}
				if (local93 == null) {
					local93 = new Class3_Sub3_Sub7(arg0[local21], this);
				}
				this.aClass193_28.method4527(local93);
				this.anInt3466++;
				Static190.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "()V")
	public void method2970() {
		this.aBoolean266 = true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
	public void method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3462 = arg0;
		this.anInt3465 = arg1;
		this.anInt3461 = arg2;
		this.anInt3464 = arg3;
		this.anInt3463 = arg4;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!qa;J[Lclient!lq;[Lclient!hd;Z)V")
	public void method2972(@OriginalArg(0) Class167 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class141[] arg2, @OriginalArg(3) Class95[] arg3) {
		if (!this.aBoolean265) {
			this.method2973(arg0, arg2);
			this.method2969(arg3);
			this.aLong121 = arg1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!qa;[Lclient!lq;Z)V")
	private void method2973(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class141[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static190.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class23_Sub8 local16 = (Class23_Sub8) this.aClass194_5.method4577(); local16 != null; local16 = (Class23_Sub8) this.aClass194_5.method4580()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass141_2 == arg1[local21] || local16.aClass141_2 == arg1[local21].aClass141_1) {
						Static190.aBooleanArray14[local21] = true;
						local16.method5856();
						local16.aBoolean489 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt7221 == 0) {
				local16.method5853();
				this.anInt3460--;
			} else {
				local16.aBoolean489 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3460 != 8; local21++) {
			if (!Static190.aBooleanArray14[local21]) {
				@Pc(101) Class23_Sub8 local101 = new Class23_Sub8(arg0, arg1[local21], this, this.aLong121);
				this.aClass194_5.method4582(local101);
				this.anInt3460++;
				Static190.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "()Lclient!fq;")
	public Class77 method2974() {
		return this.aClass77_1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(J)V")
	public void method2975(@OriginalArg(0) long arg0) {
		this.aLong121 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "()V")
	private void method2977() {
		this.aBoolean264 = false;
	}
}
