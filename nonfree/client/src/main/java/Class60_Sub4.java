import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class60_Sub4 extends Class60 {

	@OriginalMember(owner = "client!it", name = "y", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	public int anInt5035;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Z")
	private boolean aBoolean377 = false;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public int anInt5032 = 0;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!vs;")
	private Class385 aClass385_3 = new Class385();

	@OriginalMember(owner = "client!it", name = "x", descriptor = "I")
	private int anInt5033 = 0;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "Lclient!tf;")
	public Class340 aClass340_34 = new Class340();

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	private int anInt5034 = 0;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "Z")
	private boolean aBoolean378 = false;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Lclient!kia;")
	public final Class209 aClass209_1 = new Class209();

	@OriginalMember(owner = "client!it", name = "k", descriptor = "[Lclient!ks;")
	public final Class60_Sub2_Sub1_Sub1[] aClass60_Sub2_Sub1_Sub1Array2 = new Class60_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IZ)V")
	public Class60_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4542(arg0, arg1);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(IZ)V")
	public void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static374.aClass385_6.method8779(this);
		this.aLong160 = (long) arg0;
		this.aLong159 = (long) arg0;
		this.aBoolean378 = true;
		this.aBoolean379 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "()V")
	public void method4543() {
		this.aBoolean377 = true;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "()Lclient!kia;")
	public Class209 method4544() {
		return this.aClass209_1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ha;)V")
	public void method4545(@OriginalArg(0) Class75 arg0) {
		this.aClass209_1.aClass46_1.method673();
		for (@Pc(10) Class60_Sub7 local10 = (Class60_Sub7) this.aClass385_3.method8778(); local10 != null; local10 = (Class60_Sub7) this.aClass385_3.method8773()) {
			local10.method5570(arg0, this.aLong159);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(J)V")
	public void method4546(@OriginalArg(0) long arg0) {
		this.aLong160 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIII)V")
	public void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5035 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ha;J[Lclient!kw;[Lclient!iia;Z)V")
	public void method4548(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class216[] arg2, @OriginalArg(3) Class173[] arg3) {
		if (!this.aBoolean376) {
			this.method4551(arg0, arg2);
			this.method4554(arg3);
			this.aLong160 = arg1;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method4549(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong160 == this.aLong159) {
			this.method4552();
		} else {
			this.method4543();
		}
		if (arg1 - this.aLong160 > 750L) {
			this.method4557();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong159);
		@Pc(36) Class60_Sub7 local36;
		if (this.aBoolean378) {
			for (local36 = (Class60_Sub7) this.aClass385_3.method8778(); local36 != null; local36 = (Class60_Sub7) this.aClass385_3.method8773()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass280_1.anInt7861; local39++) {
					local36.method5569(arg0, 1, arg1, !this.aBoolean377);
				}
			}
			this.aBoolean378 = false;
		}
		for (local36 = (Class60_Sub7) this.aClass385_3.method8778(); local36 != null; local36 = (Class60_Sub7) this.aClass385_3.method8773()) {
			local36.method5569(arg0, local27, arg1, !this.aBoolean377);
		}
		this.aLong159 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "()V")
	public void method4550() {
		this.aBoolean378 = true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ha;[Lclient!kw;Z)V")
	private void method4551(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class216[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static267.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class60_Sub7 local16 = (Class60_Sub7) this.aClass385_3.method8778(); local16 != null; local16 = (Class60_Sub7) this.aClass385_3.method8773()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass216_2 == arg1[local21] || local16.aClass216_2 == arg1[local21].aClass216_1) {
						Static267.aBooleanArray12[local21] = true;
						local16.method5567();
						local16.aBoolean459 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt6205 == 0) {
				local16.method8914();
				this.anInt5033--;
			} else {
				local16.aBoolean459 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt5033 != 32; local21++) {
			if (!Static267.aBooleanArray12[local21]) {
				@Pc(104) Class60_Sub7 local104 = new Class60_Sub7(arg0, arg1[local21], this, this.aLong160);
				this.aClass385_3.method8779(local104);
				this.anInt5033++;
				Static267.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "g", descriptor = "()V")
	private void method4552() {
		this.aBoolean377 = false;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([Lclient!iia;Z)V")
	private void method4554(@OriginalArg(0) Class173[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static267.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub2_Sub14 local16 = (Class6_Sub2_Sub14) this.aClass340_34.method8124(); local16 != null; local16 = (Class6_Sub2_Sub14) this.aClass340_34.method8134()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass173_2 == arg0[local21] || local16.aClass173_2 == arg0[local21].aClass173_1) {
						Static267.aBooleanArray13[local21] = true;
						local16.method5860();
						continue label71;
					}
				}
			}
			local16.method9051();
			this.anInt5034--;
			if (local16.method8470()) {
				local16.method8464();
				Static75.anInt1039--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt5034 != 8; local21++) {
			if (!Static267.aBooleanArray13[local21]) {
				@Pc(96) Class6_Sub2_Sub14 local96 = null;
				if (arg0[local21].method4483().anInt2656 == 1 && Static75.anInt1039 < 32) {
					local96 = new Class6_Sub2_Sub14(arg0[local21], this);
					Static665.aClass88_1.method2180(local96, (long) arg0[local21].anInt4950);
					Static75.anInt1039++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub2_Sub14(arg0[local21], this);
				}
				this.aClass340_34.method8131(local96);
				this.anInt5034++;
				Static267.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()Lclient!kia;")
	public Class209 method4556() {
		this.aClass209_1.aClass46_1.method673();
		for (@Pc(6) int local6 = 0; local6 < this.aClass60_Sub2_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass60_Sub2_Sub1_Sub1Array2[local6] != null && this.aClass60_Sub2_Sub1_Sub1Array2[local6].aClass60_Sub7_1 != null) {
				this.aClass209_1.aClass46_1.method674(this.aClass60_Sub2_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass209_1;
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "()V")
	public void method4557() {
		this.aBoolean376 = true;
		for (@Pc(8) Class6_Sub2_Sub14 local8 = (Class6_Sub2_Sub14) this.aClass340_34.method8124(); local8 != null; local8 = (Class6_Sub2_Sub14) this.aClass340_34.method8134()) {
			if (local8.aClass100_1.anInt2656 == 1) {
				local8.method8464();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass60_Sub2_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass60_Sub2_Sub1_Sub1Array2[local27] != null) {
				this.aClass60_Sub2_Sub1_Sub1Array2[local27].method5111();
				this.aClass60_Sub2_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt5032 = 0;
		this.aClass385_3 = new Class385();
		this.anInt5033 = 0;
		this.aClass340_34 = new Class340();
		this.anInt5034 = 0;
		this.method8914();
		Static239.aClass60_Sub4Array1[Static688.anInt10535] = this;
		Static688.anInt10535 = Static688.anInt10535 + 1 & Static493.anIntArray525[Static470.anInt8040];
	}
}
