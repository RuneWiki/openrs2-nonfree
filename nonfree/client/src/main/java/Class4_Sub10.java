import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	public int anInt9126;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Z")
	public boolean aBoolean651 = false;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	public int anInt9124 = 0;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!fw;")
	private Class120 aClass120_7 = new Class120();

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	private int anInt9125 = 0;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Lclient!mr;")
	public Class223 aClass223_57 = new Class223();

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Z")
	public boolean aBoolean653 = false;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Z")
	private boolean aBoolean654 = false;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	private int anInt9127 = 0;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!eea;")
	public final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "[Lclient!pg;")
	public final Class4_Sub2_Sub2_Sub1[] aClass4_Sub2_Sub2_Sub1Array1 = new Class4_Sub2_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IZ)V")
	public Class4_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7854(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method7844(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong240 == this.aLong241) {
			this.method7857();
		} else {
			this.method7847();
		}
		if (arg1 - this.aLong240 > 750L) {
			this.method7855();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong241);
		@Pc(36) Class4_Sub4 local36;
		if (this.aBoolean654) {
			for (local36 = (Class4_Sub4) this.aClass120_7.method2966(); local36 != null; local36 = (Class4_Sub4) this.aClass120_7.method2962()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass349_1.anInt9675; local39++) {
					local36.method4809(arg0, !this.aBoolean652, arg1, 1);
				}
			}
			this.aBoolean654 = false;
		}
		for (local36 = (Class4_Sub4) this.aClass120_7.method2966(); local36 != null; local36 = (Class4_Sub4) this.aClass120_7.method2962()) {
			local36.method4809(arg0, !this.aBoolean652, arg1, local27);
		}
		this.aLong241 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(J)V")
	public void method7845(@OriginalArg(0) long arg0) {
		this.aLong240 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()Lclient!eea;")
	public Class85 method7846() {
		this.aClass85_1.aClass34_1.method1400();
		for (@Pc(6) int local6 = 0; local6 < this.aClass4_Sub2_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass4_Sub2_Sub2_Sub1Array1[local6] != null && this.aClass4_Sub2_Sub2_Sub1Array1[local6].aClass4_Sub4_1 != null) {
				this.aClass85_1.aClass34_1.method1397(this.aClass4_Sub2_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass85_1;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
	public void method7847() {
		this.aBoolean652 = true;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
	public void method7848() {
		this.aBoolean654 = true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ha;J[Lclient!qv;[Lclient!vea;Z)V")
	public void method7849(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class284[] arg2, @OriginalArg(3) Class353[] arg3) {
		if (!this.aBoolean651) {
			this.method7858(arg0, arg2);
			this.method7852(arg3);
			this.aLong240 = arg1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()Lclient!eea;")
	public Class85 method7850() {
		return this.aClass85_1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!vea;Z)V")
	private void method7852(@OriginalArg(0) Class353[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static536.aBooleanArray26[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub4_Sub3 local16 = (Class3_Sub4_Sub3) this.aClass223_57.method5874(); local16 != null; local16 = (Class3_Sub4_Sub3) this.aClass223_57.method5870()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass353_1 == arg0[local21] || local16.aClass353_1 == arg0[local21].aClass353_2) {
						Static536.aBooleanArray26[local21] = true;
						local16.method1252();
						continue label71;
					}
				}
			}
			local16.method8769();
			this.anInt9127--;
			if (local16.method8736()) {
				local16.method8732();
				Static549.anInt9261--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt9127 != 8; local21++) {
			if (!Static536.aBooleanArray26[local21]) {
				@Pc(96) Class3_Sub4_Sub3 local96 = null;
				if (arg0[local21].method8351().anInt4112 == 1 && Static549.anInt9261 < 32) {
					local96 = new Class3_Sub4_Sub3(arg0[local21], this);
					Static127.aClass42_1.method1578((long) arg0[local21].anInt9753, local96);
					Static549.anInt9261++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub4_Sub3(arg0[local21], this);
				}
				this.aClass223_57.method5868(local96);
				this.anInt9127++;
				Static536.aBooleanArray26[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public void method7853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9126 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IZ)V")
	public void method7854(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static88.aClass120_1.method2960(this);
		this.aLong240 = arg0;
		this.aLong241 = arg0;
		this.aBoolean654 = true;
		this.aBoolean653 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "()V")
	public void method7855() {
		this.aBoolean651 = true;
		for (@Pc(8) Class3_Sub4_Sub3 local8 = (Class3_Sub4_Sub3) this.aClass223_57.method5874(); local8 != null; local8 = (Class3_Sub4_Sub3) this.aClass223_57.method5870()) {
			if (local8.aClass142_1.anInt4112 == 1) {
				local8.method8732();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass4_Sub2_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass4_Sub2_Sub2_Sub1Array1[local27] != null) {
				this.aClass4_Sub2_Sub2_Sub1Array1[local27].method6699();
				this.aClass4_Sub2_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt9124 = 0;
		this.aClass120_7 = new Class120();
		this.anInt9125 = 0;
		this.aClass223_57 = new Class223();
		this.anInt9127 = 0;
		this.method7841();
		Static429.aClass4_Sub10Array1[Static563.anInt9404] = this;
		Static563.anInt9404 = Static563.anInt9404 + 1 & Static256.anIntArray247[Static449.anInt7994];
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ha;)V")
	public void method7856(@OriginalArg(0) Class5 arg0) {
		this.aClass85_1.aClass34_1.method1400();
		for (@Pc(10) Class4_Sub4 local10 = (Class4_Sub4) this.aClass120_7.method2966(); local10 != null; local10 = (Class4_Sub4) this.aClass120_7.method2962()) {
			local10.method4807(this.aLong241, arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "()V")
	private void method7857() {
		this.aBoolean652 = false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ha;[Lclient!qv;Z)V")
	private void method7858(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class284[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static536.aBooleanArray25[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class4_Sub4 local16 = (Class4_Sub4) this.aClass120_7.method2966(); local16 != null; local16 = (Class4_Sub4) this.aClass120_7.method2962()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass284_1 == arg1[local21] || local16.aClass284_1 == arg1[local21].aClass284_2) {
						Static536.aBooleanArray25[local21] = true;
						local16.method4805();
						local16.aBoolean359 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt5358 == 0) {
				local16.method7841();
				this.anInt9125--;
			} else {
				local16.aBoolean359 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt9125 != 32; local21++) {
			if (!Static536.aBooleanArray25[local21]) {
				@Pc(104) Class4_Sub4 local104 = new Class4_Sub4(arg0, arg1[local21], this, this.aLong240);
				this.aClass120_7.method2960(local104);
				this.anInt9125++;
				Static536.aBooleanArray25[local21] = true;
			}
		}
	}
}
