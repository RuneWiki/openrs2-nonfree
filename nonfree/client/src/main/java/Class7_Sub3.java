import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public int anInt645 = 0;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Lclient!re;")
	private Class199 aClass199_1 = new Class199();

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
	private int anInt646 = 0;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "Lclient!vf;")
	public Class238 aClass238_4 = new Class238();

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
	private int anInt650 = 0;

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "Lclient!cd;")
	public final Class34 aClass34_1 = new Class34();

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "[Lclient!bl;")
	public Class7_Sub1_Sub1_Sub1[] aClass7_Sub1_Sub1_Sub1Array1 = new Class7_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class7_Sub3(@OriginalArg(0) int arg0) {
		Static228.aClass199_4.method4898(this);
		this.aLong16 = arg0;
		this.aLong15 = arg0;
		this.aBoolean48 = true;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!oj;J[Lclient!tn;[Lclient!gp;Z)V")
	public void method518(@OriginalArg(0) Class48 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class218[] arg2, @OriginalArg(3) Class88[] arg3) {
		if (!this.aBoolean46) {
			this.method530(arg0, arg2);
			this.method522(arg3);
			this.aLong16 = arg1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lclient!cd;")
	public Class34 method519() {
		return this.aClass34_1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!oj;J)Z")
	public boolean method520(@OriginalArg(0) Class48 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong16 == this.aLong15) {
			this.method529();
		} else {
			this.method528();
		}
		if (arg1 - this.aLong16 > 750L) {
			this.method527();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong15);
		@Pc(36) Class7_Sub8 local36;
		if (this.aBoolean48) {
			for (local36 = (Class7_Sub8) this.aClass199_1.method4896(); local36 != null; local36 = (Class7_Sub8) this.aClass199_1.method4902()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass55_1.anInt1599; local39++) {
					local36.method5401(1, arg0, !this.aBoolean47, arg1);
				}
			}
			this.aBoolean48 = false;
		}
		for (local36 = (Class7_Sub8) this.aClass199_1.method4896(); local36 != null; local36 = (Class7_Sub8) this.aClass199_1.method4902()) {
			local36.method5401(local27, arg0, !this.aBoolean47, arg1);
		}
		this.aLong15 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt651 = arg0;
		this.anInt648 = arg1;
		this.anInt647 = arg2;
		this.anInt649 = arg3;
		this.anInt652 = arg4;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lclient!gp;Z)V")
	private void method522(@OriginalArg(0) Class88[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static37.aBooleanArray3[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub7_Sub6 local16 = (Class2_Sub7_Sub6) this.aClass238_4.method5795(); local16 != null; local16 = (Class2_Sub7_Sub6) this.aClass238_4.method5799()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass88_2 == arg0[local21] || local16.aClass88_2 == arg0[local21].aClass88_1) {
						Static37.aBooleanArray3[local21] = true;
						local16.method2208();
						continue label68;
					}
				}
			}
			local16.method6130();
			this.anInt650--;
			if (local16.method6083()) {
				local16.method6085();
				Static345.anInt6353--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt650 != 8; local21++) {
			if (!Static37.aBooleanArray3[local21]) {
				@Pc(93) Class2_Sub7_Sub6 local93 = null;
				if (Static329.method5294(arg0[local21].anInt2638).anInt662 == 1 && Static345.anInt6353 < 32) {
					local93 = new Class2_Sub7_Sub6(arg0[local21], this);
					Static180.aClass12_1.method106(local93, (long) arg0[local21].anInt2638);
					Static345.anInt6353++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub7_Sub6(arg0[local21], this);
				}
				this.aClass238_4.method5796(local93);
				this.anInt650++;
				Static37.aBooleanArray3[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "()V")
	public void method523() {
		this.aBoolean48 = true;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "()V")
	public void method524() {
		this.aClass34_1.aClass180_1.method4496();
		for (@Pc(10) Class7_Sub8 local10 = (Class7_Sub8) this.aClass199_1.method4896(); local10 != null; local10 = (Class7_Sub8) this.aClass199_1.method4902()) {
			local10.method5407(this.aLong15);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(J)V")
	public void method525(@OriginalArg(0) long arg0) {
		this.aLong16 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "()V")
	public void method527() {
		this.aBoolean46 = true;
		for (@Pc(8) Class2_Sub7_Sub6 local8 = (Class2_Sub7_Sub6) this.aClass238_4.method5795(); local8 != null; local8 = (Class2_Sub7_Sub6) this.aClass238_4.method5799()) {
			if (local8.aClass31_1.anInt662 == 1) {
				local8.method6085();
			}
		}
		this.aClass7_Sub1_Sub1_Sub1Array1 = new Class7_Sub1_Sub1_Sub1[8192];
		this.anInt645 = 0;
		this.aClass199_1 = new Class199();
		this.anInt646 = 0;
		this.aClass238_4 = new Class238();
		this.anInt650 = 0;
		this.method5398();
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "()V")
	public void method528() {
		this.aBoolean47 = true;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "()V")
	private void method529() {
		this.aBoolean47 = false;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!oj;[Lclient!tn;Z)V")
	private void method530(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class218[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static37.aBooleanArray4[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class7_Sub8 local16 = (Class7_Sub8) this.aClass199_1.method4896(); local16 != null; local16 = (Class7_Sub8) this.aClass199_1.method4902()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass218_1 == arg1[local21] || local16.aClass218_1 == arg1[local21].aClass218_2) {
						Static37.aBooleanArray4[local21] = true;
						local16.method5405();
						local16.aBoolean453 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6181 == 0) {
				local16.method5398();
				this.anInt646--;
			} else {
				local16.aBoolean453 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt646 != 8; local21++) {
			if (!Static37.aBooleanArray4[local21]) {
				@Pc(101) Class7_Sub8 local101 = new Class7_Sub8(arg0, arg1[local21], this, this.aLong16);
				this.aClass199_1.method4898(local101);
				this.anInt646++;
				Static37.aBooleanArray4[local21] = true;
			}
		}
	}
}
