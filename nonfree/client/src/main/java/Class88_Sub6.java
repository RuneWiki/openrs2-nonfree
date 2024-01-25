import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class88_Sub6 extends Class88 {

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	public int anInt6358;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public int anInt6359;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	public int anInt6361;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	public int anInt6356 = 0;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Z")
	public boolean aBoolean420 = false;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!hv;")
	private Class107 aClass107_12 = new Class107();

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	private int anInt6357 = 0;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!nv;")
	public Class177 aClass177_36 = new Class177();

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	private int anInt6360 = 0;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!vm;")
	public final Class255 aClass255_1 = new Class255();

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[Lclient!gg;")
	public Class88_Sub1_Sub1_Sub1[] aClass88_Sub1_Sub1_Sub1Array3 = new Class88_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!td", name = "l", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "J")
	private long aLong198;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
	public Class88_Sub6(@OriginalArg(0) int arg0) {
		Static348.aClass107_11.method2332(this);
		this.aLong197 = arg0;
		this.aLong198 = arg0;
		this.aBoolean422 = true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
	public void method5041() {
		this.aClass255_1.aClass225_1.method4944();
		for (@Pc(10) Class88_Sub3 local10 = (Class88_Sub3) this.aClass107_12.method2326(); local10 != null; local10 = (Class88_Sub3) this.aClass107_12.method2327()) {
			local10.method3943(this.aLong198);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!za;J[Lclient!od;[Lclient!u;Z)V")
	public void method5042(@OriginalArg(0) Class200 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class179[] arg2, @OriginalArg(3) Class236[] arg3) {
		if (!this.aBoolean420) {
			this.method5048(arg0, arg2);
			this.method5050(arg3);
			this.aLong197 = arg1;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(J)V")
	public void method5044(@OriginalArg(0) long arg0) {
		this.aLong197 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()Lclient!vm;")
	public Class255 method5045() {
		return this.aClass255_1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!za;J)Z")
	public boolean method5046(@OriginalArg(0) Class200 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong197 == this.aLong198) {
			this.method5053();
		} else {
			this.method5051();
		}
		if (arg1 - this.aLong197 > 750L) {
			this.method5049();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong198);
		@Pc(36) Class88_Sub3 local36;
		if (this.aBoolean422) {
			for (local36 = (Class88_Sub3) this.aClass107_12.method2326(); local36 != null; local36 = (Class88_Sub3) this.aClass107_12.method2327()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass156_1.anInt4005; local39++) {
					local36.method3945(1, arg1, arg0, !this.aBoolean421);
				}
			}
			this.aBoolean422 = false;
		}
		for (local36 = (Class88_Sub3) this.aClass107_12.method2326(); local36 != null; local36 = (Class88_Sub3) this.aClass107_12.method2327()) {
			local36.method3945(local27, arg1, arg0, !this.aBoolean421);
		}
		this.aLong198 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	public void method5047() {
		this.aBoolean422 = true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!za;[Lclient!od;Z)V")
	private void method5048(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class179[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static386.aBooleanArray23[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class88_Sub3 local16 = (Class88_Sub3) this.aClass107_12.method2326(); local16 != null; local16 = (Class88_Sub3) this.aClass107_12.method2327()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass179_2 == arg1[local21] || local16.aClass179_2 == arg1[local21].aClass179_1) {
						Static386.aBooleanArray23[local21] = true;
						local16.method3949();
						local16.aBoolean345 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4984 == 0) {
				local16.method5917();
				this.anInt6357--;
			} else {
				local16.aBoolean345 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt6357 != 8; local21++) {
			if (!Static386.aBooleanArray23[local21]) {
				@Pc(101) Class88_Sub3 local101 = new Class88_Sub3(arg0, arg1[local21], this, this.aLong197);
				this.aClass107_12.method2332(local101);
				this.anInt6357++;
				Static386.aBooleanArray23[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
	public void method5049() {
		this.aBoolean420 = true;
		for (@Pc(8) Class5_Sub2_Sub16 local8 = (Class5_Sub2_Sub16) this.aClass177_36.method3618(); local8 != null; local8 = (Class5_Sub2_Sub16) this.aClass177_36.method3619()) {
			if (local8.aClass55_1.anInt1558 == 1) {
				local8.method6006();
			}
		}
		this.aClass88_Sub1_Sub1_Sub1Array3 = new Class88_Sub1_Sub1_Sub1[8192];
		this.anInt6356 = 0;
		this.aClass107_12 = new Class107();
		this.anInt6357 = 0;
		this.aClass177_36 = new Class177();
		this.anInt6360 = 0;
		this.method5917();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([Lclient!u;Z)V")
	private void method5050(@OriginalArg(0) Class236[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static386.aBooleanArray24[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class5_Sub2_Sub16 local16 = (Class5_Sub2_Sub16) this.aClass177_36.method3618(); local16 != null; local16 = (Class5_Sub2_Sub16) this.aClass177_36.method3619()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass236_1 == arg0[local21] || local16.aClass236_1 == arg0[local21].aClass236_2) {
						Static386.aBooleanArray24[local21] = true;
						local16.method5066();
						continue label68;
					}
				}
			}
			local16.method6003();
			this.anInt6360--;
			if (local16.method6007()) {
				local16.method6006();
				Static241.anInt3926--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt6360 != 8; local21++) {
			if (!Static386.aBooleanArray24[local21]) {
				@Pc(93) Class5_Sub2_Sub16 local93 = null;
				if (arg0[local21].method5358().anInt1558 == 1 && Static241.anInt3926 < 32) {
					local93 = new Class5_Sub2_Sub16(arg0[local21], this);
					Static136.aClass237_27.method5365(local93, (long) arg0[local21].anInt6773);
					Static241.anInt3926++;
				}
				if (local93 == null) {
					local93 = new Class5_Sub2_Sub16(arg0[local21], this);
				}
				this.aClass177_36.method3615(local93);
				this.anInt6360++;
				Static386.aBooleanArray24[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
	public void method5051() {
		this.aBoolean421 = true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public void method5052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6359 = arg0;
		this.anInt6361 = arg1;
		this.anInt6363 = arg2;
		this.anInt6358 = arg3;
		this.anInt6362 = arg4;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
	private void method5053() {
		this.aBoolean421 = false;
	}
}
