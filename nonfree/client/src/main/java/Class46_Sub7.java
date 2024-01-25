import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class46_Sub7 extends Class46 {

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
	public int anInt8479;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
	public int anInt8481;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	public int anInt8482;

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
	public int anInt8483;

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
	public int anInt8484;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	public int anInt8477 = 0;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Z")
	private boolean aBoolean628 = false;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Z")
	public boolean aBoolean627 = false;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "Lclient!mf;")
	private Class184 aClass184_40 = new Class184();

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
	private int anInt8478 = 0;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "Lclient!ui;")
	public Class295 aClass295_58 = new Class295();

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
	private int anInt8480 = 0;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!ka;")
	public final Class158 aClass158_2 = new Class158();

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "[Lclient!jv;")
	public final Class46_Sub3_Sub1_Sub1[] aClass46_Sub3_Sub1_Sub1Array2 = new Class46_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	public Class46_Sub7(@OriginalArg(0) int arg0) {
		this.method7419(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qa;)V")
	public void method7407(@OriginalArg(0) Class4 arg0) {
		this.aClass158_2.aClass185_1.method5308();
		for (@Pc(10) Class46_Sub8 local10 = (Class46_Sub8) this.aClass184_40.method5138(); local10 != null; local10 = (Class46_Sub8) this.aClass184_40.method5145()) {
			local10.method8088(this.aLong229, arg0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "()Lclient!ka;")
	public Class158 method7408() {
		return this.aClass158_2;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([Lclient!fr;Z)V")
	private void method7409(@OriginalArg(0) Class106[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static477.aBooleanArray36[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub2_Sub18 local16 = (Class1_Sub2_Sub18) this.aClass295_58.method7543(); local16 != null; local16 = (Class1_Sub2_Sub18) this.aClass295_58.method7540()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass106_2 == arg0[local21] || local16.aClass106_2 == arg0[local21].aClass106_1) {
						Static477.aBooleanArray36[local21] = true;
						local16.method7146();
						continue label68;
					}
				}
			}
			local16.method8239();
			this.anInt8480--;
			if (local16.method7389()) {
				local16.method7390();
				Static474.anInt4535--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt8480 != 8; local21++) {
			if (!Static477.aBooleanArray36[local21]) {
				@Pc(93) Class1_Sub2_Sub18 local93 = null;
				if (arg0[local21].method2621().anInt6662 == 1 && Static474.anInt4535 < 32) {
					local93 = new Class1_Sub2_Sub18(arg0[local21], this);
					Static74.aClass37_1.method1280(local93, (long) arg0[local21].anInt2799);
					Static474.anInt4535++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub2_Sub18(arg0[local21], this);
				}
				this.aClass295_58.method7533(local93);
				this.anInt8480++;
				Static477.aBooleanArray36[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qa;[Lclient!dl;Z)V")
	private void method7411(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class68[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static477.aBooleanArray35[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class46_Sub8 local16 = (Class46_Sub8) this.aClass184_40.method5138(); local16 != null; local16 = (Class46_Sub8) this.aClass184_40.method5145()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass68_2 == arg1[local21] || local16.aClass68_2 == arg1[local21].aClass68_1) {
						Static477.aBooleanArray35[local21] = true;
						local16.method8092();
						local16.aBoolean700 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt9380 == 0) {
				local16.method8227();
				this.anInt8478--;
			} else {
				local16.aBoolean700 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt8478 != 8; local21++) {
			if (!Static477.aBooleanArray35[local21]) {
				@Pc(101) Class46_Sub8 local101 = new Class46_Sub8(arg0, arg1[local21], this, this.aLong230);
				this.aClass184_40.method5142(local101);
				this.anInt8478++;
				Static477.aBooleanArray35[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "()V")
	public void method7412() {
		this.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method7413(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong230 == this.aLong229) {
			this.method7421();
		} else {
			this.method7412();
		}
		if (arg1 - this.aLong230 > 750L) {
			this.method7418();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong229);
		@Pc(36) Class46_Sub8 local36;
		if (this.aBoolean629) {
			for (local36 = (Class46_Sub8) this.aClass184_40.method5138(); local36 != null; local36 = (Class46_Sub8) this.aClass184_40.method5145()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass216_1.anInt6398; local39++) {
					local36.method8091(arg1, !this.aBoolean628, arg0, 1);
				}
			}
			this.aBoolean629 = false;
		}
		for (local36 = (Class46_Sub8) this.aClass184_40.method5138(); local36 != null; local36 = (Class46_Sub8) this.aClass184_40.method5145()) {
			local36.method8091(arg1, !this.aBoolean628, arg0, local27);
		}
		this.aLong229 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qa;J[Lclient!dl;[Lclient!fr;Z)V")
	public void method7414(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class68[] arg2, @OriginalArg(3) Class106[] arg3) {
		if (!this.aBoolean627) {
			this.method7411(arg0, arg2);
			this.method7409(arg3);
			this.aLong230 = arg1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "()V")
	public void method7415() {
		this.aBoolean629 = true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(J)V")
	public void method7416(@OriginalArg(0) long arg0) {
		this.aLong230 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "()V")
	public void method7418() {
		this.aBoolean627 = true;
		for (@Pc(8) Class1_Sub2_Sub18 local8 = (Class1_Sub2_Sub18) this.aClass295_58.method7543(); local8 != null; local8 = (Class1_Sub2_Sub18) this.aClass295_58.method7540()) {
			if (local8.aClass226_1.anInt6662 == 1) {
				local8.method7390();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass46_Sub3_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass46_Sub3_Sub1_Sub1Array2[local27] != null) {
				this.aClass46_Sub3_Sub1_Sub1Array2[local27].method4256();
				this.aClass46_Sub3_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt8477 = 0;
		this.aClass184_40 = new Class184();
		this.anInt8478 = 0;
		this.aClass295_58 = new Class295();
		this.anInt8480 = 0;
		this.method8227();
		Static355.aClass46_Sub7Array1[Static153.anInt3001] = this;
		Static153.anInt3001 = Static153.anInt3001 + 1 & Static154.anIntArray263[Static431.anInt7490];
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public void method7419(@OriginalArg(0) int arg0) {
		Static448.aClass184_36.method5142(this);
		this.aLong230 = arg0;
		this.aLong229 = arg0;
		this.aBoolean629 = true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII)V")
	public void method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8481 = arg0;
		this.anInt8484 = arg1;
		this.anInt8482 = arg2;
		this.anInt8479 = arg3;
		this.anInt8483 = arg4;
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "()V")
	private void method7421() {
		this.aBoolean628 = false;
	}
}
