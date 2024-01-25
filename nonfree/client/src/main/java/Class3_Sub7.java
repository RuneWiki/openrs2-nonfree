import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!sia", name = "n", descriptor = "J")
	private long aLong253;

	@OriginalMember(owner = "client!sia", name = "q", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
	public int anInt8435;

	@OriginalMember(owner = "client!sia", name = "p", descriptor = "Z")
	private boolean aBoolean651 = false;

	@OriginalMember(owner = "client!sia", name = "r", descriptor = "Z")
	public boolean aBoolean652 = false;

	@OriginalMember(owner = "client!sia", name = "t", descriptor = "I")
	public int anInt8433 = 0;

	@OriginalMember(owner = "client!sia", name = "l", descriptor = "Lclient!ml;")
	private Class236 aClass236_7 = new Class236();

	@OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
	private int anInt8434 = 0;

	@OriginalMember(owner = "client!sia", name = "u", descriptor = "Lclient!ifa;")
	public Class163 aClass163_59 = new Class163();

	@OriginalMember(owner = "client!sia", name = "w", descriptor = "Z")
	private boolean aBoolean653 = false;

	@OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
	private int anInt8436 = 0;

	@OriginalMember(owner = "client!sia", name = "A", descriptor = "Z")
	public boolean aBoolean654 = false;

	@OriginalMember(owner = "client!sia", name = "y", descriptor = "Lclient!af;")
	public final Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!sia", name = "o", descriptor = "[Lclient!cs;")
	public final Class3_Sub3_Sub1_Sub1[] aClass3_Sub3_Sub1_Sub1Array2 = new Class3_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(IZ)V")
	public Class3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7305(arg0, arg1);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIII)V")
	public void method7297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8435 = arg0;
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "()V")
	private void method7299() {
		this.aBoolean651 = false;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "([Lclient!ir;Z)V")
	private void method7300(@OriginalArg(0) Class170[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static549.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class4_Sub5_Sub1 local16 = (Class4_Sub5_Sub1) this.aClass163_59.method3639(); local16 != null; local16 = (Class4_Sub5_Sub1) this.aClass163_59.method3640()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass170_1 == arg0[local21] || local16.aClass170_1 == arg0[local21].aClass170_2) {
						Static549.aBooleanArray22[local21] = true;
						local16.method322();
						continue label71;
					}
				}
			}
			local16.method9000();
			this.anInt8436--;
			if (local16.method8994()) {
				local16.method8990();
				Static465.anInt7430--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt8436 != 8; local21++) {
			if (!Static549.aBooleanArray22[local21]) {
				@Pc(96) Class4_Sub5_Sub1 local96 = null;
				if (arg0[local21].method3791().anInt8184 == 1 && Static465.anInt7430 < 32) {
					local96 = new Class4_Sub5_Sub1(arg0[local21], this);
					Static166.aClass321_2.method7164(local96, (long) arg0[local21].anInt4271);
					Static465.anInt7430++;
				}
				if (local96 == null) {
					local96 = new Class4_Sub5_Sub1(arg0[local21], this);
				}
				this.aClass163_59.method3646(local96);
				this.anInt8436++;
				Static549.aBooleanArray22[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "()Lclient!af;")
	public Class9 method7301() {
		return this.aClass9_1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(J)V")
	public void method7302(@OriginalArg(0) long arg0) {
		this.aLong254 = arg0;
	}

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "()V")
	public void method7303() {
		this.aBoolean653 = true;
	}

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "()V")
	public void method7304() {
		this.aBoolean651 = true;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZ)V")
	public void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static645.aClass236_10.method4955(this);
		this.aLong254 = (long) arg0;
		this.aLong253 = (long) arg0;
		this.aBoolean653 = true;
		this.aBoolean654 = arg1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method7306(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong254 == this.aLong253) {
			this.method7299();
		} else {
			this.method7304();
		}
		if (arg1 - this.aLong254 > 750L) {
			this.method7308();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong253);
		@Pc(36) Class3_Sub5 local36;
		if (this.aBoolean653) {
			for (local36 = (Class3_Sub5) this.aClass236_7.method4958(); local36 != null; local36 = (Class3_Sub5) this.aClass236_7.method4950()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass21_1.anInt523; local39++) {
					local36.method4136(1, !this.aBoolean651, arg0, arg1);
				}
			}
			this.aBoolean653 = false;
		}
		for (local36 = (Class3_Sub5) this.aClass236_7.method4958(); local36 != null; local36 = (Class3_Sub5) this.aClass236_7.method4950()) {
			local36.method4136(local27, !this.aBoolean651, arg0, arg1);
		}
		this.aLong253 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ha;J[Lclient!mk;[Lclient!ir;Z)V")
	public void method7307(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class235[] arg2, @OriginalArg(3) Class170[] arg3) {
		if (!this.aBoolean652) {
			this.method7311(arg0, arg2);
			this.method7300(arg3);
			this.aLong254 = arg1;
		}
	}

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "()V")
	public void method7308() {
		this.aBoolean652 = true;
		for (@Pc(8) Class4_Sub5_Sub1 local8 = (Class4_Sub5_Sub1) this.aClass163_59.method3639(); local8 != null; local8 = (Class4_Sub5_Sub1) this.aClass163_59.method3640()) {
			if (local8.aClass320_1.anInt8184 == 1) {
				local8.method8990();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass3_Sub3_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass3_Sub3_Sub1_Sub1Array2[local27] != null) {
				this.aClass3_Sub3_Sub1_Sub1Array2[local27].method1702();
				this.aClass3_Sub3_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt8433 = 0;
		this.aClass236_7 = new Class236();
		this.anInt8434 = 0;
		this.aClass163_59 = new Class163();
		this.anInt8436 = 0;
		this.method8898();
		Static649.aClass3_Sub7Array1[Static101.anInt2072] = this;
		Static101.anInt2072 = Static101.anInt2072 + 1 & Static619.anIntArray668[Static290.anInt4596];
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ha;)V")
	public void method7309(@OriginalArg(0) Class33 arg0) {
		this.aClass9_1.aClass87_1.method2178();
		for (@Pc(10) Class3_Sub5 local10 = (Class3_Sub5) this.aClass236_7.method4958(); local10 != null; local10 = (Class3_Sub5) this.aClass236_7.method4950()) {
			local10.method4134(arg0, this.aLong253);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!ha;[Lclient!mk;Z)V")
	private void method7311(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class235[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static549.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class3_Sub5 local16 = (Class3_Sub5) this.aClass236_7.method4958(); local16 != null; local16 = (Class3_Sub5) this.aClass236_7.method4950()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass235_1 == arg1[local21] || local16.aClass235_1 == arg1[local21].aClass235_2) {
						Static549.aBooleanArray21[local21] = true;
						local16.method4137();
						local16.aBoolean344 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt4576 == 0) {
				local16.method8898();
				this.anInt8434--;
			} else {
				local16.aBoolean344 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt8434 != 32; local21++) {
			if (!Static549.aBooleanArray21[local21]) {
				@Pc(104) Class3_Sub5 local104 = new Class3_Sub5(arg0, arg1[local21], this, this.aLong254);
				this.aClass236_7.method4955(local104);
				this.anInt8434++;
				Static549.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "()Lclient!af;")
	public Class9 method7312() {
		this.aClass9_1.aClass87_1.method2178();
		for (@Pc(6) int local6 = 0; local6 < this.aClass3_Sub3_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass3_Sub3_Sub1_Sub1Array2[local6] != null && this.aClass3_Sub3_Sub1_Sub1Array2[local6].aClass3_Sub5_1 != null) {
				this.aClass9_1.aClass87_1.method2173(this.aClass3_Sub3_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass9_1;
	}
}
