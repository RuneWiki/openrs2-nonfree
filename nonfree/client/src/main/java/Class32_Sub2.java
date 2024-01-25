import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	public int anInt1449;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
	public int anInt1452;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public int anInt1445 = 0;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Lclient!tg;")
	private Class195 aClass195_3 = new Class195();

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	private int anInt1446 = 0;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!eb;")
	public Class42 aClass42_5 = new Class42();

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
	private int anInt1450 = 0;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "Lclient!ci;")
	public final Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "[Lclient!hm;")
	public Class32_Sub3_Sub1_Sub1[] aClass32_Sub3_Sub1_Sub1Array1 = new Class32_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class32_Sub2(@OriginalArg(0) int arg0) {
		Static185.aClass195_5.method5300(this);
		this.aLong51 = arg0;
		this.aLong52 = arg0;
		this.aBoolean107 = true;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(J)V")
	public void method1396(@OriginalArg(0) long arg0) {
		this.aLong51 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lclient!jo;Z)V")
	private void method1397(@OriginalArg(0) Class107[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static57.aBooleanArray5[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub4_Sub18 local16 = (Class1_Sub4_Sub18) this.aClass42_5.method1543(); local16 != null; local16 = (Class1_Sub4_Sub18) this.aClass42_5.method1551()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass107_2 == arg0[local21] || local16.aClass107_2 == arg0[local21].aClass107_1) {
						Static57.aBooleanArray5[local21] = true;
						local16.method3868();
						continue label68;
					}
				}
			}
			local16.method6045();
			this.anInt1450--;
			if (local16.method5709()) {
				local16.method5714();
				Static129.anInt2808--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt1450 != 8; local21++) {
			if (!Static57.aBooleanArray5[local21]) {
				@Pc(93) Class1_Sub4_Sub18 local93 = null;
				if (Static78.method1685(arg0[local21].anInt3189).anInt3112 == 1 && Static129.anInt2808 < 32) {
					local93 = new Class1_Sub4_Sub18(arg0[local21], this);
					Static87.aClass141_1.method3761((long) arg0[local21].anInt3189, local93);
					Static129.anInt2808++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub4_Sub18(arg0[local21], this);
				}
				this.aClass42_5.method1549(local93);
				this.anInt1450++;
				Static57.aBooleanArray5[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()V")
	public void method1398() {
		this.aBoolean105 = true;
		for (@Pc(8) Class1_Sub4_Sub18 local8 = (Class1_Sub4_Sub18) this.aClass42_5.method1543(); local8 != null; local8 = (Class1_Sub4_Sub18) this.aClass42_5.method1551()) {
			if (local8.aClass102_1.anInt3112 == 1) {
				local8.method5714();
			}
		}
		this.aClass32_Sub3_Sub1_Sub1Array1 = new Class32_Sub3_Sub1_Sub1[8192];
		this.anInt1445 = 0;
		this.aClass195_3 = new Class195();
		this.anInt1446 = 0;
		this.aClass42_5 = new Class42();
		this.anInt1450 = 0;
		this.method5725();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!fp;J[Lclient!ai;[Lclient!jo;Z)V")
	public void method1399(@OriginalArg(0) Class63 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class6[] arg2, @OriginalArg(3) Class107[] arg3) {
		if (!this.aBoolean105) {
			this.method1401(arg0, arg2);
			this.method1397(arg3);
			this.aLong51 = arg1;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public void method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1449 = arg0;
		this.anInt1447 = arg1;
		this.anInt1448 = arg2;
		this.anInt1451 = arg3;
		this.anInt1452 = arg4;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!fp;[Lclient!ai;Z)V")
	private void method1401(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class6[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static57.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class32_Sub8 local16 = (Class32_Sub8) this.aClass195_3.method5302(); local16 != null; local16 = (Class32_Sub8) this.aClass195_3.method5298()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass6_2 == arg1[local21] || local16.aClass6_2 == arg1[local21].aClass6_1) {
						Static57.aBooleanArray6[local21] = true;
						local16.method5731();
						local16.aBoolean485 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6489 == 0) {
				local16.method5725();
				this.anInt1446--;
			} else {
				local16.aBoolean485 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt1446 != 8; local21++) {
			if (!Static57.aBooleanArray6[local21]) {
				@Pc(101) Class32_Sub8 local101 = new Class32_Sub8(arg0, arg1[local21], this, this.aLong51);
				this.aClass195_3.method5300(local101);
				this.anInt1446++;
				Static57.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "()V")
	public void method1402() {
		this.aClass26_1.aClass209_1.method5550();
		for (@Pc(10) Class32_Sub8 local10 = (Class32_Sub8) this.aClass195_3.method5302(); local10 != null; local10 = (Class32_Sub8) this.aClass195_3.method5298()) {
			local10.method5733(this.aLong52);
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "()Lclient!ci;")
	public Class26 method1403() {
		return this.aClass26_1;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "()V")
	public void method1404() {
		this.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "()V")
	private void method1405() {
		this.aBoolean106 = false;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "()V")
	public void method1406() {
		this.aBoolean107 = true;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!fp;J)Z")
	public boolean method1408(@OriginalArg(0) Class63 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong51 == this.aLong52) {
			this.method1405();
		} else {
			this.method1404();
		}
		if (arg1 - this.aLong51 > 750L) {
			this.method1398();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong52);
		@Pc(36) Class32_Sub8 local36;
		if (this.aBoolean107) {
			for (local36 = (Class32_Sub8) this.aClass195_3.method5302(); local36 != null; local36 = (Class32_Sub8) this.aClass195_3.method5298()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass132_1.anInt3913; local39++) {
					local36.method5730(1, arg1, arg0, !this.aBoolean106);
				}
			}
			this.aBoolean107 = false;
		}
		for (local36 = (Class32_Sub8) this.aClass195_3.method5302(); local36 != null; local36 = (Class32_Sub8) this.aClass195_3.method5298()) {
			local36.method5730(local27, arg1, arg0, !this.aBoolean106);
		}
		this.aLong52 = arg1;
		return true;
	}
}
