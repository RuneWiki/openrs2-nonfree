import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	public int anInt4921;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	public int anInt4919 = 0;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "Z")
	public boolean aBoolean380 = false;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!mb;")
	private Class220 aClass220_7 = new Class220();

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
	private int anInt4920 = 0;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "Lclient!dc;")
	public Class70 aClass70_35 = new Class70();

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "Z")
	public boolean aBoolean382 = false;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
	private int anInt4922 = 0;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "Lclient!uo;")
	public final Class339 aClass339_1 = new Class339();

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "[Lclient!ko;")
	public final Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array2 = new Class12_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IZ)V")
	public Class12_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4139(arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([Lclient!il;Z)V")
	private void method4125(@OriginalArg(0) Class163[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static291.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub2_Sub12 local16 = (Class2_Sub2_Sub12) this.aClass70_35.method1264(); local16 != null; local16 = (Class2_Sub2_Sub12) this.aClass70_35.method1261()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass163_2 == arg0[local21] || local16.aClass163_2 == arg0[local21].aClass163_1) {
						Static291.aBooleanArray21[local21] = true;
						local16.method4775();
						continue label71;
					}
				}
			}
			local16.method7657();
			this.anInt4922--;
			if (local16.method7662()) {
				local16.method7659();
				Static359.anInt3109--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4922 != 8; local21++) {
			if (!Static291.aBooleanArray21[local21]) {
				@Pc(96) Class2_Sub2_Sub12 local96 = null;
				if (arg0[local21].method3310().anInt4877 == 1 && Static359.anInt3109 < 32) {
					local96 = new Class2_Sub2_Sub12(arg0[local21], this);
					Static227.aClass259_1.method5447(local96, (long) arg0[local21].anInt3822);
					Static359.anInt3109++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub2_Sub12(arg0[local21], this);
				}
				this.aClass70_35.method1269(local96);
				this.anInt4922++;
				Static291.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
	public void method4126() {
		this.aBoolean381 = true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
	public void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4921 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!r;J[Lclient!rca;[Lclient!il;Z)V")
	public void method4128(@OriginalArg(0) Class162 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class293[] arg2, @OriginalArg(3) Class163[] arg3) {
		if (!this.aBoolean380) {
			this.method4136(arg0, arg2);
			this.method4125(arg3);
			this.aLong128 = arg1;
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
	public void method4129() {
		this.aBoolean380 = true;
		for (@Pc(8) Class2_Sub2_Sub12 local8 = (Class2_Sub2_Sub12) this.aClass70_35.method1264(); local8 != null; local8 = (Class2_Sub2_Sub12) this.aClass70_35.method1261()) {
			if (local8.aClass198_1.anInt4877 == 1) {
				local8.method7659();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass12_Sub1_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass12_Sub1_Sub1_Sub1Array2[local27] != null) {
				this.aClass12_Sub1_Sub1_Sub1Array2[local27].method4065();
				this.aClass12_Sub1_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt4919 = 0;
		this.aClass220_7 = new Class220();
		this.anInt4920 = 0;
		this.aClass70_35 = new Class70();
		this.anInt4922 = 0;
		this.method7630();
		Static316.aClass12_Sub4Array1[Static211.anInt3063] = this;
		Static211.anInt3063 = Static211.anInt3063 + 1 & Static115.anIntArray171[Static313.anInt5212];
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "()Lclient!uo;")
	public Class339 method4130() {
		return this.aClass339_1;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(J)V")
	public void method4131(@OriginalArg(0) long arg0) {
		this.aLong128 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "()V")
	public void method4132() {
		this.aBoolean383 = true;
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "()V")
	private void method4134() {
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "()Lclient!uo;")
	public Class339 method4135() {
		this.aClass339_1.aClass77_1.method1507();
		for (@Pc(6) int local6 = 0; local6 < this.aClass12_Sub1_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass12_Sub1_Sub1_Sub1Array2[local6] != null && this.aClass12_Sub1_Sub1_Sub1Array2[local6].aClass12_Sub9_1 != null) {
				this.aClass339_1.aClass77_1.method1510(this.aClass12_Sub1_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass339_1;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!r;[Lclient!rca;Z)V")
	private void method4136(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class293[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static291.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class12_Sub9 local16 = (Class12_Sub9) this.aClass220_7.method4661(); local16 != null; local16 = (Class12_Sub9) this.aClass220_7.method4660()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass293_2 == arg1[local21] || local16.aClass293_2 == arg1[local21].aClass293_1) {
						Static291.aBooleanArray20[local21] = true;
						local16.method6343();
						local16.aBoolean667 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt7857 == 0) {
				local16.method7630();
				this.anInt4920--;
			} else {
				local16.aBoolean667 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4920 != 32; local21++) {
			if (!Static291.aBooleanArray20[local21]) {
				@Pc(104) Class12_Sub9 local104 = new Class12_Sub9(arg0, arg1[local21], this, this.aLong128);
				this.aClass220_7.method4659(local104);
				this.anInt4920++;
				Static291.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method4137(@OriginalArg(0) Class162 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong128 == this.aLong129) {
			this.method4134();
		} else {
			this.method4126();
		}
		if (arg1 - this.aLong128 > 750L) {
			this.method4129();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong129);
		@Pc(36) Class12_Sub9 local36;
		if (this.aBoolean383) {
			for (local36 = (Class12_Sub9) this.aClass220_7.method4661(); local36 != null; local36 = (Class12_Sub9) this.aClass220_7.method4660()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass326_1.anInt8153; local39++) {
					local36.method6342(!this.aBoolean381, arg1, 1, arg0);
				}
			}
			this.aBoolean383 = false;
		}
		for (local36 = (Class12_Sub9) this.aClass220_7.method4661(); local36 != null; local36 = (Class12_Sub9) this.aClass220_7.method4660()) {
			local36.method6342(!this.aBoolean381, arg1, local27, arg0);
		}
		this.aLong129 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IZ)V")
	public void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static56.aClass220_1.method4659(this);
		this.aLong128 = arg0;
		this.aLong129 = arg0;
		this.aBoolean383 = true;
		this.aBoolean382 = arg1;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!r;)V")
	public void method4140(@OriginalArg(0) Class162 arg0) {
		this.aClass339_1.aClass77_1.method1507();
		for (@Pc(10) Class12_Sub9 local10 = (Class12_Sub9) this.aClass220_7.method4661(); local10 != null; local10 = (Class12_Sub9) this.aClass220_7.method4660()) {
			local10.method6341(arg0, this.aLong129);
		}
	}
}
