import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
	public int anInt4347;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
	public int anInt4348;

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
	public int anInt4349;

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
	public int anInt4350;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	public int anInt4343 = 0;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Z")
	public boolean aBoolean354 = false;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "Lclient!qo;")
	private Class267 aClass267_4 = new Class267();

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	private int anInt4344 = 0;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "Lclient!mfa;")
	public Class211 aClass211_28 = new Class211();

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	private int anInt4345 = 0;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "Z")
	public boolean aBoolean357 = false;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Lclient!tg;")
	public final Class299 aClass299_1 = new Class299();

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "[Lclient!mea;")
	public final Class5_Sub1_Sub1_Sub1[] aClass5_Sub1_Sub1_Sub1Array1 = new Class5_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IZ)V")
	public Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3785(arg0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!oa;[Lclient!dg;Z)V")
	private void method3778(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class69[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static202.aBooleanArray15[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class5_Sub7 local16 = (Class5_Sub7) this.aClass267_4.method6544(); local16 != null; local16 = (Class5_Sub7) this.aClass267_4.method6543()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass69_2 == arg1[local21] || local16.aClass69_2 == arg1[local21].aClass69_1) {
						Static202.aBooleanArray15[local21] = true;
						local16.method6922();
						local16.aBoolean609 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8317 == 0) {
				local16.method7282();
				this.anInt4344--;
			} else {
				local16.aBoolean609 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4344 != 32; local21++) {
			if (!Static202.aBooleanArray15[local21]) {
				@Pc(104) Class5_Sub7 local104 = new Class5_Sub7(arg0, arg1[local21], this, this.aLong87);
				this.aClass267_4.method6538(local104);
				this.anInt4344++;
				Static202.aBooleanArray15[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
	public void method3779() {
		this.aBoolean354 = true;
		for (@Pc(8) Class6_Sub4_Sub16 local8 = (Class6_Sub4_Sub16) this.aClass211_28.method5183(); local8 != null; local8 = (Class6_Sub4_Sub16) this.aClass211_28.method5177()) {
			if (local8.aClass330_1.anInt9306 == 1) {
				local8.method8035();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass5_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass5_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass5_Sub1_Sub1_Sub1Array1[local27].method5146();
				this.aClass5_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt4343 = 0;
		this.aClass267_4 = new Class267();
		this.anInt4344 = 0;
		this.aClass211_28 = new Class211();
		this.anInt4345 = 0;
		this.method7282();
		Static118.aClass5_Sub2Array1[Static298.anInt5669] = this;
		Static298.anInt5669 = Static298.anInt5669 + 1 & Static429.anIntArray566[Static217.anInt3896];
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
	public void method3780() {
		this.aBoolean356 = true;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!oa;)V")
	public void method3781(@OriginalArg(0) Class9 arg0) {
		this.aClass299_1.aClass272_1.method6600();
		for (@Pc(10) Class5_Sub7 local10 = (Class5_Sub7) this.aClass267_4.method6544(); local10 != null; local10 = (Class5_Sub7) this.aClass267_4.method6543()) {
			local10.method6924(arg0, this.aLong86);
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "()Lclient!tg;")
	public Class299 method3782() {
		this.aClass299_1.aClass272_1.method6600();
		for (@Pc(6) int local6 = 0; local6 < this.aClass5_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass5_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass5_Sub1_Sub1_Sub1Array1[local6].aClass5_Sub7_1 != null) {
				this.aClass299_1.aClass272_1.method6601(this.aClass5_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass299_1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!oa;J[Lclient!dg;[Lclient!haa;Z)V")
	public void method3784(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class69[] arg2, @OriginalArg(3) Class128[] arg3) {
		if (!this.aBoolean354) {
			this.method3778(arg0, arg2);
			this.method3792(arg3);
			this.aLong87 = arg1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IZ)V")
	public void method3785(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static574.aClass267_8.method6538(this);
		this.aLong87 = arg0;
		this.aLong86 = arg0;
		this.aBoolean356 = true;
		this.aBoolean357 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(J)V")
	public void method3786(@OriginalArg(0) long arg0) {
		this.aLong87 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "()V")
	private void method3787() {
		this.aBoolean355 = false;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method3788(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong87 == this.aLong86) {
			this.method3787();
		} else {
			this.method3791();
		}
		if (arg1 - this.aLong87 > 750L) {
			this.method3779();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong86);
		@Pc(36) Class5_Sub7 local36;
		if (this.aBoolean356) {
			for (local36 = (Class5_Sub7) this.aClass267_4.method6544(); local36 != null; local36 = (Class5_Sub7) this.aClass267_4.method6543()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass284_1.anInt8529; local39++) {
					local36.method6923(1, arg0, arg1, !this.aBoolean355);
				}
			}
			this.aBoolean356 = false;
		}
		for (local36 = (Class5_Sub7) this.aClass267_4.method6544(); local36 != null; local36 = (Class5_Sub7) this.aClass267_4.method6543()) {
			local36.method6923(local27, arg0, arg1, !this.aBoolean355);
		}
		this.aLong86 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "()Lclient!tg;")
	public Class299 method3789() {
		return this.aClass299_1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	public void method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4347 = arg0;
		this.anInt4346 = arg1;
		this.anInt4350 = arg2;
		this.anInt4348 = arg3;
		this.anInt4349 = arg4;
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "()V")
	public void method3791() {
		this.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([Lclient!haa;Z)V")
	private void method3792(@OriginalArg(0) Class128[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static202.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub4_Sub16 local16 = (Class6_Sub4_Sub16) this.aClass211_28.method5183(); local16 != null; local16 = (Class6_Sub4_Sub16) this.aClass211_28.method5177()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass128_2 == arg0[local21] || local16.aClass128_2 == arg0[local21].aClass128_1) {
						Static202.aBooleanArray14[local21] = true;
						local16.method7156();
						continue label71;
					}
				}
			}
			local16.method8151();
			this.anInt4345--;
			if (local16.method8033()) {
				local16.method8035();
				Static49.anInt1352--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4345 != 8; local21++) {
			if (!Static202.aBooleanArray14[local21]) {
				@Pc(96) Class6_Sub4_Sub16 local96 = null;
				if (arg0[local21].method3602().anInt9306 == 1 && Static49.anInt1352 < 32) {
					local96 = new Class6_Sub4_Sub16(arg0[local21], this);
					Static40.aClass41_1.method1143((long) arg0[local21].anInt4094, local96);
					Static49.anInt1352++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub4_Sub16(arg0[local21], this);
				}
				this.aClass211_28.method5173(local96);
				this.anInt4345++;
				Static202.aBooleanArray14[local21] = true;
			}
		}
	}
}
