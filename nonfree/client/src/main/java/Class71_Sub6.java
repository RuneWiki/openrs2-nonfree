import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class71_Sub6 extends Class71 {

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public int anInt7237;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
	public int anInt7238;

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
	public int anInt7239;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	public int anInt7240;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
	public int anInt7241;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public int anInt7235 = 0;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Z")
	public boolean aBoolean535 = false;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!wp;")
	private Class273 aClass273_6 = new Class273();

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	private int anInt7236 = 0;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!gw;")
	public Class91 aClass91_51 = new Class91();

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
	private int anInt7242 = 0;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!wg;")
	public final Class270 aClass270_2 = new Class270();

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[Lclient!io;")
	public final Class71_Sub1_Sub2_Sub1[] aClass71_Sub1_Sub2_Sub1Array2 = new Class71_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V")
	public Class71_Sub6(@OriginalArg(0) int arg0) {
		this.method5784(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!qa;[Lclient!eh;Z)V")
	private void method5783(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class61[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static415.aBooleanArray140[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class71_Sub5 local16 = (Class71_Sub5) this.aClass273_6.method6246(); local16 != null; local16 = (Class71_Sub5) this.aClass273_6.method6249()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass61_2 == arg1[local21] || local16.aClass61_2 == arg1[local21].aClass61_1) {
						Static415.aBooleanArray140[local21] = true;
						local16.method4785();
						local16.aBoolean430 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt5765 == 0) {
				local16.method6187();
				this.anInt7236--;
			} else {
				local16.aBoolean430 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt7236 != 8; local21++) {
			if (!Static415.aBooleanArray140[local21]) {
				@Pc(101) Class71_Sub5 local101 = new Class71_Sub5(arg0, arg1[local21], this, this.aLong207);
				this.aClass273_6.method6247(local101);
				this.anInt7236++;
				Static415.aBooleanArray140[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public void method5784(@OriginalArg(0) int arg0) {
		Static299.aClass273_2.method6247(this);
		this.aLong207 = arg0;
		this.aLong208 = arg0;
		this.aBoolean536 = true;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method5786(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong207 == this.aLong208) {
			this.method5791();
		} else {
			this.method5788();
		}
		if (arg1 - this.aLong207 > 750L) {
			this.method5795();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong208);
		@Pc(36) Class71_Sub5 local36;
		if (this.aBoolean536) {
			for (local36 = (Class71_Sub5) this.aClass273_6.method6246(); local36 != null; local36 = (Class71_Sub5) this.aClass273_6.method6249()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass179_1.anInt5246; local39++) {
					local36.method4786(arg1, !this.aBoolean534, 1, arg0);
				}
			}
			this.aBoolean536 = false;
		}
		for (local36 = (Class71_Sub5) this.aClass273_6.method6246(); local36 != null; local36 = (Class71_Sub5) this.aClass273_6.method6249()) {
			local36.method4786(arg1, !this.aBoolean534, local27, arg0);
		}
		this.aLong208 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
	public void method5788() {
		this.aBoolean534 = true;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public void method5789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7241 = arg0;
		this.anInt7239 = arg1;
		this.anInt7240 = arg2;
		this.anInt7238 = arg3;
		this.anInt7237 = arg4;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([Lclient!tb;Z)V")
	private void method5790(@OriginalArg(0) Class239[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static415.aBooleanArray141[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class4_Sub1_Sub10 local16 = (Class4_Sub1_Sub10) this.aClass91_51.method2584(); local16 != null; local16 = (Class4_Sub1_Sub10) this.aClass91_51.method2586()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass239_1 == arg0[local21] || local16.aClass239_1 == arg0[local21].aClass239_2) {
						Static415.aBooleanArray141[local21] = true;
						local16.method2764();
						continue label68;
					}
				}
			}
			local16.method6330();
			this.anInt7242--;
			if (local16.method5982()) {
				local16.method5985();
				Static343.anInt5785--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt7242 != 8; local21++) {
			if (!Static415.aBooleanArray141[local21]) {
				@Pc(93) Class4_Sub1_Sub10 local93 = null;
				if (arg0[local21].method5453().anInt4592 == 1 && Static343.anInt5785 < 32) {
					local93 = new Class4_Sub1_Sub10(arg0[local21], this);
					Static11.aClass114_1.method3080(local93, (long) arg0[local21].anInt6760);
					Static343.anInt5785++;
				}
				if (local93 == null) {
					local93 = new Class4_Sub1_Sub10(arg0[local21], this);
				}
				this.aClass91_51.method2587(local93);
				this.anInt7242++;
				Static415.aBooleanArray141[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "()V")
	private void method5791() {
		this.aBoolean534 = false;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!qa;J[Lclient!eh;[Lclient!tb;Z)V")
	public void method5792(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class61[] arg2, @OriginalArg(3) Class239[] arg3) {
		if (!this.aBoolean535) {
			this.method5783(arg0, arg2);
			this.method5790(arg3);
			this.aLong207 = arg1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "()V")
	public void method5793() {
		this.aBoolean536 = true;
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "()Lclient!wg;")
	public Class270 method5794() {
		return this.aClass270_2;
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "()V")
	public void method5795() {
		this.aBoolean535 = true;
		for (@Pc(8) Class4_Sub1_Sub10 local8 = (Class4_Sub1_Sub10) this.aClass91_51.method2584(); local8 != null; local8 = (Class4_Sub1_Sub10) this.aClass91_51.method2586()) {
			if (local8.aClass150_1.anInt4592 == 1) {
				local8.method5985();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass71_Sub1_Sub2_Sub1Array2.length; local27++) {
			if (this.aClass71_Sub1_Sub2_Sub1Array2[local27] != null) {
				this.aClass71_Sub1_Sub2_Sub1Array2[local27].method3044();
				this.aClass71_Sub1_Sub2_Sub1Array2[local27] = null;
			}
		}
		this.anInt7235 = 0;
		this.aClass273_6 = new Class273();
		this.anInt7236 = 0;
		this.aClass91_51 = new Class91();
		this.anInt7242 = 0;
		this.method6187();
		Static427.aClass71_Sub6Array1[Static176.anInt3455] = this;
		Static176.anInt3455 = Static176.anInt3455 + 1 & Static129.anIntArray232[Static87.anInt1986];
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(J)V")
	public void method5796(@OriginalArg(0) long arg0) {
		this.aLong207 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!qa;)V")
	public void method5797(@OriginalArg(0) Class30 arg0) {
		this.aClass270_2.aClass108_1.method3012();
		for (@Pc(10) Class71_Sub5 local10 = (Class71_Sub5) this.aClass273_6.method6246(); local10 != null; local10 = (Class71_Sub5) this.aClass273_6.method6249()) {
			local10.method4784(arg0, this.aLong208);
		}
	}
}
