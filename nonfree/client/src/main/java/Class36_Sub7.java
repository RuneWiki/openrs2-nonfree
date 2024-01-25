import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class36_Sub7 extends Class36 {

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
	public int anInt6156;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
	public int anInt6157;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	public int anInt6158;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
	public int anInt6159;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public int anInt6161;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public int anInt6154 = 0;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
	public boolean aBoolean500 = false;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!uj;")
	private Class242 aClass242_7 = new Class242();

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	private int anInt6155 = 0;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!ko;")
	public Class142 aClass142_44 = new Class142();

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	private int anInt6160 = 0;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!gn;")
	public final Class101 aClass101_2 = new Class101();

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "[Lclient!ff;")
	public Class36_Sub3_Sub1_Sub1[] aClass36_Sub3_Sub1_Sub1Array3 = new Class36_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
	public Class36_Sub7(@OriginalArg(0) int arg0) {
		Static158.aClass242_2.method5501(this);
		this.aLong177 = arg0;
		this.aLong178 = arg0;
		this.aBoolean501 = true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!qa;[Lclient!qr;Z)V")
	private void method4872(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class203[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static339.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class36_Sub6 local16 = (Class36_Sub6) this.aClass242_7.method5503(); local16 != null; local16 = (Class36_Sub6) this.aClass242_7.method5506()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass203_1 == arg1[local21] || local16.aClass203_1 == arg1[local21].aClass203_2) {
						Static339.aBooleanArray21[local21] = true;
						local16.method4278();
						local16.aBoolean426 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5287 == 0) {
				local16.method5131();
				this.anInt6155--;
			} else {
				local16.aBoolean426 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt6155 != 8; local21++) {
			if (!Static339.aBooleanArray21[local21]) {
				@Pc(101) Class36_Sub6 local101 = new Class36_Sub6(arg0, arg1[local21], this, this.aLong177);
				this.aClass242_7.method5501(local101);
				this.anInt6155++;
				Static339.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!qa;J[Lclient!qr;[Lclient!wq;Z)V")
	public void method4873(@OriginalArg(0) Class121 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class203[] arg2, @OriginalArg(3) Class265[] arg3) {
		if (!this.aBoolean500) {
			this.method4872(arg0, arg2);
			this.method4876(arg3);
			this.aLong177 = arg1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()Lclient!gn;")
	public Class101 method4874() {
		return this.aClass101_2;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
	public void method4875() {
		this.aClass101_2.aClass95_1.method1889();
		for (@Pc(10) Class36_Sub6 local10 = (Class36_Sub6) this.aClass242_7.method5503(); local10 != null; local10 = (Class36_Sub6) this.aClass242_7.method5506()) {
			local10.method4279(this.aLong178);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lclient!wq;Z)V")
	private void method4876(@OriginalArg(0) Class265[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static339.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub1_Sub8 local16 = (Class1_Sub1_Sub8) this.aClass142_44.method3199(); local16 != null; local16 = (Class1_Sub1_Sub8) this.aClass142_44.method3198()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass265_1 == arg0[local21] || local16.aClass265_1 == arg0[local21].aClass265_2) {
						Static339.aBooleanArray20[local21] = true;
						local16.method2450();
						continue label68;
					}
				}
			}
			local16.method5965();
			this.anInt6160--;
			if (local16.method5895()) {
				local16.method5893();
				Static363.anInt6608--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt6160 != 8; local21++) {
			if (!Static339.aBooleanArray20[local21]) {
				@Pc(93) Class1_Sub1_Sub8 local93 = null;
				if (arg0[local21].method5979().anInt314 == 1 && Static363.anInt6608 < 32) {
					local93 = new Class1_Sub1_Sub8(arg0[local21], this);
					Static415.aClass23_1.method384(local93, (long) arg0[local21].anInt7761);
					Static363.anInt6608++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub1_Sub8(arg0[local21], this);
				}
				this.aClass142_44.method3212(local93);
				this.anInt6160++;
				Static339.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
	public void method4877() {
		this.aBoolean501 = true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method4878(@OriginalArg(0) Class121 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong177 == this.aLong178) {
			this.method4882();
		} else {
			this.method4883();
		}
		if (arg1 - this.aLong177 > 750L) {
			this.method4881();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong178);
		@Pc(36) Class36_Sub6 local36;
		if (this.aBoolean501) {
			for (local36 = (Class36_Sub6) this.aClass242_7.method5503(); local36 != null; local36 = (Class36_Sub6) this.aClass242_7.method5506()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass210_1.anInt6393; local39++) {
					local36.method4280(arg1, !this.aBoolean499, 1, arg0);
				}
			}
			this.aBoolean501 = false;
		}
		for (local36 = (Class36_Sub6) this.aClass242_7.method5503(); local36 != null; local36 = (Class36_Sub6) this.aClass242_7.method5506()) {
			local36.method4280(arg1, !this.aBoolean499, local27, arg0);
		}
		this.aLong178 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(J)V")
	public void method4880(@OriginalArg(0) long arg0) {
		this.aLong177 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "()V")
	public void method4881() {
		this.aBoolean500 = true;
		for (@Pc(8) Class1_Sub1_Sub8 local8 = (Class1_Sub1_Sub8) this.aClass142_44.method3199(); local8 != null; local8 = (Class1_Sub1_Sub8) this.aClass142_44.method3198()) {
			if (local8.aClass18_1.anInt314 == 1) {
				local8.method5893();
			}
		}
		this.aClass36_Sub3_Sub1_Sub1Array3 = new Class36_Sub3_Sub1_Sub1[8192];
		this.anInt6154 = 0;
		this.aClass242_7 = new Class242();
		this.anInt6155 = 0;
		this.aClass142_44 = new Class142();
		this.anInt6160 = 0;
		this.method5131();
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "()V")
	private void method4882() {
		this.aBoolean499 = false;
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "()V")
	public void method4883() {
		this.aBoolean499 = true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	public void method4884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6158 = arg0;
		this.anInt6161 = arg1;
		this.anInt6159 = arg2;
		this.anInt6157 = arg3;
		this.anInt6156 = arg4;
	}
}
