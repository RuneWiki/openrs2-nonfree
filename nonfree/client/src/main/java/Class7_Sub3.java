import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
	public int anInt5011;

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
	public int anInt5012;

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
	public int anInt5013;

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
	public int anInt5014;

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "I")
	public int anInt5015;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "Z")
	public boolean aBoolean392 = false;

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
	public int anInt5009 = 0;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "Lclient!it;")
	private Class149 aClass149_2 = new Class149();

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
	private int anInt5010 = 0;

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "Lclient!dm;")
	public Class73 aClass73_43 = new Class73();

	@OriginalMember(owner = "client!jw", name = "A", descriptor = "I")
	private int anInt5016 = 0;

	@OriginalMember(owner = "client!jw", name = "B", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "Lclient!hp;")
	public final Class136 aClass136_2 = new Class136();

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "[Lclient!g;")
	public final Class7_Sub1_Sub1_Sub1[] aClass7_Sub1_Sub1_Sub1Array2 = new Class7_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(I)V")
	public Class7_Sub3(@OriginalArg(0) int arg0) {
		this.method4197(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "()V")
	public void method4190() {
		this.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method4192(@OriginalArg(0) Class42 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong133 == this.aLong132) {
			this.method4194();
		} else {
			this.method4196();
		}
		if (arg1 - this.aLong133 > 750L) {
			this.method4199();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong132);
		@Pc(36) Class7_Sub5 local36;
		if (this.aBoolean393) {
			for (local36 = (Class7_Sub5) this.aClass149_2.method3989(); local36 != null; local36 = (Class7_Sub5) this.aClass149_2.method3986()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass282_1.anInt8376; local39++) {
					local36.method4650(1, arg1, arg0, !this.aBoolean391);
				}
			}
			this.aBoolean393 = false;
		}
		for (local36 = (Class7_Sub5) this.aClass149_2.method3989(); local36 != null; local36 = (Class7_Sub5) this.aClass149_2.method3986()) {
			local36.method4650(local27, arg1, arg0, !this.aBoolean391);
		}
		this.aLong132 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIII)V")
	public void method4193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5015 = arg0;
		this.anInt5014 = arg1;
		this.anInt5013 = arg2;
		this.anInt5012 = arg3;
		this.anInt5011 = arg4;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "()V")
	private void method4194() {
		this.aBoolean391 = false;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(J)V")
	public void method4195(@OriginalArg(0) long arg0) {
		this.aLong133 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "()V")
	public void method4196() {
		this.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)V")
	public void method4197(@OriginalArg(0) int arg0) {
		Static5.aClass149_1.method3984(this);
		this.aLong133 = arg0;
		this.aLong132 = arg0;
		this.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!qa;[Lclient!ig;Z)V")
	private void method4198(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class142[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static244.aBooleanArray35[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class7_Sub5 local16 = (Class7_Sub5) this.aClass149_2.method3989(); local16 != null; local16 = (Class7_Sub5) this.aClass149_2.method3986()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass142_2 == arg1[local21] || local16.aClass142_2 == arg1[local21].aClass142_1) {
						Static244.aBooleanArray35[local21] = true;
						local16.method4649();
						local16.aBoolean423 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5529 == 0) {
				local16.method7760();
				this.anInt5010--;
			} else {
				local16.aBoolean423 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt5010 != 8; local21++) {
			if (!Static244.aBooleanArray35[local21]) {
				@Pc(101) Class7_Sub5 local101 = new Class7_Sub5(arg0, arg1[local21], this, this.aLong133);
				this.aClass149_2.method3984(local101);
				this.anInt5010++;
				Static244.aBooleanArray35[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "()V")
	public void method4199() {
		this.aBoolean392 = true;
		for (@Pc(8) Class12_Sub4_Sub16 local8 = (Class12_Sub4_Sub16) this.aClass73_43.method2005(); local8 != null; local8 = (Class12_Sub4_Sub16) this.aClass73_43.method2009()) {
			if (local8.aClass102_1.anInt3110 == 1) {
				local8.method7959();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass7_Sub1_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass7_Sub1_Sub1_Sub1Array2[local27] != null) {
				this.aClass7_Sub1_Sub1_Sub1Array2[local27].method2942();
				this.aClass7_Sub1_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt5009 = 0;
		this.aClass149_2 = new Class149();
		this.anInt5010 = 0;
		this.aClass73_43 = new Class73();
		this.anInt5016 = 0;
		this.method7760();
		Static193.aClass7_Sub3Array1[Static72.anInt1748] = this;
		Static72.anInt1748 = Static72.anInt1748 + 1 & Static270.anIntArray597[Static324.anInt6094];
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!qa;)V")
	public void method4200(@OriginalArg(0) Class42 arg0) {
		this.aClass136_2.aClass313_1.method7876();
		for (@Pc(10) Class7_Sub5 local10 = (Class7_Sub5) this.aClass149_2.method3989(); local10 != null; local10 = (Class7_Sub5) this.aClass149_2.method3986()) {
			local10.method4647(arg0, this.aLong132);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!qa;J[Lclient!ig;[Lclient!rn;Z)V")
	public void method4201(@OriginalArg(0) Class42 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class142[] arg2, @OriginalArg(3) Class265[] arg3) {
		if (!this.aBoolean392) {
			this.method4198(arg0, arg2);
			this.method4203(arg3);
			this.aLong133 = arg1;
		}
	}

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "()Lclient!hp;")
	public Class136 method4202() {
		return this.aClass136_2;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([Lclient!rn;Z)V")
	private void method4203(@OriginalArg(0) Class265[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static244.aBooleanArray36[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class12_Sub4_Sub16 local16 = (Class12_Sub4_Sub16) this.aClass73_43.method2005(); local16 != null; local16 = (Class12_Sub4_Sub16) this.aClass73_43.method2009()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass265_2 == arg0[local21] || local16.aClass265_2 == arg0[local21].aClass265_1) {
						Static244.aBooleanArray36[local21] = true;
						local16.method6660();
						continue label68;
					}
				}
			}
			local16.method7967();
			this.anInt5016--;
			if (local16.method7958()) {
				local16.method7959();
				Static216.anInt4689--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt5016 != 8; local21++) {
			if (!Static244.aBooleanArray36[local21]) {
				@Pc(93) Class12_Sub4_Sub16 local93 = null;
				if (arg0[local21].method6595().anInt3110 == 1 && Static216.anInt4689 < 32) {
					local93 = new Class12_Sub4_Sub16(arg0[local21], this);
					Static271.aClass222_1.method5411(local93, (long) arg0[local21].anInt7979);
					Static216.anInt4689++;
				}
				if (local93 == null) {
					local93 = new Class12_Sub4_Sub16(arg0[local21], this);
				}
				this.aClass73_43.method2012(local93);
				this.anInt5016++;
				Static244.aBooleanArray36[local21] = true;
			}
		}
	}
}
