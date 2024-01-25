import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
	public int anInt3465;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	public int anInt3462 = 0;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Z")
	public boolean aBoolean274 = false;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!sk;")
	private Class309 aClass309_7 = new Class309();

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
	private int anInt3463 = 0;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "Lclient!hga;")
	public Class130 aClass130_14 = new Class130();

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	private int anInt3464 = 0;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "Lclient!fi;")
	public final Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "[Lclient!nk;")
	public final Class9_Sub8_Sub2_Sub1[] aClass9_Sub8_Sub2_Sub1Array1 = new Class9_Sub8_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IZ)V")
	public Class9_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3050(arg0, arg1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
	private void method3046() {
		this.aBoolean275 = false;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;[Lclient!tk;Z)V")
	private void method3047(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class323[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static177.aBooleanArray10[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class9_Sub3 local16 = (Class9_Sub3) this.aClass309_7.method6590(); local16 != null; local16 = (Class9_Sub3) this.aClass309_7.method6594()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass323_1 == arg1[local21] || local16.aClass323_1 == arg1[local21].aClass323_2) {
						Static177.aBooleanArray10[local21] = true;
						local16.method2760();
						local16.aBoolean252 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt3082 == 0) {
				local16.method7465();
				this.anInt3463--;
			} else {
				local16.aBoolean252 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt3463 != 32; local21++) {
			if (!Static177.aBooleanArray10[local21]) {
				@Pc(104) Class9_Sub3 local104 = new Class9_Sub3(arg0, arg1[local21], this, this.aLong100);
				this.aClass309_7.method6595(local104);
				this.anInt3463++;
				Static177.aBooleanArray10[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "()V")
	public void method3048() {
		this.aBoolean277 = true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
	public void method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3465 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)V")
	public void method3050(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static337.aClass309_10.method6595(this);
		this.aLong100 = arg0;
		this.aLong101 = arg0;
		this.aBoolean277 = true;
		this.aBoolean276 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "()Lclient!fi;")
	public Class96 method3051() {
		this.aClass96_1.aClass269_1.method6017();
		for (@Pc(6) int local6 = 0; local6 < this.aClass9_Sub8_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass9_Sub8_Sub2_Sub1Array1[local6] != null && this.aClass9_Sub8_Sub2_Sub1Array1[local6].aClass9_Sub3_1 != null) {
				this.aClass96_1.aClass269_1.method6014(this.aClass9_Sub8_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass96_1;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "()Lclient!fi;")
	public Class96 method3053() {
		return this.aClass96_1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method3054(@OriginalArg(0) Class43 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong100 == this.aLong101) {
			this.method3046();
		} else {
			this.method3059();
		}
		if (arg1 - this.aLong100 > 750L) {
			this.method3056();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong101);
		@Pc(36) Class9_Sub3 local36;
		if (this.aBoolean277) {
			for (local36 = (Class9_Sub3) this.aClass309_7.method6590(); local36 != null; local36 = (Class9_Sub3) this.aClass309_7.method6594()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass361_1.anInt9282; local39++) {
					local36.method2764(!this.aBoolean275, arg1, 1, arg0);
				}
			}
			this.aBoolean277 = false;
		}
		for (local36 = (Class9_Sub3) this.aClass309_7.method6590(); local36 != null; local36 = (Class9_Sub3) this.aClass309_7.method6594()) {
			local36.method2764(!this.aBoolean275, arg1, local27, arg0);
		}
		this.aLong101 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([Lclient!aq;Z)V")
	private void method3055(@OriginalArg(0) Class15[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static177.aBooleanArray9[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub3_Sub9 local16 = (Class3_Sub3_Sub9) this.aClass130_14.method3543(); local16 != null; local16 = (Class3_Sub3_Sub9) this.aClass130_14.method3551()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass15_2 == arg0[local21] || local16.aClass15_2 == arg0[local21].aClass15_1) {
						Static177.aBooleanArray9[local21] = true;
						local16.method2176();
						continue label71;
					}
				}
			}
			local16.method7812();
			this.anInt3464--;
			if (local16.method7722()) {
				local16.method7720();
				Static47.anInt1012--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt3464 != 8; local21++) {
			if (!Static177.aBooleanArray9[local21]) {
				@Pc(96) Class3_Sub3_Sub9 local96 = null;
				if (arg0[local21].method442().anInt3240 == 1 && Static47.anInt1012 < 32) {
					local96 = new Class3_Sub3_Sub9(arg0[local21], this);
					Static260.aClass35_1.method829((long) arg0[local21].anInt537, local96);
					Static47.anInt1012++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub3_Sub9(arg0[local21], this);
				}
				this.aClass130_14.method3548(local96);
				this.anInt3464++;
				Static177.aBooleanArray9[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "()V")
	public void method3056() {
		this.aBoolean274 = true;
		for (@Pc(8) Class3_Sub3_Sub9 local8 = (Class3_Sub3_Sub9) this.aClass130_14.method3543(); local8 != null; local8 = (Class3_Sub3_Sub9) this.aClass130_14.method3551()) {
			if (local8.aClass110_1.anInt3240 == 1) {
				local8.method7720();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass9_Sub8_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass9_Sub8_Sub2_Sub1Array1[local27] != null) {
				this.aClass9_Sub8_Sub2_Sub1Array1[local27].method5341();
				this.aClass9_Sub8_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt3462 = 0;
		this.aClass309_7 = new Class309();
		this.anInt3463 = 0;
		this.aClass130_14 = new Class130();
		this.anInt3464 = 0;
		this.method7465();
		Static397.aClass9_Sub6Array1[Static537.anInt4383] = this;
		Static537.anInt4383 = Static537.anInt4383 + 1 & Static26.anIntArray657[Static190.anInt3685];
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;)V")
	public void method3057(@OriginalArg(0) Class43 arg0) {
		this.aClass96_1.aClass269_1.method6017();
		for (@Pc(10) Class9_Sub3 local10 = (Class9_Sub3) this.aClass309_7.method6590(); local10 != null; local10 = (Class9_Sub3) this.aClass309_7.method6594()) {
			local10.method2763(arg0, this.aLong101);
		}
	}

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "()V")
	public void method3059() {
		this.aBoolean275 = true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;J[Lclient!tk;[Lclient!aq;Z)V")
	public void method3060(@OriginalArg(0) Class43 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class323[] arg2, @OriginalArg(3) Class15[] arg3) {
		if (!this.aBoolean274) {
			this.method3047(arg0, arg2);
			this.method3055(arg3);
			this.aLong100 = arg1;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(J)V")
	public void method3061(@OriginalArg(0) long arg0) {
		this.aLong100 = arg0;
	}
}
