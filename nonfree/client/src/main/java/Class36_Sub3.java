import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class36_Sub3 extends Class36 {

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public int anInt2565;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	public int anInt2566;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public int anInt2567;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	public int anInt2563 = 0;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!td;")
	private Class191 aClass191_3 = new Class191();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	private int anInt2564 = 0;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!fi;")
	public Class74 aClass74_11 = new Class74();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
	private int anInt2569 = 0;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "Lclient!bg;")
	public final Class24 aClass24_2 = new Class24();

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[Lclient!vi;")
	public Class36_Sub2_Sub1_Sub1[] aClass36_Sub2_Sub1_Sub1Array1 = new Class36_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
	public Class36_Sub3(@OriginalArg(0) int arg0) {
		Static111.aClass191_2.method4872(this);
		this.aLong88 = arg0;
		this.aLong89 = arg0;
		this.aBoolean179 = true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(J)V")
	public void method2168(@OriginalArg(0) long arg0) {
		this.aLong88 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pe;J[Lclient!ds;[Lclient!ae;Z)V")
	public void method2169(@OriginalArg(0) Class89 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class57[] arg2, @OriginalArg(3) Class6[] arg3) {
		if (!this.aBoolean178) {
			this.method2174(arg0, arg2);
			this.method2170(arg3);
			this.aLong88 = arg1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lclient!ae;Z)V")
	private void method2170(@OriginalArg(0) Class6[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static112.aBooleanArray15[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class7_Sub1_Sub11 local16 = (Class7_Sub1_Sub11) this.aClass74_11.method1793(); local16 != null; local16 = (Class7_Sub1_Sub11) this.aClass74_11.method1798()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass6_2 == arg0[local21] || local16.aClass6_2 == arg0[local21].aClass6_1) {
						Static112.aBooleanArray15[local21] = true;
						local16.method2629();
						continue label68;
					}
				}
			}
			local16.method5648();
			this.anInt2569--;
			if (local16.method5505()) {
				local16.method5509();
				Static177.anInt3631--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt2569 != 8; local21++) {
			if (!Static112.aBooleanArray15[local21]) {
				@Pc(93) Class7_Sub1_Sub11 local93 = null;
				if (Static87.method4767(arg0[local21].anInt81).anInt14 == 1 && Static177.anInt3631 < 32) {
					local93 = new Class7_Sub1_Sub11(arg0[local21], this);
					Static319.aClass146_1.method3905(local93, (long) arg0[local21].anInt81);
					Static177.anInt3631++;
				}
				if (local93 == null) {
					local93 = new Class7_Sub1_Sub11(arg0[local21], this);
				}
				this.aClass74_11.method1802(local93);
				this.anInt2569++;
				Static112.aBooleanArray15[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pe;J)Z")
	public boolean method2171(@OriginalArg(0) Class89 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong88 == this.aLong89) {
			this.method2172();
		} else {
			this.method2173();
		}
		if (arg1 - this.aLong88 > 750L) {
			this.method2179();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong89);
		@Pc(36) Class36_Sub7 local36;
		if (this.aBoolean179) {
			for (local36 = (Class36_Sub7) this.aClass191_3.method4862(); local36 != null; local36 = (Class36_Sub7) this.aClass191_3.method4869()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass12_1.anInt240; local39++) {
					local36.method4482(1, !this.aBoolean177, arg1, arg0);
				}
			}
			this.aBoolean179 = false;
		}
		for (local36 = (Class36_Sub7) this.aClass191_3.method4862(); local36 != null; local36 = (Class36_Sub7) this.aClass191_3.method4869()) {
			local36.method4482(local27, !this.aBoolean177, arg1, arg0);
		}
		this.aLong89 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	private void method2172() {
		this.aBoolean177 = false;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	public void method2173() {
		this.aBoolean177 = true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pe;[Lclient!ds;Z)V")
	private void method2174(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class57[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static112.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class36_Sub7 local16 = (Class36_Sub7) this.aClass191_3.method4862(); local16 != null; local16 = (Class36_Sub7) this.aClass191_3.method4869()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass57_2 == arg1[local21] || local16.aClass57_2 == arg1[local21].aClass57_1) {
						Static112.aBooleanArray14[local21] = true;
						local16.method4490();
						local16.aBoolean395 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5299 == 0) {
				local16.method5317();
				this.anInt2564--;
			} else {
				local16.aBoolean395 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt2564 != 8; local21++) {
			if (!Static112.aBooleanArray14[local21]) {
				@Pc(101) Class36_Sub7 local101 = new Class36_Sub7(arg0, arg1[local21], this, this.aLong88);
				this.aClass191_3.method4872(local101);
				this.anInt2564++;
				Static112.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lclient!bg;")
	public Class24 method2176() {
		return this.aClass24_2;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
	public void method2177() {
		this.aBoolean179 = true;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public void method2178() {
		this.aClass24_2.aClass127_1.method3313();
		for (@Pc(10) Class36_Sub7 local10 = (Class36_Sub7) this.aClass191_3.method4862(); local10 != null; local10 = (Class36_Sub7) this.aClass191_3.method4869()) {
			local10.method4486(this.aLong89);
		}
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "()V")
	public void method2179() {
		this.aBoolean178 = true;
		for (@Pc(8) Class7_Sub1_Sub11 local8 = (Class7_Sub1_Sub11) this.aClass74_11.method1793(); local8 != null; local8 = (Class7_Sub1_Sub11) this.aClass74_11.method1798()) {
			if (local8.aClass2_1.anInt14 == 1) {
				local8.method5509();
			}
		}
		this.aClass36_Sub2_Sub1_Sub1Array1 = new Class36_Sub2_Sub1_Sub1[8192];
		this.anInt2563 = 0;
		this.aClass191_3 = new Class191();
		this.anInt2564 = 0;
		this.aClass74_11 = new Class74();
		this.anInt2569 = 0;
		this.method5317();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public void method2180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2568 = arg0;
		this.anInt2567 = arg1;
		this.anInt2566 = arg3;
		this.anInt2565 = arg4;
	}
}
