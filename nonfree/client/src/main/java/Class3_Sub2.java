import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	public int anInt212 = 0;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!gn;")
	private Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
	private int anInt213 = 0;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "Lclient!pk;")
	public Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
	private int anInt216 = 0;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Lclient!mc;")
	public final Class146 aClass146_1 = new Class146();

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "[Lclient!lb;")
	public Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array1 = new Class3_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2(@OriginalArg(0) int arg0) {
		Static384.aClass84_8.method2305(this);
		this.aLong11 = arg0;
		this.aLong12 = arg0;
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	public void method164() {
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
	public void method165() {
		this.aBoolean24 = true;
		for (@Pc(8) Class4_Sub1_Sub12 local8 = (Class4_Sub1_Sub12) this.aClass183_1.method4140(); local8 != null; local8 = (Class4_Sub1_Sub12) this.aClass183_1.method4144()) {
			if (local8.aClass8_1.anInt121 == 1) {
				local8.method4662();
			}
		}
		this.aClass3_Sub1_Sub1_Sub1Array1 = new Class3_Sub1_Sub1_Sub1[8192];
		this.anInt212 = 0;
		this.aClass84_1 = new Class84();
		this.anInt213 = 0;
		this.aClass183_1 = new Class183();
		this.anInt216 = 0;
		this.method5676();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
	public void method166() {
		this.aBoolean23 = true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(J)V")
	public void method168(@OriginalArg(0) long arg0) {
		this.aLong11 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ya;J[Lclient!bu;[Lclient!pf;Z)V")
	public void method169(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class29[] arg2, @OriginalArg(3) Class179[] arg3) {
		if (!this.aBoolean24) {
			this.method175(arg0, arg2);
			this.method173(arg3);
			this.aLong11 = arg1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()V")
	public void method170() {
		this.aClass146_1.aClass232_1.method5122();
		for (@Pc(10) Class3_Sub6 local10 = (Class3_Sub6) this.aClass84_1.method2312(); local10 != null; local10 = (Class3_Sub6) this.aClass84_1.method2309()) {
			local10.method3635(this.aLong12);
		}
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()Lclient!mc;")
	public Class146 method171() {
		return this.aClass146_1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ya;J)Z")
	public boolean method172(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong11 == this.aLong12) {
			this.method176();
		} else {
			this.method166();
		}
		if (arg1 - this.aLong11 > 750L) {
			this.method165();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong12);
		@Pc(36) Class3_Sub6 local36;
		if (this.aBoolean25) {
			for (local36 = (Class3_Sub6) this.aClass84_1.method2312(); local36 != null; local36 = (Class3_Sub6) this.aClass84_1.method2309()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass123_1.anInt3789; local39++) {
					local36.method3632(1, arg1, !this.aBoolean23, arg0);
				}
			}
			this.aBoolean25 = false;
		}
		for (local36 = (Class3_Sub6) this.aClass84_1.method2312(); local36 != null; local36 = (Class3_Sub6) this.aClass84_1.method2309()) {
			local36.method3632(local27, arg1, !this.aBoolean23, arg0);
		}
		this.aLong12 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([Lclient!pf;Z)V")
	private void method173(@OriginalArg(0) Class179[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static16.aBooleanArray1[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class4_Sub1_Sub12 local16 = (Class4_Sub1_Sub12) this.aClass183_1.method4140(); local16 != null; local16 = (Class4_Sub1_Sub12) this.aClass183_1.method4144()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass179_1 == arg0[local21] || local16.aClass179_1 == arg0[local21].aClass179_2) {
						Static16.aBooleanArray1[local21] = true;
						local16.method2732();
						continue label68;
					}
				}
			}
			local16.method5684();
			this.anInt216--;
			if (local16.method4666()) {
				local16.method4662();
				Static246.anInt4588--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt216 != 8; local21++) {
			if (!Static16.aBooleanArray1[local21]) {
				@Pc(93) Class4_Sub1_Sub12 local93 = null;
				if (arg0[local21].method4106().anInt121 == 1 && Static246.anInt4588 < 32) {
					local93 = new Class4_Sub1_Sub12(arg0[local21], this);
					Static166.aClass100_1.method2674(local93, (long) arg0[local21].anInt5339);
					Static246.anInt4588++;
				}
				if (local93 == null) {
					local93 = new Class4_Sub1_Sub12(arg0[local21], this);
				}
				this.aClass183_1.method4137(local93);
				this.anInt216++;
				Static16.aBooleanArray1[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
	public void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt217 = arg0;
		this.anInt215 = arg1;
		this.anInt218 = arg2;
		this.anInt219 = arg3;
		this.anInt214 = arg4;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ya;[Lclient!bu;Z)V")
	private void method175(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class29[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static16.aBooleanArray2[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class3_Sub6 local16 = (Class3_Sub6) this.aClass84_1.method2312(); local16 != null; local16 = (Class3_Sub6) this.aClass84_1.method2309()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass29_2 == arg1[local21] || local16.aClass29_2 == arg1[local21].aClass29_1) {
						Static16.aBooleanArray2[local21] = true;
						local16.method3630();
						local16.aBoolean427 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4650 == 0) {
				local16.method5676();
				this.anInt213--;
			} else {
				local16.aBoolean427 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt213 != 8; local21++) {
			if (!Static16.aBooleanArray2[local21]) {
				@Pc(101) Class3_Sub6 local101 = new Class3_Sub6(arg0, arg1[local21], this, this.aLong11);
				this.aClass84_1.method2305(local101);
				this.anInt213++;
				Static16.aBooleanArray2[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "()V")
	private void method176() {
		this.aBoolean23 = false;
	}
}
