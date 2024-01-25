import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class111_Sub4 extends Class111 {

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public int anInt4311;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt4313;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
	public int anInt4308 = 0;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Lclient!dv;")
	private Class63 aClass63_4 = new Class63();

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	private int anInt4309 = 0;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!am;")
	public Class14 aClass14_25 = new Class14();

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	private int anInt4315 = 0;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Z")
	private boolean aBoolean400 = false;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Lclient!sj;")
	public final Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[Lclient!uh;")
	public Class111_Sub1_Sub2_Sub1[] aClass111_Sub1_Sub2_Sub1Array2 = new Class111_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
	public Class111_Sub4(@OriginalArg(0) int arg0) {
		Static242.aClass63_5.method1024(this);
		this.aLong146 = arg0;
		this.aLong147 = arg0;
		this.aBoolean400 = true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method3411(@OriginalArg(0) Class117 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong146 == this.aLong147) {
			this.method3412();
		} else {
			this.method3423();
		}
		if (arg1 - this.aLong146 > 750L) {
			this.method3413();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong147);
		@Pc(36) Class111_Sub7 local36;
		if (this.aBoolean400) {
			for (local36 = (Class111_Sub7) this.aClass63_4.method1019(); local36 != null; local36 = (Class111_Sub7) this.aClass63_4.method1022()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass250_1.anInt6602; local39++) {
					local36.method5171(arg1, 1, arg0, !this.aBoolean399);
				}
			}
			this.aBoolean400 = false;
		}
		for (local36 = (Class111_Sub7) this.aClass63_4.method1019(); local36 != null; local36 = (Class111_Sub7) this.aClass63_4.method1022()) {
			local36.method5171(arg1, local27, arg0, !this.aBoolean399);
		}
		this.aLong147 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	private void method3412() {
		this.aBoolean399 = false;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	public void method3413() {
		this.aBoolean398 = true;
		for (@Pc(8) Class1_Sub3_Sub2 local8 = (Class1_Sub3_Sub2) this.aClass14_25.method203(); local8 != null; local8 = (Class1_Sub3_Sub2) this.aClass14_25.method208()) {
			if (local8.aClass140_1.anInt3962 == 1) {
				local8.method5941();
			}
		}
		this.aClass111_Sub1_Sub2_Sub1Array2 = new Class111_Sub1_Sub2_Sub1[8192];
		this.anInt4308 = 0;
		this.aClass63_4 = new Class63();
		this.anInt4309 = 0;
		this.aClass14_25 = new Class14();
		this.anInt4315 = 0;
		this.method5886();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!za;J[Lclient!ck;[Lclient!sd;Z)V")
	public void method3414(@OriginalArg(0) Class117 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class40[] arg2, @OriginalArg(3) Class230[] arg3) {
		if (!this.aBoolean398) {
			this.method3421(arg0, arg2);
			this.method3417(arg3);
			this.aLong146 = arg1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "()V")
	public void method3416() {
		this.aClass232_1.aClass15_1.method219();
		for (@Pc(10) Class111_Sub7 local10 = (Class111_Sub7) this.aClass63_4.method1019(); local10 != null; local10 = (Class111_Sub7) this.aClass63_4.method1022()) {
			local10.method5173(this.aLong147);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!sd;Z)V")
	private void method3417(@OriginalArg(0) Class230[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static239.aBooleanArray90[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub3_Sub2 local16 = (Class1_Sub3_Sub2) this.aClass14_25.method203(); local16 != null; local16 = (Class1_Sub3_Sub2) this.aClass14_25.method208()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass230_1 == arg0[local21] || local16.aClass230_1 == arg0[local21].aClass230_2) {
						Static239.aBooleanArray90[local21] = true;
						local16.method683();
						continue label68;
					}
				}
			}
			local16.method5953();
			this.anInt4315--;
			if (local16.method5938()) {
				local16.method5941();
				Static32.anInt498--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4315 != 8; local21++) {
			if (!Static239.aBooleanArray90[local21]) {
				@Pc(93) Class1_Sub3_Sub2 local93 = null;
				if (arg0[local21].method4832().anInt3962 == 1 && Static32.anInt498 < 32) {
					local93 = new Class1_Sub3_Sub2(arg0[local21], this);
					Static82.aClass28_1.method422(local93, (long) arg0[local21].anInt6003);
					Static32.anInt498++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub3_Sub2(arg0[local21], this);
				}
				this.aClass14_25.method205(local93);
				this.anInt4315++;
				Static239.aBooleanArray90[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "()V")
	public void method3418() {
		this.aBoolean400 = true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public void method3419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4311 = arg0;
		this.anInt4312 = arg1;
		this.anInt4310 = arg2;
		this.anInt4314 = arg3;
		this.anInt4313 = arg4;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(J)V")
	public void method3420(@OriginalArg(0) long arg0) {
		this.aLong146 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!za;[Lclient!ck;Z)V")
	private void method3421(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class40[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static239.aBooleanArray91[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class111_Sub7 local16 = (Class111_Sub7) this.aClass63_4.method1019(); local16 != null; local16 = (Class111_Sub7) this.aClass63_4.method1022()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass40_2 == arg1[local21] || local16.aClass40_2 == arg1[local21].aClass40_1) {
						Static239.aBooleanArray91[local21] = true;
						local16.method5174();
						local16.aBoolean562 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6424 == 0) {
				local16.method5886();
				this.anInt4309--;
			} else {
				local16.aBoolean562 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4309 != 8; local21++) {
			if (!Static239.aBooleanArray91[local21]) {
				@Pc(101) Class111_Sub7 local101 = new Class111_Sub7(arg0, arg1[local21], this, this.aLong146);
				this.aClass63_4.method1024(local101);
				this.anInt4309++;
				Static239.aBooleanArray91[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "()Lclient!sj;")
	public Class232 method3422() {
		return this.aClass232_1;
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "()V")
	public void method3423() {
		this.aBoolean399 = true;
	}
}
