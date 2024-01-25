import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!em", name = "j", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!em", name = "s", descriptor = "I")
	public int anInt2349;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "I")
	public int anInt2347 = 0;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Lclient!fa;")
	private Class99 aClass99_3 = new Class99();

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	private int anInt2348 = 0;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "Lclient!tg;")
	public Class330 aClass330_9 = new Class330();

	@OriginalMember(owner = "client!em", name = "t", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "I")
	private int anInt2350 = 0;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!mp;")
	public final Class235 aClass235_1 = new Class235();

	@OriginalMember(owner = "client!em", name = "i", descriptor = "[Lclient!aba;")
	public final Class4_Sub1_Sub1_Sub1[] aClass4_Sub1_Sub1_Sub1Array1 = new Class4_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IZ)V")
	public Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method1963(arg0, arg1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "()Lclient!mp;")
	public Class235 method1951() {
		this.aClass235_1.aClass287_1.method6810();
		for (@Pc(6) int local6 = 0; local6 < this.aClass4_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass4_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass4_Sub1_Sub1_Sub1Array1[local6].aClass4_Sub3_1 != null) {
				this.aClass235_1.aClass287_1.method6808(this.aClass4_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass235_1;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "()V")
	public void method1952() {
		this.aBoolean174 = true;
		for (@Pc(8) Class5_Sub5_Sub1 local8 = (Class5_Sub5_Sub1) this.aClass330_9.method7908(); local8 != null; local8 = (Class5_Sub5_Sub1) this.aClass330_9.method7914()) {
			if (local8.aClass328_1.anInt9110 == 1) {
				local8.method8952();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass4_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass4_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass4_Sub1_Sub1_Sub1Array1[local27].method61();
				this.aClass4_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt2347 = 0;
		this.aClass99_3 = new Class99();
		this.anInt2348 = 0;
		this.aClass330_9 = new Class330();
		this.anInt2350 = 0;
		this.method8713();
		Static318.aClass4_Sub4Array1[Static8.anInt6060] = this;
		Static8.anInt6060 = Static8.anInt6060 + 1 & Static592.anIntArray562[Static359.anInt6012];
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "()V")
	public void method1953() {
		this.aBoolean176 = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([Lclient!sn;Z)V")
	private void method1954(@OriginalArg(0) Class320[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static131.aBooleanArray5[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class5_Sub5_Sub1 local16 = (Class5_Sub5_Sub1) this.aClass330_9.method7908(); local16 != null; local16 = (Class5_Sub5_Sub1) this.aClass330_9.method7914()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass320_1 == arg0[local21] || local16.aClass320_1 == arg0[local21].aClass320_2) {
						Static131.aBooleanArray5[local21] = true;
						local16.method537();
						continue label71;
					}
				}
			}
			local16.method9047();
			this.anInt2350--;
			if (local16.method8951()) {
				local16.method8952();
				Static637.anInt8736--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt2350 != 8; local21++) {
			if (!Static131.aBooleanArray5[local21]) {
				@Pc(96) Class5_Sub5_Sub1 local96 = null;
				if (arg0[local21].method7683().anInt9110 == 1 && Static637.anInt8736 < 32) {
					local96 = new Class5_Sub5_Sub1(arg0[local21], this);
					Static464.aClass281_1.method6690((long) arg0[local21].anInt8921, local96);
					Static637.anInt8736++;
				}
				if (local96 == null) {
					local96 = new Class5_Sub5_Sub1(arg0[local21], this);
				}
				this.aClass330_9.method7917(local96);
				this.anInt2350++;
				Static131.aBooleanArray5[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "()V")
	private void method1955() {
		this.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(J)V")
	public void method1956(@OriginalArg(0) long arg0) {
		this.aLong62 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;)V")
	public void method1958(@OriginalArg(0) Class133 arg0) {
		this.aClass235_1.aClass287_1.method6810();
		for (@Pc(10) Class4_Sub3 local10 = (Class4_Sub3) this.aClass99_3.method2045(); local10 != null; local10 = (Class4_Sub3) this.aClass99_3.method2047()) {
			local10.method1116(arg0, this.aLong61);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method1959(@OriginalArg(0) Class133 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong62 == this.aLong61) {
			this.method1955();
		} else {
			this.method1962();
		}
		if (arg1 - this.aLong62 > 750L) {
			this.method1952();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong61);
		@Pc(36) Class4_Sub3 local36;
		if (this.aBoolean176) {
			for (local36 = (Class4_Sub3) this.aClass99_3.method2045(); local36 != null; local36 = (Class4_Sub3) this.aClass99_3.method2047()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass360_1.anInt9979; local39++) {
					local36.method1118(!this.aBoolean173, arg0, arg1, 1);
				}
			}
			this.aBoolean176 = false;
		}
		for (local36 = (Class4_Sub3) this.aClass99_3.method2045(); local36 != null; local36 = (Class4_Sub3) this.aClass99_3.method2047()) {
			local36.method1118(!this.aBoolean173, arg0, arg1, local27);
		}
		this.aLong61 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!em", name = "f", descriptor = "()Lclient!mp;")
	public Class235 method1961() {
		return this.aClass235_1;
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "()V")
	public void method1962() {
		this.aBoolean173 = true;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(IZ)V")
	public void method1963(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static340.aClass99_6.method2039(this);
		this.aLong62 = arg0;
		this.aLong61 = arg0;
		this.aBoolean176 = true;
		this.aBoolean175 = arg1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;[Lclient!ou;Z)V")
	private void method1964(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class261[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static131.aBooleanArray4[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class4_Sub3 local16 = (Class4_Sub3) this.aClass99_3.method2045(); local16 != null; local16 = (Class4_Sub3) this.aClass99_3.method2047()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass261_1 == arg1[local21] || local16.aClass261_1 == arg1[local21].aClass261_2) {
						Static131.aBooleanArray4[local21] = true;
						local16.method1117();
						local16.aBoolean77 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt1379 == 0) {
				local16.method8713();
				this.anInt2348--;
			} else {
				local16.aBoolean77 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt2348 != 32; local21++) {
			if (!Static131.aBooleanArray4[local21]) {
				@Pc(104) Class4_Sub3 local104 = new Class4_Sub3(arg0, arg1[local21], this, this.aLong62);
				this.aClass99_3.method2039(local104);
				this.anInt2348++;
				Static131.aBooleanArray4[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	public void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2349 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ha;J[Lclient!ou;[Lclient!sn;Z)V")
	public void method1966(@OriginalArg(0) Class133 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class261[] arg2, @OriginalArg(3) Class320[] arg3) {
		if (!this.aBoolean174) {
			this.method1964(arg0, arg2);
			this.method1954(arg3);
			this.aLong62 = arg1;
		}
	}
}
