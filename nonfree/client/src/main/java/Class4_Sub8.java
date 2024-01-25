import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "J")
	private long aLong287;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "J")
	private long aLong288;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public int anInt10139;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public int anInt10137 = 0;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Z")
	private boolean aBoolean704 = false;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Z")
	public boolean aBoolean705 = false;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Lclient!pda;")
	private Class283 aClass283_14 = new Class283();

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	private int anInt10138 = 0;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "Lclient!bd;")
	public Class32 aClass32_65 = new Class32();

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	private int anInt10140 = 0;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Z")
	private boolean aBoolean706 = false;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
	public boolean aBoolean707 = false;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!qv;")
	public final Class304 aClass304_1 = new Class304();

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[Lclient!ti;")
	public final Class4_Sub4_Sub1_Sub1[] aClass4_Sub4_Sub1_Sub1Array2 = new Class4_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IZ)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method8668(arg0, arg1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;J[Lclient!tm;[Lclient!ih;Z)V")
	public void method8667(@OriginalArg(0) Class144 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class352[] arg2, @OriginalArg(3) Class172[] arg3) {
		if (!this.aBoolean705) {
			this.method8669(arg0, arg2);
			this.method8672(arg3);
			this.aLong287 = arg1;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(IZ)V")
	public void method8668(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static440.aClass283_5.method6802(this);
		this.aLong287 = (long) arg0;
		this.aLong288 = (long) arg0;
		this.aBoolean706 = true;
		this.aBoolean707 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;[Lclient!tm;Z)V")
	private void method8669(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class352[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static616.aBooleanArray25[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class4_Sub6 local16 = (Class4_Sub6) this.aClass283_14.method6791(); local16 != null; local16 = (Class4_Sub6) this.aClass283_14.method6792()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass352_1 == arg1[local21] || local16.aClass352_1 == arg1[local21].aClass352_2) {
						Static616.aBooleanArray25[local21] = true;
						local16.method5934();
						local16.aBoolean485 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt6807 == 0) {
				local16.method9473();
				this.anInt10138--;
			} else {
				local16.aBoolean485 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt10138 != 32; local21++) {
			if (!Static616.aBooleanArray25[local21]) {
				@Pc(104) Class4_Sub6 local104 = new Class4_Sub6(arg0, arg1[local21], this, this.aLong287);
				this.aClass283_14.method6802(local104);
				this.anInt10138++;
				Static616.aBooleanArray25[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
	public void method8670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10139 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "()Lclient!qv;")
	public Class304 method8671() {
		return this.aClass304_1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lclient!ih;Z)V")
	private void method8672(@OriginalArg(0) Class172[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static616.aBooleanArray26[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class14_Sub2_Sub3 local16 = (Class14_Sub2_Sub3) this.aClass32_65.method584(); local16 != null; local16 = (Class14_Sub2_Sub3) this.aClass32_65.method577()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass172_1 == arg0[local21] || local16.aClass172_1 == arg0[local21].aClass172_2) {
						Static616.aBooleanArray26[local21] = true;
						local16.method1108();
						continue label71;
					}
				}
			}
			local16.method9513();
			this.anInt10140--;
			if (local16.method9094()) {
				local16.method9093();
				Static139.anInt2199--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt10140 != 8; local21++) {
			if (!Static616.aBooleanArray26[local21]) {
				@Pc(96) Class14_Sub2_Sub3 local96 = null;
				if (arg0[local21].method4231().anInt9074 == 1 && Static139.anInt2199 < 32) {
					local96 = new Class14_Sub2_Sub3(arg0[local21], this);
					Static164.aClass300_1.method7456((long) arg0[local21].anInt4760, local96);
					Static139.anInt2199++;
				}
				if (local96 == null) {
					local96 = new Class14_Sub2_Sub3(arg0[local21], this);
				}
				this.aClass32_65.method582(local96);
				this.anInt10140++;
				Static616.aBooleanArray26[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method8673(@OriginalArg(0) Class144 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong287 == this.aLong288) {
			this.method8674();
		} else {
			this.method8680();
		}
		if (arg1 - this.aLong287 > 750L) {
			this.method8679();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong288);
		@Pc(36) Class4_Sub6 local36;
		if (this.aBoolean706) {
			for (local36 = (Class4_Sub6) this.aClass283_14.method6791(); local36 != null; local36 = (Class4_Sub6) this.aClass283_14.method6792()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass385_1.anInt10858; local39++) {
					local36.method5940(!this.aBoolean704, arg1, 1, arg0);
				}
			}
			this.aBoolean706 = false;
		}
		for (local36 = (Class4_Sub6) this.aClass283_14.method6791(); local36 != null; local36 = (Class4_Sub6) this.aClass283_14.method6792()) {
			local36.method5940(!this.aBoolean704, arg1, local27, arg0);
		}
		this.aLong288 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "()V")
	private void method8674() {
		this.aBoolean704 = false;
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "()Lclient!qv;")
	public Class304 method8675() {
		this.aClass304_1.aClass324_1.method7946();
		for (@Pc(6) int local6 = 0; local6 < this.aClass4_Sub4_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass4_Sub4_Sub1_Sub1Array2[local6] != null && this.aClass4_Sub4_Sub1_Sub1Array2[local6].aClass4_Sub6_1 != null) {
				this.aClass304_1.aClass324_1.method7953(this.aClass4_Sub4_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass304_1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;)V")
	public void method8676(@OriginalArg(0) Class144 arg0) {
		this.aClass304_1.aClass324_1.method7946();
		for (@Pc(10) Class4_Sub6 local10 = (Class4_Sub6) this.aClass283_14.method6791(); local10 != null; local10 = (Class4_Sub6) this.aClass283_14.method6792()) {
			local10.method5941(arg0, this.aLong288);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(J)V")
	public void method8678(@OriginalArg(0) long arg0) {
		this.aLong287 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
	public void method8679() {
		this.aBoolean705 = true;
		for (@Pc(8) Class14_Sub2_Sub3 local8 = (Class14_Sub2_Sub3) this.aClass32_65.method584(); local8 != null; local8 = (Class14_Sub2_Sub3) this.aClass32_65.method577()) {
			if (local8.aClass312_1.anInt9074 == 1) {
				local8.method9093();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass4_Sub4_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass4_Sub4_Sub1_Sub1Array2[local27] != null) {
				this.aClass4_Sub4_Sub1_Sub1Array2[local27].method8328();
				this.aClass4_Sub4_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt10137 = 0;
		this.aClass283_14 = new Class283();
		this.anInt10138 = 0;
		this.aClass32_65 = new Class32();
		this.anInt10140 = 0;
		this.method9473();
		Static192.aClass4_Sub8Array5[Static44.anInt763] = this;
		Static44.anInt763 = Static44.anInt763 + 1 & Static435.anIntArray389[Static173.anInt2826];
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "()V")
	public void method8680() {
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "()V")
	public void method8681() {
		this.aBoolean706 = true;
	}
}
