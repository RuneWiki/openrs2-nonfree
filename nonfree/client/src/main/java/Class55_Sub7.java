import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class55_Sub7 extends Class55 {

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public int anInt4406;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public int anInt4407;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public int anInt4408;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public int anInt4409;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "I")
	public int anInt4404 = 0;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Z")
	public boolean aBoolean393 = false;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!fk;")
	private Class67 aClass67_6 = new Class67();

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	private int anInt4405 = 0;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Lclient!wq;")
	public Class216 aClass216_37 = new Class216();

	@OriginalMember(owner = "client!om", name = "t", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	private int anInt4410 = 0;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "Lclient!gm;")
	public final Class75 aClass75_2 = new Class75();

	@OriginalMember(owner = "client!om", name = "g", descriptor = "[Lclient!qg;")
	public Class55_Sub8_Sub1_Sub1[] aClass55_Sub8_Sub1_Sub1Array3 = new Class55_Sub8_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!om", name = "m", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
	public Class55_Sub7(@OriginalArg(0) int arg0) {
		Static28.aClass67_3.method2100(this);
		this.aLong138 = arg0;
		this.aLong139 = arg0;
		this.aBoolean395 = true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	public void method4024() {
		this.aBoolean393 = true;
		for (@Pc(8) Class2_Sub11_Sub16 local8 = (Class2_Sub11_Sub16) this.aClass216_37.method5992(); local8 != null; local8 = (Class2_Sub11_Sub16) this.aClass216_37.method6000()) {
			if (local8.aClass32_1.anInt782 == 1) {
				local8.method5914();
			}
		}
		this.aClass55_Sub8_Sub1_Sub1Array3 = new Class55_Sub8_Sub1_Sub1[8192];
		this.anInt4404 = 0;
		this.aClass67_6 = new Class67();
		this.anInt4405 = 0;
		this.aClass216_37 = new Class216();
		this.anInt4410 = 0;
		this.method4599();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ae;J[Lclient!qh;[Lclient!dj;Z)V")
	public void method4025(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class161[] arg2, @OriginalArg(3) Class44[] arg3) {
		if (!this.aBoolean393) {
			this.method4036(arg0, arg2);
			this.method4026(arg3);
			this.aLong138 = arg1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([Lclient!dj;Z)V")
	private void method4026(@OriginalArg(0) Class44[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static232.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub11_Sub16 local16 = (Class2_Sub11_Sub16) this.aClass216_37.method5992(); local16 != null; local16 = (Class2_Sub11_Sub16) this.aClass216_37.method6000()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass44_2 == arg0[local21] || local16.aClass44_2 == arg0[local21].aClass44_1) {
						Static232.aBooleanArray21[local21] = true;
						local16.method4899();
						continue label68;
					}
				}
			}
			local16.method5945();
			this.anInt4410--;
			if (local16.method5917()) {
				local16.method5914();
				Static49.anInt1102--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4410 != 8; local21++) {
			if (!Static232.aBooleanArray21[local21]) {
				@Pc(93) Class2_Sub11_Sub16 local93 = null;
				if (Static194.method3507(arg0[local21].anInt1284).anInt782 == 1 && Static49.anInt1102 < 32) {
					local93 = new Class2_Sub11_Sub16(arg0[local21], this);
					Static30.aClass26_1.method801(local93, (long) arg0[local21].anInt1284);
					Static49.anInt1102++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub11_Sub16(arg0[local21], this);
				}
				this.aClass216_37.method5995(local93);
				this.anInt4410++;
				Static232.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	public void method4027() {
		this.aBoolean395 = true;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "()V")
	private void method4028() {
		this.aBoolean394 = false;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()V")
	public void method4029() {
		this.aClass75_2.aClass155_1.method4203();
		for (@Pc(10) Class55_Sub6 local10 = (Class55_Sub6) this.aClass67_6.method2098(); local10 != null; local10 = (Class55_Sub6) this.aClass67_6.method2104()) {
			local10.method3939(this.aLong139);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(J)V")
	public void method4030(@OriginalArg(0) long arg0) {
		this.aLong138 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ae;J)Z")
	public boolean method4031(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong138 == this.aLong139) {
			this.method4028();
		} else {
			this.method4032();
		}
		if (arg1 - this.aLong138 > 750L) {
			this.method4024();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong139);
		@Pc(36) Class55_Sub6 local36;
		if (this.aBoolean395) {
			for (local36 = (Class55_Sub6) this.aClass67_6.method2098(); local36 != null; local36 = (Class55_Sub6) this.aClass67_6.method2104()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass47_1.anInt1414; local39++) {
					local36.method3944(arg0, 1, !this.aBoolean394, arg1);
				}
			}
			this.aBoolean395 = false;
		}
		for (local36 = (Class55_Sub6) this.aClass67_6.method2098(); local36 != null; local36 = (Class55_Sub6) this.aClass67_6.method2104()) {
			local36.method3944(arg0, local27, !this.aBoolean394, arg1);
		}
		this.aLong139 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "()V")
	public void method4032() {
		this.aBoolean394 = true;
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "()Lclient!gm;")
	public Class75 method4034() {
		return this.aClass75_2;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	public void method4035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4408 = arg0;
		this.anInt4406 = arg1;
		this.anInt4407 = arg3;
		this.anInt4409 = arg4;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ae;[Lclient!qh;Z)V")
	private void method4036(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class161[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static232.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class55_Sub6 local16 = (Class55_Sub6) this.aClass67_6.method2098(); local16 != null; local16 = (Class55_Sub6) this.aClass67_6.method2104()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass161_1 == arg1[local21] || local16.aClass161_1 == arg1[local21].aClass161_2) {
						Static232.aBooleanArray22[local21] = true;
						local16.method3942();
						local16.aBoolean382 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4320 == 0) {
				local16.method4599();
				this.anInt4405--;
			} else {
				local16.aBoolean382 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4405 != 8; local21++) {
			if (!Static232.aBooleanArray22[local21]) {
				@Pc(101) Class55_Sub6 local101 = new Class55_Sub6(arg0, arg1[local21], this, this.aLong138);
				this.aClass67_6.method2100(local101);
				this.anInt4405++;
				Static232.aBooleanArray22[local21] = true;
			}
		}
	}
}
