import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	public int anInt2168;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	public int anInt2170;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public int anInt2171;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public int anInt2164 = 0;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!bc;")
	private Class22 aClass22_4 = new Class22();

	@OriginalMember(owner = "client!g", name = "t", descriptor = "I")
	private int anInt2165 = 0;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!kr;")
	public Class138 aClass138_13 = new Class138();

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	private int anInt2166 = 0;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "Lclient!cs;")
	public final Class47 aClass47_2 = new Class47();

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[Lclient!rl;")
	public Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array1 = new Class12_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!g", name = "o", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
	public Class12_Sub4(@OriginalArg(0) int arg0) {
		Static156.aClass22_5.method286(this);
		this.aLong77 = arg0;
		this.aLong76 = arg0;
		this.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2170 = arg0;
		this.anInt2171 = arg1;
		this.anInt2169 = arg2;
		this.anInt2167 = arg3;
		this.anInt2168 = arg4;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!np;J)Z")
	public boolean method1794(@OriginalArg(0) Class155 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong77 == this.aLong76) {
			this.method1798();
		} else {
			this.method1799();
		}
		if (arg1 - this.aLong77 > 750L) {
			this.method1802();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong76);
		@Pc(36) Class12_Sub6 local36;
		if (this.aBoolean161) {
			for (local36 = (Class12_Sub6) this.aClass22_4.method291(); local36 != null; local36 = (Class12_Sub6) this.aClass22_4.method292()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass242_1.anInt6301; local39++) {
					local36.method4062(1, !this.aBoolean159, arg1, arg0);
				}
			}
			this.aBoolean161 = false;
		}
		for (local36 = (Class12_Sub6) this.aClass22_4.method291(); local36 != null; local36 = (Class12_Sub6) this.aClass22_4.method292()) {
			local36.method4062(local27, !this.aBoolean159, arg1, arg0);
		}
		this.aLong76 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([Lclient!mm;Z)V")
	private void method1796(@OriginalArg(0) Class158[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static111.aBooleanArray47[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class3_Sub7_Sub11 local16 = (Class3_Sub7_Sub11) this.aClass138_13.method3051(); local16 != null; local16 = (Class3_Sub7_Sub11) this.aClass138_13.method3050()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass158_2 == arg0[local21] || local16.aClass158_2 == arg0[local21].aClass158_1) {
						Static111.aBooleanArray47[local21] = true;
						local16.method4183();
						continue label68;
					}
				}
			}
			local16.method5700();
			this.anInt2166--;
			if (local16.method5672()) {
				local16.method5673();
				Static258.anInt4640--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt2166 != 8; local21++) {
			if (!Static111.aBooleanArray47[local21]) {
				@Pc(93) Class3_Sub7_Sub11 local93 = null;
				if (Static245.method4024(arg0[local21].anInt3921).anInt6442 == 1 && Static258.anInt4640 < 32) {
					local93 = new Class3_Sub7_Sub11(arg0[local21], this);
					Static247.aClass58_1.method1157((long) arg0[local21].anInt3921, local93);
					Static258.anInt4640++;
				}
				if (local93 == null) {
					local93 = new Class3_Sub7_Sub11(arg0[local21], this);
				}
				this.aClass138_13.method3053(local93);
				this.anInt2166++;
				Static111.aBooleanArray47[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "()Lclient!cs;")
	public Class47 method1797() {
		return this.aClass47_2;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "()V")
	private void method1798() {
		this.aBoolean159 = false;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "()V")
	public void method1799() {
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "()V")
	public void method1800() {
		this.aClass47_2.aClass32_1.method527();
		for (@Pc(10) Class12_Sub6 local10 = (Class12_Sub6) this.aClass22_4.method291(); local10 != null; local10 = (Class12_Sub6) this.aClass22_4.method292()) {
			local10.method4056(this.aLong76);
		}
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "()V")
	public void method1801() {
		this.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "()V")
	public void method1802() {
		this.aBoolean160 = true;
		for (@Pc(8) Class3_Sub7_Sub11 local8 = (Class3_Sub7_Sub11) this.aClass138_13.method3051(); local8 != null; local8 = (Class3_Sub7_Sub11) this.aClass138_13.method3050()) {
			if (local8.aClass250_1.anInt6442 == 1) {
				local8.method5673();
			}
		}
		this.aClass12_Sub1_Sub1_Sub1Array1 = new Class12_Sub1_Sub1_Sub1[8192];
		this.anInt2164 = 0;
		this.aClass22_4 = new Class22();
		this.anInt2165 = 0;
		this.aClass138_13 = new Class138();
		this.anInt2166 = 0;
		this.method5277();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!np;J[Lclient!vq;[Lclient!mm;Z)V")
	public void method1803(@OriginalArg(0) Class155 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class241[] arg2, @OriginalArg(3) Class158[] arg3) {
		if (!this.aBoolean160) {
			this.method1804(arg0, arg2);
			this.method1796(arg3);
			this.aLong77 = arg1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!np;[Lclient!vq;Z)V")
	private void method1804(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class241[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static111.aBooleanArray46[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class12_Sub6 local16 = (Class12_Sub6) this.aClass22_4.method291(); local16 != null; local16 = (Class12_Sub6) this.aClass22_4.method292()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass241_1 == arg1[local21] || local16.aClass241_1 == arg1[local21].aClass241_2) {
						Static111.aBooleanArray46[local21] = true;
						local16.method4057();
						local16.aBoolean348 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4454 == 0) {
				local16.method5277();
				this.anInt2165--;
			} else {
				local16.aBoolean348 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt2165 != 8; local21++) {
			if (!Static111.aBooleanArray46[local21]) {
				@Pc(101) Class12_Sub6 local101 = new Class12_Sub6(arg0, arg1[local21], this, this.aLong77);
				this.aClass22_4.method286(local101);
				this.anInt2165++;
				Static111.aBooleanArray46[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(J)V")
	public void method1805(@OriginalArg(0) long arg0) {
		this.aLong77 = arg0;
	}
}
