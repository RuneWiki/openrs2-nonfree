import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
	public int anInt3560;

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
	public int anInt3561;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
	public int anInt3562;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
	public int anInt3563;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public int anInt3557 = 0;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Z")
	public boolean aBoolean331 = false;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "Lclient!wp;")
	private Class217 aClass217_7 = new Class217();

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
	private int anInt3558 = 0;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Lclient!bb;")
	public Class16 aClass16_17 = new Class16();

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
	private int anInt3559 = 0;

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "Lclient!sk;")
	public final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "[Lclient!cd;")
	public Class8_Sub2_Sub1_Sub1[] aClass8_Sub2_Sub1_Sub1Array1 = new Class8_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
	public Class8_Sub6(@OriginalArg(0) int arg0) {
		Static140.aClass217_5.method5678(this);
		this.aLong119 = arg0;
		this.aLong118 = arg0;
		this.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!uo;J[Lclient!un;[Lclient!kh;Z)V")
	public void method3271(@OriginalArg(0) Class32 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class206[] arg2, @OriginalArg(3) Class115[] arg3) {
		if (!this.aBoolean331) {
			this.method3283(arg0, arg2);
			this.method3278(arg3);
			this.aLong119 = arg1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	public void method3273() {
		this.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()V")
	public void method3274() {
		this.aClass191_1.aClass130_1.method3553();
		for (@Pc(10) Class8_Sub4 local10 = (Class8_Sub4) this.aClass217_7.method5683(); local10 != null; local10 = (Class8_Sub4) this.aClass217_7.method5679()) {
			local10.method1954(this.aLong118);
		}
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()V")
	private void method3275() {
		this.aBoolean332 = false;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!uo;J)Z")
	public boolean method3276(@OriginalArg(0) Class32 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong119 == this.aLong118) {
			this.method3275();
		} else {
			this.method3280();
		}
		if (arg1 - this.aLong119 > 750L) {
			this.method3282();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong118);
		@Pc(36) Class8_Sub4 local36;
		if (this.aBoolean333) {
			for (local36 = (Class8_Sub4) this.aClass217_7.method5683(); local36 != null; local36 = (Class8_Sub4) this.aClass217_7.method5679()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass177_1.anInt5471; local39++) {
					local36.method1957(!this.aBoolean332, arg0, arg1, 1);
				}
			}
			this.aBoolean333 = false;
		}
		for (local36 = (Class8_Sub4) this.aClass217_7.method5683(); local36 != null; local36 = (Class8_Sub4) this.aClass217_7.method5679()) {
			local36.method1957(!this.aBoolean332, arg0, arg1, local27);
		}
		this.aLong118 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(J)V")
	public void method3277(@OriginalArg(0) long arg0) {
		this.aLong119 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([Lclient!kh;Z)V")
	private void method3278(@OriginalArg(0) Class115[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static164.aBooleanArray17[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub4_Sub12 local16 = (Class1_Sub4_Sub12) this.aClass16_17.method410(); local16 != null; local16 = (Class1_Sub4_Sub12) this.aClass16_17.method419()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass115_1 == arg0[local21] || local16.aClass115_1 == arg0[local21].aClass115_2) {
						Static164.aBooleanArray17[local21] = true;
						local16.method2426();
						continue label68;
					}
				}
			}
			local16.method5628();
			this.anInt3559--;
			if (local16.method5630()) {
				local16.method5632();
				Static189.anInt4072--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3559 != 8; local21++) {
			if (!Static164.aBooleanArray17[local21]) {
				@Pc(93) Class1_Sub4_Sub12 local93 = null;
				if (Static91.method1962(arg0[local21].anInt3429).anInt6010 == 1 && Static189.anInt4072 < 32) {
					local93 = new Class1_Sub4_Sub12(arg0[local21], this);
					Static156.aClass75_1.method2026((long) arg0[local21].anInt3429, local93);
					Static189.anInt4072++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub4_Sub12(arg0[local21], this);
				}
				this.aClass16_17.method416(local93);
				this.anInt3559++;
				Static164.aBooleanArray17[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "()Lclient!sk;")
	public Class191 method3279() {
		return this.aClass191_1;
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "()V")
	public void method3280() {
		this.aBoolean332 = true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
	public void method3281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3561 = arg0;
		this.anInt3563 = arg1;
		this.anInt3560 = arg3;
		this.anInt3562 = arg4;
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "()V")
	public void method3282() {
		this.aBoolean331 = true;
		for (@Pc(8) Class1_Sub4_Sub12 local8 = (Class1_Sub4_Sub12) this.aClass16_17.method410(); local8 != null; local8 = (Class1_Sub4_Sub12) this.aClass16_17.method419()) {
			if (local8.aClass195_1.anInt6010 == 1) {
				local8.method5632();
			}
		}
		this.aClass8_Sub2_Sub1_Sub1Array1 = new Class8_Sub2_Sub1_Sub1[8192];
		this.anInt3557 = 0;
		this.aClass217_7 = new Class217();
		this.anInt3558 = 0;
		this.aClass16_17 = new Class16();
		this.anInt3559 = 0;
		this.method4763();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!uo;[Lclient!un;Z)V")
	private void method3283(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class206[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static164.aBooleanArray18[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class8_Sub4 local16 = (Class8_Sub4) this.aClass217_7.method5683(); local16 != null; local16 = (Class8_Sub4) this.aClass217_7.method5679()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass206_1 == arg1[local21] || local16.aClass206_1 == arg1[local21].aClass206_2) {
						Static164.aBooleanArray18[local21] = true;
						local16.method1956();
						local16.aBoolean212 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt2265 == 0) {
				local16.method4763();
				this.anInt3558--;
			} else {
				local16.aBoolean212 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3558 != 8; local21++) {
			if (!Static164.aBooleanArray18[local21]) {
				@Pc(101) Class8_Sub4 local101 = new Class8_Sub4(arg0, arg1[local21], this, this.aLong119);
				this.aClass217_7.method5678(local101);
				this.anInt3558++;
				Static164.aBooleanArray18[local21] = true;
			}
		}
	}
}
