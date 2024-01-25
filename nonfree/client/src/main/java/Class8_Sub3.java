import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	public int anInt651 = 0;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Lclient!ht;")
	private Class112 aClass112_4 = new Class112();

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	private int anInt652 = 0;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Lclient!ar;")
	public Class14 aClass14_2 = new Class14();

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	private int anInt653 = 0;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Lclient!pn;")
	public final Class194 aClass194_1 = new Class194();

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "[Lclient!wq;")
	public Class8_Sub2_Sub1_Sub1[] aClass8_Sub2_Sub1_Sub1Array1 = new Class8_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I)V")
	public Class8_Sub3(@OriginalArg(0) int arg0) {
		Static28.aClass112_3.method2546(this);
		this.aLong33 = arg0;
		this.aLong34 = arg0;
		this.aBoolean36 = true;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ya;J[Lclient!qc;[Lclient!pd;Z)V")
	public void method556(@OriginalArg(0) Class49 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class200[] arg2, @OriginalArg(3) Class189[] arg3) {
		if (!this.aBoolean35) {
			this.method567(arg0, arg2);
			this.method568(arg3);
			this.aLong33 = arg1;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ya;J)Z")
	public boolean method557(@OriginalArg(0) Class49 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong33 == this.aLong34) {
			this.method563();
		} else {
			this.method565();
		}
		if (arg1 - this.aLong33 > 750L) {
			this.method564();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong34);
		@Pc(36) Class8_Sub6 local36;
		if (this.aBoolean36) {
			for (local36 = (Class8_Sub6) this.aClass112_4.method2553(); local36 != null; local36 = (Class8_Sub6) this.aClass112_4.method2550()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass102_1.anInt2971; local39++) {
					local36.method3880(arg0, !this.aBoolean34, 1, arg1);
				}
			}
			this.aBoolean36 = false;
		}
		for (local36 = (Class8_Sub6) this.aClass112_4.method2553(); local36 != null; local36 = (Class8_Sub6) this.aClass112_4.method2550()) {
			local36.method3880(arg0, !this.aBoolean34, local27, arg1);
		}
		this.aLong34 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIII)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt657 = arg0;
		this.anInt654 = arg1;
		this.anInt656 = arg2;
		this.anInt658 = arg3;
		this.anInt655 = arg4;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "()V")
	public void method560() {
		this.aBoolean36 = true;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "()Lclient!pn;")
	public Class194 method561() {
		return this.aClass194_1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(J)V")
	public void method562(@OriginalArg(0) long arg0) {
		this.aLong33 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "()V")
	private void method563() {
		this.aBoolean34 = false;
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "()V")
	public void method564() {
		this.aBoolean35 = true;
		for (@Pc(8) Class2_Sub5_Sub18 local8 = (Class2_Sub5_Sub18) this.aClass14_2.method309(); local8 != null; local8 = (Class2_Sub5_Sub18) this.aClass14_2.method311()) {
			if (local8.aClass267_1.anInt7254 == 1) {
				local8.method5534();
			}
		}
		this.aClass8_Sub2_Sub1_Sub1Array1 = new Class8_Sub2_Sub1_Sub1[8192];
		this.anInt651 = 0;
		this.aClass112_4 = new Class112();
		this.anInt652 = 0;
		this.aClass14_2 = new Class14();
		this.anInt653 = 0;
		this.method5780();
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "()V")
	public void method565() {
		this.aBoolean34 = true;
	}

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "()V")
	public void method566() {
		this.aClass194_1.aClass191_1.method4331();
		for (@Pc(10) Class8_Sub6 local10 = (Class8_Sub6) this.aClass112_4.method2553(); local10 != null; local10 = (Class8_Sub6) this.aClass112_4.method2550()) {
			local10.method3881(this.aLong34);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ya;[Lclient!qc;Z)V")
	private void method567(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class200[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static32.aBooleanArray5[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class8_Sub6 local16 = (Class8_Sub6) this.aClass112_4.method2553(); local16 != null; local16 = (Class8_Sub6) this.aClass112_4.method2550()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass200_1 == arg1[local21] || local16.aClass200_1 == arg1[local21].aClass200_2) {
						Static32.aBooleanArray5[local21] = true;
						local16.method3879();
						local16.aBoolean346 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4815 == 0) {
				local16.method5780();
				this.anInt652--;
			} else {
				local16.aBoolean346 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt652 != 8; local21++) {
			if (!Static32.aBooleanArray5[local21]) {
				@Pc(101) Class8_Sub6 local101 = new Class8_Sub6(arg0, arg1[local21], this, this.aLong33);
				this.aClass112_4.method2546(local101);
				this.anInt652++;
				Static32.aBooleanArray5[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "([Lclient!pd;Z)V")
	private void method568(@OriginalArg(0) Class189[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static32.aBooleanArray4[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub5_Sub18 local16 = (Class2_Sub5_Sub18) this.aClass14_2.method309(); local16 != null; local16 = (Class2_Sub5_Sub18) this.aClass14_2.method311()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass189_2 == arg0[local21] || local16.aClass189_2 == arg0[local21].aClass189_1) {
						Static32.aBooleanArray4[local21] = true;
						local16.method5539();
						continue label68;
					}
				}
			}
			local16.method5866();
			this.anInt653--;
			if (local16.method5535()) {
				local16.method5534();
				Static349.anInt5938--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt653 != 8; local21++) {
			if (!Static32.aBooleanArray4[local21]) {
				@Pc(93) Class2_Sub5_Sub18 local93 = null;
				if (arg0[local21].method4279().anInt7254 == 1 && Static349.anInt5938 < 32) {
					local93 = new Class2_Sub5_Sub18(arg0[local21], this);
					Static291.aClass98_1.method2245((long) arg0[local21].anInt5343, local93);
					Static349.anInt5938++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub5_Sub18(arg0[local21], this);
				}
				this.aClass14_2.method300(local93);
				this.anInt653++;
				Static32.aBooleanArray4[local21] = true;
			}
		}
	}
}
