import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!au", name = "n", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "I")
	public int anInt397 = 0;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!au", name = "r", descriptor = "Lclient!hf;")
	private Class136 aClass136_1 = new Class136();

	@OriginalMember(owner = "client!au", name = "x", descriptor = "I")
	private int anInt398 = 0;

	@OriginalMember(owner = "client!au", name = "w", descriptor = "Lclient!oe;")
	public Class244 aClass244_1 = new Class244();

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!au", name = "C", descriptor = "I")
	private int anInt400 = 0;

	@OriginalMember(owner = "client!au", name = "A", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!au", name = "B", descriptor = "Lclient!so;")
	public final Class305 aClass305_1 = new Class305();

	@OriginalMember(owner = "client!au", name = "p", descriptor = "[Lclient!a;")
	public final Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IZ)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method327(arg0, arg1);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "()Lclient!so;")
	public Class305 method326() {
		this.aClass305_1.aClass224_1.method5405();
		for (@Pc(6) int local6 = 0; local6 < this.aClass1_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass1_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass1_Sub1_Sub1_Sub1Array1[local6].aClass1_Sub10_1 != null) {
				this.aClass305_1.aClass224_1.method5404(this.aClass1_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass305_1;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)V")
	public void method327(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static128.aClass136_4.method3289(this);
		this.aLong14 = arg0;
		this.aLong13 = arg0;
		this.aBoolean23 = true;
		this.aBoolean22 = arg1;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "()Lclient!so;")
	public Class305 method329() {
		return this.aClass305_1;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!r;[Lclient!nba;Z)V")
	private void method330(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class227[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static25.aBooleanArray1[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class1_Sub10 local16 = (Class1_Sub10) this.aClass136_1.method3288(); local16 != null; local16 = (Class1_Sub10) this.aClass136_1.method3286()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass227_2 == arg1[local21] || local16.aClass227_2 == arg1[local21].aClass227_1) {
						Static25.aBooleanArray1[local21] = true;
						local16.method8260();
						local16.aBoolean713 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt10087 == 0) {
				local16.method8252();
				this.anInt398--;
			} else {
				local16.aBoolean713 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt398 != 32; local21++) {
			if (!Static25.aBooleanArray1[local21]) {
				@Pc(104) Class1_Sub10 local104 = new Class1_Sub10(arg0, arg1[local21], this, this.aLong14);
				this.aClass136_1.method3289(local104);
				this.anInt398++;
				Static25.aBooleanArray1[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([Lclient!fk;Z)V")
	private void method331(@OriginalArg(0) Class103[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static25.aBooleanArray2[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class4_Sub5_Sub11 local16 = (Class4_Sub5_Sub11) this.aClass244_1.method5963(); local16 != null; local16 = (Class4_Sub5_Sub11) this.aClass244_1.method5965()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass103_2 == arg0[local21] || local16.aClass103_2 == arg0[local21].aClass103_1) {
						Static25.aBooleanArray2[local21] = true;
						local16.method5371();
						continue label71;
					}
				}
			}
			local16.method8379();
			this.anInt400--;
			if (local16.method8013()) {
				local16.method8015();
				Static517.anInt9274--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt400 != 8; local21++) {
			if (!Static25.aBooleanArray2[local21]) {
				@Pc(96) Class4_Sub5_Sub11 local96 = null;
				if (arg0[local21].method2736().anInt6340 == 1 && Static517.anInt9274 < 32) {
					local96 = new Class4_Sub5_Sub11(arg0[local21], this);
					Static370.aClass217_1.method5339(local96, (long) arg0[local21].anInt2989);
					Static517.anInt9274++;
				}
				if (local96 == null) {
					local96 = new Class4_Sub5_Sub11(arg0[local21], this);
				}
				this.aClass244_1.method5960(local96);
				this.anInt400++;
				Static25.aBooleanArray2[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!r;)V")
	public void method332(@OriginalArg(0) Class44 arg0) {
		this.aClass305_1.aClass224_1.method5405();
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) this.aClass136_1.method3288(); local10 != null; local10 = (Class1_Sub10) this.aClass136_1.method3286()) {
			local10.method8258(this.aLong13, arg0);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!r;J[Lclient!nba;[Lclient!fk;Z)V")
	public void method333(@OriginalArg(0) Class44 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class227[] arg2, @OriginalArg(3) Class103[] arg3) {
		if (!this.aBoolean21) {
			this.method330(arg0, arg2);
			this.method331(arg3);
			this.aLong14 = arg1;
		}
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "()V")
	private void method334() {
		this.aBoolean20 = false;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(J)V")
	public void method335(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "()V")
	public void method336() {
		this.aBoolean23 = true;
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "()V")
	public void method337() {
		this.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V")
	public void method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt399 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method340(@OriginalArg(0) Class44 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong14 == this.aLong13) {
			this.method334();
		} else {
			this.method337();
		}
		if (arg1 - this.aLong14 > 750L) {
			this.method341();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong13);
		@Pc(36) Class1_Sub10 local36;
		if (this.aBoolean23) {
			for (local36 = (Class1_Sub10) this.aClass136_1.method3288(); local36 != null; local36 = (Class1_Sub10) this.aClass136_1.method3286()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass187_1.anInt5112; local39++) {
					local36.method8261(1, arg1, !this.aBoolean20, arg0);
				}
			}
			this.aBoolean23 = false;
		}
		for (local36 = (Class1_Sub10) this.aClass136_1.method3288(); local36 != null; local36 = (Class1_Sub10) this.aClass136_1.method3286()) {
			local36.method8261(local27, arg1, !this.aBoolean20, arg0);
		}
		this.aLong13 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!au", name = "g", descriptor = "()V")
	public void method341() {
		this.aBoolean21 = true;
		for (@Pc(8) Class4_Sub5_Sub11 local8 = (Class4_Sub5_Sub11) this.aClass244_1.method5963(); local8 != null; local8 = (Class4_Sub5_Sub11) this.aClass244_1.method5965()) {
			if (local8.aClass222_1.anInt6340 == 1) {
				local8.method8015();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass1_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass1_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass1_Sub1_Sub1_Sub1Array1[local27].method56();
				this.aClass1_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt397 = 0;
		this.aClass136_1 = new Class136();
		this.anInt398 = 0;
		this.aClass244_1 = new Class244();
		this.anInt400 = 0;
		this.method8252();
		Static437.aClass1_Sub2Array1[Static249.anInt4563] = this;
		Static249.anInt4563 = Static249.anInt4563 + 1 & Static231.anIntArray204[Static224.anInt4124];
	}
}
