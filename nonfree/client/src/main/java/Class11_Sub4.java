import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	public int anInt3072;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	public int anInt3069 = 0;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
	public boolean aBoolean260 = false;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!hda;")
	private Class143 aClass143_3 = new Class143();

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	private int anInt3070 = 0;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!nt;")
	public Class238 aClass238_24 = new Class238();

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	private int anInt3071 = 0;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!oo;")
	public final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[Lclient!gj;")
	public final Class11_Sub5_Sub1_Sub1[] aClass11_Sub5_Sub1_Sub1Array1 = new Class11_Sub5_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IZ)V")
	public Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2641(arg0, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(J)V")
	public void method2626(@OriginalArg(0) long arg0) {
		this.aLong87 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method2627(@OriginalArg(0) Class87 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong87 == this.aLong88) {
			this.method2634();
		} else {
			this.method2632();
		}
		if (arg1 - this.aLong87 > 750L) {
			this.method2630();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong88);
		@Pc(36) Class11_Sub6 local36;
		if (this.aBoolean261) {
			for (local36 = (Class11_Sub6) this.aClass143_3.method3536(); local36 != null; local36 = (Class11_Sub6) this.aClass143_3.method3528()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass106_1.anInt3400; local39++) {
					local36.method3805(!this.aBoolean259, 1, arg1, arg0);
				}
			}
			this.aBoolean261 = false;
		}
		for (local36 = (Class11_Sub6) this.aClass143_3.method3536(); local36 != null; local36 = (Class11_Sub6) this.aClass143_3.method3528()) {
			local36.method3805(!this.aBoolean259, local27, arg1, arg0);
		}
		this.aLong88 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;)V")
	public void method2628(@OriginalArg(0) Class87 arg0) {
		this.aClass247_1.aClass34_1.method814();
		for (@Pc(10) Class11_Sub6 local10 = (Class11_Sub6) this.aClass143_3.method3536(); local10 != null; local10 = (Class11_Sub6) this.aClass143_3.method3528()) {
			local10.method3804(arg0, this.aLong88);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public void method2629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3072 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	public void method2630() {
		this.aBoolean260 = true;
		for (@Pc(8) Class2_Sub5_Sub14 local8 = (Class2_Sub5_Sub14) this.aClass238_24.method5833(); local8 != null; local8 = (Class2_Sub5_Sub14) this.aClass238_24.method5838()) {
			if (local8.aClass351_1.anInt9697 == 1) {
				local8.method8464();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass11_Sub5_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass11_Sub5_Sub1_Sub1Array1[local27] != null) {
				this.aClass11_Sub5_Sub1_Sub1Array1[local27].method3317();
				this.aClass11_Sub5_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt3069 = 0;
		this.aClass143_3 = new Class143();
		this.anInt3070 = 0;
		this.aClass238_24 = new Class238();
		this.anInt3071 = 0;
		this.method8372();
		Static73.aClass11_Sub4Array1[Static208.anInt4358] = this;
		Static208.anInt4358 = Static208.anInt4358 + 1 & Static304.anIntArray381[Static97.anInt1908];
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
	public void method2631() {
		this.aBoolean261 = true;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	public void method2632() {
		this.aBoolean259 = true;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()Lclient!oo;")
	public Class247 method2633() {
		this.aClass247_1.aClass34_1.method814();
		for (@Pc(6) int local6 = 0; local6 < this.aClass11_Sub5_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass11_Sub5_Sub1_Sub1Array1[local6] != null && this.aClass11_Sub5_Sub1_Sub1Array1[local6].aClass11_Sub6_1 != null) {
				this.aClass247_1.aClass34_1.method818(this.aClass11_Sub5_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass247_1;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
	private void method2634() {
		this.aBoolean259 = false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;[Lclient!gi;Z)V")
	private void method2635(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class130[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static138.aBooleanArray19[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class11_Sub6 local16 = (Class11_Sub6) this.aClass143_3.method3536(); local16 != null; local16 = (Class11_Sub6) this.aClass143_3.method3528()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass130_2 == arg1[local21] || local16.aClass130_2 == arg1[local21].aClass130_1) {
						Static138.aBooleanArray19[local21] = true;
						local16.method3806();
						local16.aBoolean385 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt4596 == 0) {
				local16.method8372();
				this.anInt3070--;
			} else {
				local16.aBoolean385 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt3070 != 32; local21++) {
			if (!Static138.aBooleanArray19[local21]) {
				@Pc(104) Class11_Sub6 local104 = new Class11_Sub6(arg0, arg1[local21], this, this.aLong87);
				this.aClass143_3.method3529(local104);
				this.anInt3070++;
				Static138.aBooleanArray19[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;J[Lclient!gi;[Lclient!uga;Z)V")
	public void method2636(@OriginalArg(0) Class87 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class130[] arg2, @OriginalArg(3) Class337[] arg3) {
		if (!this.aBoolean260) {
			this.method2635(arg0, arg2);
			this.method2637(arg3);
			this.aLong87 = arg1;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([Lclient!uga;Z)V")
	private void method2637(@OriginalArg(0) Class337[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static138.aBooleanArray18[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub5_Sub14 local16 = (Class2_Sub5_Sub14) this.aClass238_24.method5833(); local16 != null; local16 = (Class2_Sub5_Sub14) this.aClass238_24.method5838()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass337_1 == arg0[local21] || local16.aClass337_1 == arg0[local21].aClass337_2) {
						Static138.aBooleanArray18[local21] = true;
						local16.method4711();
						continue label71;
					}
				}
			}
			local16.method8599();
			this.anInt3071--;
			if (local16.method8462()) {
				local16.method8464();
				Static142.anInt3124--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt3071 != 8; local21++) {
			if (!Static138.aBooleanArray18[local21]) {
				@Pc(96) Class2_Sub5_Sub14 local96 = null;
				if (arg0[local21].method7847().anInt9697 == 1 && Static142.anInt3124 < 32) {
					local96 = new Class2_Sub5_Sub14(arg0[local21], this);
					Static119.aClass185_1.method4464((long) arg0[local21].anInt9396, local96);
					Static142.anInt3124++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub5_Sub14(arg0[local21], this);
				}
				this.aClass238_24.method5837(local96);
				this.anInt3071++;
				Static138.aBooleanArray18[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "()Lclient!oo;")
	public Class247 method2638() {
		return this.aClass247_1;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IZ)V")
	public void method2641(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static458.aClass143_7.method3529(this);
		this.aLong87 = arg0;
		this.aLong88 = arg0;
		this.aBoolean261 = true;
		this.aBoolean262 = arg1;
	}
}
