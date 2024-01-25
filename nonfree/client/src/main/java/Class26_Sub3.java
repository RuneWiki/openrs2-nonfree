import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
	public int anInt4307;

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
	public int anInt4309;

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
	public int anInt4311;

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
	public int anInt4305 = 0;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "Z")
	public boolean aBoolean320 = false;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Lclient!aea;")
	private Class8 aClass8_2 = new Class8();

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
	private int anInt4306 = 0;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "Lclient!gj;")
	public Class124 aClass124_21 = new Class124();

	@OriginalMember(owner = "client!hv", name = "B", descriptor = "Z")
	public boolean aBoolean321 = false;

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
	private int anInt4308 = 0;

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "Lclient!c;")
	public final Class42 aClass42_2 = new Class42();

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "[Lclient!vb;")
	public final Class26_Sub1_Sub1_Sub1[] aClass26_Sub1_Sub1_Sub1Array1 = new Class26_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IZ)V")
	public Class26_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3666(arg0, arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "()Lclient!c;")
	public Class42 method3652() {
		this.aClass42_2.aClass212_1.method4711();
		for (@Pc(6) int local6 = 0; local6 < this.aClass26_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass26_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass26_Sub1_Sub1_Sub1Array1[local6].aClass26_Sub7_1 != null) {
				this.aClass42_2.aClass212_1.method4712(this.aClass26_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass42_2;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public void method3653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4307 = arg0;
		this.anInt4311 = arg1;
		this.anInt4310 = arg2;
		this.anInt4309 = arg3;
		this.anInt4312 = arg4;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "()V")
	public void method3654() {
		this.aBoolean322 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lclient!efa;Z)V")
	private void method3655(@OriginalArg(0) Class89[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static207.aBooleanArray17[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class4_Sub7_Sub10 local16 = (Class4_Sub7_Sub10) this.aClass124_21.method3267(); local16 != null; local16 = (Class4_Sub7_Sub10) this.aClass124_21.method3273()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass89_2 == arg0[local21] || local16.aClass89_2 == arg0[local21].aClass89_1) {
						Static207.aBooleanArray17[local21] = true;
						local16.method4430();
						continue label71;
					}
				}
			}
			local16.method8013();
			this.anInt4308--;
			if (local16.method7960()) {
				local16.method7963();
				Static328.anInt5854--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4308 != 8; local21++) {
			if (!Static207.aBooleanArray17[local21]) {
				@Pc(96) Class4_Sub7_Sub10 local96 = null;
				if (arg0[local21].method2424().anInt4716 == 1 && Static328.anInt5854 < 32) {
					local96 = new Class4_Sub7_Sub10(arg0[local21], this);
					Static460.aClass176_1.method4108((long) arg0[local21].anInt2743, local96);
					Static328.anInt5854++;
				}
				if (local96 == null) {
					local96 = new Class4_Sub7_Sub10(arg0[local21], this);
				}
				this.aClass124_21.method3275(local96);
				this.anInt4308++;
				Static207.aBooleanArray17[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
	private void method3656() {
		this.aBoolean319 = false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!oa;)V")
	public void method3657(@OriginalArg(0) Class66 arg0) {
		this.aClass42_2.aClass212_1.method4711();
		for (@Pc(10) Class26_Sub7 local10 = (Class26_Sub7) this.aClass8_2.method110(); local10 != null; local10 = (Class26_Sub7) this.aClass8_2.method113()) {
			local10.method5890(arg0, this.aLong101);
		}
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "()Lclient!c;")
	public Class42 method3658() {
		return this.aClass42_2;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!oa;J[Lclient!jt;[Lclient!efa;Z)V")
	public void method3659(@OriginalArg(0) Class66 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class181[] arg2, @OriginalArg(3) Class89[] arg3) {
		if (!this.aBoolean320) {
			this.method3667(arg0, arg2);
			this.method3655(arg3);
			this.aLong102 = arg1;
		}
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "()V")
	public void method3661() {
		this.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "()V")
	public void method3663() {
		this.aBoolean320 = true;
		for (@Pc(8) Class4_Sub7_Sub10 local8 = (Class4_Sub7_Sub10) this.aClass124_21.method3267(); local8 != null; local8 = (Class4_Sub7_Sub10) this.aClass124_21.method3273()) {
			if (local8.aClass167_1.anInt4716 == 1) {
				local8.method7963();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass26_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass26_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass26_Sub1_Sub1_Sub1Array1[local27].method7588();
				this.aClass26_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt4305 = 0;
		this.aClass8_2 = new Class8();
		this.anInt4306 = 0;
		this.aClass124_21 = new Class124();
		this.anInt4308 = 0;
		this.method7575();
		Static181.aClass26_Sub3Array1[Static478.anInt8049] = this;
		Static478.anInt8049 = Static478.anInt8049 + 1 & Static416.anIntArray597[Static400.anInt6962];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method3664(@OriginalArg(0) Class66 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong102 == this.aLong101) {
			this.method3656();
		} else {
			this.method3661();
		}
		if (arg1 - this.aLong102 > 750L) {
			this.method3663();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong101);
		@Pc(36) Class26_Sub7 local36;
		if (this.aBoolean322) {
			for (local36 = (Class26_Sub7) this.aClass8_2.method110(); local36 != null; local36 = (Class26_Sub7) this.aClass8_2.method113()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass160_1.anInt4537; local39++) {
					local36.method5891(arg1, 1, !this.aBoolean319, arg0);
				}
			}
			this.aBoolean322 = false;
		}
		for (local36 = (Class26_Sub7) this.aClass8_2.method110(); local36 != null; local36 = (Class26_Sub7) this.aClass8_2.method113()) {
			local36.method5891(arg1, local27, !this.aBoolean319, arg0);
		}
		this.aLong101 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(J)V")
	public void method3665(@OriginalArg(0) long arg0) {
		this.aLong102 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(IZ)V")
	public void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static471.aClass8_7.method109(this);
		this.aLong102 = arg0;
		this.aLong101 = arg0;
		this.aBoolean322 = true;
		this.aBoolean321 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!oa;[Lclient!jt;Z)V")
	private void method3667(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class181[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static207.aBooleanArray16[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class26_Sub7 local16 = (Class26_Sub7) this.aClass8_2.method110(); local16 != null; local16 = (Class26_Sub7) this.aClass8_2.method113()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass181_2 == arg1[local21] || local16.aClass181_2 == arg1[local21].aClass181_1) {
						Static207.aBooleanArray16[local21] = true;
						local16.method5889();
						local16.aBoolean509 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt7069 == 0) {
				local16.method7575();
				this.anInt4306--;
			} else {
				local16.aBoolean509 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4306 != 32; local21++) {
			if (!Static207.aBooleanArray16[local21]) {
				@Pc(104) Class26_Sub7 local104 = new Class26_Sub7(arg0, arg1[local21], this, this.aLong102);
				this.aClass8_2.method109(local104);
				this.anInt4306++;
				Static207.aBooleanArray16[local21] = true;
			}
		}
	}
}
