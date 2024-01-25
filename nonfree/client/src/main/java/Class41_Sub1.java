import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!li", name = "q", descriptor = "I")
	public int anInt4182;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	public int anInt4183;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	public int anInt4185;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	public int anInt4186;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	public int anInt4187;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public int anInt4180 = 0;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!br;")
	private Class27 aClass27_4 = new Class27();

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	private int anInt4181 = 0;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!vr;")
	public Class258 aClass258_34 = new Class258();

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Z")
	private boolean aBoolean310 = false;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	private int anInt4184 = 0;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "Lclient!vo;")
	public final Class256 aClass256_2 = new Class256();

	@OriginalMember(owner = "client!li", name = "g", descriptor = "[Lclient!wr;")
	public Class41_Sub7_Sub1_Sub1[] aClass41_Sub7_Sub1_Sub1Array1 = new Class41_Sub7_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!li", name = "n", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
	public Class41_Sub1(@OriginalArg(0) int arg0) {
		Static129.aClass27_3.method725(this);
		this.aLong113 = arg0;
		this.aLong112 = arg0;
		this.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	public void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4185 = arg0;
		this.anInt4183 = arg1;
		this.anInt4186 = arg2;
		this.anInt4182 = arg3;
		this.anInt4187 = arg4;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
	private void method3159() {
		this.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
	public void method3160() {
		this.aClass256_2.aClass91_1.method1943();
		for (@Pc(10) Class41_Sub3 local10 = (Class41_Sub3) this.aClass27_4.method730(); local10 != null; local10 = (Class41_Sub3) this.aClass27_4.method735()) {
			local10.method3309(this.aLong112);
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()V")
	public void method3161() {
		this.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
	public void method3162() {
		this.aBoolean308 = true;
		for (@Pc(8) Class4_Sub1_Sub6 local8 = (Class4_Sub1_Sub6) this.aClass258_34.method5538(); local8 != null; local8 = (Class4_Sub1_Sub6) this.aClass258_34.method5528()) {
			if (local8.aClass153_1.anInt4405 == 1) {
				local8.method5863();
			}
		}
		this.aClass41_Sub7_Sub1_Sub1Array1 = new Class41_Sub7_Sub1_Sub1[8192];
		this.anInt4180 = 0;
		this.aClass27_4 = new Class27();
		this.anInt4181 = 0;
		this.aClass258_34 = new Class258();
		this.anInt4184 = 0;
		this.method5818();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method3163(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong113 == this.aLong112) {
			this.method3159();
		} else {
			this.method3168();
		}
		if (arg1 - this.aLong113 > 750L) {
			this.method3162();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong112);
		@Pc(36) Class41_Sub3 local36;
		if (this.aBoolean310) {
			for (local36 = (Class41_Sub3) this.aClass27_4.method730(); local36 != null; local36 = (Class41_Sub3) this.aClass27_4.method735()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass130_1.anInt3666; local39++) {
					local36.method3310(!this.aBoolean309, 1, arg1, arg0);
				}
			}
			this.aBoolean310 = false;
		}
		for (local36 = (Class41_Sub3) this.aClass27_4.method730(); local36 != null; local36 = (Class41_Sub3) this.aClass27_4.method735()) {
			local36.method3310(!this.aBoolean309, local27, arg1, arg0);
		}
		this.aLong112 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!qa;J[Lclient!e;[Lclient!il;Z)V")
	public void method3165(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class56[] arg2, @OriginalArg(3) Class120[] arg3) {
		if (!this.aBoolean308) {
			this.method3167(arg0, arg2);
			this.method3169(arg3);
			this.aLong113 = arg1;
		}
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "()Lclient!vo;")
	public Class256 method3166() {
		return this.aClass256_2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!qa;[Lclient!e;Z)V")
	private void method3167(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class56[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static228.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class41_Sub3 local16 = (Class41_Sub3) this.aClass27_4.method730(); local16 != null; local16 = (Class41_Sub3) this.aClass27_4.method735()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass56_2 == arg1[local21] || local16.aClass56_2 == arg1[local21].aClass56_1) {
						Static228.aBooleanArray12[local21] = true;
						local16.method3305();
						local16.aBoolean325 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4374 == 0) {
				local16.method5818();
				this.anInt4181--;
			} else {
				local16.aBoolean325 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4181 != 8; local21++) {
			if (!Static228.aBooleanArray12[local21]) {
				@Pc(101) Class41_Sub3 local101 = new Class41_Sub3(arg0, arg1[local21], this, this.aLong113);
				this.aClass27_4.method725(local101);
				this.anInt4181++;
				Static228.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "g", descriptor = "()V")
	public void method3168() {
		this.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([Lclient!il;Z)V")
	private void method3169(@OriginalArg(0) Class120[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static228.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class4_Sub1_Sub6 local16 = (Class4_Sub1_Sub6) this.aClass258_34.method5538(); local16 != null; local16 = (Class4_Sub1_Sub6) this.aClass258_34.method5528()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass120_1 == arg0[local21] || local16.aClass120_1 == arg0[local21].aClass120_2) {
						Static228.aBooleanArray13[local21] = true;
						local16.method1175();
						continue label68;
					}
				}
			}
			local16.method5854();
			this.anInt4184--;
			if (local16.method5861()) {
				local16.method5863();
				Static124.anInt2538--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4184 != 8; local21++) {
			if (!Static228.aBooleanArray13[local21]) {
				@Pc(93) Class4_Sub1_Sub6 local93 = null;
				if (arg0[local21].method2498().anInt4405 == 1 && Static124.anInt2538 < 32) {
					local93 = new Class4_Sub1_Sub6(arg0[local21], this);
					Static386.aClass38_1.method1182((long) arg0[local21].anInt3180, local93);
					Static124.anInt2538++;
				}
				if (local93 == null) {
					local93 = new Class4_Sub1_Sub6(arg0[local21], this);
				}
				this.aClass258_34.method5526(local93);
				this.anInt4184++;
				Static228.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(J)V")
	public void method3170(@OriginalArg(0) long arg0) {
		this.aLong113 = arg0;
	}
}
