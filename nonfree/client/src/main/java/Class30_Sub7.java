import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class30_Sub7 extends Class30 {

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
	public int anInt7267;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
	public int anInt7268;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	public int anInt7269;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
	public int anInt7270;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
	public int anInt7272;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	public int anInt7265 = 0;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!ed;")
	private Class77 aClass77_10 = new Class77();

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
	private int anInt7266 = 0;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "Lclient!fea;")
	public Class99 aClass99_59 = new Class99();

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
	private int anInt7271 = 0;

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "Lclient!sh;")
	public final Class267 aClass267_2 = new Class267();

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "[Lclient!fo;")
	public final Class30_Sub2_Sub1_Sub1[] aClass30_Sub2_Sub1_Sub1Array1 = new Class30_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
	public Class30_Sub7(@OriginalArg(0) int arg0) {
		this.method5913(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([Lclient!tf;Z)V")
	private void method5899(@OriginalArg(0) Class280[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static407.aBooleanArray28[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class5_Sub2_Sub12 local16 = (Class5_Sub2_Sub12) this.aClass99_59.method2526(); local16 != null; local16 = (Class5_Sub2_Sub12) this.aClass99_59.method2519()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass280_1 == arg0[local21] || local16.aClass280_1 == arg0[local21].aClass280_2) {
						Static407.aBooleanArray28[local21] = true;
						local16.method2084();
						continue label68;
					}
				}
			}
			local16.method7425();
			this.anInt7271--;
			if (local16.method7321()) {
				local16.method7323();
				Static246.anInt5006--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt7271 != 8; local21++) {
			if (!Static407.aBooleanArray28[local21]) {
				@Pc(93) Class5_Sub2_Sub12 local93 = null;
				if (arg0[local21].method6569().anInt3800 == 1 && Static246.anInt5006 < 32) {
					local93 = new Class5_Sub2_Sub12(arg0[local21], this);
					Static213.aClass80_1.method2209((long) arg0[local21].anInt8071, local93);
					Static246.anInt5006++;
				}
				if (local93 == null) {
					local93 = new Class5_Sub2_Sub12(arg0[local21], this);
				}
				this.aClass99_59.method2513(local93);
				this.anInt7271++;
				Static407.aBooleanArray28[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
	public void method5900() {
		this.aBoolean513 = true;
		for (@Pc(8) Class5_Sub2_Sub12 local8 = (Class5_Sub2_Sub12) this.aClass99_59.method2526(); local8 != null; local8 = (Class5_Sub2_Sub12) this.aClass99_59.method2519()) {
			if (local8.aClass137_1.anInt3800 == 1) {
				local8.method7323();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass30_Sub2_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass30_Sub2_Sub1_Sub1Array1[local27] != null) {
				this.aClass30_Sub2_Sub1_Sub1Array1[local27].method2677();
				this.aClass30_Sub2_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt7265 = 0;
		this.aClass77_10 = new Class77();
		this.anInt7266 = 0;
		this.aClass99_59 = new Class99();
		this.anInt7271 = 0;
		this.method6004();
		Static67.aClass30_Sub7Array3[Static134.anInt2771] = this;
		Static134.anInt2771 = Static134.anInt2771 + 1 & Static112.anIntArray210[Static490.anInt8412];
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qa;J[Lclient!on;[Lclient!tf;Z)V")
	public void method5901(@OriginalArg(0) Class62 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class223[] arg2, @OriginalArg(3) Class280[] arg3) {
		if (!this.aBoolean513) {
			this.method5912(arg0, arg2);
			this.method5899(arg3);
			this.aLong200 = arg1;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
	public void method5902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7272 = arg0;
		this.anInt7267 = arg1;
		this.anInt7268 = arg2;
		this.anInt7269 = arg3;
		this.anInt7270 = arg4;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "()V")
	public void method5903() {
		this.aBoolean514 = true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qa;)V")
	public void method5904(@OriginalArg(0) Class62 arg0) {
		this.aClass267_2.aClass161_1.method4081();
		for (@Pc(10) Class30_Sub8 local10 = (Class30_Sub8) this.aClass77_10.method2157(); local10 != null; local10 = (Class30_Sub8) this.aClass77_10.method2160()) {
			local10.method6011(this.aLong201, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(J)V")
	public void method5905(@OriginalArg(0) long arg0) {
		this.aLong200 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "()Lclient!sh;")
	public Class267 method5906() {
		return this.aClass267_2;
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "()V")
	private void method5908() {
		this.aBoolean514 = false;
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "()V")
	public void method5910() {
		this.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method5911(@OriginalArg(0) Class62 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong200 == this.aLong201) {
			this.method5908();
		} else {
			this.method5903();
		}
		if (arg1 - this.aLong200 > 750L) {
			this.method5900();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong201);
		@Pc(36) Class30_Sub8 local36;
		if (this.aBoolean515) {
			for (local36 = (Class30_Sub8) this.aClass77_10.method2157(); local36 != null; local36 = (Class30_Sub8) this.aClass77_10.method2160()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass81_1.anInt2471; local39++) {
					local36.method6010(arg0, arg1, !this.aBoolean514, 1);
				}
			}
			this.aBoolean515 = false;
		}
		for (local36 = (Class30_Sub8) this.aClass77_10.method2157(); local36 != null; local36 = (Class30_Sub8) this.aClass77_10.method2160()) {
			local36.method6010(arg0, arg1, !this.aBoolean514, local27);
		}
		this.aLong201 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qa;[Lclient!on;Z)V")
	private void method5912(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class223[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static407.aBooleanArray27[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class30_Sub8 local16 = (Class30_Sub8) this.aClass77_10.method2157(); local16 != null; local16 = (Class30_Sub8) this.aClass77_10.method2160()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass223_2 == arg1[local21] || local16.aClass223_2 == arg1[local21].aClass223_1) {
						Static407.aBooleanArray27[local21] = true;
						local16.method6008();
						local16.aBoolean528 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt7392 == 0) {
				local16.method6004();
				this.anInt7266--;
			} else {
				local16.aBoolean528 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt7266 != 8; local21++) {
			if (!Static407.aBooleanArray27[local21]) {
				@Pc(101) Class30_Sub8 local101 = new Class30_Sub8(arg0, arg1[local21], this, this.aLong200);
				this.aClass77_10.method2165(local101);
				this.anInt7266++;
				Static407.aBooleanArray27[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
	public void method5913(@OriginalArg(0) int arg0) {
		Static84.aClass77_5.method2165(this);
		this.aLong200 = arg0;
		this.aLong201 = arg0;
		this.aBoolean515 = true;
	}
}
