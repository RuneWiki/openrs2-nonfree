import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public int anInt4800;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
	public int anInt4801;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Z")
	private boolean aBoolean318 = false;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public int anInt4795 = 0;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Lclient!lc;")
	private Class126 aClass126_6 = new Class126();

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	private int anInt4796 = 0;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "Lclient!bd;")
	public Class18 aClass18_30 = new Class18();

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	private int anInt4799 = 0;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Z")
	private boolean aBoolean320 = false;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!jp;")
	public final Class109 aClass109_1 = new Class109();

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[Lclient!vf;")
	public Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array2 = new Class1_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		Static292.aClass126_7.method3401(this);
		this.aLong150 = arg0;
		this.aLong151 = arg0;
		this.aBoolean320 = true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
	private void method4316() {
		this.aBoolean318 = false;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([Lclient!jc;Z)V")
	private void method4317(@OriginalArg(0) Class101[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static248.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class14_Sub2_Sub5 local16 = (Class14_Sub2_Sub5) this.aClass18_30.method459(); local16 != null; local16 = (Class14_Sub2_Sub5) this.aClass18_30.method453()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass101_1 == arg0[local21] || local16.aClass101_1 == arg0[local21].aClass101_2) {
						Static248.aBooleanArray22[local21] = true;
						local16.method1315();
						continue label68;
					}
				}
			}
			local16.method5986();
			this.anInt4799--;
			if (local16.method5757()) {
				local16.method5760();
				Static187.anInt3853--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4799 != 8; local21++) {
			if (!Static248.aBooleanArray22[local21]) {
				@Pc(93) Class14_Sub2_Sub5 local93 = null;
				if (Static157.method3071(arg0[local21].anInt3055).anInt3771 == 1 && Static187.anInt3853 < 32) {
					local93 = new Class14_Sub2_Sub5(arg0[local21], this);
					Static253.aClass77_2.method2259(local93, (long) arg0[local21].anInt3055);
					Static187.anInt3853++;
				}
				if (local93 == null) {
					local93 = new Class14_Sub2_Sub5(arg0[local21], this);
				}
				this.aClass18_30.method451(local93);
				this.anInt4799++;
				Static248.aBooleanArray22[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!e;[Lclient!kh;Z)V")
	private void method4318(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class115[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static248.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass126_6.method3389(); local16 != null; local16 = (Class1_Sub2) this.aClass126_6.method3394()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass115_1 == arg1[local21] || local16.aClass115_1 == arg1[local21].aClass115_2) {
						Static248.aBooleanArray21[local21] = true;
						local16.method747();
						local16.aBoolean36 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt718 == 0) {
				local16.method5701();
				this.anInt4796--;
			} else {
				local16.aBoolean36 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4796 != 8; local21++) {
			if (!Static248.aBooleanArray21[local21]) {
				@Pc(101) Class1_Sub2 local101 = new Class1_Sub2(arg0, arg1[local21], this, this.aLong150);
				this.aClass126_6.method3401(local101);
				this.anInt4796++;
				Static248.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!e;J[Lclient!kh;[Lclient!jc;Z)V")
	public void method4319(@OriginalArg(0) Class46 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class115[] arg2, @OriginalArg(3) Class101[] arg3) {
		if (!this.aBoolean319) {
			this.method4318(arg0, arg2);
			this.method4317(arg3);
			this.aLong150 = arg1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "()Lclient!jp;")
	public Class109 method4320() {
		return this.aClass109_1;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "()V")
	public void method4322() {
		this.aBoolean320 = true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V")
	public void method4323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4798 = arg0;
		this.anInt4800 = arg1;
		this.anInt4801 = arg3;
		this.anInt4797 = arg4;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "()V")
	public void method4324() {
		this.aClass109_1.aClass70_1.method2176();
		for (@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass126_6.method3389(); local10 != null; local10 = (Class1_Sub2) this.aClass126_6.method3394()) {
			local10.method748(this.aLong151);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(J)V")
	public void method4325(@OriginalArg(0) long arg0) {
		this.aLong150 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "()V")
	public void method4326() {
		this.aBoolean319 = true;
		for (@Pc(8) Class14_Sub2_Sub5 local8 = (Class14_Sub2_Sub5) this.aClass18_30.method459(); local8 != null; local8 = (Class14_Sub2_Sub5) this.aClass18_30.method453()) {
			if (local8.aClass129_1.anInt3771 == 1) {
				local8.method5760();
			}
		}
		this.aClass1_Sub1_Sub1_Sub1Array2 = new Class1_Sub1_Sub1_Sub1[8192];
		this.anInt4795 = 0;
		this.aClass126_6 = new Class126();
		this.anInt4796 = 0;
		this.aClass18_30 = new Class18();
		this.anInt4799 = 0;
		this.method5701();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!e;J)Z")
	public boolean method4327(@OriginalArg(0) Class46 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong150 == this.aLong151) {
			this.method4316();
		} else {
			this.method4328();
		}
		if (arg1 - this.aLong150 > 750L) {
			this.method4326();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong151);
		@Pc(36) Class1_Sub2 local36;
		if (this.aBoolean320) {
			for (local36 = (Class1_Sub2) this.aClass126_6.method3389(); local36 != null; local36 = (Class1_Sub2) this.aClass126_6.method3394()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass167_1.anInt4968; local39++) {
					local36.method750(arg1, arg0, !this.aBoolean318, 1);
				}
			}
			this.aBoolean320 = false;
		}
		for (local36 = (Class1_Sub2) this.aClass126_6.method3389(); local36 != null; local36 = (Class1_Sub2) this.aClass126_6.method3394()) {
			local36.method750(arg1, arg0, !this.aBoolean318, local27);
		}
		this.aLong151 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "()V")
	public void method4328() {
		this.aBoolean318 = true;
	}
}
