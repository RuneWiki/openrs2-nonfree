import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!eea", name = "r", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
	public int anInt2486 = 0;

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "Lclient!cp;")
	private Class60 aClass60_3 = new Class60();

	@OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
	private int anInt2487 = 0;

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "Lclient!ow;")
	public Class271 aClass271_9 = new Class271();

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
	private int anInt2488 = 0;

	@OriginalMember(owner = "client!eea", name = "z", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "Lclient!gka;")
	public final Class127 aClass127_1 = new Class127();

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "[Lclient!vda;")
	public final Class15_Sub2_Sub1_Sub1[] aClass15_Sub2_Sub1_Sub1Array1 = new Class15_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IZ)V")
	public Class15_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2308(arg0, arg1);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "()V")
	private void method2295() {
		this.aBoolean184 = false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ha;[Lclient!pi;Z)V")
	private void method2296(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class283[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static128.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class15_Sub7 local16 = (Class15_Sub7) this.aClass60_3.method1547(); local16 != null; local16 = (Class15_Sub7) this.aClass60_3.method1546()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass283_2 == arg1[local21] || local16.aClass283_2 == arg1[local21].aClass283_1) {
						Static128.aBooleanArray12[local21] = true;
						local16.method8570();
						local16.aBoolean719 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt9777 == 0) {
				local16.method9741();
				this.anInt2487--;
			} else {
				local16.aBoolean719 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt2487 != 32; local21++) {
			if (!Static128.aBooleanArray12[local21]) {
				@Pc(104) Class15_Sub7 local104 = new Class15_Sub7(arg0, arg1[local21], this, this.aLong70);
				this.aClass60_3.method1551(local104);
				this.anInt2487++;
				Static128.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(J)V")
	public void method2297(@OriginalArg(0) long arg0) {
		this.aLong70 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "()V")
	public void method2298() {
		this.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "()V")
	public void method2299() {
		this.aBoolean183 = true;
		for (@Pc(8) Class2_Sub1_Sub4 local8 = (Class2_Sub1_Sub4) this.aClass271_9.method7177(); local8 != null; local8 = (Class2_Sub1_Sub4) this.aClass271_9.method7175()) {
			if (local8.aClass172_1.anInt5065 == 1) {
				local8.method9377();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass15_Sub2_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass15_Sub2_Sub1_Sub1Array1[local27] != null) {
				this.aClass15_Sub2_Sub1_Sub1Array1[local27].method9321();
				this.aClass15_Sub2_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt2486 = 0;
		this.aClass60_3 = new Class60();
		this.anInt2487 = 0;
		this.aClass271_9 = new Class271();
		this.anInt2488 = 0;
		this.method9741();
		Static190.aClass15_Sub5Array1[Static91.anInt1670] = this;
		Static91.anInt1670 = Static91.anInt1670 + 1 & Static235.anIntArray218[Static169.anInt3597];
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "()Lclient!gka;")
	public Class127 method2300() {
		return this.aClass127_1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ha;J[Lclient!pi;[Lclient!gfa;Z)V")
	public void method2301(@OriginalArg(0) Class101 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class283[] arg2, @OriginalArg(3) Class123[] arg3) {
		if (!this.aBoolean183) {
			this.method2296(arg0, arg2);
			this.method2307(arg3);
			this.aLong70 = arg1;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ha;)V")
	public void method2302(@OriginalArg(0) Class101 arg0) {
		this.aClass127_1.aClass390_1.method9677();
		for (@Pc(10) Class15_Sub7 local10 = (Class15_Sub7) this.aClass60_3.method1547(); local10 != null; local10 = (Class15_Sub7) this.aClass60_3.method1546()) {
			local10.method8569(arg0, this.aLong71);
		}
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "()Lclient!gka;")
	public Class127 method2304() {
		this.aClass127_1.aClass390_1.method9677();
		for (@Pc(6) int local6 = 0; local6 < this.aClass15_Sub2_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass15_Sub2_Sub1_Sub1Array1[local6] != null && this.aClass15_Sub2_Sub1_Sub1Array1[local6].aClass15_Sub7_1 != null) {
				this.aClass127_1.aClass390_1.method9674(this.aClass15_Sub2_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass127_1;
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "()V")
	public void method2306() {
		this.aBoolean186 = true;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([Lclient!gfa;Z)V")
	private void method2307(@OriginalArg(0) Class123[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static128.aBooleanArray11[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub1_Sub4 local16 = (Class2_Sub1_Sub4) this.aClass271_9.method7177(); local16 != null; local16 = (Class2_Sub1_Sub4) this.aClass271_9.method7175()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass123_1 == arg0[local21] || local16.aClass123_1 == arg0[local21].aClass123_2) {
						Static128.aBooleanArray11[local21] = true;
						local16.method2280();
						continue label71;
					}
				}
			}
			local16.method9825();
			this.anInt2488--;
			if (local16.method9376()) {
				local16.method9377();
				Static505.anInt10359--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt2488 != 8; local21++) {
			if (!Static128.aBooleanArray11[local21]) {
				@Pc(96) Class2_Sub1_Sub4 local96 = null;
				if (arg0[local21].method3580().anInt5065 == 1 && Static505.anInt10359 < 32) {
					local96 = new Class2_Sub1_Sub4(arg0[local21], this);
					Static186.aClass170_1.method4521(local96, (long) arg0[local21].anInt3868);
					Static505.anInt10359++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub1_Sub4(arg0[local21], this);
				}
				this.aClass271_9.method7174(local96);
				this.anInt2488++;
				Static128.aBooleanArray11[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(IZ)V")
	public void method2308(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static559.aClass60_8.method1551(this);
		this.aLong70 = (long) arg0;
		this.aLong71 = (long) arg0;
		this.aBoolean186 = true;
		this.aBoolean185 = arg1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIII)V")
	public void method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2489 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method2310(@OriginalArg(0) Class101 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong70 == this.aLong71) {
			this.method2295();
		} else {
			this.method2298();
		}
		if (arg1 - this.aLong70 > 750L) {
			this.method2299();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong71);
		@Pc(36) Class15_Sub7 local36;
		if (this.aBoolean186) {
			for (local36 = (Class15_Sub7) this.aClass60_3.method1547(); local36 != null; local36 = (Class15_Sub7) this.aClass60_3.method1546()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass308_1.anInt8951; local39++) {
					local36.method8568(arg1, 1, !this.aBoolean184, arg0);
				}
			}
			this.aBoolean186 = false;
		}
		for (local36 = (Class15_Sub7) this.aClass60_3.method1547(); local36 != null; local36 = (Class15_Sub7) this.aClass60_3.method1546()) {
			local36.method8568(arg1, local27, !this.aBoolean184, arg0);
		}
		this.aLong71 = arg1;
		return true;
	}
}
