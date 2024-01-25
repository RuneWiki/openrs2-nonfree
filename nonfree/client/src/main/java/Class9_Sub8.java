import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class9_Sub8 extends Class9 {

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!nha", name = "o", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!nha", name = "x", descriptor = "I")
	public int anInt6827;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
	public int anInt6824 = 0;

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "Z")
	public boolean aBoolean493 = false;

	@OriginalMember(owner = "client!nha", name = "q", descriptor = "Lclient!hca;")
	private Class139 aClass139_10 = new Class139();

	@OriginalMember(owner = "client!nha", name = "s", descriptor = "I")
	private int anInt6825 = 0;

	@OriginalMember(owner = "client!nha", name = "r", descriptor = "Lclient!mba;")
	public Class216 aClass216_49 = new Class216();

	@OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
	private int anInt6826 = 0;

	@OriginalMember(owner = "client!nha", name = "t", descriptor = "Z")
	public boolean aBoolean494 = false;

	@OriginalMember(owner = "client!nha", name = "w", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "client!nha", name = "v", descriptor = "Lclient!ik;")
	public final Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!nha", name = "m", descriptor = "[Lclient!nd;")
	public final Class9_Sub3_Sub2_Sub1[] aClass9_Sub3_Sub2_Sub1Array2 = new Class9_Sub3_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(IZ)V")
	public Class9_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5942(arg0, arg1);
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "()V")
	public void method5935() {
		this.aBoolean493 = true;
		for (@Pc(8) Class3_Sub7_Sub7 local8 = (Class3_Sub7_Sub7) this.aClass216_49.method5457(); local8 != null; local8 = (Class3_Sub7_Sub7) this.aClass216_49.method5458()) {
			if (local8.aClass121_1.anInt3358 == 1) {
				local8.method7907();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass9_Sub3_Sub2_Sub1Array2.length; local27++) {
			if (this.aClass9_Sub3_Sub2_Sub1Array2[local27] != null) {
				this.aClass9_Sub3_Sub2_Sub1Array2[local27].method5877();
				this.aClass9_Sub3_Sub2_Sub1Array2[local27] = null;
			}
		}
		this.anInt6824 = 0;
		this.aClass139_10 = new Class139();
		this.anInt6825 = 0;
		this.aClass216_49 = new Class216();
		this.anInt6826 = 0;
		this.method8593();
		Static438.aClass9_Sub8Array1[Static417.anInt7331] = this;
		Static417.anInt7331 = Static417.anInt7331 + 1 & Static435.anIntArray452[Static479.anInt7495];
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;J[Lclient!mv;[Lclient!nba;Z)V")
	public void method5936(@OriginalArg(0) Class82 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class228[] arg2, @OriginalArg(3) Class232[] arg3) {
		if (!this.aBoolean493) {
			this.method5943(arg0, arg2);
			this.method5944(arg3);
			this.aLong180 = arg1;
		}
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "()V")
	public void method5937() {
		this.aBoolean495 = true;
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "()Lclient!ik;")
	public Class162 method5939() {
		this.aClass162_1.aClass347_1.method8209();
		for (@Pc(6) int local6 = 0; local6 < this.aClass9_Sub3_Sub2_Sub1Array2.length; local6++) {
			if (this.aClass9_Sub3_Sub2_Sub1Array2[local6] != null && this.aClass9_Sub3_Sub2_Sub1Array2[local6].aClass9_Sub4_1 != null) {
				this.aClass162_1.aClass347_1.method8207(this.aClass9_Sub3_Sub2_Sub1Array2[local6]);
			}
		}
		return this.aClass162_1;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(J)V")
	public void method5940(@OriginalArg(0) long arg0) {
		this.aLong180 = arg0;
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "()V")
	private void method5941() {
		this.aBoolean492 = false;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(IZ)V")
	public void method5942(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static76.aClass139_2.method3203(this);
		this.aLong180 = (long) arg0;
		this.aLong179 = (long) arg0;
		this.aBoolean495 = true;
		this.aBoolean494 = arg1;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;[Lclient!mv;Z)V")
	private void method5943(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class228[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static375.aBooleanArray24[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class9_Sub4 local16 = (Class9_Sub4) this.aClass139_10.method3198(); local16 != null; local16 = (Class9_Sub4) this.aClass139_10.method3205()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass228_1 == arg1[local21] || local16.aClass228_1 == arg1[local21].aClass228_2) {
						Static375.aBooleanArray24[local21] = true;
						local16.method4025();
						local16.aBoolean344 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt4705 == 0) {
				local16.method8593();
				this.anInt6825--;
			} else {
				local16.aBoolean344 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6825 != 32; local21++) {
			if (!Static375.aBooleanArray24[local21]) {
				@Pc(104) Class9_Sub4 local104 = new Class9_Sub4(arg0, arg1[local21], this, this.aLong180);
				this.aClass139_10.method3203(local104);
				this.anInt6825++;
				Static375.aBooleanArray24[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "([Lclient!nba;Z)V")
	private void method5944(@OriginalArg(0) Class232[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static375.aBooleanArray23[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub7_Sub7 local16 = (Class3_Sub7_Sub7) this.aClass216_49.method5457(); local16 != null; local16 = (Class3_Sub7_Sub7) this.aClass216_49.method5458()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass232_1 == arg0[local21] || local16.aClass232_1 == arg0[local21].aClass232_2) {
						Static375.aBooleanArray23[local21] = true;
						local16.method2216();
						continue label71;
					}
				}
			}
			local16.method8682();
			this.anInt6826--;
			if (local16.method7910()) {
				local16.method7907();
				Static41.anInt770--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6826 != 8; local21++) {
			if (!Static375.aBooleanArray23[local21]) {
				@Pc(96) Class3_Sub7_Sub7 local96 = null;
				if (arg0[local21].method5856().anInt3358 == 1 && Static41.anInt770 < 32) {
					local96 = new Class3_Sub7_Sub7(arg0[local21], this);
					Static240.aClass353_1.method8296((long) arg0[local21].anInt6735, local96);
					Static41.anInt770++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub7_Sub7(arg0[local21], this);
				}
				this.aClass216_49.method5449(local96);
				this.anInt6826++;
				Static375.aBooleanArray23[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "()V")
	public void method5945() {
		this.aBoolean492 = true;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIII)V")
	public void method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6827 = arg0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5947(@OriginalArg(0) Class82 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong180 == this.aLong179) {
			this.method5941();
		} else {
			this.method5945();
		}
		if (arg1 - this.aLong180 > 750L) {
			this.method5935();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong179);
		@Pc(36) Class9_Sub4 local36;
		if (this.aBoolean495) {
			for (local36 = (Class9_Sub4) this.aClass139_10.method3198(); local36 != null; local36 = (Class9_Sub4) this.aClass139_10.method3205()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass68_1.anInt1867; local39++) {
					local36.method4026(arg1, !this.aBoolean492, arg0, 1);
				}
			}
			this.aBoolean495 = false;
		}
		for (local36 = (Class9_Sub4) this.aClass139_10.method3198(); local36 != null; local36 = (Class9_Sub4) this.aClass139_10.method3205()) {
			local36.method4026(arg1, !this.aBoolean492, arg0, local27);
		}
		this.aLong179 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5948(@OriginalArg(0) Class82 arg0) {
		this.aClass162_1.aClass347_1.method8209();
		for (@Pc(10) Class9_Sub4 local10 = (Class9_Sub4) this.aClass139_10.method3198(); local10 != null; local10 = (Class9_Sub4) this.aClass139_10.method3205()) {
			local10.method4023(this.aLong179, arg0);
		}
	}

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "()Lclient!ik;")
	public Class162 method5949() {
		return this.aClass162_1;
	}
}
