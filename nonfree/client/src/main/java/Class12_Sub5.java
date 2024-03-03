import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "[Z")
	private static final boolean[] aBooleanArray38 = new boolean[8];

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[Z")
	private static final boolean[] aBooleanArray39 = new boolean[8];

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public int anInt4666;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	public int anInt4667;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	public int anInt4668;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	public int anInt4670;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
	public int anInt4671;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
	public boolean aBoolean322 = false;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	public int anInt4664 = 0;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!cm;")
	private Class36 aClass36_5 = new Class36();

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	private int anInt4665 = 0;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!ld;")
	public Class135 aClass135_29 = new Class135();

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	private int anInt4669 = 0;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
	private boolean aBoolean324 = false;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Lclient!tp;")
	public final Class224 aClass224_2 = new Class224();

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "[Lclient!ns;")
	public Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array2 = new Class12_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V", line = 331)
	public Class12_Sub5(@OriginalArg(0) int arg0) {
		Static122.aClass36_4.method1420(this);
		this.aLong138 = arg0;
		this.aLong137 = arg0;
		this.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V", line = 5)
	public void method4351() {
		this.aClass224_2.aClass191_1.method4893();
		for (@Pc(10) Class12_Sub8 local10 = (Class12_Sub8) this.aClass36_5.method1417(); local10 != null; local10 = (Class12_Sub8) this.aClass36_5.method1422()) {
			local10.method5689(this.aLong137);
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V", line = 20)
	private void method4352() {
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wm;J)Z", line = 26)
	public boolean method4353(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong138 == this.aLong137) {
			this.method4352();
		} else {
			this.method4355();
		}
		if (arg1 - this.aLong138 > 750L) {
			this.method4357();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong137);
		@Pc(36) Class12_Sub8 local36;
		if (this.aBoolean324) {
			for (local36 = (Class12_Sub8) this.aClass36_5.method1417(); local36 != null; local36 = (Class12_Sub8) this.aClass36_5.method1422()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass235_1.anInt6592; local39++) {
					local36.method5687(arg1, arg0, 1, !this.aBoolean323);
				}
			}
			this.aBoolean324 = false;
		}
		for (local36 = (Class12_Sub8) this.aClass36_5.method1417(); local36 != null; local36 = (Class12_Sub8) this.aClass36_5.method1422()) {
			local36.method5687(arg1, arg0, local27, !this.aBoolean323);
		}
		this.aLong137 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wm;[Lclient!jf;Z)V", line = 77)
	private void method4354(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class114[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			aBooleanArray39[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class12_Sub8 local16 = (Class12_Sub8) this.aClass36_5.method1417(); local16 != null; local16 = (Class12_Sub8) this.aClass36_5.method1422()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass114_2 == arg1[local21] || local16.aClass114_2 == arg1[local21].aClass114_1) {
						aBooleanArray39[local21] = true;
						local16.method5690();
						local16.aBoolean422 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6241 == 0) {
				local16.method5685();
				this.anInt4665--;
			} else {
				local16.aBoolean422 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4665 != 8; local21++) {
			if (!aBooleanArray39[local21]) {
				@Pc(101) Class12_Sub8 local101 = new Class12_Sub8(arg0, arg1[local21], this, this.aLong138);
				this.aClass36_5.method1420(local101);
				this.anInt4665++;
				aBooleanArray39[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "()V", line = 149)
	public void method4355() {
		this.aBoolean323 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(J)V", line = 153)
	public void method4356(@OriginalArg(0) long arg0) {
		this.aLong138 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "()V", line = 159)
	public void method4357() {
		this.aBoolean322 = true;
		for (@Pc(8) Class2_Sub2_Sub5 local8 = (Class2_Sub2_Sub5) this.aClass135_29.method3552(); local8 != null; local8 = (Class2_Sub2_Sub5) this.aClass135_29.method3553()) {
			if (local8.aClass28_1.anInt737 == 1) {
				local8.method6144();
			}
		}
		this.aClass12_Sub1_Sub1_Sub1Array2 = new Class12_Sub1_Sub1_Sub1[8192];
		this.anInt4664 = 0;
		this.aClass36_5 = new Class36();
		this.anInt4665 = 0;
		this.aClass135_29 = new Class135();
		this.anInt4669 = 0;
		this.method5685();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wm;J[Lclient!jf;[Lclient!nm;Z)V", line = 180)
	public void method4358(@OriginalArg(0) Class19 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class114[] arg2, @OriginalArg(3) Class163[] arg3) {
		if (!this.aBoolean322) {
			this.method4354(arg0, arg2);
			this.method4363(arg3);
			this.aLong138 = arg1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "()Lclient!tp;", line = 189)
	public Class224 method4359() {
		return this.aClass224_2;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "()V", line = 193)
	public void method4360() {
		this.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V", line = 203)
	public void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4670 = arg0;
		this.anInt4668 = arg1;
		this.anInt4667 = arg2;
		this.anInt4671 = arg3;
		this.anInt4666 = arg4;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([Lclient!nm;Z)V", line = 212)
	private void method4363(@OriginalArg(0) Class163[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			aBooleanArray38[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub2_Sub5 local16 = (Class2_Sub2_Sub5) this.aClass135_29.method3552(); local16 != null; local16 = (Class2_Sub2_Sub5) this.aClass135_29.method3553()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass163_1 == arg0[local21] || local16.aClass163_1 == arg0[local21].aClass163_2) {
						aBooleanArray38[local21] = true;
						local16.method1566();
						continue label68;
					}
				}
			}
			local16.method6469();
			this.anInt4669--;
			if (local16.method6143()) {
				local16.method6144();
				Class141.anInt3697--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4669 != 8; local21++) {
			if (!aBooleanArray38[local21]) {
				@Pc(93) Class2_Sub2_Sub5 local93 = null;
				if (Static291.method5368(arg0[local21].anInt4323).anInt737 == 1 && Class141.anInt3697 < 32) {
					local93 = new Class2_Sub2_Sub5(arg0[local21], this);
					Class2_Sub3_Sub15.aClass115_1.method2979((long) arg0[local21].anInt4323, local93);
					Class141.anInt3697++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub2_Sub5(arg0[local21], this);
				}
				this.aClass135_29.method3541(local93);
				this.anInt4669++;
				aBooleanArray38[local21] = true;
			}
		}
	}
}
