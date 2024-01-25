import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public int anInt784 = 0;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!st;")
	private Class227 aClass227_3 = new Class227();

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
	private int anInt785 = 0;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!vp;")
	public Class254 aClass254_7 = new Class254();

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
	private int anInt786 = 0;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Lclient!po;")
	public final Class194 aClass194_1 = new Class194();

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "[Lclient!jv;")
	public Class13_Sub1_Sub1_Sub1[] aClass13_Sub1_Sub1_Sub1Array1 = new Class13_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class13_Sub2(@OriginalArg(0) int arg0) {
		Static358.aClass227_5.method4832(this);
		this.aLong29 = arg0;
		this.aLong30 = arg0;
		this.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(J)V")
	public void method695(@OriginalArg(0) long arg0) {
		this.aLong29 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "()V")
	private void method696() {
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	public void method697() {
		this.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!qa;[Lclient!u;Z)V")
	private void method698(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class239[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static46.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class13_Sub7 local16 = (Class13_Sub7) this.aClass227_3.method4827(); local16 != null; local16 = (Class13_Sub7) this.aClass227_3.method4834()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass239_2 == arg1[local21] || local16.aClass239_2 == arg1[local21].aClass239_1) {
						Static46.aBooleanArray7[local21] = true;
						local16.method5043();
						local16.aBoolean537 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6567 == 0) {
				local16.method5413();
				this.anInt785--;
			} else {
				local16.aBoolean537 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt785 != 8; local21++) {
			if (!Static46.aBooleanArray7[local21]) {
				@Pc(101) Class13_Sub7 local101 = new Class13_Sub7(arg0, arg1[local21], this, this.aLong29);
				this.aClass227_3.method4832(local101);
				this.anInt785++;
				Static46.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "()V")
	public void method699() {
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!qa;J[Lclient!u;[Lclient!at;Z)V")
	public void method700(@OriginalArg(0) Class128 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class239[] arg2, @OriginalArg(3) Class15[] arg3) {
		if (!this.aBoolean61) {
			this.method698(arg0, arg2);
			this.method706(arg3);
			this.aLong29 = arg1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method701(@OriginalArg(0) Class128 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong29 == this.aLong30) {
			this.method696();
		} else {
			this.method699();
		}
		if (arg1 - this.aLong29 > 750L) {
			this.method705();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong30);
		@Pc(36) Class13_Sub7 local36;
		if (this.aBoolean63) {
			for (local36 = (Class13_Sub7) this.aClass227_3.method4827(); local36 != null; local36 = (Class13_Sub7) this.aClass227_3.method4834()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass131_1.anInt3313; local39++) {
					local36.method5042(1, arg1, !this.aBoolean62, arg0);
				}
			}
			this.aBoolean63 = false;
		}
		for (local36 = (Class13_Sub7) this.aClass227_3.method4827(); local36 != null; local36 = (Class13_Sub7) this.aClass227_3.method4834()) {
			local36.method5042(local27, arg1, !this.aBoolean62, arg0);
		}
		this.aLong30 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "()Lclient!po;")
	public Class194 method702() {
		return this.aClass194_1;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "()V")
	public void method703() {
		this.aClass194_1.aClass46_1.method987();
		for (@Pc(10) Class13_Sub7 local10 = (Class13_Sub7) this.aClass227_3.method4827(); local10 != null; local10 = (Class13_Sub7) this.aClass227_3.method4834()) {
			local10.method5039(this.aLong30);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	public void method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt789 = arg0;
		this.anInt788 = arg1;
		this.anInt790 = arg2;
		this.anInt787 = arg3;
		this.anInt791 = arg4;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "()V")
	public void method705() {
		this.aBoolean61 = true;
		for (@Pc(8) Class1_Sub3_Sub5 local8 = (Class1_Sub3_Sub5) this.aClass254_7.method5437(); local8 != null; local8 = (Class1_Sub3_Sub5) this.aClass254_7.method5433()) {
			if (local8.aClass216_1.anInt5843 == 1) {
				local8.method5312();
			}
		}
		this.aClass13_Sub1_Sub1_Sub1Array1 = new Class13_Sub1_Sub1_Sub1[8192];
		this.anInt784 = 0;
		this.aClass227_3 = new Class227();
		this.anInt785 = 0;
		this.aClass254_7 = new Class254();
		this.anInt786 = 0;
		this.method5413();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([Lclient!at;Z)V")
	private void method706(@OriginalArg(0) Class15[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static46.aBooleanArray8[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub3_Sub5 local16 = (Class1_Sub3_Sub5) this.aClass254_7.method5437(); local16 != null; local16 = (Class1_Sub3_Sub5) this.aClass254_7.method5433()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass15_2 == arg0[local21] || local16.aClass15_2 == arg0[local21].aClass15_1) {
						Static46.aBooleanArray8[local21] = true;
						local16.method1285();
						continue label68;
					}
				}
			}
			local16.method5617();
			this.anInt786--;
			if (local16.method5313()) {
				local16.method5312();
				Static109.anInt1929--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt786 != 8; local21++) {
			if (!Static46.aBooleanArray8[local21]) {
				@Pc(93) Class1_Sub3_Sub5 local93 = null;
				if (arg0[local21].method278().anInt5843 == 1 && Static109.anInt1929 < 32) {
					local93 = new Class1_Sub3_Sub5(arg0[local21], this);
					Static434.aClass55_2.method1223(local93, (long) arg0[local21].anInt338);
					Static109.anInt1929++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub3_Sub5(arg0[local21], this);
				}
				this.aClass254_7.method5430(local93);
				this.anInt786++;
				Static46.aBooleanArray8[local21] = true;
			}
		}
	}
}
