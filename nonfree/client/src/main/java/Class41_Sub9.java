import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class41_Sub9 extends Class41 {

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "J")
	private long aLong267;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "J")
	private long aLong268;

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
	public int anInt9311;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Z")
	public boolean aBoolean722 = false;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
	public int anInt9309 = 0;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!kf;")
	private Class178 aClass178_24 = new Class178();

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "I")
	private int anInt9310 = 0;

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "Lclient!gk;")
	public Class112 aClass112_73 = new Class112();

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
	private int anInt9312 = 0;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "Z")
	public boolean aBoolean724 = false;

	@OriginalMember(owner = "client!wca", name = "w", descriptor = "Z")
	private boolean aBoolean725 = false;

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "Lclient!qw;")
	public final Class283 aClass283_1 = new Class283();

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "[Lclient!oi;")
	public final Class41_Sub3_Sub1_Sub1[] aClass41_Sub3_Sub1_Sub1Array2 = new Class41_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IZ)V")
	public Class41_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7729(arg0, arg1);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!r;)V")
	public void method7720(@OriginalArg(0) Class45 arg0) {
		this.aClass283_1.aClass206_1.method4716();
		for (@Pc(10) Class41_Sub1 local10 = (Class41_Sub1) this.aClass178_24.method4168(); local10 != null; local10 = (Class41_Sub1) this.aClass178_24.method4165()) {
			local10.method843(arg0, this.aLong268);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIII)V")
	public void method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9311 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!r;[Lclient!ow;Z)V")
	private void method7723(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class248[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static575.aBooleanArray27[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class41_Sub1 local16 = (Class41_Sub1) this.aClass178_24.method4168(); local16 != null; local16 = (Class41_Sub1) this.aClass178_24.method4165()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass248_1 == arg1[local21] || local16.aClass248_1 == arg1[local21].aClass248_2) {
						Static575.aBooleanArray27[local21] = true;
						local16.method840();
						local16.aBoolean84 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt1010 == 0) {
				local16.method7833();
				this.anInt9310--;
			} else {
				local16.aBoolean84 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt9310 != 32; local21++) {
			if (!Static575.aBooleanArray27[local21]) {
				@Pc(104) Class41_Sub1 local104 = new Class41_Sub1(arg0, arg1[local21], this, this.aLong267);
				this.aClass178_24.method4166(local104);
				this.anInt9310++;
				Static575.aBooleanArray27[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "()Lclient!qw;")
	public Class283 method7724() {
		return this.aClass283_1;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "()V")
	public void method7725() {
		this.aBoolean722 = true;
		for (@Pc(8) Class3_Sub7_Sub7 local8 = (Class3_Sub7_Sub7) this.aClass112_73.method3088(); local8 != null; local8 = (Class3_Sub7_Sub7) this.aClass112_73.method3084()) {
			if (local8.aClass334_1.anInt8424 == 1) {
				local8.method7614();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass41_Sub3_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass41_Sub3_Sub1_Sub1Array2[local27] != null) {
				this.aClass41_Sub3_Sub1_Sub1Array2[local27].method5675();
				this.aClass41_Sub3_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt9309 = 0;
		this.aClass178_24 = new Class178();
		this.anInt9310 = 0;
		this.aClass112_73 = new Class112();
		this.anInt9312 = 0;
		this.method7833();
		Static151.aClass41_Sub9Array1[Static302.anInt5115] = this;
		Static302.anInt5115 = Static302.anInt5115 + 1 & Static555.anIntArray579[Static411.anInt7039];
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "()V")
	public void method7726() {
		this.aBoolean723 = true;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method7727(@OriginalArg(0) Class45 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong267 == this.aLong268) {
			this.method7731();
		} else {
			this.method7726();
		}
		if (arg1 - this.aLong267 > 750L) {
			this.method7725();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong268);
		@Pc(36) Class41_Sub1 local36;
		if (this.aBoolean725) {
			for (local36 = (Class41_Sub1) this.aClass178_24.method4168(); local36 != null; local36 = (Class41_Sub1) this.aClass178_24.method4165()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass186_1.anInt5034; local39++) {
					local36.method841(arg1, !this.aBoolean723, 1, arg0);
				}
			}
			this.aBoolean725 = false;
		}
		for (local36 = (Class41_Sub1) this.aClass178_24.method4168(); local36 != null; local36 = (Class41_Sub1) this.aClass178_24.method4165()) {
			local36.method841(arg1, !this.aBoolean723, local27, arg0);
		}
		this.aLong268 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lclient!qr;Z)V")
	private void method7728(@OriginalArg(0) Class281[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static575.aBooleanArray26[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub7_Sub7 local16 = (Class3_Sub7_Sub7) this.aClass112_73.method3088(); local16 != null; local16 = (Class3_Sub7_Sub7) this.aClass112_73.method3084()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass281_1 == arg0[local21] || local16.aClass281_1 == arg0[local21].aClass281_2) {
						Static575.aBooleanArray26[local21] = true;
						local16.method2695();
						continue label71;
					}
				}
			}
			local16.method7825();
			this.anInt9312--;
			if (local16.method7616()) {
				local16.method7614();
				Static440.anInt7355--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt9312 != 8; local21++) {
			if (!Static575.aBooleanArray26[local21]) {
				@Pc(96) Class3_Sub7_Sub7 local96 = null;
				if (arg0[local21].method6193().anInt8424 == 1 && Static440.anInt7355 < 32) {
					local96 = new Class3_Sub7_Sub7(arg0[local21], this);
					Static437.aClass142_1.method3501((long) arg0[local21].anInt7417, local96);
					Static440.anInt7355++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub7_Sub7(arg0[local21], this);
				}
				this.aClass112_73.method3079(local96);
				this.anInt9312++;
				Static575.aBooleanArray26[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(IZ)V")
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static361.aClass178_20.method4166(this);
		this.aLong267 = arg0;
		this.aLong268 = arg0;
		this.aBoolean725 = true;
		this.aBoolean724 = arg1;
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "()V")
	public void method7730() {
		this.aBoolean725 = true;
	}

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "()V")
	private void method7731() {
		this.aBoolean723 = false;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!r;J[Lclient!ow;[Lclient!qr;Z)V")
	public void method7732(@OriginalArg(0) Class45 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class248[] arg2, @OriginalArg(3) Class281[] arg3) {
		if (!this.aBoolean722) {
			this.method7723(arg0, arg2);
			this.method7728(arg3);
			this.aLong267 = arg1;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(J)V")
	public void method7734(@OriginalArg(0) long arg0) {
		this.aLong267 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "()Lclient!qw;")
	public Class283 method7735() {
		this.aClass283_1.aClass206_1.method4716();
		for (@Pc(6) int local6 = 0; local6 < this.aClass41_Sub3_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass41_Sub3_Sub1_Sub1Array2[local6] != null && this.aClass41_Sub3_Sub1_Sub1Array2[local6].aClass41_Sub1_1 != null) {
				this.aClass283_1.aClass206_1.method4712(this.aClass41_Sub3_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass283_1;
	}
}
