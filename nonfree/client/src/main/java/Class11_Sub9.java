import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class11_Sub9 extends Class11 {

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	public int anInt6592;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public int anInt6589 = 0;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!kr;")
	private Class196 aClass196_6 = new Class196();

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	private int anInt6590 = 0;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!gca;")
	public Class111 aClass111_41 = new Class111();

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	private int anInt6591 = 0;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!dk;")
	public final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "[Lclient!iga;")
	public final Class11_Sub5_Sub1_Sub1[] aClass11_Sub5_Sub1_Sub1Array1 = new Class11_Sub5_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IZ)V")
	public Class11_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5351(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!dk;")
	public Class64 method5336() {
		return this.aClass64_1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!lp;Z)V")
	private void method5337(@OriginalArg(0) Class212[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static363.aBooleanArray29[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class1_Sub8_Sub15 local16 = (Class1_Sub8_Sub15) this.aClass111_41.method2547(); local16 != null; local16 = (Class1_Sub8_Sub15) this.aClass111_41.method2554()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass212_2 == arg0[local21] || local16.aClass212_2 == arg0[local21].aClass212_1) {
						Static363.aBooleanArray29[local21] = true;
						local16.method6744();
						continue label71;
					}
				}
			}
			local16.method7908();
			this.anInt6591--;
			if (local16.method7713()) {
				local16.method7712();
				Static574.anInt9496--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6591 != 8; local21++) {
			if (!Static363.aBooleanArray29[local21]) {
				@Pc(96) Class1_Sub8_Sub15 local96 = null;
				if (arg0[local21].method4603().anInt4758 == 1 && Static574.anInt9496 < 32) {
					local96 = new Class1_Sub8_Sub15(arg0[local21], this);
					Static133.aClass306_1.method6494(local96, (long) arg0[local21].anInt5654);
					Static574.anInt9496++;
				}
				if (local96 == null) {
					local96 = new Class1_Sub8_Sub15(arg0[local21], this);
				}
				this.aClass111_41.method2552(local96);
				this.anInt6591++;
				Static363.aBooleanArray29[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	public void method5338() {
		this.aBoolean514 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!r;J[Lclient!ns;[Lclient!lp;Z)V")
	public void method5339(@OriginalArg(0) Class78 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class244[] arg2, @OriginalArg(3) Class212[] arg3) {
		if (!this.aBoolean511) {
			this.method5350(arg0, arg2);
			this.method5337(arg3);
			this.aLong162 = arg1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	private void method5340() {
		this.aBoolean512 = false;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	public void method5342() {
		this.aBoolean512 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(J)V")
	public void method5343(@OriginalArg(0) long arg0) {
		this.aLong162 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lclient!dk;")
	public Class64 method5345() {
		this.aClass64_1.aClass102_1.method2423();
		for (@Pc(6) int local6 = 0; local6 < this.aClass11_Sub5_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass11_Sub5_Sub1_Sub1Array1[local6] != null && this.aClass11_Sub5_Sub1_Sub1Array1[local6].aClass11_Sub3_1 != null) {
				this.aClass64_1.aClass102_1.method2417(this.aClass11_Sub5_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass64_1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method5346(@OriginalArg(0) Class78 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong162 == this.aLong161) {
			this.method5340();
		} else {
			this.method5342();
		}
		if (arg1 - this.aLong162 > 750L) {
			this.method5347();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong161);
		@Pc(36) Class11_Sub3 local36;
		if (this.aBoolean514) {
			for (local36 = (Class11_Sub3) this.aClass196_6.method4024(); local36 != null; local36 = (Class11_Sub3) this.aClass196_6.method4028()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass59_1.lb; local39++) {
					local36.method1463(arg0, 1, !this.aBoolean512, arg1);
				}
			}
			this.aBoolean514 = false;
		}
		for (local36 = (Class11_Sub3) this.aClass196_6.method4024(); local36 != null; local36 = (Class11_Sub3) this.aClass196_6.method4028()) {
			local36.method1463(arg0, local27, !this.aBoolean512, arg1);
		}
		this.aLong161 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	public void method5347() {
		this.aBoolean511 = true;
		for (@Pc(8) Class1_Sub8_Sub15 local8 = (Class1_Sub8_Sub15) this.aClass111_41.method2547(); local8 != null; local8 = (Class1_Sub8_Sub15) this.aClass111_41.method2554()) {
			if (local8.aClass183_1.anInt4758 == 1) {
				local8.method7712();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass11_Sub5_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass11_Sub5_Sub1_Sub1Array1[local27] != null) {
				this.aClass11_Sub5_Sub1_Sub1Array1[local27].method3314();
				this.aClass11_Sub5_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt6589 = 0;
		this.aClass196_6 = new Class196();
		this.anInt6590 = 0;
		this.aClass111_41 = new Class111();
		this.anInt6591 = 0;
		this.method7200();
		Static135.aClass11_Sub9Array1[Static234.anInt4321] = this;
		Static234.anInt4321 = Static234.anInt4321 + 1 & Static188.anIntArray182[Static129.anInt2578];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public void method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6592 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!r;)V")
	public void method5349(@OriginalArg(0) Class78 arg0) {
		this.aClass64_1.aClass102_1.method2423();
		for (@Pc(10) Class11_Sub3 local10 = (Class11_Sub3) this.aClass196_6.method4024(); local10 != null; local10 = (Class11_Sub3) this.aClass196_6.method4028()) {
			local10.method1462(this.aLong161, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!r;[Lclient!ns;Z)V")
	private void method5350(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class244[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static363.aBooleanArray28[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class11_Sub3 local16 = (Class11_Sub3) this.aClass196_6.method4024(); local16 != null; local16 = (Class11_Sub3) this.aClass196_6.method4028()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass244_1 == arg1[local21] || local16.aClass244_1 == arg1[local21].aClass244_2) {
						Static363.aBooleanArray28[local21] = true;
						local16.method1464();
						local16.aBoolean113 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt1742 == 0) {
				local16.method7200();
				this.anInt6590--;
			} else {
				local16.aBoolean113 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6590 != 32; local21++) {
			if (!Static363.aBooleanArray28[local21]) {
				@Pc(104) Class11_Sub3 local104 = new Class11_Sub3(arg0, arg1[local21], this, this.aLong162);
				this.aClass196_6.method4032(local104);
				this.anInt6590++;
				Static363.aBooleanArray28[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IZ)V")
	public void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static485.aClass196_8.method4032(this);
		this.aLong162 = arg0;
		this.aLong161 = arg0;
		this.aBoolean514 = true;
		this.aBoolean513 = arg1;
	}
}
