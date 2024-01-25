import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	public int anInt3871;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	public int anInt3873;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	public int anInt3874;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "I")
	public int anInt3875;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
	private boolean aBoolean288 = false;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public int anInt3869 = 0;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
	public boolean aBoolean289 = false;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!du;")
	private Class56 aClass56_5 = new Class56();

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	private int anInt3870 = 0;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!sm;")
	public Class210 aClass210_28 = new Class210();

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	private int anInt3872 = 0;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Z")
	private boolean aBoolean290 = false;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Lclient!nd;")
	public final Class157 aClass157_1 = new Class157();

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[Lclient!mh;")
	public Class22_Sub4_Sub1_Sub1[] aClass22_Sub4_Sub1_Sub1Array2 = new Class22_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!m", name = "k", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V")
	public Class22_Sub6(@OriginalArg(0) int arg0) {
		Static35.aClass56_1.method1253(this);
		this.aLong128 = arg0;
		this.aLong129 = arg0;
		this.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()Lclient!nd;")
	public Class157 method3555() {
		return this.aClass157_1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Lclient!ta;Z)V")
	private void method3556(@OriginalArg(0) Class218[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static210.aBooleanArray88[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub1_Sub13 local16 = (Class2_Sub1_Sub13) this.aClass210_28.method5035(); local16 != null; local16 = (Class2_Sub1_Sub13) this.aClass210_28.method5037()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass218_1 == arg0[local21] || local16.aClass218_1 == arg0[local21].aClass218_2) {
						Static210.aBooleanArray88[local21] = true;
						local16.method4310();
						continue label68;
					}
				}
			}
			local16.method5745();
			this.anInt3872--;
			if (local16.method5747()) {
				local16.method5748();
				Static99.anInt1955--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3872 != 8; local21++) {
			if (!Static210.aBooleanArray88[local21]) {
				@Pc(93) Class2_Sub1_Sub13 local93 = null;
				if (Static165.method2707(arg0[local21].anInt5832).anInt575 == 1 && Static99.anInt1955 < 32) {
					local93 = new Class2_Sub1_Sub13(arg0[local21], this);
					Static307.aClass100_1.method2339(local93, (long) arg0[local21].anInt5832);
					Static99.anInt1955++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub1_Sub13(arg0[local21], this);
				}
				this.aClass210_28.method5044(local93);
				this.anInt3872++;
				Static210.aBooleanArray88[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "()V")
	public void method3557() {
		this.aBoolean289 = true;
		for (@Pc(8) Class2_Sub1_Sub13 local8 = (Class2_Sub1_Sub13) this.aClass210_28.method5035(); local8 != null; local8 = (Class2_Sub1_Sub13) this.aClass210_28.method5037()) {
			if (local8.aClass24_1.anInt575 == 1) {
				local8.method5748();
			}
		}
		this.aClass22_Sub4_Sub1_Sub1Array2 = new Class22_Sub4_Sub1_Sub1[8192];
		this.anInt3869 = 0;
		this.aClass56_5 = new Class56();
		this.anInt3870 = 0;
		this.aClass210_28 = new Class210();
		this.anInt3872 = 0;
		this.method5237();
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "()V")
	public void method3558() {
		this.aClass157_1.aClass228_1.method5367();
		for (@Pc(10) Class22_Sub7 local10 = (Class22_Sub7) this.aClass56_5.method1259(); local10 != null; local10 = (Class22_Sub7) this.aClass56_5.method1254()) {
			local10.method3634(this.aLong129);
		}
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "()V")
	private void method3559() {
		this.aBoolean288 = false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
	public void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3871 = arg0;
		this.anInt3876 = arg1;
		this.anInt3875 = arg2;
		this.anInt3873 = arg3;
		this.anInt3874 = arg4;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "()V")
	public void method3561() {
		this.aBoolean288 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!km;[Lclient!qm;Z)V")
	private void method3562(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class191[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static210.aBooleanArray87[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class22_Sub7 local16 = (Class22_Sub7) this.aClass56_5.method1259(); local16 != null; local16 = (Class22_Sub7) this.aClass56_5.method1254()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass191_1 == arg1[local21] || local16.aClass191_1 == arg1[local21].aClass191_2) {
						Static210.aBooleanArray87[local21] = true;
						local16.method3633();
						local16.aBoolean298 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3962 == 0) {
				local16.method5237();
				this.anInt3870--;
			} else {
				local16.aBoolean298 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3870 != 8; local21++) {
			if (!Static210.aBooleanArray87[local21]) {
				@Pc(101) Class22_Sub7 local101 = new Class22_Sub7(arg0, arg1[local21], this, this.aLong128);
				this.aClass56_5.method1253(local101);
				this.anInt3870++;
				Static210.aBooleanArray87[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!km;J)Z")
	public boolean method3563(@OriginalArg(0) Class82 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong128 == this.aLong129) {
			this.method3559();
		} else {
			this.method3561();
		}
		if (arg1 - this.aLong128 > 750L) {
			this.method3557();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong129);
		@Pc(36) Class22_Sub7 local36;
		if (this.aBoolean290) {
			for (local36 = (Class22_Sub7) this.aClass56_5.method1259(); local36 != null; local36 = (Class22_Sub7) this.aClass56_5.method1254()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass183_1.anInt5067; local39++) {
					local36.method3637(arg0, arg1, !this.aBoolean288, 1);
				}
			}
			this.aBoolean290 = false;
		}
		for (local36 = (Class22_Sub7) this.aClass56_5.method1259(); local36 != null; local36 = (Class22_Sub7) this.aClass56_5.method1254()) {
			local36.method3637(arg0, arg1, !this.aBoolean288, local27);
		}
		this.aLong129 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!km;J[Lclient!qm;[Lclient!ta;Z)V")
	public void method3564(@OriginalArg(0) Class82 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class191[] arg2, @OriginalArg(3) Class218[] arg3) {
		if (!this.aBoolean289) {
			this.method3562(arg0, arg2);
			this.method3556(arg3);
			this.aLong128 = arg1;
		}
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "()V")
	public void method3565() {
		this.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(J)V")
	public void method3566(@OriginalArg(0) long arg0) {
		this.aLong128 = arg0;
	}
}
