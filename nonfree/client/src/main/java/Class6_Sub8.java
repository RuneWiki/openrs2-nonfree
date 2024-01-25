import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "J")
	private long aLong235;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	public int anInt8589;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public int anInt8586 = 0;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
	public boolean aBoolean660 = false;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!fca;")
	private Class109 aClass109_9 = new Class109();

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	private int anInt8587 = 0;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Lclient!ae;")
	public Class8 aClass8_61 = new Class8();

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Z")
	private boolean aBoolean661 = false;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
	private int anInt8588 = 0;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!ir;")
	public final Class164 aClass164_1 = new Class164();

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "[Lclient!fe;")
	public final Class6_Sub3_Sub1_Sub1[] aClass6_Sub3_Sub1_Sub1Array26 = new Class6_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IZ)V")
	public Class6_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7158(arg0, arg1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method7148(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong235 == this.aLong234) {
			this.method7154();
		} else {
			this.method7159();
		}
		if (arg1 - this.aLong235 > 750L) {
			this.method7155();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong234);
		@Pc(36) Class6_Sub4 local36;
		if (this.aBoolean661) {
			for (local36 = (Class6_Sub4) this.aClass109_9.method2314(); local36 != null; local36 = (Class6_Sub4) this.aClass109_9.method2312()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass51_1.anInt1314; local39++) {
					local36.method2466(!this.aBoolean659, arg0, 1, arg1);
				}
			}
			this.aBoolean661 = false;
		}
		for (local36 = (Class6_Sub4) this.aClass109_9.method2314(); local36 != null; local36 = (Class6_Sub4) this.aClass109_9.method2312()) {
			local36.method2466(!this.aBoolean659, arg0, local27, arg1);
		}
		this.aLong234 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!r;J[Lclient!hi;[Lclient!qg;Z)V")
	public void method7149(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class139[] arg2, @OriginalArg(3) Class270[] arg3) {
		if (!this.aBoolean660) {
			this.method7163(arg0, arg2);
			this.method7162(arg3);
			this.aLong235 = arg1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(J)V")
	public void method7150(@OriginalArg(0) long arg0) {
		this.aLong235 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "()Lclient!ir;")
	public Class164 method7151() {
		this.aClass164_1.aClass234_1.method5479();
		for (@Pc(6) int local6 = 0; local6 < this.aClass6_Sub3_Sub1_Sub1Array26.length; local6++) {
			if (this.aClass6_Sub3_Sub1_Sub1Array26[local6] != null && this.aClass6_Sub3_Sub1_Sub1Array26[local6].aClass6_Sub4_1 != null) {
				this.aClass164_1.aClass234_1.method5481(this.aClass6_Sub3_Sub1_Sub1Array26[local6]);
			}
		}
		return this.aClass164_1;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "()V")
	public void method7152() {
		this.aBoolean661 = true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!r;)V")
	public void method7153(@OriginalArg(0) Class100 arg0) {
		this.aClass164_1.aClass234_1.method5479();
		for (@Pc(10) Class6_Sub4 local10 = (Class6_Sub4) this.aClass109_9.method2314(); local10 != null; local10 = (Class6_Sub4) this.aClass109_9.method2312()) {
			local10.method2467(arg0, this.aLong234);
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "()V")
	private void method7154() {
		this.aBoolean659 = false;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "()V")
	public void method7155() {
		this.aBoolean660 = true;
		for (@Pc(8) Class2_Sub3_Sub10 local8 = (Class2_Sub3_Sub10) this.aClass8_61.method210(); local8 != null; local8 = (Class2_Sub3_Sub10) this.aClass8_61.method218()) {
			if (local8.aClass349_1.anInt9198 == 1) {
				local8.method7767();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass6_Sub3_Sub1_Sub1Array26.length; local27++) {
			if (this.aClass6_Sub3_Sub1_Sub1Array26[local27] != null) {
				this.aClass6_Sub3_Sub1_Sub1Array26[local27].method2376();
				this.aClass6_Sub3_Sub1_Sub1Array26[local27] = null;
			}
		}
		this.anInt8586 = 0;
		this.aClass109_9 = new Class109();
		this.anInt8587 = 0;
		this.aClass8_61 = new Class8();
		this.anInt8588 = 0;
		this.method7989();
		Static78.aClass6_Sub8Array5[Static568.anInt9291] = this;
		Static568.anInt9291 = Static568.anInt9291 + 1 & Static180.anIntArray214[Static206.anInt3999];
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IZ)V")
	public void method7158(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static508.aClass109_8.method2313(this);
		this.aLong235 = arg0;
		this.aLong234 = arg0;
		this.aBoolean661 = true;
		this.aBoolean662 = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "()V")
	public void method7159() {
		this.aBoolean659 = true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIII)V")
	public void method7160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8589 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "()Lclient!ir;")
	public Class164 method7161() {
		return this.aClass164_1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lclient!qg;Z)V")
	private void method7162(@OriginalArg(0) Class270[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static518.aBooleanArray37[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub3_Sub10 local16 = (Class2_Sub3_Sub10) this.aClass8_61.method210(); local16 != null; local16 = (Class2_Sub3_Sub10) this.aClass8_61.method218()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass270_1 == arg0[local21] || local16.aClass270_1 == arg0[local21].aClass270_2) {
						Static518.aBooleanArray37[local21] = true;
						local16.method5185();
						continue label71;
					}
				}
			}
			local16.method7966();
			this.anInt8588--;
			if (local16.method7766()) {
				local16.method7767();
				Static566.anInt9279--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt8588 != 8; local21++) {
			if (!Static518.aBooleanArray37[local21]) {
				@Pc(96) Class2_Sub3_Sub10 local96 = null;
				if (arg0[local21].method6130().anInt9198 == 1 && Static566.anInt9279 < 32) {
					local96 = new Class2_Sub3_Sub10(arg0[local21], this);
					Static228.aClass296_1.method6775((long) arg0[local21].anInt7315, local96);
					Static566.anInt9279++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub3_Sub10(arg0[local21], this);
				}
				this.aClass8_61.method212(local96);
				this.anInt8588++;
				Static518.aBooleanArray37[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!r;[Lclient!hi;Z)V")
	private void method7163(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class139[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static518.aBooleanArray38[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class6_Sub4 local16 = (Class6_Sub4) this.aClass109_9.method2314(); local16 != null; local16 = (Class6_Sub4) this.aClass109_9.method2312()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass139_1 == arg1[local21] || local16.aClass139_1 == arg1[local21].aClass139_2) {
						Static518.aBooleanArray38[local21] = true;
						local16.method2468();
						local16.aBoolean248 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt3038 == 0) {
				local16.method7989();
				this.anInt8587--;
			} else {
				local16.aBoolean248 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt8587 != 32; local21++) {
			if (!Static518.aBooleanArray38[local21]) {
				@Pc(104) Class6_Sub4 local104 = new Class6_Sub4(arg0, arg1[local21], this, this.aLong235);
				this.aClass109_9.method2313(local104);
				this.anInt8587++;
				Static518.aBooleanArray38[local21] = true;
			}
		}
	}
}
