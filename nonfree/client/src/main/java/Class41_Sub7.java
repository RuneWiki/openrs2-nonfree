import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class41_Sub7 extends Class41 {

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	public int anInt8332;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public int anInt8330 = 0;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Z")
	private boolean aBoolean597 = false;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Z")
	public boolean aBoolean596 = false;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "Lclient!eo;")
	private Class102 aClass102_7 = new Class102();

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
	private int anInt8331 = 0;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!ga;")
	public Class124 aClass124_86 = new Class124();

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
	private int anInt8333 = 0;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "Z")
	public boolean aBoolean599 = false;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "Lclient!hea;")
	public final Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "[Lclient!jr;")
	public final Class41_Sub4_Sub1_Sub1[] aClass41_Sub4_Sub1_Sub1Array1 = new Class41_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IZ)V")
	public Class41_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7091(arg0, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
	public void method7077() {
		this.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
	public void method7078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8332 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()Lclient!hea;")
	public Class149 method7079() {
		this.aClass149_1.aClass382_1.method8471();
		for (@Pc(6) int local6 = 0; local6 < this.aClass41_Sub4_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass41_Sub4_Sub1_Sub1Array1[local6] != null && this.aClass41_Sub4_Sub1_Sub1Array1[local6].aClass41_Sub6_1 != null) {
				this.aClass149_1.aClass382_1.method8468(this.aClass41_Sub4_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass149_1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ha;)V")
	public void method7080(@OriginalArg(0) Class143 arg0) {
		this.aClass149_1.aClass382_1.method8471();
		for (@Pc(10) Class41_Sub6 local10 = (Class41_Sub6) this.aClass102_7.method2062(); local10 != null; local10 = (Class41_Sub6) this.aClass102_7.method2054()) {
			local10.method6170(arg0, this.aLong258);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([Lclient!rf;Z)V")
	private void method7081(@OriginalArg(0) Class303[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static485.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class5_Sub2_Sub19 local16 = (Class5_Sub2_Sub19) this.aClass124_86.method2572(); local16 != null; local16 = (Class5_Sub2_Sub19) this.aClass124_86.method2569()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass303_2 == arg0[local21] || local16.aClass303_2 == arg0[local21].aClass303_1) {
						Static485.aBooleanArray20[local21] = true;
						local16.method7809();
						continue label71;
					}
				}
			}
			local16.method8829();
			this.anInt8333--;
			if (local16.method8572()) {
				local16.method8569();
				Static125.anInt2161--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt8333 != 8; local21++) {
			if (!Static485.aBooleanArray20[local21]) {
				@Pc(96) Class5_Sub2_Sub19 local96 = null;
				if (arg0[local21].method7243().anInt7538 == 1 && Static125.anInt2161 < 32) {
					local96 = new Class5_Sub2_Sub19(arg0[local21], this);
					Static435.aClass99_1.method2044(local96, (long) arg0[local21].anInt8521);
					Static125.anInt2161++;
				}
				if (local96 == null) {
					local96 = new Class5_Sub2_Sub19(arg0[local21], this);
				}
				this.aClass124_86.method2574(local96);
				this.anInt8333++;
				Static485.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ha;[Lclient!nha;Z)V")
	private void method7082(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class244[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static485.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class41_Sub6 local16 = (Class41_Sub6) this.aClass102_7.method2062(); local16 != null; local16 = (Class41_Sub6) this.aClass102_7.method2054()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass244_2 == arg1[local21] || local16.aClass244_2 == arg1[local21].aClass244_1) {
						Static485.aBooleanArray21[local21] = true;
						local16.method6169();
						local16.aBoolean511 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt7158 == 0) {
				local16.method8644();
				this.anInt8331--;
			} else {
				local16.aBoolean511 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt8331 != 32; local21++) {
			if (!Static485.aBooleanArray21[local21]) {
				@Pc(104) Class41_Sub6 local104 = new Class41_Sub6(arg0, arg1[local21], this, this.aLong257);
				this.aClass102_7.method2055(local104);
				this.anInt8331++;
				Static485.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()V")
	public void method7084() {
		this.aBoolean596 = true;
		for (@Pc(8) Class5_Sub2_Sub19 local8 = (Class5_Sub2_Sub19) this.aClass124_86.method2572(); local8 != null; local8 = (Class5_Sub2_Sub19) this.aClass124_86.method2569()) {
			if (local8.aClass257_1.anInt7538 == 1) {
				local8.method8569();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass41_Sub4_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass41_Sub4_Sub1_Sub1Array1[local27] != null) {
				this.aClass41_Sub4_Sub1_Sub1Array1[local27].method3959();
				this.aClass41_Sub4_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt8330 = 0;
		this.aClass102_7 = new Class102();
		this.anInt8331 = 0;
		this.aClass124_86 = new Class124();
		this.anInt8333 = 0;
		this.method8644();
		Static345.aClass41_Sub7Array1[Static354.anInt6241] = this;
		Static354.anInt6241 = Static354.anInt6241 + 1 & Static603.anIntArray557[Static168.anInt2782];
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "()V")
	private void method7085() {
		this.aBoolean597 = false;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "()Lclient!hea;")
	public Class149 method7086() {
		return this.aClass149_1;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "()V")
	public void method7088() {
		this.aBoolean597 = true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method7089(@OriginalArg(0) Class143 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong257 == this.aLong258) {
			this.method7085();
		} else {
			this.method7088();
		}
		if (arg1 - this.aLong257 > 750L) {
			this.method7084();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong258);
		@Pc(36) Class41_Sub6 local36;
		if (this.aBoolean598) {
			for (local36 = (Class41_Sub6) this.aClass102_7.method2062(); local36 != null; local36 = (Class41_Sub6) this.aClass102_7.method2054()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass217_1.anInt6084; local39++) {
					local36.method6168(arg0, arg1, 1, !this.aBoolean597);
				}
			}
			this.aBoolean598 = false;
		}
		for (local36 = (Class41_Sub6) this.aClass102_7.method2062(); local36 != null; local36 = (Class41_Sub6) this.aClass102_7.method2054()) {
			local36.method6168(arg0, arg1, local27, !this.aBoolean597);
		}
		this.aLong258 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(J)V")
	public void method7090(@OriginalArg(0) long arg0) {
		this.aLong257 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IZ)V")
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static422.aClass102_5.method2055(this);
		this.aLong257 = (long) arg0;
		this.aLong258 = (long) arg0;
		this.aBoolean598 = true;
		this.aBoolean599 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ha;J[Lclient!nha;[Lclient!rf;Z)V")
	public void method7092(@OriginalArg(0) Class143 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class244[] arg2, @OriginalArg(3) Class303[] arg3) {
		if (!this.aBoolean596) {
			this.method7082(arg0, arg2);
			this.method7081(arg3);
			this.aLong257 = arg1;
		}
	}
}
