import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class20_Sub5 extends Class20 {

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public int anInt4270 = 0;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!vu;")
	private Class349 aClass349_5 = new Class349();

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	private int anInt4271 = 0;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "Lclient!wo;")
	public Class361 aClass361_47 = new Class361();

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	private int anInt4273 = 0;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Lclient!ec;")
	public final Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "[Lclient!nr;")
	public final Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array1 = new Class20_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IZ)V")
	public Class20_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3669(arg0, arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;J)Z")
	public boolean method3654(@OriginalArg(0) Class12 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong182 == this.aLong183) {
			this.method3657();
		} else {
			this.method3661();
		}
		if (arg1 - this.aLong182 > 750L) {
			this.method3667();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong183);
		@Pc(36) Class20_Sub7 local36;
		if (this.aBoolean345) {
			for (local36 = (Class20_Sub7) this.aClass349_5.method7653(); local36 != null; local36 = (Class20_Sub7) this.aClass349_5.method7660()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass86_1.anInt2380; local39++) {
					local36.method5452(!this.aBoolean343, 1, arg1, arg0);
				}
			}
			this.aBoolean345 = false;
		}
		for (local36 = (Class20_Sub7) this.aClass349_5.method7653(); local36 != null; local36 = (Class20_Sub7) this.aClass349_5.method7660()) {
			local36.method5452(!this.aBoolean343, local27, arg1, arg0);
		}
		this.aLong183 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public void method3655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4272 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;J[Lclient!mp;[Lclient!fk;Z)V")
	public void method3656(@OriginalArg(0) Class12 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class219[] arg2, @OriginalArg(3) Class101[] arg3) {
		if (!this.aBoolean342) {
			this.method3665(arg0, arg2);
			this.method3659(arg3);
			this.aLong182 = arg1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
	private void method3657() {
		this.aBoolean343 = false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!fk;Z)V")
	private void method3659(@OriginalArg(0) Class101[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static220.aBooleanArray11[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class1_Sub3_Sub16 local16 = (Class1_Sub3_Sub16) this.aClass361_47.method7854(); local16 != null; local16 = (Class1_Sub3_Sub16) this.aClass361_47.method7853()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass101_2 == arg0[local21] || local16.aClass101_2 == arg0[local21].aClass101_1) {
						Static220.aBooleanArray11[local21] = true;
						local16.method5919();
						continue label71;
					}
				}
			}
			local16.method7878();
			this.anInt4273--;
			if (local16.method7813()) {
				local16.method7811();
				Static152.anInt2859--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4273 != 8; local21++) {
			if (!Static220.aBooleanArray11[local21]) {
				@Pc(96) Class1_Sub3_Sub16 local96 = null;
				if (arg0[local21].method2365().anInt9083 == 1 && Static152.anInt2859 < 32) {
					local96 = new Class1_Sub3_Sub16(arg0[local21], this);
					Static531.aClass33_1.method1007(local96, (long) arg0[local21].anInt2800);
					Static152.anInt2859++;
				}
				if (local96 == null) {
					local96 = new Class1_Sub3_Sub16(arg0[local21], this);
				}
				this.aClass361_47.method7855(local96);
				this.anInt4273++;
				Static220.aBooleanArray11[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()V")
	public void method3660() {
		this.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	public void method3661() {
		this.aBoolean343 = true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;)V")
	public void method3662(@OriginalArg(0) Class12 arg0) {
		this.aClass82_1.aClass127_1.method2712();
		for (@Pc(10) Class20_Sub7 local10 = (Class20_Sub7) this.aClass349_5.method7653(); local10 != null; local10 = (Class20_Sub7) this.aClass349_5.method7660()) {
			local10.method5454(this.aLong183, arg0);
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()Lclient!ec;")
	public Class82 method3663() {
		this.aClass82_1.aClass127_1.method2712();
		for (@Pc(6) int local6 = 0; local6 < this.aClass20_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass20_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass20_Sub1_Sub1_Sub1Array1[local6].aClass20_Sub7_1 != null) {
				this.aClass82_1.aClass127_1.method2715(this.aClass20_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass82_1;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "()Lclient!ec;")
	public Class82 method3664() {
		return this.aClass82_1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;[Lclient!mp;Z)V")
	private void method3665(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class219[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static220.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class20_Sub7 local16 = (Class20_Sub7) this.aClass349_5.method7653(); local16 != null; local16 = (Class20_Sub7) this.aClass349_5.method7660()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass219_2 == arg1[local21] || local16.aClass219_2 == arg1[local21].aClass219_1) {
						Static220.aBooleanArray12[local21] = true;
						local16.method5455();
						local16.aBoolean468 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt6611 == 0) {
				local16.method7704();
				this.anInt4271--;
			} else {
				local16.aBoolean468 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4271 != 32; local21++) {
			if (!Static220.aBooleanArray12[local21]) {
				@Pc(104) Class20_Sub7 local104 = new Class20_Sub7(arg0, arg1[local21], this, this.aLong182);
				this.aClass349_5.method7655(local104);
				this.anInt4271++;
				Static220.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "()V")
	public void method3667() {
		this.aBoolean342 = true;
		for (@Pc(8) Class1_Sub3_Sub16 local8 = (Class1_Sub3_Sub16) this.aClass361_47.method7854(); local8 != null; local8 = (Class1_Sub3_Sub16) this.aClass361_47.method7853()) {
			if (local8.aClass343_1.anInt9083 == 1) {
				local8.method7811();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass20_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass20_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass20_Sub1_Sub1_Sub1Array1[local27].method5279();
				this.aClass20_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt4270 = 0;
		this.aClass349_5 = new Class349();
		this.anInt4271 = 0;
		this.aClass361_47 = new Class361();
		this.anInt4273 = 0;
		this.method7704();
		Static400.aClass20_Sub5Array2[Static469.anInt7951] = this;
		Static469.anInt7951 = Static469.anInt7951 + 1 & Static504.anIntArray578[Static341.anInt6056];
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(J)V")
	public void method3668(@OriginalArg(0) long arg0) {
		this.aLong182 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IZ)V")
	public void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static290.aClass349_7.method7655(this);
		this.aLong182 = arg0;
		this.aLong183 = arg0;
		this.aBoolean345 = true;
		this.aBoolean344 = arg1;
	}
}
