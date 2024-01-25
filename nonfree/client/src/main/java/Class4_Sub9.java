import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "J")
	private long aLong271;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "J")
	private long aLong272;

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	public int anInt9449;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Z")
	public boolean aBoolean654 = false;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public int anInt9447 = 0;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Lclient!wc;")
	private Class387 aClass387_6 = new Class387();

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	private int anInt9448 = 0;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!at;")
	public Class20 aClass20_60 = new Class20();

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Z")
	private boolean aBoolean656 = false;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
	public boolean aBoolean657 = false;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
	private int anInt9450 = 0;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "Lclient!sn;")
	public final Class336 aClass336_1 = new Class336();

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[Lclient!qc;")
	public final Class4_Sub4_Sub1_Sub1[] aClass4_Sub4_Sub1_Sub1Array2 = new Class4_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IZ)V")
	public Class4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method8054(arg0, arg1);
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "()V")
	public void method8044() {
		this.aBoolean655 = true;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
	public void method8045() {
		this.aBoolean656 = true;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "()Lclient!sn;")
	public Class336 method8046() {
		return this.aClass336_1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([Lclient!ok;Z)V")
	private void method8048(@OriginalArg(0) Class270[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static585.aBooleanArray25[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class5_Sub1_Sub7 local16 = (Class5_Sub1_Sub7) this.aClass20_60.method378(); local16 != null; local16 = (Class5_Sub1_Sub7) this.aClass20_60.method366()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass270_1 == arg0[local21] || local16.aClass270_1 == arg0[local21].aClass270_2) {
						Static585.aBooleanArray25[local21] = true;
						local16.method3435();
						continue label71;
					}
				}
			}
			local16.method9222();
			this.anInt9450--;
			if (local16.method8954()) {
				local16.method8955();
				Static681.anInt10914--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt9450 != 8; local21++) {
			if (!Static585.aBooleanArray25[local21]) {
				@Pc(96) Class5_Sub1_Sub7 local96 = null;
				if (arg0[local21].method6191().anInt7211 == 1 && Static681.anInt10914 < 32) {
					local96 = new Class5_Sub1_Sub7(arg0[local21], this);
					Static7.aClass296_1.method6678(local96, (long) arg0[local21].anInt7121);
					Static681.anInt10914++;
				}
				if (local96 == null) {
					local96 = new Class5_Sub1_Sub7(arg0[local21], this);
				}
				this.aClass20_60.method370(local96);
				this.anInt9450++;
				Static585.aBooleanArray25[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ha;J[Lclient!ui;[Lclient!ok;Z)V")
	public void method8049(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class363[] arg2, @OriginalArg(3) Class270[] arg3) {
		if (!this.aBoolean654) {
			this.method8053(arg0, arg2);
			this.method8048(arg3);
			this.aLong271 = arg1;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method8050(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong271 == this.aLong272) {
			this.method8056();
		} else {
			this.method8044();
		}
		if (arg1 - this.aLong271 > 750L) {
			this.method8059();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong272);
		@Pc(36) Class4_Sub2 local36;
		if (this.aBoolean656) {
			for (local36 = (Class4_Sub2) this.aClass387_6.method9018(); local36 != null; local36 = (Class4_Sub2) this.aClass387_6.method9016()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass254_1.anInt6709; local39++) {
					local36.method934(!this.aBoolean655, arg1, 1, arg0);
				}
			}
			this.aBoolean656 = false;
		}
		for (local36 = (Class4_Sub2) this.aClass387_6.method9018(); local36 != null; local36 = (Class4_Sub2) this.aClass387_6.method9016()) {
			local36.method934(!this.aBoolean655, arg1, local27, arg0);
		}
		this.aLong272 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(J)V")
	public void method8051(@OriginalArg(0) long arg0) {
		this.aLong271 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ha;)V")
	public void method8052(@OriginalArg(0) Class100 arg0) {
		this.aClass336_1.aClass179_1.method4234();
		for (@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) this.aClass387_6.method9018(); local10 != null; local10 = (Class4_Sub2) this.aClass387_6.method9016()) {
			local10.method937(this.aLong272, arg0);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ha;[Lclient!ui;Z)V")
	private void method8053(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class363[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static585.aBooleanArray26[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class4_Sub2 local16 = (Class4_Sub2) this.aClass387_6.method9018(); local16 != null; local16 = (Class4_Sub2) this.aClass387_6.method9016()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass363_1 == arg1[local21] || local16.aClass363_1 == arg1[local21].aClass363_2) {
						Static585.aBooleanArray26[local21] = true;
						local16.method935();
						local16.aBoolean74 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt917 == 0) {
				local16.method8570();
				this.anInt9448--;
			} else {
				local16.aBoolean74 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt9448 != 32; local21++) {
			if (!Static585.aBooleanArray26[local21]) {
				@Pc(104) Class4_Sub2 local104 = new Class4_Sub2(arg0, arg1[local21], this, this.aLong271);
				this.aClass387_6.method9017(local104);
				this.anInt9448++;
				Static585.aBooleanArray26[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
	public void method8054(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static618.aClass387_9.method9017(this);
		this.aLong271 = (long) arg0;
		this.aLong272 = (long) arg0;
		this.aBoolean656 = true;
		this.aBoolean657 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "()Lclient!sn;")
	public Class336 method8055() {
		this.aClass336_1.aClass179_1.method4234();
		for (@Pc(6) int local6 = 0; local6 < this.aClass4_Sub4_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass4_Sub4_Sub1_Sub1Array2[local6] != null && this.aClass4_Sub4_Sub1_Sub1Array2[local6].aClass4_Sub2_1 != null) {
				this.aClass336_1.aClass179_1.method4236(this.aClass4_Sub4_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass336_1;
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "()V")
	private void method8056() {
		this.aBoolean655 = false;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
	public void method8057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9449 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
	public void method8059() {
		this.aBoolean654 = true;
		for (@Pc(8) Class5_Sub1_Sub7 local8 = (Class5_Sub1_Sub7) this.aClass20_60.method378(); local8 != null; local8 = (Class5_Sub1_Sub7) this.aClass20_60.method366()) {
			if (local8.aClass274_1.anInt7211 == 1) {
				local8.method8955();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass4_Sub4_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass4_Sub4_Sub1_Sub1Array2[local27] != null) {
				this.aClass4_Sub4_Sub1_Sub1Array2[local27].method6724();
				this.aClass4_Sub4_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt9447 = 0;
		this.aClass387_6 = new Class387();
		this.anInt9448 = 0;
		this.aClass20_60 = new Class20();
		this.anInt9450 = 0;
		this.method8570();
		Static68.aClass4_Sub9Array3[Static555.anInt8749] = this;
		Static555.anInt8749 = Static555.anInt8749 + 1 & Static445.anIntArray379[Static378.anInt6342];
	}
}
