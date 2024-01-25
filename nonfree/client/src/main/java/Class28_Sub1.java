import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	public int anInt559 = 0;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "Lclient!gn;")
	private Class97 aClass97_2 = new Class97();

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
	private int anInt560 = 0;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "Lclient!nj;")
	public Class181 aClass181_2 = new Class181();

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private int anInt561 = 0;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "Lclient!dm;")
	public final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "[Lclient!mk;")
	public Class28_Sub2_Sub1_Sub1[] aClass28_Sub2_Sub1_Sub1Array1 = new Class28_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class28_Sub1(@OriginalArg(0) int arg0) {
		Static315.aClass97_4.method2154(this);
		this.aLong42 = arg0;
		this.aLong43 = arg0;
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
	public void method528() {
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([Lclient!vc;Z)V")
	private void method529(@OriginalArg(0) Class254[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static33.aBooleanArray1[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub1_Sub8 local16 = (Class2_Sub1_Sub8) this.aClass181_2.method3972(); local16 != null; local16 = (Class2_Sub1_Sub8) this.aClass181_2.method3975()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass254_1 == arg0[local21] || local16.aClass254_1 == arg0[local21].aClass254_2) {
						Static33.aBooleanArray1[local21] = true;
						local16.method3023();
						continue label68;
					}
				}
			}
			local16.method6260();
			this.anInt561--;
			if (local16.method5840()) {
				local16.method5838();
				Static459.anInt7729--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt561 != 8; local21++) {
			if (!Static33.aBooleanArray1[local21]) {
				@Pc(93) Class2_Sub1_Sub8 local93 = null;
				if (arg0[local21].method5790().anInt37 == 1 && Static459.anInt7729 < 32) {
					local93 = new Class2_Sub1_Sub8(arg0[local21], this);
					Static284.aClass52_1.method1094((long) arg0[local21].anInt7216, local93);
					Static459.anInt7729++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub1_Sub8(arg0[local21], this);
				}
				this.aClass181_2.method3973(local93);
				this.anInt561++;
				Static33.aBooleanArray1[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method530(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong42 == this.aLong43) {
			this.method535();
		} else {
			this.method538();
		}
		if (arg1 - this.aLong42 > 750L) {
			this.method540();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong43);
		@Pc(36) Class28_Sub6 local36;
		if (this.aBoolean25) {
			for (local36 = (Class28_Sub6) this.aClass97_2.method2145(); local36 != null; local36 = (Class28_Sub6) this.aClass97_2.method2148()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass153_1.anInt3750; local39++) {
					local36.method4506(arg1, arg0, 1, !this.aBoolean23);
				}
			}
			this.aBoolean25 = false;
		}
		for (local36 = (Class28_Sub6) this.aClass97_2.method2145(); local36 != null; local36 = (Class28_Sub6) this.aClass97_2.method2148()) {
			local36.method4506(arg1, arg0, local27, !this.aBoolean23);
		}
		this.aLong43 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt566 = arg0;
		this.anInt565 = arg1;
		this.anInt564 = arg2;
		this.anInt563 = arg3;
		this.anInt562 = arg4;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!za;[Lclient!ol;Z)V")
	private void method532(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class191[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static33.aBooleanArray2[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class28_Sub6 local16 = (Class28_Sub6) this.aClass97_2.method2145(); local16 != null; local16 = (Class28_Sub6) this.aClass97_2.method2148()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass191_2 == arg1[local21] || local16.aClass191_2 == arg1[local21].aClass191_1) {
						Static33.aBooleanArray2[local21] = true;
						local16.method4502();
						local16.aBoolean400 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5687 == 0) {
				local16.method5916();
				this.anInt560--;
			} else {
				local16.aBoolean400 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt560 != 8; local21++) {
			if (!Static33.aBooleanArray2[local21]) {
				@Pc(101) Class28_Sub6 local101 = new Class28_Sub6(arg0, arg1[local21], this, this.aLong42);
				this.aClass97_2.method2154(local101);
				this.anInt560++;
				Static33.aBooleanArray2[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!za;J[Lclient!ol;[Lclient!vc;Z)V")
	public void method534(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class191[] arg2, @OriginalArg(3) Class254[] arg3) {
		if (!this.aBoolean24) {
			this.method532(arg0, arg2);
			this.method529(arg3);
			this.aLong42 = arg1;
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "()V")
	private void method535() {
		this.aBoolean23 = false;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "()Lclient!dm;")
	public Class56 method536() {
		return this.aClass56_1;
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "()V")
	public void method537() {
		this.aClass56_1.aClass96_1.method2139();
		for (@Pc(10) Class28_Sub6 local10 = (Class28_Sub6) this.aClass97_2.method2145(); local10 != null; local10 = (Class28_Sub6) this.aClass97_2.method2148()) {
			local10.method4503(this.aLong43);
		}
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "()V")
	public void method538() {
		this.aBoolean23 = true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(J)V")
	public void method539(@OriginalArg(0) long arg0) {
		this.aLong42 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "()V")
	public void method540() {
		this.aBoolean24 = true;
		for (@Pc(8) Class2_Sub1_Sub8 local8 = (Class2_Sub1_Sub8) this.aClass181_2.method3972(); local8 != null; local8 = (Class2_Sub1_Sub8) this.aClass181_2.method3975()) {
			if (local8.aClass3_1.anInt37 == 1) {
				local8.method5838();
			}
		}
		this.aClass28_Sub2_Sub1_Sub1Array1 = new Class28_Sub2_Sub1_Sub1[8192];
		this.anInt559 = 0;
		this.aClass97_2 = new Class97();
		this.anInt560 = 0;
		this.aClass181_2 = new Class181();
		this.anInt561 = 0;
		this.method5916();
	}
}
