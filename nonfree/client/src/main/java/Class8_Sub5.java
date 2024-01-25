import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	public int anInt5766;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
	public boolean aBoolean440 = false;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
	public int anInt5764 = 0;

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "Lclient!eba;")
	private Class98 aClass98_6 = new Class98();

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
	private int anInt5765 = 0;

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "Lclient!ef;")
	public Class102 aClass102_40 = new Class102();

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "Z")
	private boolean aBoolean442 = false;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Z")
	public boolean aBoolean441 = false;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	private int anInt5767 = 0;

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "Lclient!jw;")
	public final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "[Lclient!om;")
	public final Class8_Sub8_Sub1_Sub1[] aClass8_Sub8_Sub1_Sub1Array1 = new Class8_Sub8_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IZ)V")
	public Class8_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4909(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ha;J[Lclient!jk;[Lclient!hja;Z)V")
	public void method4903(@OriginalArg(0) Class57 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class189[] arg2, @OriginalArg(3) Class161[] arg3) {
		if (!this.aBoolean440) {
			this.method4915(arg0, arg2);
			this.method4916(arg3);
			this.aLong177 = arg1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
	public void method4904() {
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()V")
	public void method4905() {
		this.aBoolean440 = true;
		for (@Pc(8) Class5_Sub5_Sub10 local8 = (Class5_Sub5_Sub10) this.aClass102_40.method1916(); local8 != null; local8 = (Class5_Sub5_Sub10) this.aClass102_40.method1915()) {
			if (local8.aClass92_1.anInt1838 == 1) {
				local8.method9186();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass8_Sub8_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass8_Sub8_Sub1_Sub1Array1[local27] != null) {
				this.aClass8_Sub8_Sub1_Sub1Array1[local27].method6335();
				this.aClass8_Sub8_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt5764 = 0;
		this.aClass98_6 = new Class98();
		this.anInt5765 = 0;
		this.aClass102_40 = new Class102();
		this.anInt5767 = 0;
		this.method8893();
		Static387.aClass8_Sub5Array1[Static544.anInt9264] = this;
		Static544.anInt9264 = Static544.anInt9264 + 1 & Static506.anIntArray617[Static554.anInt9335];
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	private void method4906() {
		this.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ha;)V")
	public void method4907(@OriginalArg(0) Class57 arg0) {
		this.aClass193_1.aClass154_1.method3047();
		for (@Pc(10) Class8_Sub2 local10 = (Class8_Sub2) this.aClass98_6.method1777(); local10 != null; local10 = (Class8_Sub2) this.aClass98_6.method1782()) {
			local10.method769(arg0, this.aLong178);
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "()Lclient!jw;")
	public Class193 method4908() {
		this.aClass193_1.aClass154_1.method3047();
		for (@Pc(6) int local6 = 0; local6 < this.aClass8_Sub8_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass8_Sub8_Sub1_Sub1Array1[local6] != null && this.aClass8_Sub8_Sub1_Sub1Array1[local6].aClass8_Sub2_1 != null) {
				this.aClass193_1.aClass154_1.method3046(this.aClass8_Sub8_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass193_1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
	public void method4909(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static120.aClass98_2.method1780(this);
		this.aLong177 = (long) arg0;
		this.aLong178 = (long) arg0;
		this.aBoolean442 = true;
		this.aBoolean441 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method4910(@OriginalArg(0) Class57 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong177 == this.aLong178) {
			this.method4906();
		} else {
			this.method4913();
		}
		if (arg1 - this.aLong177 > 750L) {
			this.method4905();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong178);
		@Pc(36) Class8_Sub2 local36;
		if (this.aBoolean442) {
			for (local36 = (Class8_Sub2) this.aClass98_6.method1777(); local36 != null; local36 = (Class8_Sub2) this.aClass98_6.method1782()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass184_1.anInt4697; local39++) {
					local36.method770(!this.aBoolean439, arg0, 1, arg1);
				}
			}
			this.aBoolean442 = false;
		}
		for (local36 = (Class8_Sub2) this.aClass98_6.method1777(); local36 != null; local36 = (Class8_Sub2) this.aClass98_6.method1782()) {
			local36.method770(!this.aBoolean439, arg0, local27, arg1);
		}
		this.aLong178 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "()Lclient!jw;")
	public Class193 method4912() {
		return this.aClass193_1;
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "()V")
	public void method4913() {
		this.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ha;[Lclient!jk;Z)V")
	private void method4915(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class189[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static321.aBooleanArray8[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class8_Sub2 local16 = (Class8_Sub2) this.aClass98_6.method1777(); local16 != null; local16 = (Class8_Sub2) this.aClass98_6.method1782()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass189_1 == arg1[local21] || local16.aClass189_1 == arg1[local21].aClass189_2) {
						Static321.aBooleanArray8[local21] = true;
						local16.method767();
						local16.aBoolean66 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt806 == 0) {
				local16.method8893();
				this.anInt5765--;
			} else {
				local16.aBoolean66 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt5765 != 32; local21++) {
			if (!Static321.aBooleanArray8[local21]) {
				@Pc(104) Class8_Sub2 local104 = new Class8_Sub2(arg0, arg1[local21], this, this.aLong177);
				this.aClass98_6.method1780(local104);
				this.anInt5765++;
				Static321.aBooleanArray8[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([Lclient!hja;Z)V")
	private void method4916(@OriginalArg(0) Class161[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static321.aBooleanArray9[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class5_Sub5_Sub10 local16 = (Class5_Sub5_Sub10) this.aClass102_40.method1916(); local16 != null; local16 = (Class5_Sub5_Sub10) this.aClass102_40.method1915()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass161_2 == arg0[local21] || local16.aClass161_2 == arg0[local21].aClass161_1) {
						Static321.aBooleanArray9[local21] = true;
						local16.method3238();
						continue label71;
					}
				}
			}
			local16.method9327(1);
			this.anInt5767--;
			if (local16.method9187()) {
				local16.method9186();
				Static147.anInt2372--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt5767 != 8; local21++) {
			if (!Static321.aBooleanArray9[local21]) {
				@Pc(96) Class5_Sub5_Sub10 local96 = null;
				if (arg0[local21].method3220().anInt1838 == 1 && Static147.anInt2372 < 32) {
					local96 = new Class5_Sub5_Sub10(arg0[local21], this);
					Static348.aClass195_1.method4401((long) arg0[local21].anInt3674, local96);
					Static147.anInt2372++;
				}
				if (local96 == null) {
					local96 = new Class5_Sub5_Sub10(arg0[local21], this);
				}
				this.aClass102_40.method1921(local96);
				this.anInt5767++;
				Static321.aBooleanArray9[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
	public void method4917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5766 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(J)V")
	public void method4918(@OriginalArg(0) long arg0) {
		this.aLong177 = arg0;
	}
}
