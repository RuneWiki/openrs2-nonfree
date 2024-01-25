import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
	public int anInt5414 = 0;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "Z")
	public boolean aBoolean436 = false;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "Lclient!li;")
	private Class209 aClass209_3 = new Class209();

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
	private int anInt5415 = 0;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "Lclient!wba;")
	public Class353 aClass353_35 = new Class353();

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
	private int anInt5416 = 0;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "Z")
	public boolean aBoolean438 = false;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "Lclient!vi;")
	public final Class343 aClass343_1 = new Class343();

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "[Lclient!lk;")
	public final Class8_Sub2_Sub1_Sub1[] aClass8_Sub2_Sub1_Sub1Array1 = new Class8_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IZ)V")
	public Class8_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4395(arg0, arg1);
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "()V")
	private void method4390() {
		this.aBoolean435 = false;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(J)V")
	public void method4391(@OriginalArg(0) long arg0) {
		this.aLong178 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "()V")
	public void method4393() {
		this.aBoolean436 = true;
		for (@Pc(8) Class1_Sub6_Sub15 local8 = (Class1_Sub6_Sub15) this.aClass353_35.method7677(); local8 != null; local8 = (Class1_Sub6_Sub15) this.aClass353_35.method7687()) {
			if (local8.aClass50_1.anInt1078 == 1) {
				local8.method7811();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass8_Sub2_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass8_Sub2_Sub1_Sub1Array1[local27] != null) {
				this.aClass8_Sub2_Sub1_Sub1Array1[local27].method4232();
				this.aClass8_Sub2_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt5414 = 0;
		this.aClass209_3 = new Class209();
		this.anInt5415 = 0;
		this.aClass353_35 = new Class353();
		this.anInt5416 = 0;
		this.method7615();
		Static341.aClass8_Sub7Array2[Static29.anInt423] = this;
		Static29.anInt423 = Static29.anInt423 + 1 & Static571.anIntArray714[Static390.anInt6750];
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "([Lclient!in;Z)V")
	private void method4394(@OriginalArg(0) Class158[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static318.aBooleanArray11[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class1_Sub6_Sub15 local16 = (Class1_Sub6_Sub15) this.aClass353_35.method7677(); local16 != null; local16 = (Class1_Sub6_Sub15) this.aClass353_35.method7687()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass158_2 == arg0[local21] || local16.aClass158_2 == arg0[local21].aClass158_1) {
						Static318.aBooleanArray11[local21] = true;
						local16.method6554();
						continue label71;
					}
				}
			}
			local16.method7859();
			this.anInt5416--;
			if (local16.method7812()) {
				local16.method7811();
				Static553.anInt9202--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt5416 != 8; local21++) {
			if (!Static318.aBooleanArray11[local21]) {
				@Pc(96) Class1_Sub6_Sub15 local96 = null;
				if (arg0[local21].method3423().anInt1078 == 1 && Static553.anInt9202 < 32) {
					local96 = new Class1_Sub6_Sub15(arg0[local21], this);
					Static228.aClass117_1.method2284(local96, (long) arg0[local21].anInt4243);
					Static553.anInt9202++;
				}
				if (local96 == null) {
					local96 = new Class1_Sub6_Sub15(arg0[local21], this);
				}
				this.aClass353_35.method7679(local96);
				this.anInt5416++;
				Static318.aBooleanArray11[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(IZ)V")
	public void method4395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static293.aClass209_2.method4190(this);
		this.aLong178 = arg0;
		this.aLong177 = arg0;
		this.aBoolean437 = true;
		this.aBoolean438 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIII)V")
	public void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5417 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "()V")
	public void method4397() {
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "()Lclient!vi;")
	public Class343 method4398() {
		this.aClass343_1.aClass355_1.method7730();
		for (@Pc(6) int local6 = 0; local6 < this.aClass8_Sub2_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass8_Sub2_Sub1_Sub1Array1[local6] != null && this.aClass8_Sub2_Sub1_Sub1Array1[local6].aClass8_Sub8_1 != null) {
				this.aClass343_1.aClass355_1.method7729(this.aClass8_Sub2_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass343_1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!r;J[Lclient!lea;[Lclient!in;Z)V")
	public void method4399(@OriginalArg(0) Class134 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class206[] arg2, @OriginalArg(3) Class158[] arg3) {
		if (!this.aBoolean436) {
			this.method4403(arg0, arg2);
			this.method4394(arg3);
			this.aLong178 = arg1;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method4400(@OriginalArg(0) Class134 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong178 == this.aLong177) {
			this.method4390();
		} else {
			this.method4397();
		}
		if (arg1 - this.aLong178 > 750L) {
			this.method4393();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong177);
		@Pc(36) Class8_Sub8 local36;
		if (this.aBoolean437) {
			for (local36 = (Class8_Sub8) this.aClass209_3.method4194(); local36 != null; local36 = (Class8_Sub8) this.aClass209_3.method4191()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass243_1.anInt6046; local39++) {
					local36.method5347(1, arg1, !this.aBoolean435, arg0);
				}
			}
			this.aBoolean437 = false;
		}
		for (local36 = (Class8_Sub8) this.aClass209_3.method4194(); local36 != null; local36 = (Class8_Sub8) this.aClass209_3.method4191()) {
			local36.method5347(local27, arg1, !this.aBoolean435, arg0);
		}
		this.aLong177 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "()V")
	public void method4401() {
		this.aBoolean437 = true;
	}

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "()Lclient!vi;")
	public Class343 method4402() {
		return this.aClass343_1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!r;[Lclient!lea;Z)V")
	private void method4403(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class206[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static318.aBooleanArray10[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class8_Sub8 local16 = (Class8_Sub8) this.aClass209_3.method4194(); local16 != null; local16 = (Class8_Sub8) this.aClass209_3.method4191()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass206_2 == arg1[local21] || local16.aClass206_2 == arg1[local21].aClass206_1) {
						Static318.aBooleanArray10[local21] = true;
						local16.method5345();
						local16.aBoolean538 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt6672 == 0) {
				local16.method7615();
				this.anInt5415--;
			} else {
				local16.aBoolean538 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt5415 != 32; local21++) {
			if (!Static318.aBooleanArray10[local21]) {
				@Pc(104) Class8_Sub8 local104 = new Class8_Sub8(arg0, arg1[local21], this, this.aLong178);
				this.aClass209_3.method4190(local104);
				this.anInt5415++;
				Static318.aBooleanArray10[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!r;)V")
	public void method4404(@OriginalArg(0) Class134 arg0) {
		this.aClass343_1.aClass355_1.method7730();
		for (@Pc(10) Class8_Sub8 local10 = (Class8_Sub8) this.aClass209_3.method4194(); local10 != null; local10 = (Class8_Sub8) this.aClass209_3.method4191()) {
			local10.method5346(this.aLong177, arg0);
		}
	}
}
