import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class21_Sub5 extends Class21 {

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!hda", name = "i", descriptor = "Z")
	public boolean aBoolean281 = false;

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
	public int anInt3862 = 0;

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "Lclient!iv;")
	private Class158 aClass158_9 = new Class158();

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
	private int anInt3863 = 0;

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "Lclient!au;")
	public Class22 aClass22_22 = new Class22();

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "Z")
	public boolean aBoolean282 = false;

	@OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
	private int anInt3865 = 0;

	@OriginalMember(owner = "client!hda", name = "v", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "Lclient!qg;")
	public final Class276 aClass276_1 = new Class276();

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "[Lclient!rea;")
	public final Class21_Sub3_Sub1_Sub1[] aClass21_Sub3_Sub1_Sub1Array1 = new Class21_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(IZ)V")
	public Class21_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3049(arg0, arg1);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!r;[Lclient!kw;Z)V")
	private void method3040(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class190[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static185.aBooleanArray9[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class21_Sub8 local16 = (Class21_Sub8) this.aClass158_9.method3726(); local16 != null; local16 = (Class21_Sub8) this.aClass158_9.method3721()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass190_2 == arg1[local21] || local16.aClass190_2 == arg1[local21].aClass190_1) {
						Static185.aBooleanArray9[local21] = true;
						local16.method4738();
						local16.aBoolean423 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt6000 == 0) {
				local16.method8246();
				this.anInt3863--;
			} else {
				local16.aBoolean423 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt3863 != 32; local21++) {
			if (!Static185.aBooleanArray9[local21]) {
				@Pc(104) Class21_Sub8 local104 = new Class21_Sub8(arg0, arg1[local21], this, this.aLong97);
				this.aClass158_9.method3720(local104);
				this.anInt3863++;
				Static185.aBooleanArray9[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lclient!qg;")
	public Class276 method3041() {
		this.aClass276_1.aClass39_1.method1141();
		for (@Pc(6) int local6 = 0; local6 < this.aClass21_Sub3_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass21_Sub3_Sub1_Sub1Array1[local6] != null && this.aClass21_Sub3_Sub1_Sub1Array1[local6].aClass21_Sub8_1 != null) {
				this.aClass276_1.aClass39_1.method1142(this.aClass21_Sub3_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass276_1;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
	private void method3042() {
		this.aBoolean280 = false;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(J)V")
	public void method3043(@OriginalArg(0) long arg0) {
		this.aLong97 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!r;)V")
	public void method3044(@OriginalArg(0) Class7 arg0) {
		this.aClass276_1.aClass39_1.method1141();
		for (@Pc(10) Class21_Sub8 local10 = (Class21_Sub8) this.aClass158_9.method3726(); local10 != null; local10 = (Class21_Sub8) this.aClass158_9.method3721()) {
			local10.method4740(arg0, this.aLong98);
		}
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "()V")
	public void method3045() {
		this.aBoolean281 = true;
		for (@Pc(8) Class4_Sub6_Sub14 local8 = (Class4_Sub6_Sub14) this.aClass22_22.method895(); local8 != null; local8 = (Class4_Sub6_Sub14) this.aClass22_22.method889()) {
			if (local8.aClass286_1.anInt8561 == 1) {
				local8.method7880();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass21_Sub3_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass21_Sub3_Sub1_Sub1Array1[local27] != null) {
				this.aClass21_Sub3_Sub1_Sub1Array1[local27].method6656();
				this.aClass21_Sub3_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt3862 = 0;
		this.aClass158_9 = new Class158();
		this.anInt3863 = 0;
		this.aClass22_22 = new Class22();
		this.anInt3865 = 0;
		this.method8246();
		Static110.aClass21_Sub5Array1[Static517.anInt10516] = this;
		Static517.anInt10516 = Static517.anInt10516 + 1 & Static414.anIntArray447[Static204.anInt8817];
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!r;J[Lclient!kw;[Lclient!cea;Z)V")
	public void method3046(@OriginalArg(0) Class7 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class190[] arg2, @OriginalArg(3) Class52[] arg3) {
		if (!this.aBoolean281) {
			this.method3040(arg0, arg2);
			this.method3053(arg3);
			this.aLong97 = arg1;
		}
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "()Lclient!qg;")
	public Class276 method3048() {
		return this.aClass276_1;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(IZ)V")
	public void method3049(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static109.aClass158_8.method3720(this);
		this.aLong97 = arg0;
		this.aLong98 = arg0;
		this.aBoolean283 = true;
		this.aBoolean282 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "()V")
	public void method3050() {
		this.aBoolean283 = true;
	}

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "()V")
	public void method3051() {
		this.aBoolean280 = true;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([Lclient!cea;Z)V")
	private void method3053(@OriginalArg(0) Class52[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static185.aBooleanArray10[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class4_Sub6_Sub14 local16 = (Class4_Sub6_Sub14) this.aClass22_22.method895(); local16 != null; local16 = (Class4_Sub6_Sub14) this.aClass22_22.method889()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass52_2 == arg0[local21] || local16.aClass52_2 == arg0[local21].aClass52_1) {
						Static185.aBooleanArray10[local21] = true;
						local16.method4986();
						continue label71;
					}
				}
			}
			local16.method8193();
			this.anInt3865--;
			if (local16.method7881()) {
				local16.method7880();
				Static173.anInt3657--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt3865 != 8; local21++) {
			if (!Static185.aBooleanArray10[local21]) {
				@Pc(96) Class4_Sub6_Sub14 local96 = null;
				if (arg0[local21].method1379().anInt8561 == 1 && Static173.anInt3657 < 32) {
					local96 = new Class4_Sub6_Sub14(arg0[local21], this);
					Static413.aClass303_1.method6977(local96, (long) arg0[local21].anInt1630);
					Static173.anInt3657++;
				}
				if (local96 == null) {
					local96 = new Class4_Sub6_Sub14(arg0[local21], this);
				}
				this.aClass22_22.method894(local96);
				this.anInt3865++;
				Static185.aBooleanArray10[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIII)V")
	public void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3864 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method3055(@OriginalArg(0) Class7 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong97 == this.aLong98) {
			this.method3042();
		} else {
			this.method3051();
		}
		if (arg1 - this.aLong97 > 750L) {
			this.method3045();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong98);
		@Pc(36) Class21_Sub8 local36;
		if (this.aBoolean283) {
			for (local36 = (Class21_Sub8) this.aClass158_9.method3726(); local36 != null; local36 = (Class21_Sub8) this.aClass158_9.method3721()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass126_1.anInt3500; local39++) {
					local36.method4736(arg1, !this.aBoolean280, arg0, 1);
				}
			}
			this.aBoolean283 = false;
		}
		for (local36 = (Class21_Sub8) this.aClass158_9.method3726(); local36 != null; local36 = (Class21_Sub8) this.aClass158_9.method3721()) {
			local36.method4736(arg1, !this.aBoolean280, arg0, local27);
		}
		this.aLong98 = arg1;
		return true;
	}
}
