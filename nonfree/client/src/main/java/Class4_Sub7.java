import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
	public int anInt4031;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
	public int anInt4029 = 0;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Lclient!re;")
	private Class320 aClass320_2 = new Class320();

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
	private int anInt4030 = 0;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Lclient!cga;")
	public Class60 aClass60_84 = new Class60();

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Z")
	private boolean aBoolean357 = false;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
	private int anInt4032 = 0;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "Lclient!mb;")
	public final Class236 aClass236_1 = new Class236();

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "[Lclient!lga;")
	public final Class4_Sub1_Sub1_Sub1[] aClass4_Sub1_Sub1_Sub1Array2 = new Class4_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IZ)V")
	public Class4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3639(arg0, arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J[Lclient!uda;[Lclient!uc;Z)V")
	public void method3627(@OriginalArg(0) Class145 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class364[] arg2, @OriginalArg(3) Class363[] arg3) {
		if (!this.aBoolean355) {
			this.method3642(arg0, arg2);
			this.method3633(arg3);
			this.aLong138 = arg1;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public void method3628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4031 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "()V")
	public void method3630() {
		this.aBoolean355 = true;
		for (@Pc(8) Class2_Sub6_Sub10 local8 = (Class2_Sub6_Sub10) this.aClass60_84.method1226(7); local8 != null; local8 = (Class2_Sub6_Sub10) this.aClass60_84.method1228()) {
			if (local8.aClass379_1.anInt10445 == 1) {
				local8.method8698();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass4_Sub1_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass4_Sub1_Sub1_Sub1Array2[local27] != null) {
				this.aClass4_Sub1_Sub1_Sub1Array2[local27].method5192();
				this.aClass4_Sub1_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt4029 = 0;
		this.aClass320_2 = new Class320();
		this.anInt4030 = 0;
		this.aClass60_84 = new Class60();
		this.anInt4032 = 0;
		this.method9416();
		Static317.aClass4_Sub7Array5[Static518.anInt8266] = this;
		Static518.anInt8266 = Static518.anInt8266 + 1 & Static429.anIntArray123[Static261.anInt10710];
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "()Lclient!mb;")
	public Class236 method3631() {
		this.aClass236_1.aClass58_1.method1198();
		for (@Pc(6) int local6 = 0; local6 < this.aClass4_Sub1_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass4_Sub1_Sub1_Sub1Array2[local6] != null && this.aClass4_Sub1_Sub1_Sub1Array2[local6].aClass4_Sub10_1 != null) {
				this.aClass236_1.aClass58_1.method1195(this.aClass4_Sub1_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass236_1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(J)V")
	public void method3632(@OriginalArg(0) long arg0) {
		this.aLong138 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!uc;Z)V")
	private void method3633(@OriginalArg(0) Class363[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static256.aBooleanArray16[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub6_Sub10 local16 = (Class2_Sub6_Sub10) this.aClass60_84.method1226(7); local16 != null; local16 = (Class2_Sub6_Sub10) this.aClass60_84.method1228()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass363_1 == arg0[local21] || local16.aClass363_1 == arg0[local21].aClass363_2) {
						Static256.aBooleanArray16[local21] = true;
						local16.method5143();
						continue label71;
					}
				}
			}
			local16.method9872();
			this.anInt4032--;
			if (local16.method8696()) {
				local16.method8698();
				Static25.anInt311--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4032 != 8; local21++) {
			if (!Static256.aBooleanArray16[local21]) {
				@Pc(96) Class2_Sub6_Sub10 local96 = null;
				if (arg0[local21].method8646().anInt10445 == 1 && Static25.anInt311 < 32) {
					local96 = new Class2_Sub6_Sub10(arg0[local21], this);
					Static382.aClass244_1.method5892(local96, (long) arg0[local21].anInt9784);
					Static25.anInt311++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub6_Sub10(arg0[local21], this);
				}
				this.aClass60_84.method1233(local96);
				this.anInt4032++;
				Static256.aBooleanArray16[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "()V")
	public void method3634() {
		this.aBoolean357 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;)V")
	public void method3635(@OriginalArg(0) Class145 arg0) {
		this.aClass236_1.aClass58_1.method1198();
		for (@Pc(10) Class4_Sub10 local10 = (Class4_Sub10) this.aClass320_2.method7605(); local10 != null; local10 = (Class4_Sub10) this.aClass320_2.method7608()) {
			local10.method9421(arg0, this.aLong137);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
	private void method3636() {
		this.aBoolean356 = false;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
	public void method3637() {
		this.aBoolean356 = true;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(IZ)V")
	public void method3639(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static624.aClass320_8.method7600(this);
		this.aLong138 = (long) arg0;
		this.aLong137 = (long) arg0;
		this.aBoolean357 = true;
		this.aBoolean358 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "()Lclient!mb;")
	public Class236 method3640() {
		return this.aClass236_1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method3641(@OriginalArg(0) Class145 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong138 == this.aLong137) {
			this.method3636();
		} else {
			this.method3637();
		}
		if (arg1 - this.aLong138 > 750L) {
			this.method3630();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong137);
		@Pc(36) Class4_Sub10 local36;
		if (this.aBoolean357) {
			for (local36 = (Class4_Sub10) this.aClass320_2.method7605(); local36 != null; local36 = (Class4_Sub10) this.aClass320_2.method7608()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass334_1.anInt8948; local39++) {
					local36.method9424(arg0, !this.aBoolean356, 1, arg1);
				}
			}
			this.aBoolean357 = false;
		}
		for (local36 = (Class4_Sub10) this.aClass320_2.method7605(); local36 != null; local36 = (Class4_Sub10) this.aClass320_2.method7608()) {
			local36.method9424(arg0, !this.aBoolean356, local27, arg1);
		}
		this.aLong137 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;[Lclient!uda;Z)V")
	private void method3642(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class364[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static256.aBooleanArray17[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class4_Sub10 local16 = (Class4_Sub10) this.aClass320_2.method7605(); local16 != null; local16 = (Class4_Sub10) this.aClass320_2.method7608()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass364_2 == arg1[local21] || local16.aClass364_2 == arg1[local21].aClass364_1) {
						Static256.aBooleanArray17[local21] = true;
						local16.method9418();
						local16.aBoolean924 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt10772 == 0) {
				local16.method9416();
				this.anInt4030--;
			} else {
				local16.aBoolean924 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4030 != 32; local21++) {
			if (!Static256.aBooleanArray17[local21]) {
				@Pc(104) Class4_Sub10 local104 = new Class4_Sub10(arg0, arg1[local21], this, this.aLong138);
				this.aClass320_2.method7600(local104);
				this.anInt4030++;
				Static256.aBooleanArray17[local21] = true;
			}
		}
	}
}
