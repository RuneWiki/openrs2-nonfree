import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
	public int anInt3026;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
	public int anInt3028;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	public int anInt3029;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
	public int anInt3030;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	public int anInt3024 = 0;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "Lclient!re;")
	private Class175 aClass175_4 = new Class175();

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	private int anInt3025 = 0;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "Lclient!tc;")
	public Class195 aClass195_34 = new Class195();

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
	private int anInt3027 = 0;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "Lclient!qd;")
	public final Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "[Lclient!mp;")
	public Class15_Sub4_Sub1_Sub1[] aClass15_Sub4_Sub1_Sub1Array1 = new Class15_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
	public Class15_Sub5(@OriginalArg(0) int arg0) {
		Static293.aClass175_6.method4672(this);
		this.aLong111 = arg0;
		this.aLong110 = arg0;
		this.aBoolean261 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	public void method2858() {
		this.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!aa;J[Lclient!pd;[Lclient!hp;Z)V")
	public void method2859(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class154[] arg2, @OriginalArg(3) Class85[] arg3) {
		if (!this.aBoolean259) {
			this.method2870(arg0, arg2);
			this.method2864(arg3);
			this.aLong111 = arg1;
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "()V")
	public void method2860() {
		this.aBoolean259 = true;
		for (@Pc(8) Class1_Sub1_Sub15 local8 = (Class1_Sub1_Sub15) this.aClass195_34.method5029(); local8 != null; local8 = (Class1_Sub1_Sub15) this.aClass195_34.method5021()) {
			if (local8.aClass183_1.anInt5436 == 1) {
				local8.method5564();
			}
		}
		this.aClass15_Sub4_Sub1_Sub1Array1 = new Class15_Sub4_Sub1_Sub1[8192];
		this.anInt3024 = 0;
		this.aClass175_4 = new Class175();
		this.anInt3025 = 0;
		this.aClass195_34 = new Class195();
		this.anInt3027 = 0;
		this.method5441();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
	public void method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3030 = arg0;
		this.anInt3029 = arg1;
		this.anInt3026 = arg3;
		this.anInt3028 = arg4;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!aa;J)Z")
	public boolean method2862(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong111 == this.aLong110) {
			this.method2867();
		} else {
			this.method2858();
		}
		if (arg1 - this.aLong111 > 750L) {
			this.method2860();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong110);
		@Pc(36) Class15_Sub8 local36;
		if (this.aBoolean261) {
			for (local36 = (Class15_Sub8) this.aClass175_4.method4669(); local36 != null; local36 = (Class15_Sub8) this.aClass175_4.method4673()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass193_1.anInt5577; local39++) {
					local36.method5445(arg0, arg1, 1, !this.aBoolean260);
				}
			}
			this.aBoolean261 = false;
		}
		for (local36 = (Class15_Sub8) this.aClass175_4.method4669(); local36 != null; local36 = (Class15_Sub8) this.aClass175_4.method4673()) {
			local36.method5445(arg0, arg1, local27, !this.aBoolean260);
		}
		this.aLong110 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([Lclient!hp;Z)V")
	private void method2864(@OriginalArg(0) Class85[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static150.aBooleanArray11[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub1_Sub15 local16 = (Class1_Sub1_Sub15) this.aClass195_34.method5029(); local16 != null; local16 = (Class1_Sub1_Sub15) this.aClass195_34.method5021()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass85_2 == arg0[local21] || local16.aClass85_2 == arg0[local21].aClass85_1) {
						Static150.aBooleanArray11[local21] = true;
						local16.method4124();
						continue label68;
					}
				}
			}
			local16.method5710();
			this.anInt3027--;
			if (local16.method5563()) {
				local16.method5564();
				Static90.anInt1761--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3027 != 8; local21++) {
			if (!Static150.aBooleanArray11[local21]) {
				@Pc(93) Class1_Sub1_Sub15 local93 = null;
				if (Static125.method2401(arg0[local21].anInt2518).anInt5436 == 1 && Static90.anInt1761 < 32) {
					local93 = new Class1_Sub1_Sub15(arg0[local21], this);
					Static291.aClass148_1.method4110((long) arg0[local21].anInt2518, local93);
					Static90.anInt1761++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub1_Sub15(arg0[local21], this);
				}
				this.aClass195_34.method5018(local93);
				this.anInt3027++;
				Static150.aBooleanArray11[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "()V")
	public void method2865() {
		this.aClass162_1.aClass161_1.method4436();
		for (@Pc(10) Class15_Sub8 local10 = (Class15_Sub8) this.aClass175_4.method4669(); local10 != null; local10 = (Class15_Sub8) this.aClass175_4.method4673()) {
			local10.method5449(this.aLong110);
		}
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "()V")
	public void method2866() {
		this.aBoolean261 = true;
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "()V")
	private void method2867() {
		this.aBoolean260 = false;
	}

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "()Lclient!qd;")
	public Class162 method2868() {
		return this.aClass162_1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(J)V")
	public void method2869(@OriginalArg(0) long arg0) {
		this.aLong111 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!aa;[Lclient!pd;Z)V")
	private void method2870(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class154[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static150.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class15_Sub8 local16 = (Class15_Sub8) this.aClass175_4.method4669(); local16 != null; local16 = (Class15_Sub8) this.aClass175_4.method4673()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass154_2 == arg1[local21] || local16.aClass154_2 == arg1[local21].aClass154_1) {
						Static150.aBooleanArray12[local21] = true;
						local16.method5444();
						local16.aBoolean548 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6210 == 0) {
				local16.method5441();
				this.anInt3025--;
			} else {
				local16.aBoolean548 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3025 != 8; local21++) {
			if (!Static150.aBooleanArray12[local21]) {
				@Pc(101) Class15_Sub8 local101 = new Class15_Sub8(arg0, arg1[local21], this, this.aLong111);
				this.aClass175_4.method4672(local101);
				this.anInt3025++;
				Static150.aBooleanArray12[local21] = true;
			}
		}
	}
}
