import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!dea", name = "t", descriptor = "I")
	public int anInt2193;

	@OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
	public int anInt2194;

	@OriginalMember(owner = "client!dea", name = "w", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!dea", name = "z", descriptor = "I")
	public int anInt2198;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!dea", name = "o", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
	public int anInt2191 = 0;

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "Lclient!jc;")
	private Class145 aClass145_3 = new Class145();

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
	private int anInt2192 = 0;

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "Lclient!bu;")
	public Class38 aClass38_19 = new Class38();

	@OriginalMember(owner = "client!dea", name = "v", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
	private int anInt2196 = 0;

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "Lclient!rd;")
	public final Class249 aClass249_1 = new Class249();

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "[Lclient!ek;")
	public final Class2_Sub4_Sub1_Sub1[] aClass2_Sub4_Sub1_Sub1Array1 = new Class2_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.method2070(arg0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method2066(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong53 == this.aLong52) {
			this.method2076();
		} else {
			this.method2079();
		}
		if (arg1 - this.aLong53 > 750L) {
			this.method2068();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong52);
		@Pc(36) Class2_Sub1 local36;
		if (this.aBoolean163) {
			for (local36 = (Class2_Sub1) this.aClass145_3.method3919(); local36 != null; local36 = (Class2_Sub1) this.aClass145_3.method3926()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass107_1.anInt3614; local39++) {
					local36.method211(arg1, 1, !this.aBoolean162, arg0);
				}
			}
			this.aBoolean163 = false;
		}
		for (local36 = (Class2_Sub1) this.aClass145_3.method3919(); local36 != null; local36 = (Class2_Sub1) this.aClass145_3.method3926()) {
			local36.method211(arg1, local27, !this.aBoolean162, arg0);
		}
		this.aLong52 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "()Lclient!rd;")
	public Class249 method2067() {
		return this.aClass249_1;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "()V")
	public void method2068() {
		this.aBoolean161 = true;
		for (@Pc(8) Class1_Sub1_Sub10 local8 = (Class1_Sub1_Sub10) this.aClass38_19.method1419(); local8 != null; local8 = (Class1_Sub1_Sub10) this.aClass38_19.method1415()) {
			if (local8.aClass302_1.anInt8611 == 1) {
				local8.method7493();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass2_Sub4_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass2_Sub4_Sub1_Sub1Array1[local27] != null) {
				this.aClass2_Sub4_Sub1_Sub1Array1[local27].method2403();
				this.aClass2_Sub4_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt2191 = 0;
		this.aClass145_3 = new Class145();
		this.anInt2192 = 0;
		this.aClass38_19 = new Class38();
		this.anInt2196 = 0;
		this.method7890();
		Static202.aClass2_Sub3Array3[Static476.anInt7308] = this;
		Static476.anInt7308 = Static476.anInt7308 + 1 & Static144.anIntArray263[Static309.anInt5935];
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V")
	public void method2070(@OriginalArg(0) int arg0) {
		Static14.aClass145_2.method3927(this);
		this.aLong53 = arg0;
		this.aLong52 = arg0;
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIIII)V")
	public void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2198 = arg0;
		this.anInt2197 = arg1;
		this.anInt2193 = arg2;
		this.anInt2195 = arg3;
		this.anInt2194 = arg4;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([Lclient!ia;Z)V")
	private void method2072(@OriginalArg(0) Class129[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static84.aBooleanArray11[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub1_Sub10 local16 = (Class1_Sub1_Sub10) this.aClass38_19.method1419(); local16 != null; local16 = (Class1_Sub1_Sub10) this.aClass38_19.method1415()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass129_1 == arg0[local21] || local16.aClass129_1 == arg0[local21].aClass129_2) {
						Static84.aBooleanArray11[local21] = true;
						local16.method3536();
						continue label68;
					}
				}
			}
			local16.method7983();
			this.anInt2196--;
			if (local16.method7495()) {
				local16.method7493();
				Static6.anInt98--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt2196 != 8; local21++) {
			if (!Static84.aBooleanArray11[local21]) {
				@Pc(93) Class1_Sub1_Sub10 local93 = null;
				if (arg0[local21].method3626().anInt8611 == 1 && Static6.anInt98 < 32) {
					local93 = new Class1_Sub1_Sub10(arg0[local21], this);
					Static479.aClass252_1.method6159(local93, (long) arg0[local21].anInt4066);
					Static6.anInt98++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub1_Sub10(arg0[local21], this);
				}
				this.aClass38_19.method1426(local93);
				this.anInt2196++;
				Static84.aBooleanArray11[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!qa;)V")
	public void method2073(@OriginalArg(0) Class9 arg0) {
		this.aClass249_1.aClass120_1.method3472();
		for (@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass145_3.method3919(); local10 != null; local10 = (Class2_Sub1) this.aClass145_3.method3926()) {
			local10.method207(this.aLong52, arg0);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!qa;[Lclient!lh;Z)V")
	private void method2075(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class178[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static84.aBooleanArray10[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class2_Sub1 local16 = (Class2_Sub1) this.aClass145_3.method3919(); local16 != null; local16 = (Class2_Sub1) this.aClass145_3.method3926()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass178_1 == arg1[local21] || local16.aClass178_1 == arg1[local21].aClass178_2) {
						Static84.aBooleanArray10[local21] = true;
						local16.method209();
						local16.aBoolean4 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt90 == 0) {
				local16.method7890();
				this.anInt2192--;
			} else {
				local16.aBoolean4 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt2192 != 8; local21++) {
			if (!Static84.aBooleanArray10[local21]) {
				@Pc(101) Class2_Sub1 local101 = new Class2_Sub1(arg0, arg1[local21], this, this.aLong53);
				this.aClass145_3.method3927(local101);
				this.anInt2192++;
				Static84.aBooleanArray10[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "()V")
	private void method2076() {
		this.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!qa;J[Lclient!lh;[Lclient!ia;Z)V")
	public void method2077(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class178[] arg2, @OriginalArg(3) Class129[] arg3) {
		if (!this.aBoolean161) {
			this.method2075(arg0, arg2);
			this.method2072(arg3);
			this.aLong53 = arg1;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(J)V")
	public void method2078(@OriginalArg(0) long arg0) {
		this.aLong53 = arg0;
	}

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "()V")
	public void method2079() {
		this.aBoolean162 = true;
	}

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "()V")
	public void method2080() {
		this.aBoolean163 = true;
	}
}
