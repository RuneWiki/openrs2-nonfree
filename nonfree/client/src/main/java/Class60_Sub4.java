import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class60_Sub4 extends Class60 {

	@OriginalMember(owner = "client!io", name = "i", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "I")
	public int anInt4189;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "I")
	public int anInt4190;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	public int anInt4191;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "I")
	public int anInt4192;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "I")
	public int anInt4193;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "I")
	public int anInt4187 = 0;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "Z")
	private boolean aBoolean317 = false;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Lclient!wn;")
	private Class349 aClass349_7 = new Class349();

	@OriginalMember(owner = "client!io", name = "r", descriptor = "I")
	private int anInt4188 = 0;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Lclient!su;")
	public Class298 aClass298_90 = new Class298();

	@OriginalMember(owner = "client!io", name = "v", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Z")
	private boolean aBoolean318 = false;

	@OriginalMember(owner = "client!io", name = "A", descriptor = "I")
	private int anInt4194 = 0;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!hfa;")
	public final Class127 aClass127_2 = new Class127();

	@OriginalMember(owner = "client!io", name = "k", descriptor = "[Lclient!fb;")
	public final Class60_Sub1_Sub1_Sub1[] aClass60_Sub1_Sub1_Sub1Array1 = new Class60_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IZ)V")
	public Class60_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3585(arg0, arg1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()Lclient!hfa;")
	public Class127 method3575() {
		this.aClass127_2.aClass145_1.method3531();
		for (@Pc(6) int local6 = 0; local6 < this.aClass60_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass60_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass60_Sub1_Sub1_Sub1Array1[local6].aClass60_Sub5_1 != null) {
				this.aClass127_2.aClass145_1.method3530(this.aClass60_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass127_2;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4190 = arg0;
		this.anInt4192 = arg1;
		this.anInt4189 = arg2;
		this.anInt4193 = arg3;
		this.anInt4191 = arg4;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()V")
	public void method3578() {
		this.aBoolean316 = true;
		for (@Pc(8) Class6_Sub5_Sub9 local8 = (Class6_Sub5_Sub9) this.aClass298_90.method6809(); local8 != null; local8 = (Class6_Sub5_Sub9) this.aClass298_90.method6821()) {
			if (local8.aClass282_1.anInt7984 == 1) {
				local8.method7814();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass60_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass60_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass60_Sub1_Sub1_Sub1Array1[local27].method2310();
				this.aClass60_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt4187 = 0;
		this.aClass349_7 = new Class349();
		this.anInt4188 = 0;
		this.aClass298_90 = new Class298();
		this.anInt4194 = 0;
		this.method7802();
		Static56.aClass60_Sub4Array1[Static23.anInt421] = this;
		Static23.anInt421 = Static23.anInt421 + 1 & Static45.anIntArray34[Static345.anInt6520];
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(J)V")
	public void method3579(@OriginalArg(0) long arg0) {
		this.aLong91 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!oa;J[Lclient!bh;[Lclient!vp;Z)V")
	public void method3580(@OriginalArg(0) Class90 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class33[] arg2, @OriginalArg(3) Class335[] arg3) {
		if (!this.aBoolean316) {
			this.method3586(arg0, arg2);
			this.method3581(arg3);
			this.aLong91 = arg1;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([Lclient!vp;Z)V")
	private void method3581(@OriginalArg(0) Class335[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static229.aBooleanArray16[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub5_Sub9 local16 = (Class6_Sub5_Sub9) this.aClass298_90.method6809(); local16 != null; local16 = (Class6_Sub5_Sub9) this.aClass298_90.method6821()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass335_1 == arg0[local21] || local16.aClass335_1 == arg0[local21].aClass335_2) {
						Static229.aBooleanArray16[local21] = true;
						local16.method4192();
						continue label71;
					}
				}
			}
			local16.method7948();
			this.anInt4194--;
			if (local16.method7815()) {
				local16.method7814();
				Static338.anInt6451--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4194 != 8; local21++) {
			if (!Static229.aBooleanArray16[local21]) {
				@Pc(96) Class6_Sub5_Sub9 local96 = null;
				if (arg0[local21].method7729().anInt7984 == 1 && Static338.anInt6451 < 32) {
					local96 = new Class6_Sub5_Sub9(arg0[local21], this);
					Static431.aClass119_1.method2709(local96, (long) arg0[local21].anInt9661);
					Static338.anInt6451++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub5_Sub9(arg0[local21], this);
				}
				this.aClass298_90.method6812(local96);
				this.anInt4194++;
				Static229.aBooleanArray16[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!oa;)V")
	public void method3583(@OriginalArg(0) Class90 arg0) {
		this.aClass127_2.aClass145_1.method3531();
		for (@Pc(10) Class60_Sub5 local10 = (Class60_Sub5) this.aClass349_7.method7890(); local10 != null; local10 = (Class60_Sub5) this.aClass349_7.method7896()) {
			local10.method4613(this.aLong92, arg0);
		}
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "()V")
	private void method3584() {
		this.aBoolean317 = false;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IZ)V")
	public void method3585(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static357.aClass349_12.method7893(this);
		this.aLong91 = arg0;
		this.aLong92 = arg0;
		this.aBoolean318 = true;
		this.aBoolean319 = arg1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!oa;[Lclient!bh;Z)V")
	private void method3586(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class33[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static229.aBooleanArray15[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class60_Sub5 local16 = (Class60_Sub5) this.aClass349_7.method7890(); local16 != null; local16 = (Class60_Sub5) this.aClass349_7.method7896()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass33_2 == arg1[local21] || local16.aClass33_2 == arg1[local21].aClass33_1) {
						Static229.aBooleanArray15[local21] = true;
						local16.method4617();
						local16.aBoolean406 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt5652 == 0) {
				local16.method7802();
				this.anInt4188--;
			} else {
				local16.aBoolean406 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4188 != 32; local21++) {
			if (!Static229.aBooleanArray15[local21]) {
				@Pc(104) Class60_Sub5 local104 = new Class60_Sub5(arg0, arg1[local21], this, this.aLong91);
				this.aClass349_7.method7893(local104);
				this.anInt4188++;
				Static229.aBooleanArray15[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "()Lclient!hfa;")
	public Class127 method3587() {
		return this.aClass127_2;
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "()V")
	public void method3588() {
		this.aBoolean318 = true;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method3589(@OriginalArg(0) Class90 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong91 == this.aLong92) {
			this.method3584();
		} else {
			this.method3590();
		}
		if (arg1 - this.aLong91 > 750L) {
			this.method3578();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong92);
		@Pc(36) Class60_Sub5 local36;
		if (this.aBoolean318) {
			for (local36 = (Class60_Sub5) this.aClass349_7.method7890(); local36 != null; local36 = (Class60_Sub5) this.aClass349_7.method7896()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass288_1.lb; local39++) {
					local36.method4612(arg1, 1, !this.aBoolean317, arg0);
				}
			}
			this.aBoolean318 = false;
		}
		for (local36 = (Class60_Sub5) this.aClass349_7.method7890(); local36 != null; local36 = (Class60_Sub5) this.aClass349_7.method7896()) {
			local36.method4612(arg1, local27, !this.aBoolean317, arg0);
		}
		this.aLong92 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "()V")
	public void method3590() {
		this.aBoolean317 = true;
	}
}
