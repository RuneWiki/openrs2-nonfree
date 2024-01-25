import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
	public int anInt5457;

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
	public int anInt5458;

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
	public int anInt5460;

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
	public int anInt5461;

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
	public int anInt5462;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
	public int anInt5455 = 0;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "Lclient!fh;")
	private Class90 aClass90_11 = new Class90();

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
	private int anInt5456 = 0;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "Lclient!eea;")
	public Class71 aClass71_44 = new Class71();

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
	private int anInt5459 = 0;

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "Z")
	public boolean aBoolean361 = false;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "Lclient!be;")
	public final Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "[Lclient!kq;")
	public final Class4_Sub3_Sub1_Sub1[] aClass4_Sub3_Sub1_Sub1Array1 = new Class4_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IZ)V")
	public Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4602(arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
	public void method4588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5458 = arg0;
		this.anInt5462 = arg1;
		this.anInt5461 = arg2;
		this.anInt5460 = arg3;
		this.anInt5457 = arg4;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "()V")
	public void method4589() {
		this.aBoolean360 = true;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "()Lclient!be;")
	public Class26 method4590() {
		return this.aClass26_1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oa;)V")
	public void method4591(@OriginalArg(0) Class5 arg0) {
		this.aClass26_1.aClass163_1.method4280();
		for (@Pc(10) Class4_Sub6 local10 = (Class4_Sub6) this.aClass90_11.method2326(); local10 != null; local10 = (Class4_Sub6) this.aClass90_11.method2325()) {
			local10.method6196(arg0, this.aLong146);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method4592(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong145 == this.aLong146) {
			this.method4594();
		} else {
			this.method4600();
		}
		if (arg1 - this.aLong145 > 750L) {
			this.method4598();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong146);
		@Pc(36) Class4_Sub6 local36;
		if (this.aBoolean360) {
			for (local36 = (Class4_Sub6) this.aClass90_11.method2326(); local36 != null; local36 = (Class4_Sub6) this.aClass90_11.method2325()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass108_1.anInt3722; local39++) {
					local36.method6194(!this.aBoolean358, arg0, arg1, 1);
				}
			}
			this.aBoolean360 = false;
		}
		for (local36 = (Class4_Sub6) this.aClass90_11.method2326(); local36 != null; local36 = (Class4_Sub6) this.aClass90_11.method2325()) {
			local36.method6194(!this.aBoolean358, arg0, arg1, local27);
		}
		this.aLong146 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "()V")
	private void method4594() {
		this.aBoolean358 = false;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "()Lclient!be;")
	public Class26 method4596() {
		this.aClass26_1.aClass163_1.method4280();
		for (@Pc(6) int local6 = 0; local6 < this.aClass4_Sub3_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass4_Sub3_Sub1_Sub1Array1[local6] != null && this.aClass4_Sub3_Sub1_Sub1Array1[local6].aClass4_Sub6_1 != null) {
				this.aClass26_1.aClass163_1.method4281(this.aClass4_Sub3_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass26_1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oa;[Lclient!fca;Z)V")
	private void method4597(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class83[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static261.aBooleanArray25[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class4_Sub6 local16 = (Class4_Sub6) this.aClass90_11.method2326(); local16 != null; local16 = (Class4_Sub6) this.aClass90_11.method2325()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass83_2 == arg1[local21] || local16.aClass83_2 == arg1[local21].aClass83_1) {
						Static261.aBooleanArray25[local21] = true;
						local16.method6195();
						local16.aBoolean523 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt7528 == 0) {
				local16.method7407();
				this.anInt5456--;
			} else {
				local16.aBoolean523 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt5456 != 32; local21++) {
			if (!Static261.aBooleanArray25[local21]) {
				@Pc(104) Class4_Sub6 local104 = new Class4_Sub6(arg0, arg1[local21], this, this.aLong145);
				this.aClass90_11.method2322(local104);
				this.anInt5456++;
				Static261.aBooleanArray25[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "()V")
	public void method4598() {
		this.aBoolean359 = true;
		for (@Pc(8) Class3_Sub10_Sub13 local8 = (Class3_Sub10_Sub13) this.aClass71_44.method2089(); local8 != null; local8 = (Class3_Sub10_Sub13) this.aClass71_44.method2086()) {
			if (local8.aClass75_1.anInt2483 == 1) {
				local8.method7643();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass4_Sub3_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass4_Sub3_Sub1_Sub1Array1[local27] != null) {
				this.aClass4_Sub3_Sub1_Sub1Array1[local27].method4382();
				this.aClass4_Sub3_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt5455 = 0;
		this.aClass90_11 = new Class90();
		this.anInt5456 = 0;
		this.aClass71_44 = new Class71();
		this.anInt5459 = 0;
		this.method7407();
		Static493.aClass4_Sub4Array139[Static486.anInt7912] = this;
		Static486.anInt7912 = Static486.anInt7912 + 1 & Static215.anIntArray427[Static206.anInt4562];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oa;J[Lclient!fca;[Lclient!gl;Z)V")
	public void method4599(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class83[] arg2, @OriginalArg(3) Class109[] arg3) {
		if (!this.aBoolean359) {
			this.method4597(arg0, arg2);
			this.method4603(arg3);
			this.aLong145 = arg1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "()V")
	public void method4600() {
		this.aBoolean358 = true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(J)V")
	public void method4601(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IZ)V")
	public void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static73.aClass90_20.method2322(this);
		this.aLong145 = arg0;
		this.aLong146 = arg0;
		this.aBoolean360 = true;
		this.aBoolean361 = arg1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Lclient!gl;Z)V")
	private void method4603(@OriginalArg(0) Class109[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static261.aBooleanArray24[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub10_Sub13 local16 = (Class3_Sub10_Sub13) this.aClass71_44.method2089(); local16 != null; local16 = (Class3_Sub10_Sub13) this.aClass71_44.method2086()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass109_2 == arg0[local21] || local16.aClass109_2 == arg0[local21].aClass109_1) {
						Static261.aBooleanArray24[local21] = true;
						local16.method5767();
						continue label71;
					}
				}
			}
			local16.method7820();
			this.anInt5459--;
			if (local16.method7644()) {
				local16.method7643();
				Static459.anInt8281--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt5459 != 8; local21++) {
			if (!Static261.aBooleanArray24[local21]) {
				@Pc(96) Class3_Sub10_Sub13 local96 = null;
				if (arg0[local21].method3130().anInt2483 == 1 && Static459.anInt8281 < 32) {
					local96 = new Class3_Sub10_Sub13(arg0[local21], this);
					Static98.aClass265_1.method6632(local96, (long) arg0[local21].anInt3774);
					Static459.anInt8281++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub10_Sub13(arg0[local21], this);
				}
				this.aClass71_44.method2076(local96);
				this.anInt5459++;
				Static261.aBooleanArray24[local21] = true;
			}
		}
	}
}
