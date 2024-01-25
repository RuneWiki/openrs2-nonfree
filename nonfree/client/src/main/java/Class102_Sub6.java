import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class102_Sub6 extends Class102 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
	public int anInt8276;

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
	public int anInt8278;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
	public int anInt8279;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
	public int anInt8280;

	@OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
	public int anInt8281;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Z")
	public boolean aBoolean567 = false;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	public int anInt8274 = 0;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Lclient!pn;")
	private Class249 aClass249_7 = new Class249();

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
	private int anInt8275 = 0;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "Lclient!rh;")
	public Class275 aClass275_175 = new Class275();

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
	private int anInt8277 = 0;

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!tp", name = "A", descriptor = "Z")
	public boolean aBoolean570 = false;

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "Lclient!ob;")
	public final Class222 aClass222_2 = new Class222();

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "[Lclient!fh;")
	public final Class102_Sub1_Sub1_Sub1[] aClass102_Sub1_Sub1_Sub1Array2 = new Class102_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IZ)V")
	public Class102_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6843(arg0, arg1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!oa;J[Lclient!jq;[Lclient!pp;Z)V")
	public void method6834(@OriginalArg(0) Class121 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class163[] arg2, @OriginalArg(3) Class250[] arg3) {
		if (!this.aBoolean567) {
			this.method6839(arg0, arg2);
			this.method6848(arg3);
			this.aLong211 = arg1;
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "()V")
	public void method6836() {
		this.aBoolean569 = true;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "()V")
	public void method6837() {
		this.aBoolean567 = true;
		for (@Pc(8) Class6_Sub1_Sub14 local8 = (Class6_Sub1_Sub14) this.aClass275_175.method6366(); local8 != null; local8 = (Class6_Sub1_Sub14) this.aClass275_175.method6364()) {
			if (local8.aClass319_1.anInt8965 == 1) {
				local8.method7852();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass102_Sub1_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass102_Sub1_Sub1_Sub1Array2[local27] != null) {
				this.aClass102_Sub1_Sub1_Sub1Array2[local27].method2134();
				this.aClass102_Sub1_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt8274 = 0;
		this.aClass249_7 = new Class249();
		this.anInt8275 = 0;
		this.aClass275_175 = new Class275();
		this.anInt8277 = 0;
		this.method7587();
		Static450.aClass102_Sub6Array1[Static58.anInt957] = this;
		Static58.anInt957 = Static58.anInt957 + 1 & Static25.anIntArray37[Static353.anInt6214];
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "()V")
	public void method6838() {
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!oa;[Lclient!jq;Z)V")
	private void method6839(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class163[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static496.aBooleanArray41[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class102_Sub7 local16 = (Class102_Sub7) this.aClass249_7.method5817(); local16 != null; local16 = (Class102_Sub7) this.aClass249_7.method5815()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass163_2 == arg1[local21] || local16.aClass163_2 == arg1[local21].aClass163_1) {
						Static496.aBooleanArray41[local21] = true;
						local16.method6947();
						local16.aBoolean574 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8417 == 0) {
				local16.method7587();
				this.anInt8275--;
			} else {
				local16.aBoolean574 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt8275 != 32; local21++) {
			if (!Static496.aBooleanArray41[local21]) {
				@Pc(104) Class102_Sub7 local104 = new Class102_Sub7(arg0, arg1[local21], this, this.aLong211);
				this.aClass249_7.method5809(local104);
				this.anInt8275++;
				Static496.aBooleanArray41[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "()Lclient!ob;")
	public Class222 method6840() {
		this.aClass222_2.aClass118_1.method2332();
		for (@Pc(6) int local6 = 0; local6 < this.aClass102_Sub1_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass102_Sub1_Sub1_Sub1Array2[local6] != null && this.aClass102_Sub1_Sub1_Sub1Array2[local6].aClass102_Sub7_1 != null) {
				this.aClass222_2.aClass118_1.method2333(this.aClass102_Sub1_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass222_2;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(J)V")
	public void method6841(@OriginalArg(0) long arg0) {
		this.aLong211 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "()V")
	private void method6842() {
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(IZ)V")
	public void method6843(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static430.aClass249_5.method5809(this);
		this.aLong211 = arg0;
		this.aLong210 = arg0;
		this.aBoolean569 = true;
		this.aBoolean570 = arg1;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(IIIII)V")
	public void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8280 = arg0;
		this.anInt8281 = arg1;
		this.anInt8278 = arg2;
		this.anInt8276 = arg3;
		this.anInt8279 = arg4;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method6845(@OriginalArg(0) Class121 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong211 == this.aLong210) {
			this.method6842();
		} else {
			this.method6838();
		}
		if (arg1 - this.aLong211 > 750L) {
			this.method6837();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong210);
		@Pc(36) Class102_Sub7 local36;
		if (this.aBoolean569) {
			for (local36 = (Class102_Sub7) this.aClass249_7.method5817(); local36 != null; local36 = (Class102_Sub7) this.aClass249_7.method5815()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass242_1.anInt6546; local39++) {
					local36.method6944(!this.aBoolean568, arg1, arg0, 1);
				}
			}
			this.aBoolean569 = false;
		}
		for (local36 = (Class102_Sub7) this.aClass249_7.method5817(); local36 != null; local36 = (Class102_Sub7) this.aClass249_7.method5815()) {
			local36.method6944(!this.aBoolean568, arg1, arg0, local27);
		}
		this.aLong210 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!oa;)V")
	public void method6846(@OriginalArg(0) Class121 arg0) {
		this.aClass222_2.aClass118_1.method2332();
		for (@Pc(10) Class102_Sub7 local10 = (Class102_Sub7) this.aClass249_7.method5817(); local10 != null; local10 = (Class102_Sub7) this.aClass249_7.method5815()) {
			local10.method6942(arg0, this.aLong210);
		}
	}

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "()Lclient!ob;")
	public Class222 method6847() {
		return this.aClass222_2;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([Lclient!pp;Z)V")
	private void method6848(@OriginalArg(0) Class250[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static496.aBooleanArray40[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub1_Sub14 local16 = (Class6_Sub1_Sub14) this.aClass275_175.method6366(); local16 != null; local16 = (Class6_Sub1_Sub14) this.aClass275_175.method6364()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass250_1 == arg0[local21] || local16.aClass250_1 == arg0[local21].aClass250_2) {
						Static496.aBooleanArray40[local21] = true;
						local16.method5440();
						continue label71;
					}
				}
			}
			local16.method7849();
			this.anInt8277--;
			if (local16.method7853()) {
				local16.method7852();
				Static17.anInt337--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt8277 != 8; local21++) {
			if (!Static496.aBooleanArray40[local21]) {
				@Pc(96) Class6_Sub1_Sub14 local96 = null;
				if (arg0[local21].method5827().anInt8965 == 1 && Static17.anInt337 < 32) {
					local96 = new Class6_Sub1_Sub14(arg0[local21], this);
					Static106.aClass162_1.method3461((long) arg0[local21].anInt6994, local96);
					Static17.anInt337++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub1_Sub14(arg0[local21], this);
				}
				this.aClass275_175.method6370(local96);
				this.anInt8277++;
				Static496.aBooleanArray40[local21] = true;
			}
		}
	}
}
