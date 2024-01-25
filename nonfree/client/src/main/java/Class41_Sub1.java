import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public int anInt1158;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public int anInt1159;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
	public int anInt1161;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public int anInt1162;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public int anInt1156 = 0;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!ik;")
	private Class117 aClass117_3 = new Class117();

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private int anInt1157 = 0;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!pu;")
	public Class203 aClass203_5 = new Class203();

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	private int anInt1163 = 0;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!d;")
	public final Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "[Lclient!os;")
	public Class41_Sub3_Sub2_Sub1[] aClass41_Sub3_Sub2_Sub1Array1 = new Class41_Sub3_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class41_Sub1(@OriginalArg(0) int arg0) {
		Static30.aClass117_1.method2961(this);
		this.aLong34 = arg0;
		this.aLong35 = arg0;
		this.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!za;[Lclient!gh;Z)V")
	private void method870(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class94[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static46.aBooleanArray5[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class41_Sub5 local16 = (Class41_Sub5) this.aClass117_3.method2967(); local16 != null; local16 = (Class41_Sub5) this.aClass117_3.method2970()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass94_2 == arg1[local21] || local16.aClass94_2 == arg1[local21].aClass94_1) {
						Static46.aBooleanArray5[local21] = true;
						local16.method3474();
						local16.aBoolean284 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4483 == 0) {
				local16.method5447();
				this.anInt1157--;
			} else {
				local16.aBoolean284 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt1157 != 8; local21++) {
			if (!Static46.aBooleanArray5[local21]) {
				@Pc(101) Class41_Sub5 local101 = new Class41_Sub5(arg0, arg1[local21], this, this.aLong34);
				this.aClass117_3.method2961(local101);
				this.anInt1157++;
				Static46.aBooleanArray5[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!za;J[Lclient!gh;[Lclient!hv;Z)V")
	public void method871(@OriginalArg(0) Class106 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class94[] arg2, @OriginalArg(3) Class114[] arg3) {
		if (!this.aBoolean73) {
			this.method870(arg0, arg2);
			this.method880(arg3);
			this.aLong34 = arg1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	private void method872() {
		this.aBoolean74 = false;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	public void method873() {
		this.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method874(@OriginalArg(0) Class106 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong34 == this.aLong35) {
			this.method872();
		} else {
			this.method873();
		}
		if (arg1 - this.aLong34 > 750L) {
			this.method879();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong35);
		@Pc(36) Class41_Sub5 local36;
		if (this.aBoolean75) {
			for (local36 = (Class41_Sub5) this.aClass117_3.method2967(); local36 != null; local36 = (Class41_Sub5) this.aClass117_3.method2970()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass257_1.anInt7562; local39++) {
					local36.method3476(arg1, arg0, !this.aBoolean74, 1);
				}
			}
			this.aBoolean75 = false;
		}
		for (local36 = (Class41_Sub5) this.aClass117_3.method2967(); local36 != null; local36 = (Class41_Sub5) this.aClass117_3.method2970()) {
			local36.method3476(arg1, arg0, !this.aBoolean74, local27);
		}
		this.aLong35 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()Lclient!d;")
	public Class51 method875() {
		return this.aClass51_1;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "()V")
	public void method877() {
		this.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(J)V")
	public void method878(@OriginalArg(0) long arg0) {
		this.aLong34 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "()V")
	public void method879() {
		this.aBoolean73 = true;
		for (@Pc(8) Class1_Sub1_Sub7 local8 = (Class1_Sub1_Sub7) this.aClass203_5.method4548(); local8 != null; local8 = (Class1_Sub1_Sub7) this.aClass203_5.method4545()) {
			if (local8.aClass180_1.anInt5342 == 1) {
				local8.method6125();
			}
		}
		this.aClass41_Sub3_Sub2_Sub1Array1 = new Class41_Sub3_Sub2_Sub1[8192];
		this.anInt1156 = 0;
		this.aClass117_3 = new Class117();
		this.anInt1157 = 0;
		this.aClass203_5 = new Class203();
		this.anInt1163 = 0;
		this.method5447();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lclient!hv;Z)V")
	private void method880(@OriginalArg(0) Class114[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static46.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub1_Sub7 local16 = (Class1_Sub1_Sub7) this.aClass203_5.method4548(); local16 != null; local16 = (Class1_Sub1_Sub7) this.aClass203_5.method4545()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass114_1 == arg0[local21] || local16.aClass114_1 == arg0[local21].aClass114_2) {
						Static46.aBooleanArray6[local21] = true;
						local16.method1365();
						continue label68;
					}
				}
			}
			local16.method6178();
			this.anInt1163--;
			if (local16.method6129()) {
				local16.method6125();
				Static332.anInt6403--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt1163 != 8; local21++) {
			if (!Static46.aBooleanArray6[local21]) {
				@Pc(93) Class1_Sub1_Sub7 local93 = null;
				if (arg0[local21].method2700().anInt5342 == 1 && Static332.anInt6403 < 32) {
					local93 = new Class1_Sub1_Sub7(arg0[local21], this);
					Static210.aClass204_1.method4559(local93, (long) arg0[local21].anInt3458);
					Static332.anInt6403++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub1_Sub7(arg0[local21], this);
				}
				this.aClass203_5.method4551(local93);
				this.anInt1163++;
				Static46.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "()V")
	public void method881() {
		this.aClass51_1.aClass60_1.method1508();
		for (@Pc(10) Class41_Sub5 local10 = (Class41_Sub5) this.aClass117_3.method2967(); local10 != null; local10 = (Class41_Sub5) this.aClass117_3.method2970()) {
			local10.method3473(this.aLong35);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	public void method882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1159 = arg0;
		this.anInt1162 = arg1;
		this.anInt1160 = arg2;
		this.anInt1161 = arg3;
		this.anInt1158 = arg4;
	}
}
