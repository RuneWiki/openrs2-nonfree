import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class72_Sub4 extends Class72 {

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt5237;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	public int anInt5239;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	public int anInt5240;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "Z")
	private boolean aBoolean368 = false;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	public int anInt5233 = 0;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!vda;")
	private Class299 aClass299_6 = new Class299();

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	private int anInt5234 = 0;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!bv;")
	public Class37 aClass37_54 = new Class37();

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	private int anInt5236 = 0;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Lclient!kw;")
	public final Class175 aClass175_1 = new Class175();

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[Lclient!ef;")
	public final Class72_Sub1_Sub1_Sub1[] aClass72_Sub1_Sub1_Sub1Array1 = new Class72_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
	public Class72_Sub4(@OriginalArg(0) int arg0) {
		this.method4525(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qa;[Lclient!kca;Z)V")
	private void method4524(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class161[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static279.aBooleanArray34[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class72_Sub5 local16 = (Class72_Sub5) this.aClass299_6.method7030(); local16 != null; local16 = (Class72_Sub5) this.aClass299_6.method7031()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass161_2 == arg1[local21] || local16.aClass161_2 == arg1[local21].aClass161_1) {
						Static279.aBooleanArray34[local21] = true;
						local16.method4994();
						local16.aBoolean429 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt5875 == 0) {
				local16.method6719();
				this.anInt5234--;
			} else {
				local16.aBoolean429 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt5234 != 32; local21++) {
			if (!Static279.aBooleanArray34[local21]) {
				@Pc(104) Class72_Sub5 local104 = new Class72_Sub5(arg0, arg1[local21], this, this.aLong211);
				this.aClass299_6.method7027(local104);
				this.anInt5234++;
				Static279.aBooleanArray34[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public void method4525(@OriginalArg(0) int arg0) {
		Static214.aClass299_2.method7027(this);
		this.aLong211 = arg0;
		this.aLong212 = arg0;
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	private void method4527() {
		this.aBoolean368 = false;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()V")
	public void method4528() {
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qa;J[Lclient!kca;[Lclient!fi;Z)V")
	public void method4529(@OriginalArg(0) Class122 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class161[] arg2, @OriginalArg(3) Class93[] arg3) {
		if (!this.aBoolean369) {
			this.method4524(arg0, arg2);
			this.method4531(arg3);
			this.aLong211 = arg1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qa;)V")
	public void method4530(@OriginalArg(0) Class122 arg0) {
		this.aClass175_1.aClass193_1.method4760();
		for (@Pc(10) Class72_Sub5 local10 = (Class72_Sub5) this.aClass299_6.method7030(); local10 != null; local10 = (Class72_Sub5) this.aClass299_6.method7031()) {
			local10.method4991(arg0, this.aLong212);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!fi;Z)V")
	private void method4531(@OriginalArg(0) Class93[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static279.aBooleanArray33[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class1_Sub1_Sub17 local16 = (Class1_Sub1_Sub17) this.aClass37_54.method977(); local16 != null; local16 = (Class1_Sub1_Sub17) this.aClass37_54.method971()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass93_2 == arg0[local21] || local16.aClass93_2 == arg0[local21].aClass93_1) {
						Static279.aBooleanArray33[local21] = true;
						local16.method6106();
						continue label71;
					}
				}
			}
			local16.method7525();
			this.anInt5236--;
			if (local16.method7529()) {
				local16.method7528();
				Static191.anInt3394--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt5236 != 8; local21++) {
			if (!Static279.aBooleanArray33[local21]) {
				@Pc(96) Class1_Sub1_Sub17 local96 = null;
				if (arg0[local21].method2254().anInt733 == 1 && Static191.anInt3394 < 32) {
					local96 = new Class1_Sub1_Sub17(arg0[local21], this);
					Static396.aClass87_1.method2019((long) arg0[local21].anInt2653, local96);
					Static191.anInt3394++;
				}
				if (local96 == null) {
					local96 = new Class1_Sub1_Sub17(arg0[local21], this);
				}
				this.aClass37_54.method970(local96);
				this.anInt5236++;
				Static279.aBooleanArray33[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public void method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5240 = arg0;
		this.anInt5238 = arg1;
		this.anInt5237 = arg2;
		this.anInt5235 = arg3;
		this.anInt5239 = arg4;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "()V")
	public void method4533() {
		this.aBoolean369 = true;
		for (@Pc(8) Class1_Sub1_Sub17 local8 = (Class1_Sub1_Sub17) this.aClass37_54.method977(); local8 != null; local8 = (Class1_Sub1_Sub17) this.aClass37_54.method971()) {
			if (local8.aClass19_1.anInt733 == 1) {
				local8.method7528();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass72_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass72_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass72_Sub1_Sub1_Sub1Array1[local27].method1857();
				this.aClass72_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt5233 = 0;
		this.aClass299_6 = new Class299();
		this.anInt5234 = 0;
		this.aClass37_54 = new Class37();
		this.anInt5236 = 0;
		this.method6719();
		Static487.aClass72_Sub4Array1[Static115.anInt2354] = this;
		Static115.anInt2354 = Static115.anInt2354 + 1 & Static74.anIntArray157[Static69.anInt1331];
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "()V")
	public void method4534() {
		this.aBoolean368 = true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(J)V")
	public void method4535(@OriginalArg(0) long arg0) {
		this.aLong211 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method4536(@OriginalArg(0) Class122 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong211 == this.aLong212) {
			this.method4527();
		} else {
			this.method4534();
		}
		if (arg1 - this.aLong211 > 750L) {
			this.method4533();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong212);
		@Pc(36) Class72_Sub5 local36;
		if (this.aBoolean370) {
			for (local36 = (Class72_Sub5) this.aClass299_6.method7030(); local36 != null; local36 = (Class72_Sub5) this.aClass299_6.method7031()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass69_1.anInt1913; local39++) {
					local36.method4993(!this.aBoolean368, arg0, 1, arg1);
				}
			}
			this.aBoolean370 = false;
		}
		for (local36 = (Class72_Sub5) this.aClass299_6.method7030(); local36 != null; local36 = (Class72_Sub5) this.aClass299_6.method7031()) {
			local36.method4993(!this.aBoolean368, arg0, local27, arg1);
		}
		this.aLong212 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "()Lclient!kw;")
	public Class175 method4537() {
		return this.aClass175_1;
	}
}
