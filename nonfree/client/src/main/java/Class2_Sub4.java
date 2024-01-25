import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public int anInt4420;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
	public int anInt4421;

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
	public int anInt4422;

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
	public int anInt4423;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Z")
	public boolean aBoolean348 = false;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	public int anInt4418 = 0;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Lclient!cl;")
	private Class32 aClass32_9 = new Class32();

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
	private int anInt4419 = 0;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Lclient!kn;")
	public Class116 aClass116_39 = new Class116();

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
	private int anInt4424 = 0;

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "Lclient!rm;")
	public final Class176 aClass176_2 = new Class176();

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "[Lclient!qk;")
	public Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array1 = new Class2_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4(@OriginalArg(0) int arg0) {
		Static178.aClass32_6.method844(this);
		this.aLong137 = arg0;
		this.aLong138 = arg0;
		this.aBoolean349 = true;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIIII)V")
	public void method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4422 = arg0;
		this.anInt4421 = arg1;
		this.anInt4420 = arg3;
		this.anInt4423 = arg4;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!vq;[Lclient!hq;Z)V")
	private void method3926(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class89[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static216.aBooleanArray24[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class2_Sub3 local16 = (Class2_Sub3) this.aClass32_9.method850(); local16 != null; local16 = (Class2_Sub3) this.aClass32_9.method846()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass89_2 == arg1[local21] || local16.aClass89_2 == arg1[local21].aClass89_1) {
						Static216.aBooleanArray24[local21] = true;
						local16.method3472();
						local16.aBoolean298 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3813 == 0) {
				local16.method5419();
				this.anInt4419--;
			} else {
				local16.aBoolean298 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4419 != 8; local21++) {
			if (!Static216.aBooleanArray24[local21]) {
				@Pc(101) Class2_Sub3 local101 = new Class2_Sub3(arg0, arg1[local21], this, this.aLong137);
				this.aClass32_9.method844(local101);
				this.anInt4419++;
				Static216.aBooleanArray24[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "()Lclient!rm;")
	public Class176 method3927() {
		return this.aClass176_2;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "()V")
	public void method3928() {
		this.aBoolean349 = true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!vq;J[Lclient!hq;[Lclient!rl;Z)V")
	public void method3929(@OriginalArg(0) Class47 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class89[] arg2, @OriginalArg(3) Class175[] arg3) {
		if (!this.aBoolean348) {
			this.method3926(arg0, arg2);
			this.method3937(arg3);
			this.aLong137 = arg1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "()V")
	public void method3930() {
		this.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(J)V")
	public void method3931(@OriginalArg(0) long arg0) {
		this.aLong137 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "()V")
	public void method3932() {
		this.aBoolean348 = true;
		for (@Pc(8) Class4_Sub4_Sub3 local8 = (Class4_Sub4_Sub3) this.aClass116_39.method3270(); local8 != null; local8 = (Class4_Sub4_Sub3) this.aClass116_39.method3272()) {
			if (local8.aClass208_1.anInt6383 == 1) {
				local8.method5678();
			}
		}
		this.aClass2_Sub1_Sub1_Sub1Array1 = new Class2_Sub1_Sub1_Sub1[8192];
		this.anInt4418 = 0;
		this.aClass32_9 = new Class32();
		this.anInt4419 = 0;
		this.aClass116_39 = new Class116();
		this.anInt4424 = 0;
		this.method5419();
	}

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "()V")
	private void method3934() {
		this.aBoolean347 = false;
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "()V")
	public void method3935() {
		this.aClass176_2.aClass195_1.method5110();
		for (@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) this.aClass32_9.method850(); local10 != null; local10 = (Class2_Sub3) this.aClass32_9.method846()) {
			local10.method3470(this.aLong138);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!vq;J)Z")
	public boolean method3936(@OriginalArg(0) Class47 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong137 == this.aLong138) {
			this.method3934();
		} else {
			this.method3930();
		}
		if (arg1 - this.aLong137 > 750L) {
			this.method3932();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong138);
		@Pc(36) Class2_Sub3 local36;
		if (this.aBoolean349) {
			for (local36 = (Class2_Sub3) this.aClass32_9.method850(); local36 != null; local36 = (Class2_Sub3) this.aClass32_9.method846()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass192_1.anInt5855; local39++) {
					local36.method3471(1, !this.aBoolean347, arg0, arg1);
				}
			}
			this.aBoolean349 = false;
		}
		for (local36 = (Class2_Sub3) this.aClass32_9.method850(); local36 != null; local36 = (Class2_Sub3) this.aClass32_9.method846()) {
			local36.method3471(local27, !this.aBoolean347, arg0, arg1);
		}
		this.aLong138 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([Lclient!rl;Z)V")
	private void method3937(@OriginalArg(0) Class175[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static216.aBooleanArray23[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class4_Sub4_Sub3 local16 = (Class4_Sub4_Sub3) this.aClass116_39.method3270(); local16 != null; local16 = (Class4_Sub4_Sub3) this.aClass116_39.method3272()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass175_1 == arg0[local21] || local16.aClass175_1 == arg0[local21].aClass175_2) {
						Static216.aBooleanArray23[local21] = true;
						local16.method1879();
						continue label68;
					}
				}
			}
			local16.method5687();
			this.anInt4424--;
			if (local16.method5674()) {
				local16.method5678();
				Static189.anInt3955--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4424 != 8; local21++) {
			if (!Static216.aBooleanArray23[local21]) {
				@Pc(93) Class4_Sub4_Sub3 local93 = null;
				if (Static198.method3733(arg0[local21].anInt5509).anInt6383 == 1 && Static189.anInt3955 < 32) {
					local93 = new Class4_Sub4_Sub3(arg0[local21], this);
					Static288.aClass131_1.method3722((long) arg0[local21].anInt5509, local93);
					Static189.anInt3955++;
				}
				if (local93 == null) {
					local93 = new Class4_Sub4_Sub3(arg0[local21], this);
				}
				this.aClass116_39.method3274(local93);
				this.anInt4424++;
				Static216.aBooleanArray23[local21] = true;
			}
		}
	}
}
