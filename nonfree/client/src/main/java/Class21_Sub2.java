import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
	public int anInt784 = 0;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Lclient!gs;")
	private Class93 aClass93_1 = new Class93();

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	private int anInt785 = 0;

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "Lclient!mg;")
	public Class156 aClass156_6 = new Class156();

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
	private int anInt790 = 0;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "Lclient!vk;")
	public final Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "[Lclient!be;")
	public Class21_Sub1_Sub1_Sub1[] aClass21_Sub1_Sub1_Sub1Array1 = new Class21_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I)V")
	public Class21_Sub2(@OriginalArg(0) int arg0) {
		Static343.aClass93_6.method2079(this);
		this.aLong28 = arg0;
		this.aLong27 = arg0;
		this.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method631(@OriginalArg(0) Class163 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong28 == this.aLong27) {
			this.method640();
		} else {
			this.method635();
		}
		if (arg1 - this.aLong28 > 750L) {
			this.method633();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong27);
		@Pc(36) Class21_Sub3 local36;
		if (this.aBoolean70) {
			for (local36 = (Class21_Sub3) this.aClass93_1.method2080(); local36 != null; local36 = (Class21_Sub3) this.aClass93_1.method2081()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass152_1.anInt3856; local39++) {
					local36.method2118(arg0, 1, !this.aBoolean69, arg1);
				}
			}
			this.aBoolean70 = false;
		}
		for (local36 = (Class21_Sub3) this.aClass93_1.method2080(); local36 != null; local36 = (Class21_Sub3) this.aClass93_1.method2081()) {
			local36.method2118(arg0, local27, !this.aBoolean69, arg1);
		}
		this.aLong27 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!za;[Lclient!mf;Z)V")
	private void method632(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class155[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static42.aBooleanArray4[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class21_Sub3 local16 = (Class21_Sub3) this.aClass93_1.method2080(); local16 != null; local16 = (Class21_Sub3) this.aClass93_1.method2081()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass155_1 == arg1[local21] || local16.aClass155_1 == arg1[local21].aClass155_2) {
						Static42.aBooleanArray4[local21] = true;
						local16.method2117();
						local16.aBoolean168 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt2578 == 0) {
				local16.method5593();
				this.anInt785--;
			} else {
				local16.aBoolean168 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt785 != 8; local21++) {
			if (!Static42.aBooleanArray4[local21]) {
				@Pc(101) Class21_Sub3 local101 = new Class21_Sub3(arg0, arg1[local21], this, this.aLong28);
				this.aClass93_1.method2079(local101);
				this.anInt785++;
				Static42.aBooleanArray4[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
	public void method633() {
		this.aBoolean68 = true;
		for (@Pc(8) Class2_Sub5_Sub1 local8 = (Class2_Sub5_Sub1) this.aClass156_6.method3155(); local8 != null; local8 = (Class2_Sub5_Sub1) this.aClass156_6.method3150()) {
			if (local8.aClass228_1.anInt6215 == 1) {
				local8.method5621();
			}
		}
		this.aClass21_Sub1_Sub1_Sub1Array1 = new Class21_Sub1_Sub1_Sub1[8192];
		this.anInt784 = 0;
		this.aClass93_1 = new Class93();
		this.anInt785 = 0;
		this.aClass156_6 = new Class156();
		this.anInt790 = 0;
		this.method5593();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "()Lclient!vk;")
	public Class256 method634() {
		return this.aClass256_1;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "()V")
	public void method635() {
		this.aBoolean69 = true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(J)V")
	public void method636(@OriginalArg(0) long arg0) {
		this.aLong28 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIII)V")
	public void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt786 = arg0;
		this.anInt789 = arg1;
		this.anInt788 = arg2;
		this.anInt787 = arg3;
		this.anInt791 = arg4;
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "()V")
	public void method638() {
		this.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "()V")
	private void method640() {
		this.aBoolean69 = false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!za;J[Lclient!mf;[Lclient!qe;Z)V")
	public void method641(@OriginalArg(0) Class163 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class155[] arg2, @OriginalArg(3) Class199[] arg3) {
		if (!this.aBoolean68) {
			this.method632(arg0, arg2);
			this.method643(arg3);
			this.aLong28 = arg1;
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "()V")
	public void method642() {
		this.aClass256_1.aClass187_1.method3975();
		for (@Pc(10) Class21_Sub3 local10 = (Class21_Sub3) this.aClass93_1.method2080(); local10 != null; local10 = (Class21_Sub3) this.aClass93_1.method2081()) {
			local10.method2116(this.aLong27);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lclient!qe;Z)V")
	private void method643(@OriginalArg(0) Class199[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static42.aBooleanArray5[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub5_Sub1 local16 = (Class2_Sub5_Sub1) this.aClass156_6.method3155(); local16 != null; local16 = (Class2_Sub5_Sub1) this.aClass156_6.method3150()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass199_1 == arg0[local21] || local16.aClass199_1 == arg0[local21].aClass199_2) {
						Static42.aBooleanArray5[local21] = true;
						local16.method499();
						continue label68;
					}
				}
			}
			local16.method5703();
			this.anInt790--;
			if (local16.method5624()) {
				local16.method5621();
				Static450.anInt7196--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt790 != 8; local21++) {
			if (!Static42.aBooleanArray5[local21]) {
				@Pc(93) Class2_Sub5_Sub1 local93 = null;
				if (arg0[local21].method4353().anInt6215 == 1 && Static450.anInt7196 < 32) {
					local93 = new Class2_Sub5_Sub1(arg0[local21], this);
					Static54.aClass235_1.method4968(local93, (long) arg0[local21].anInt5506);
					Static450.anInt7196++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub5_Sub1(arg0[local21], this);
				}
				this.aClass156_6.method3157(local93);
				this.anInt790++;
				Static42.aBooleanArray5[local21] = true;
			}
		}
	}
}
