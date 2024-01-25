import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class55_Sub8 extends Class55 {

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	public int anInt8692;

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
	public int anInt8693;

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
	public int anInt8694;

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
	public int anInt8696;

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
	public int anInt8697;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	public int anInt8690 = 0;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "Z")
	private boolean aBoolean711 = false;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "Z")
	public boolean aBoolean712 = false;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!hca;")
	private Class134 aClass134_9 = new Class134();

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	private int anInt8691 = 0;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "Lclient!ki;")
	public Class183 aClass183_52 = new Class183();

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "Z")
	public boolean aBoolean713 = false;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
	private int anInt8695 = 0;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "Z")
	private boolean aBoolean714 = false;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Lclient!qu;")
	public final Class274 aClass274_2 = new Class274();

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "[Lclient!er;")
	public final Class55_Sub2_Sub1_Sub1[] aClass55_Sub2_Sub1_Sub1Array2 = new Class55_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IZ)V")
	public Class55_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7115(arg0, arg1);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "()Lclient!qu;")
	public Class274 method7113() {
		this.aClass274_2.aClass22_1.method895();
		for (@Pc(6) int local6 = 0; local6 < this.aClass55_Sub2_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass55_Sub2_Sub1_Sub1Array2[local6] != null && this.aClass55_Sub2_Sub1_Sub1Array2[local6].aClass55_Sub7_1 != null) {
				this.aClass274_2.aClass22_1.method893(this.aClass55_Sub2_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass274_2;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "()V")
	private void method7114() {
		this.aBoolean711 = false;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)V")
	public void method7115(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static388.aClass134_7.method3236(this);
		this.aLong215 = arg0;
		this.aLong216 = arg0;
		this.aBoolean714 = true;
		this.aBoolean713 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method7117(@OriginalArg(0) Class15 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong215 == this.aLong216) {
			this.method7114();
		} else {
			this.method7122();
		}
		if (arg1 - this.aLong215 > 750L) {
			this.method7118();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong216);
		@Pc(36) Class55_Sub7 local36;
		if (this.aBoolean714) {
			for (local36 = (Class55_Sub7) this.aClass134_9.method3233(); local36 != null; local36 = (Class55_Sub7) this.aClass134_9.method3230()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass144_1.anInt3834; local39++) {
					local36.method6823(arg1, arg0, 1, !this.aBoolean711);
				}
			}
			this.aBoolean714 = false;
		}
		for (local36 = (Class55_Sub7) this.aClass134_9.method3233(); local36 != null; local36 = (Class55_Sub7) this.aClass134_9.method3230()) {
			local36.method6823(arg1, arg0, local27, !this.aBoolean711);
		}
		this.aLong216 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "()V")
	public void method7118() {
		this.aBoolean712 = true;
		for (@Pc(8) Class3_Sub4_Sub1 local8 = (Class3_Sub4_Sub1) this.aClass183_52.method4795(); local8 != null; local8 = (Class3_Sub4_Sub1) this.aClass183_52.method4793()) {
			if (local8.aClass29_1.anInt980 == 1) {
				local8.method8309();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass55_Sub2_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass55_Sub2_Sub1_Sub1Array2[local27] != null) {
				this.aClass55_Sub2_Sub1_Sub1Array2[local27].method2493();
				this.aClass55_Sub2_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt8690 = 0;
		this.aClass134_9 = new Class134();
		this.anInt8691 = 0;
		this.aClass183_52 = new Class183();
		this.anInt8695 = 0;
		this.method7112();
		Static550.aClass55_Sub8Array7[Static502.anInt9330] = this;
		Static502.anInt9330 = Static502.anInt9330 + 1 & Static223.anIntArray288[Static95.anInt2313];
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(J)V")
	public void method7119(@OriginalArg(0) long arg0) {
		this.aLong215 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([Lclient!rea;Z)V")
	private void method7120(@OriginalArg(0) Class280[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static465.aBooleanArray32[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub4_Sub1 local16 = (Class3_Sub4_Sub1) this.aClass183_52.method4795(); local16 != null; local16 = (Class3_Sub4_Sub1) this.aClass183_52.method4793()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass280_1 == arg0[local21] || local16.aClass280_1 == arg0[local21].aClass280_2) {
						Static465.aBooleanArray32[local21] = true;
						local16.method980();
						continue label71;
					}
				}
			}
			local16.method8412();
			this.anInt8695--;
			if (local16.method8307()) {
				local16.method8309();
				Static314.anInt6320--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt8695 != 8; local21++) {
			if (!Static465.aBooleanArray32[local21]) {
				@Pc(96) Class3_Sub4_Sub1 local96 = null;
				if (arg0[local21].method7008().anInt980 == 1 && Static314.anInt6320 < 32) {
					local96 = new Class3_Sub4_Sub1(arg0[local21], this);
					Static547.aClass153_1.method3671(local96, (long) arg0[local21].anInt8553);
					Static314.anInt6320++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub4_Sub1(arg0[local21], this);
				}
				this.aClass183_52.method4792(local96);
				this.anInt8695++;
				Static465.aBooleanArray32[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!oa;J[Lclient!gi;[Lclient!rea;Z)V")
	public void method7121(@OriginalArg(0) Class15 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class121[] arg2, @OriginalArg(3) Class280[] arg3) {
		if (!this.aBoolean712) {
			this.method7128(arg0, arg2);
			this.method7120(arg3);
			this.aLong215 = arg1;
		}
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "()V")
	public void method7122() {
		this.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "()V")
	public void method7123() {
		this.aBoolean714 = true;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)V")
	public void method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8693 = arg0;
		this.anInt8694 = arg1;
		this.anInt8696 = arg2;
		this.anInt8697 = arg3;
		this.anInt8692 = arg4;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!oa;)V")
	public void method7125(@OriginalArg(0) Class15 arg0) {
		this.aClass274_2.aClass22_1.method895();
		for (@Pc(10) Class55_Sub7 local10 = (Class55_Sub7) this.aClass134_9.method3233(); local10 != null; local10 = (Class55_Sub7) this.aClass134_9.method3230()) {
			local10.method6819(this.aLong216, arg0);
		}
	}

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "()Lclient!qu;")
	public Class274 method7127() {
		return this.aClass274_2;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!oa;[Lclient!gi;Z)V")
	private void method7128(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class121[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static465.aBooleanArray33[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class55_Sub7 local16 = (Class55_Sub7) this.aClass134_9.method3233(); local16 != null; local16 = (Class55_Sub7) this.aClass134_9.method3230()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass121_2 == arg1[local21] || local16.aClass121_2 == arg1[local21].aClass121_1) {
						Static465.aBooleanArray33[local21] = true;
						local16.method6824();
						local16.aBoolean680 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8290 == 0) {
				local16.method7112();
				this.anInt8691--;
			} else {
				local16.aBoolean680 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt8691 != 32; local21++) {
			if (!Static465.aBooleanArray33[local21]) {
				@Pc(104) Class55_Sub7 local104 = new Class55_Sub7(arg0, arg1[local21], this, this.aLong215);
				this.aClass134_9.method3236(local104);
				this.anInt8691++;
				Static465.aBooleanArray33[local21] = true;
			}
		}
	}
}
