import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	public int anInt3987;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public int anInt3988;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!li", name = "A", descriptor = "I")
	public int anInt3990;

	@OriginalMember(owner = "client!li", name = "B", descriptor = "I")
	public int anInt3991;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public int anInt3984 = 0;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!ni;")
	private Class169 aClass169_5 = new Class169();

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	private int anInt3985 = 0;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Lclient!fr;")
	public Class85 aClass85_24 = new Class85();

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private int anInt3986 = 0;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Lclient!pv;")
	public final Class201 aClass201_1 = new Class201();

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[Lclient!oh;")
	public Class28_Sub1_Sub1_Sub1[] aClass28_Sub1_Sub1_Sub1Array2 = new Class28_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!li", name = "o", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
	public Class28_Sub3(@OriginalArg(0) int arg0) {
		Static14.aClass169_1.method3603(this);
		this.aLong131 = arg0;
		this.aLong130 = arg0;
		this.aBoolean250 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([Lclient!dh;Z)V")
	private void method3162(@OriginalArg(0) Class52[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static232.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class7_Sub4_Sub6 local16 = (Class7_Sub4_Sub6) this.aClass85_24.method2010(); local16 != null; local16 = (Class7_Sub4_Sub6) this.aClass85_24.method2000()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass52_2 == arg0[local21] || local16.aClass52_2 == arg0[local21].aClass52_1) {
						Static232.aBooleanArray22[local21] = true;
						local16.method2145();
						continue label68;
					}
				}
			}
			local16.method5802();
			this.anInt3986--;
			if (local16.method5659()) {
				local16.method5661();
				Static5.anInt18--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt3986 != 8; local21++) {
			if (!Static232.aBooleanArray22[local21]) {
				@Pc(93) Class7_Sub4_Sub6 local93 = null;
				if (arg0[local21].method1136().anInt3787 == 1 && Static5.anInt18 < 32) {
					local93 = new Class7_Sub4_Sub6(arg0[local21], this);
					Static370.aClass103_1.method2283(local93, (long) arg0[local21].anInt1303);
					Static5.anInt18++;
				}
				if (local93 == null) {
					local93 = new Class7_Sub4_Sub6(arg0[local21], this);
				}
				this.aClass85_24.method2011(local93);
				this.anInt3986++;
				Static232.aBooleanArray22[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ya;J)Z")
	public boolean method3163(@OriginalArg(0) Class51 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong131 == this.aLong130) {
			this.method3165();
		} else {
			this.method3171();
		}
		if (arg1 - this.aLong131 > 750L) {
			this.method3169();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong130);
		@Pc(36) Class28_Sub2 local36;
		if (this.aBoolean250) {
			for (local36 = (Class28_Sub2) this.aClass169_5.method3598(); local36 != null; local36 = (Class28_Sub2) this.aClass169_5.method3597()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass49_1.anInt1164; local39++) {
					local36.method3064(arg1, !this.aBoolean249, arg0, 1);
				}
			}
			this.aBoolean250 = false;
		}
		for (local36 = (Class28_Sub2) this.aClass169_5.method3598(); local36 != null; local36 = (Class28_Sub2) this.aClass169_5.method3597()) {
			local36.method3064(arg1, !this.aBoolean249, arg0, local27);
		}
		this.aLong130 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()Lclient!pv;")
	public Class201 method3164() {
		return this.aClass201_1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
	private void method3165() {
		this.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ya;J[Lclient!ng;[Lclient!dh;Z)V")
	public void method3166(@OriginalArg(0) Class51 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class167[] arg2, @OriginalArg(3) Class52[] arg3) {
		if (!this.aBoolean248) {
			this.method3167(arg0, arg2);
			this.method3162(arg3);
			this.aLong131 = arg1;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ya;[Lclient!ng;Z)V")
	private void method3167(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class167[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static232.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class28_Sub2 local16 = (Class28_Sub2) this.aClass169_5.method3598(); local16 != null; local16 = (Class28_Sub2) this.aClass169_5.method3597()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass167_1 == arg1[local21] || local16.aClass167_1 == arg1[local21].aClass167_2) {
						Static232.aBooleanArray21[local21] = true;
						local16.method3067();
						local16.aBoolean234 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3838 == 0) {
				local16.method5642();
				this.anInt3985--;
			} else {
				local16.aBoolean234 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt3985 != 8; local21++) {
			if (!Static232.aBooleanArray21[local21]) {
				@Pc(101) Class28_Sub2 local101 = new Class28_Sub2(arg0, arg1[local21], this, this.aLong131);
				this.aClass169_5.method3603(local101);
				this.anInt3985++;
				Static232.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()V")
	public void method3168() {
		this.aBoolean250 = true;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
	public void method3169() {
		this.aBoolean248 = true;
		for (@Pc(8) Class7_Sub4_Sub6 local8 = (Class7_Sub4_Sub6) this.aClass85_24.method2010(); local8 != null; local8 = (Class7_Sub4_Sub6) this.aClass85_24.method2000()) {
			if (local8.aClass134_1.anInt3787 == 1) {
				local8.method5661();
			}
		}
		this.aClass28_Sub1_Sub1_Sub1Array2 = new Class28_Sub1_Sub1_Sub1[8192];
		this.anInt3984 = 0;
		this.aClass169_5 = new Class169();
		this.anInt3985 = 0;
		this.aClass85_24 = new Class85();
		this.anInt3986 = 0;
		this.method5642();
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "()V")
	public void method3170() {
		this.aClass201_1.aClass232_1.method4840();
		for (@Pc(10) Class28_Sub2 local10 = (Class28_Sub2) this.aClass169_5.method3598(); local10 != null; local10 = (Class28_Sub2) this.aClass169_5.method3597()) {
			local10.method3063(this.aLong130);
		}
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "()V")
	public void method3171() {
		this.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	public void method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3991 = arg0;
		this.anInt3990 = arg1;
		this.anInt3988 = arg2;
		this.anInt3989 = arg3;
		this.anInt3987 = arg4;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(J)V")
	public void method3173(@OriginalArg(0) long arg0) {
		this.aLong131 = arg0;
	}
}
