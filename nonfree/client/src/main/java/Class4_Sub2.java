import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
	public int anInt1399;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
	public int anInt1401;

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
	public int anInt1402;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
	public int anInt1403;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	public int anInt1396 = 0;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!wc;")
	private Class262 aClass262_4 = new Class262();

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
	private int anInt1397 = 0;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!sr;")
	public Class227 aClass227_6 = new Class227();

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
	private int anInt1398 = 0;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "Lclient!eu;")
	public final Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[Lclient!qv;")
	public Class4_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub2_Sub1Array1 = new Class4_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2(@OriginalArg(0) int arg0) {
		Static78.aClass262_8.method5815(this);
		this.aLong45 = arg0;
		this.aLong46 = arg0;
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
	public void method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1400 = arg0;
		this.anInt1402 = arg1;
		this.anInt1399 = arg2;
		this.anInt1401 = arg3;
		this.anInt1403 = arg4;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method1238(@OriginalArg(0) Class34 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong45 == this.aLong46) {
			this.method1239();
		} else {
			this.method1244();
		}
		if (arg1 - this.aLong45 > 750L) {
			this.method1247();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong46);
		@Pc(36) Class4_Sub3 local36;
		if (this.aBoolean163) {
			for (local36 = (Class4_Sub3) this.aClass262_4.method5819(); local36 != null; local36 = (Class4_Sub3) this.aClass262_4.method5813()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass73_1.anInt1870; local39++) {
					local36.method3345(arg1, 1, arg0, !this.aBoolean161);
				}
			}
			this.aBoolean163 = false;
		}
		for (local36 = (Class4_Sub3) this.aClass262_4.method5819(); local36 != null; local36 = (Class4_Sub3) this.aClass262_4.method5813()) {
			local36.method3345(arg1, local27, arg0, !this.aBoolean161);
		}
		this.aLong46 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "()V")
	private void method1239() {
		this.aBoolean161 = false;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "()Lclient!eu;")
	public Class71 method1240() {
		return this.aClass71_1;
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "()V")
	public void method1241() {
		this.aClass71_1.aClass95_1.method2136();
		for (@Pc(10) Class4_Sub3 local10 = (Class4_Sub3) this.aClass262_4.method5819(); local10 != null; local10 = (Class4_Sub3) this.aClass262_4.method5813()) {
			local10.method3343(this.aLong46);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!za;J[Lclient!su;[Lclient!op;Z)V")
	public void method1242(@OriginalArg(0) Class34 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class229[] arg2, @OriginalArg(3) Class181[] arg3) {
		if (!this.aBoolean162) {
			this.method1245(arg0, arg2);
			this.method1243(arg3);
			this.aLong45 = arg1;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([Lclient!op;Z)V")
	private void method1243(@OriginalArg(0) Class181[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static75.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub5_Sub13 local16 = (Class1_Sub5_Sub13) this.aClass227_6.method4967(); local16 != null; local16 = (Class1_Sub5_Sub13) this.aClass227_6.method4973()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass181_1 == arg0[local21] || local16.aClass181_1 == arg0[local21].aClass181_2) {
						Static75.aBooleanArray6[local21] = true;
						local16.method3689();
						continue label68;
					}
				}
			}
			local16.method5915();
			this.anInt1398--;
			if (local16.method5307()) {
				local16.method5305();
				Static132.anInt2382--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt1398 != 8; local21++) {
			if (!Static75.aBooleanArray6[local21]) {
				@Pc(93) Class1_Sub5_Sub13 local93 = null;
				if (arg0[local21].method4028().anInt3989 == 1 && Static132.anInt2382 < 32) {
					local93 = new Class1_Sub5_Sub13(arg0[local21], this);
					Static331.aClass33_1.method621(local93, (long) arg0[local21].anInt5140);
					Static132.anInt2382++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub5_Sub13(arg0[local21], this);
				}
				this.aClass227_6.method4972(local93);
				this.anInt1398++;
				Static75.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "()V")
	public void method1244() {
		this.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!za;[Lclient!su;Z)V")
	private void method1245(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class229[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static75.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class4_Sub3 local16 = (Class4_Sub3) this.aClass262_4.method5819(); local16 != null; local16 = (Class4_Sub3) this.aClass262_4.method5813()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass229_1 == arg1[local21] || local16.aClass229_1 == arg1[local21].aClass229_2) {
						Static75.aBooleanArray7[local21] = true;
						local16.method3342();
						local16.aBoolean468 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4139 == 0) {
				local16.method5572();
				this.anInt1397--;
			} else {
				local16.aBoolean468 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt1397 != 8; local21++) {
			if (!Static75.aBooleanArray7[local21]) {
				@Pc(101) Class4_Sub3 local101 = new Class4_Sub3(arg0, arg1[local21], this, this.aLong45);
				this.aClass262_4.method5815(local101);
				this.anInt1397++;
				Static75.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "()V")
	public void method1246() {
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "()V")
	public void method1247() {
		this.aBoolean162 = true;
		for (@Pc(8) Class1_Sub5_Sub13 local8 = (Class1_Sub5_Sub13) this.aClass227_6.method4967(); local8 != null; local8 = (Class1_Sub5_Sub13) this.aClass227_6.method4973()) {
			if (local8.aClass139_1.anInt3989 == 1) {
				local8.method5305();
			}
		}
		this.aClass4_Sub1_Sub2_Sub1Array1 = new Class4_Sub1_Sub2_Sub1[8192];
		this.anInt1396 = 0;
		this.aClass262_4 = new Class262();
		this.anInt1397 = 0;
		this.aClass227_6 = new Class227();
		this.anInt1398 = 0;
		this.method5572();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(J)V")
	public void method1248(@OriginalArg(0) long arg0) {
		this.aLong45 = arg0;
	}
}
