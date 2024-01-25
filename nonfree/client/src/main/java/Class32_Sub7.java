import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class32_Sub7 extends Class32 {

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
	public int anInt5609;

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
	public int anInt5610;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
	public int anInt5611;

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
	public int anInt5612;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Z")
	public boolean aBoolean461 = false;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
	public int anInt5607 = 0;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Lclient!cp;")
	private Class39 aClass39_6 = new Class39();

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
	private int anInt5608 = 0;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "Lclient!jm;")
	public Class103 aClass103_133 = new Class103();

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
	private int anInt5613 = 0;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "Lclient!ns;")
	public final Class146 aClass146_2 = new Class146();

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "[Lclient!ma;")
	public Class32_Sub3_Sub1_Sub1[] aClass32_Sub3_Sub1_Sub1Array1 = new Class32_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
	public Class32_Sub7(@OriginalArg(0) int arg0) {
		Static233.aClass39_5.method809(this);
		this.aLong190 = arg0;
		this.aLong189 = arg0;
		this.aBoolean462 = true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()Lclient!ns;")
	public Class146 method4955() {
		return this.aClass146_2;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([Lclient!od;Z)V")
	private void method4956(@OriginalArg(0) Class148[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static285.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class5_Sub1_Sub12 local16 = (Class5_Sub1_Sub12) this.aClass103_133.method2756(); local16 != null; local16 = (Class5_Sub1_Sub12) this.aClass103_133.method2748()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass148_1 == arg0[local21] || local16.aClass148_1 == arg0[local21].aClass148_2) {
						Static285.aBooleanArray21[local21] = true;
						local16.method3380();
						continue label68;
					}
				}
			}
			local16.method6005();
			this.anInt5613--;
			if (local16.method5969()) {
				local16.method5970();
				Static144.anInt2846--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt5613 != 8; local21++) {
			if (!Static285.aBooleanArray21[local21]) {
				@Pc(93) Class5_Sub1_Sub12 local93 = null;
				if (Static19.method356(arg0[local21].anInt4440).anInt6614 == 1 && Static144.anInt2846 < 32) {
					local93 = new Class5_Sub1_Sub12(arg0[local21], this);
					Static241.aClass97_1.method2517((long) arg0[local21].anInt4440, local93);
					Static144.anInt2846++;
				}
				if (local93 == null) {
					local93 = new Class5_Sub1_Sub12(arg0[local21], this);
				}
				this.aClass103_133.method2745(local93);
				this.anInt5613++;
				Static285.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "()V")
	public void method4957() {
		this.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "()V")
	private void method4958() {
		this.aBoolean460 = false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII)V")
	public void method4959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5611 = arg0;
		this.anInt5612 = arg1;
		this.anInt5610 = arg3;
		this.anInt5609 = arg4;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "()V")
	public void method4960() {
		this.aBoolean462 = true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ea;[Lclient!kg;Z)V")
	private void method4961(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class113[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static285.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class32_Sub2 local16 = (Class32_Sub2) this.aClass39_6.method806(); local16 != null; local16 = (Class32_Sub2) this.aClass39_6.method808()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass113_1 == arg1[local21] || local16.aClass113_1 == arg1[local21].aClass113_2) {
						Static285.aBooleanArray22[local21] = true;
						local16.method1734();
						local16.aBoolean129 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt1805 == 0) {
				local16.method5578();
				this.anInt5608--;
			} else {
				local16.aBoolean129 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt5608 != 8; local21++) {
			if (!Static285.aBooleanArray22[local21]) {
				@Pc(101) Class32_Sub2 local101 = new Class32_Sub2(arg0, arg1[local21], this, this.aLong190);
				this.aClass39_6.method809(local101);
				this.anInt5608++;
				Static285.aBooleanArray22[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "()V")
	public void method4962() {
		this.aBoolean461 = true;
		for (@Pc(8) Class5_Sub1_Sub12 local8 = (Class5_Sub1_Sub12) this.aClass103_133.method2756(); local8 != null; local8 = (Class5_Sub1_Sub12) this.aClass103_133.method2748()) {
			if (local8.aClass209_1.anInt6614 == 1) {
				local8.method5970();
			}
		}
		this.aClass32_Sub3_Sub1_Sub1Array1 = new Class32_Sub3_Sub1_Sub1[8192];
		this.anInt5607 = 0;
		this.aClass39_6 = new Class39();
		this.anInt5608 = 0;
		this.aClass103_133 = new Class103();
		this.anInt5613 = 0;
		this.method5578();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ea;J[Lclient!kg;[Lclient!od;Z)V")
	public void method4963(@OriginalArg(0) Class55 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class113[] arg2, @OriginalArg(3) Class148[] arg3) {
		if (!this.aBoolean461) {
			this.method4961(arg0, arg2);
			this.method4956(arg3);
			this.aLong190 = arg1;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(J)V")
	public void method4964(@OriginalArg(0) long arg0) {
		this.aLong190 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ea;J)Z")
	public boolean method4965(@OriginalArg(0) Class55 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong190 == this.aLong189) {
			this.method4958();
		} else {
			this.method4957();
		}
		if (arg1 - this.aLong190 > 750L) {
			this.method4962();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong189);
		@Pc(36) Class32_Sub2 local36;
		if (this.aBoolean462) {
			for (local36 = (Class32_Sub2) this.aClass39_6.method806(); local36 != null; local36 = (Class32_Sub2) this.aClass39_6.method808()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass150_1.anInt4586; local39++) {
					local36.method1727(arg1, arg0, !this.aBoolean460, 1);
				}
			}
			this.aBoolean462 = false;
		}
		for (local36 = (Class32_Sub2) this.aClass39_6.method806(); local36 != null; local36 = (Class32_Sub2) this.aClass39_6.method808()) {
			local36.method1727(arg1, arg0, !this.aBoolean460, local27);
		}
		this.aLong189 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "()V")
	public void method4966() {
		this.aClass146_2.aClass13_1.method304();
		for (@Pc(10) Class32_Sub2 local10 = (Class32_Sub2) this.aClass39_6.method806(); local10 != null; local10 = (Class32_Sub2) this.aClass39_6.method808()) {
			local10.method1731(this.aLong189);
		}
	}
}
