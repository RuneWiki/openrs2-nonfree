import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
	public int anInt3324;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
	public int anInt3325;

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
	public int anInt3327;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
	public int anInt3321 = 0;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!ke;")
	private Class122 aClass122_5 = new Class122();

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	private int anInt3322 = 0;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "Lclient!ar;")
	public Class14 aClass14_12 = new Class14();

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
	private int anInt3326 = 0;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "Lclient!op;")
	public final Class153 aClass153_2 = new Class153();

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[Lclient!ch;")
	public Class7_Sub2_Sub1_Sub1[] aClass7_Sub2_Sub1_Sub1Array2 = new Class7_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
	public Class7_Sub7(@OriginalArg(0) int arg0) {
		Static116.aClass122_2.method2624(this);
		this.aLong87 = arg0;
		this.aLong86 = arg0;
		this.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "()Lclient!op;")
	public Class153 method2817() {
		return this.aClass153_2;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ii;J[Lclient!ho;[Lclient!kg;Z)V")
	public void method2818(@OriginalArg(0) Class105 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class100[] arg2, @OriginalArg(3) Class123[] arg3) {
		if (!this.aBoolean255) {
			this.method2820(arg0, arg2);
			this.method2821(arg3);
			this.aLong87 = arg1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "()V")
	public void method2819() {
		this.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ii;[Lclient!ho;Z)V")
	private void method2820(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class100[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static160.aBooleanArray15[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class7_Sub5 local16 = (Class7_Sub5) this.aClass122_5.method2626(); local16 != null; local16 = (Class7_Sub5) this.aClass122_5.method2630()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass100_1 == arg1[local21] || local16.aClass100_1 == arg1[local21].aClass100_2) {
						Static160.aBooleanArray15[local21] = true;
						local16.method1843();
						local16.aBoolean185 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt2258 == 0) {
				local16.method3450();
				this.anInt3322--;
			} else {
				local16.aBoolean185 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3322 != 8; local21++) {
			if (!Static160.aBooleanArray15[local21]) {
				@Pc(101) Class7_Sub5 local101 = new Class7_Sub5(arg0, arg1[local21], this, this.aLong87);
				this.aClass122_5.method2624(local101);
				this.anInt3322++;
				Static160.aBooleanArray15[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([Lclient!kg;Z)V")
	private void method2821(@OriginalArg(0) Class123[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static160.aBooleanArray16[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub2_Sub17 local16 = (Class1_Sub2_Sub17) this.aClass14_12.method302(); local16 != null; local16 = (Class1_Sub2_Sub17) this.aClass14_12.method313()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass123_2 == arg0[local21] || local16.aClass123_2 == arg0[local21].aClass123_1) {
						Static160.aBooleanArray16[local21] = true;
						local16.method5028();
						continue label68;
					}
				}
			}
			local16.method5796();
			this.anInt3326--;
			if (local16.method5783()) {
				local16.method5784();
				Static267.anInt5493--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3326 != 8; local21++) {
			if (!Static160.aBooleanArray16[local21]) {
				@Pc(93) Class1_Sub2_Sub17 local93 = null;
				if (Static275.method4910(arg0[local21].anInt3080).anInt2682 == 1 && Static267.anInt5493 < 32) {
					local93 = new Class1_Sub2_Sub17(arg0[local21], this);
					Static60.aClass6_1.method35(local93, (long) arg0[local21].anInt3080);
					Static267.anInt5493++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub2_Sub17(arg0[local21], this);
				}
				this.aClass14_12.method300(local93);
				this.anInt3326++;
				Static160.aBooleanArray16[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "()V")
	public void method2822() {
		this.aBoolean256 = true;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "()V")
	public void method2823() {
		this.aClass153_2.aClass55_1.method1214();
		for (@Pc(10) Class7_Sub5 local10 = (Class7_Sub5) this.aClass122_5.method2626(); local10 != null; local10 = (Class7_Sub5) this.aClass122_5.method2630()) {
			local10.method1847(this.aLong86);
		}
	}

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "()V")
	public void method2824() {
		this.aBoolean255 = true;
		for (@Pc(8) Class1_Sub2_Sub17 local8 = (Class1_Sub2_Sub17) this.aClass14_12.method302(); local8 != null; local8 = (Class1_Sub2_Sub17) this.aClass14_12.method313()) {
			if (local8.aClass112_1.anInt2682 == 1) {
				local8.method5784();
			}
		}
		this.aClass7_Sub2_Sub1_Sub1Array2 = new Class7_Sub2_Sub1_Sub1[8192];
		this.anInt3321 = 0;
		this.aClass122_5 = new Class122();
		this.anInt3322 = 0;
		this.aClass14_12 = new Class14();
		this.anInt3326 = 0;
		this.method3450();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ii;J)Z")
	public boolean method2825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong87 == this.aLong86) {
			this.method2827();
		} else {
			this.method2822();
		}
		if (arg1 - this.aLong87 > 750L) {
			this.method2824();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong86);
		@Pc(36) Class7_Sub5 local36;
		if (this.aBoolean257) {
			for (local36 = (Class7_Sub5) this.aClass122_5.method2626(); local36 != null; local36 = (Class7_Sub5) this.aClass122_5.method2630()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass95_1.anInt2202; local39++) {
					local36.method1848(arg0, arg1, 1, !this.aBoolean256);
				}
			}
			this.aBoolean257 = false;
		}
		for (local36 = (Class7_Sub5) this.aClass122_5.method2626(); local36 != null; local36 = (Class7_Sub5) this.aClass122_5.method2630()) {
			local36.method1848(arg0, arg1, local27, !this.aBoolean256);
		}
		this.aLong86 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
	public void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3323 = arg0;
		this.anInt3324 = arg1;
		this.anInt3325 = arg3;
		this.anInt3327 = arg4;
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "()V")
	private void method2827() {
		this.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(J)V")
	public void method2828(@OriginalArg(0) long arg0) {
		this.aLong87 = arg0;
	}
}
