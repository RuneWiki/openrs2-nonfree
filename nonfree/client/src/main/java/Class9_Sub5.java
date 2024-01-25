import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "J")
	private long aLong223;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	public int anInt6434;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public int anInt6431 = 0;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "Z")
	public boolean aBoolean434 = false;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "Lclient!qw;")
	private Class319 aClass319_8 = new Class319();

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	private int anInt6432 = 0;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!sja;")
	public Class342 aClass342_50 = new Class342();

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	private int anInt6433 = 0;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!so;")
	public final Class346 aClass346_1 = new Class346();

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "[Lclient!cga;")
	public final Class9_Sub2_Sub1_Sub1[] aClass9_Sub2_Sub1_Sub1Array1 = new Class9_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IZ)V")
	public Class9_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5582(arg0, arg1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V")
	public void method5570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6434 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "()V")
	public void method5572() {
		this.aBoolean434 = true;
		for (@Pc(8) Class3_Sub7_Sub15 local8 = (Class3_Sub7_Sub15) this.aClass342_50.method7644(); local8 != null; local8 = (Class3_Sub7_Sub15) this.aClass342_50.method7650()) {
			if (local8.aClass100_1.anInt2719 == 1) {
				local8.method9251();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass9_Sub2_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass9_Sub2_Sub1_Sub1Array1[local27] != null) {
				this.aClass9_Sub2_Sub1_Sub1Array1[local27].method1664();
				this.aClass9_Sub2_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt6431 = 0;
		this.aClass319_8 = new Class319();
		this.anInt6432 = 0;
		this.aClass342_50 = new Class342();
		this.anInt6433 = 0;
		this.method9182();
		Static374.aClass9_Sub5Array1[Static647.anInt9986] = this;
		Static647.anInt9986 = Static647.anInt9986 + 1 & Static280.anIntArray333[Static233.anInt3759];
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5573(@OriginalArg(0) Class22 arg0) {
		this.aClass346_1.aClass357_1.method8207();
		for (@Pc(10) Class9_Sub3 local10 = (Class9_Sub3) this.aClass319_8.method7195(); local10 != null; local10 = (Class9_Sub3) this.aClass319_8.method7188()) {
			local10.method4577(this.aLong224, arg0);
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()Lclient!so;")
	public Class346 method5574() {
		this.aClass346_1.aClass357_1.method8207();
		for (@Pc(6) int local6 = 0; local6 < this.aClass9_Sub2_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass9_Sub2_Sub1_Sub1Array1[local6] != null && this.aClass9_Sub2_Sub1_Sub1Array1[local6].aClass9_Sub3_1 != null) {
				this.aClass346_1.aClass357_1.method8203(this.aClass9_Sub2_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass346_1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()V")
	private void method5575() {
		this.aBoolean435 = false;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(J)V")
	public void method5576(@OriginalArg(0) long arg0) {
		this.aLong223 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5578(@OriginalArg(0) Class22 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong223 == this.aLong224) {
			this.method5575();
		} else {
			this.method5583();
		}
		if (arg1 - this.aLong223 > 750L) {
			this.method5572();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong224);
		@Pc(36) Class9_Sub3 local36;
		if (this.aBoolean436) {
			for (local36 = (Class9_Sub3) this.aClass319_8.method7195(); local36 != null; local36 = (Class9_Sub3) this.aClass319_8.method7188()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass201_1.anInt5212; local39++) {
					local36.method4580(!this.aBoolean435, arg0, arg1, 1);
				}
			}
			this.aBoolean436 = false;
		}
		for (local36 = (Class9_Sub3) this.aClass319_8.method7195(); local36 != null; local36 = (Class9_Sub3) this.aClass319_8.method7188()) {
			local36.method4580(!this.aBoolean435, arg0, arg1, local27);
		}
		this.aLong224 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lclient!lk;Z)V")
	private void method5579(@OriginalArg(0) Class232[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static421.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub7_Sub15 local16 = (Class3_Sub7_Sub15) this.aClass342_50.method7644(); local16 != null; local16 = (Class3_Sub7_Sub15) this.aClass342_50.method7650()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass232_2 == arg0[local21] || local16.aClass232_2 == arg0[local21].aClass232_1) {
						Static421.aBooleanArray14[local21] = true;
						local16.method5313();
						continue label71;
					}
				}
			}
			local16.method9596();
			this.anInt6433--;
			if (local16.method9249()) {
				local16.method9251();
				Static5.anInt221--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6433 != 8; local21++) {
			if (!Static421.aBooleanArray14[local21]) {
				@Pc(96) Class3_Sub7_Sub15 local96 = null;
				if (arg0[local21].method5129().anInt2719 == 1 && Static5.anInt221 < 32) {
					local96 = new Class3_Sub7_Sub15(arg0[local21], this);
					Static215.aClass48_1.method1406(local96, (long) arg0[local21].anInt5882);
					Static5.anInt221++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub7_Sub15(arg0[local21], this);
				}
				this.aClass342_50.method7654(local96);
				this.anInt6433++;
				Static421.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "()Lclient!so;")
	public Class346 method5580() {
		return this.aClass346_1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ha;[Lclient!ip;Z)V")
	private void method5581(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class184[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static421.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class9_Sub3 local16 = (Class9_Sub3) this.aClass319_8.method7195(); local16 != null; local16 = (Class9_Sub3) this.aClass319_8.method7188()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass184_2 == arg1[local21] || local16.aClass184_2 == arg1[local21].aClass184_1) {
						Static421.aBooleanArray13[local21] = true;
						local16.method4581();
						local16.aBoolean324 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt4985 == 0) {
				local16.method9182();
				this.anInt6432--;
			} else {
				local16.aBoolean324 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6432 != 32; local21++) {
			if (!Static421.aBooleanArray13[local21]) {
				@Pc(104) Class9_Sub3 local104 = new Class9_Sub3(arg0, arg1[local21], this, this.aLong223);
				this.aClass319_8.method7196(local104);
				this.anInt6432++;
				Static421.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(IZ)V")
	public void method5582(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static228.aClass319_15.method7196(this);
		this.aLong223 = (long) arg0;
		this.aLong224 = (long) arg0;
		this.aBoolean436 = true;
		this.aBoolean437 = arg1;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "()V")
	public void method5583() {
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "()V")
	public void method5584() {
		this.aBoolean436 = true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ha;J[Lclient!ip;[Lclient!lk;Z)V")
	public void method5585(@OriginalArg(0) Class22 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class184[] arg2, @OriginalArg(3) Class232[] arg3) {
		if (!this.aBoolean434) {
			this.method5581(arg0, arg2);
			this.method5579(arg3);
			this.aLong223 = arg1;
		}
	}
}
