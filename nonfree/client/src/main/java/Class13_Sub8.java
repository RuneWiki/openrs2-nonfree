import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
	public int anInt7568;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
	public int anInt7569;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
	public int anInt7570;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "I")
	public int anInt7571;

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
	public int anInt7573;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "Z")
	public boolean aBoolean522 = false;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	public int anInt7566 = 0;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "Lclient!cr;")
	private Class40 aClass40_6 = new Class40();

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	private int anInt7567 = 0;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Lclient!tu;")
	public Class229 aClass229_49 = new Class229();

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
	private int anInt7572 = 0;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "Lclient!iv;")
	public final Class116 aClass116_2 = new Class116();

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "[Lclient!u;")
	public Class13_Sub3_Sub1_Sub1[] aClass13_Sub3_Sub1_Sub1Array2 = new Class13_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V")
	public Class13_Sub8(@OriginalArg(0) int arg0) {
		Static182.aClass40_3.method1190(this);
		this.aLong224 = arg0;
		this.aLong225 = arg0;
		this.aBoolean523 = true;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	private void method5937() {
		this.aBoolean521 = false;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(J)V")
	public void method5938(@OriginalArg(0) long arg0) {
		this.aLong224 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()V")
	public void method5939() {
		this.aBoolean522 = true;
		for (@Pc(8) Class3_Sub3_Sub10 local8 = (Class3_Sub3_Sub10) this.aClass229_49.method5328(); local8 != null; local8 = (Class3_Sub3_Sub10) this.aClass229_49.method5325()) {
			if (local8.aClass115_1.anInt3689 == 1) {
				local8.method4647();
			}
		}
		this.aClass13_Sub3_Sub1_Sub1Array2 = new Class13_Sub3_Sub1_Sub1[8192];
		this.anInt7566 = 0;
		this.aClass40_6 = new Class40();
		this.anInt7567 = 0;
		this.aClass229_49 = new Class229();
		this.anInt7572 = 0;
		this.method5934();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qa;J[Lclient!sm;[Lclient!ot;Z)V")
	public void method5940(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class209[] arg2, @OriginalArg(3) Class178[] arg3) {
		if (!this.aBoolean522) {
			this.method5945(arg0, arg2);
			this.method5944(arg3);
			this.aLong224 = arg1;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method5941(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong224 == this.aLong225) {
			this.method5937();
		} else {
			this.method5946();
		}
		if (arg1 - this.aLong224 > 750L) {
			this.method5939();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong225);
		@Pc(36) Class13_Sub4 local36;
		if (this.aBoolean523) {
			for (local36 = (Class13_Sub4) this.aClass40_6.method1188(); local36 != null; local36 = (Class13_Sub4) this.aClass40_6.method1195()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass230_1.anInt6852; local39++) {
					local36.method4568(arg0, !this.aBoolean521, 1, arg1);
				}
			}
			this.aBoolean523 = false;
		}
		for (local36 = (Class13_Sub4) this.aClass40_6.method1188(); local36 != null; local36 = (Class13_Sub4) this.aClass40_6.method1195()) {
			local36.method4568(arg0, !this.aBoolean521, local27, arg1);
		}
		this.aLong225 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "()V")
	public void method5942() {
		this.aBoolean523 = true;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "()Lclient!iv;")
	public Class116 method5943() {
		return this.aClass116_2;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([Lclient!ot;Z)V")
	private void method5944(@OriginalArg(0) Class178[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static449.aBooleanArray28[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class3_Sub3_Sub10 local16 = (Class3_Sub3_Sub10) this.aClass229_49.method5328(); local16 != null; local16 = (Class3_Sub3_Sub10) this.aClass229_49.method5325()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass178_1 == arg0[local21] || local16.aClass178_1 == arg0[local21].aClass178_2) {
						Static449.aBooleanArray28[local21] = true;
						local16.method2662();
						continue label68;
					}
				}
			}
			local16.method5987();
			this.anInt7572--;
			if (local16.method4646()) {
				local16.method4647();
				Static348.anInt7446--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt7572 != 8; local21++) {
			if (!Static449.aBooleanArray28[local21]) {
				@Pc(93) Class3_Sub3_Sub10 local93 = null;
				if (arg0[local21].method4372().anInt3689 == 1 && Static348.anInt7446 < 32) {
					local93 = new Class3_Sub3_Sub10(arg0[local21], this);
					Static22.aClass135_1.method3433((long) arg0[local21].anInt5412, local93);
					Static348.anInt7446++;
				}
				if (local93 == null) {
					local93 = new Class3_Sub3_Sub10(arg0[local21], this);
				}
				this.aClass229_49.method5321(local93);
				this.anInt7572++;
				Static449.aBooleanArray28[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qa;[Lclient!sm;Z)V")
	private void method5945(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class209[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static449.aBooleanArray29[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class13_Sub4 local16 = (Class13_Sub4) this.aClass40_6.method1188(); local16 != null; local16 = (Class13_Sub4) this.aClass40_6.method1195()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass209_1 == arg1[local21] || local16.aClass209_1 == arg1[local21].aClass209_2) {
						Static449.aBooleanArray29[local21] = true;
						local16.method4567();
						local16.aBoolean407 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5672 == 0) {
				local16.method5934();
				this.anInt7567--;
			} else {
				local16.aBoolean407 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt7567 != 8; local21++) {
			if (!Static449.aBooleanArray29[local21]) {
				@Pc(101) Class13_Sub4 local101 = new Class13_Sub4(arg0, arg1[local21], this, this.aLong224);
				this.aClass40_6.method1190(local101);
				this.anInt7567++;
				Static449.aBooleanArray29[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "()V")
	public void method5946() {
		this.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "()V")
	public void method5947() {
		this.aClass116_2.aClass236_1.method5463();
		for (@Pc(10) Class13_Sub4 local10 = (Class13_Sub4) this.aClass40_6.method1188(); local10 != null; local10 = (Class13_Sub4) this.aClass40_6.method1195()) {
			local10.method4566(this.aLong225);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
	public void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7569 = arg0;
		this.anInt7573 = arg1;
		this.anInt7568 = arg2;
		this.anInt7571 = arg3;
		this.anInt7570 = arg4;
	}
}
