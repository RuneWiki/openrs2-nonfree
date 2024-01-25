import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class15_Sub8 extends Class15 {

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public int anInt7891;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Z")
	public boolean aBoolean568 = false;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	public int anInt7888 = 0;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!gt;")
	private Class123 aClass123_10 = new Class123();

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	private int anInt7889 = 0;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!bq;")
	public Class43 aClass43_50 = new Class43();

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	private int anInt7890 = 0;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
	private boolean aBoolean571 = false;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Z")
	public boolean aBoolean570 = false;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!pca;")
	public final Class250 aClass250_1 = new Class250();

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lclient!fi;")
	public final Class15_Sub5_Sub1_Sub1[] aClass15_Sub5_Sub1_Sub1Array2 = new Class15_Sub5_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IZ)V")
	public Class15_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6533(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	public void method6531() {
		this.aBoolean569 = true;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	private void method6532() {
		this.aBoolean569 = false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V")
	public void method6533(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static266.aClass123_7.method3539(this);
		this.aLong204 = arg0;
		this.aLong205 = arg0;
		this.aBoolean571 = true;
		this.aBoolean570 = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ha;J[Lclient!nda;[Lclient!oia;Z)V")
	public void method6535(@OriginalArg(0) Class16 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class219[] arg2, @OriginalArg(3) Class238[] arg3) {
		if (!this.aBoolean568) {
			this.method6542(arg0, arg2);
			this.method6536(arg3);
			this.aLong204 = arg1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([Lclient!oia;Z)V")
	private void method6536(@OriginalArg(0) Class238[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static417.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class8_Sub5_Sub18 local16 = (Class8_Sub5_Sub18) this.aClass43_50.method1422(); local16 != null; local16 = (Class8_Sub5_Sub18) this.aClass43_50.method1426()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass238_2 == arg0[local21] || local16.aClass238_2 == arg0[local21].aClass238_1) {
						Static417.aBooleanArray22[local21] = true;
						local16.method8078();
						continue label71;
					}
				}
			}
			local16.method8640();
			this.anInt7890--;
			if (local16.method8384()) {
				local16.method8381();
				Static311.anInt10378--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt7890 != 8; local21++) {
			if (!Static417.aBooleanArray22[local21]) {
				@Pc(96) Class8_Sub5_Sub18 local96 = null;
				if (arg0[local21].method6341().anInt10068 == 1 && Static311.anInt10378 < 32) {
					local96 = new Class8_Sub5_Sub18(arg0[local21], this);
					Static522.aClass136_1.method4043((long) arg0[local21].anInt7658, local96);
					Static311.anInt10378++;
				}
				if (local96 == null) {
					local96 = new Class8_Sub5_Sub18(arg0[local21], this);
				}
				this.aClass43_50.method1424(local96);
				this.anInt7890++;
				Static417.aBooleanArray22[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()V")
	public void method6537() {
		this.aBoolean568 = true;
		for (@Pc(8) Class8_Sub5_Sub18 local8 = (Class8_Sub5_Sub18) this.aClass43_50.method1422(); local8 != null; local8 = (Class8_Sub5_Sub18) this.aClass43_50.method1426()) {
			if (local8.aClass351_1.anInt10068 == 1) {
				local8.method8381();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass15_Sub5_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass15_Sub5_Sub1_Sub1Array2[local27] != null) {
				this.aClass15_Sub5_Sub1_Sub1Array2[local27].method3099();
				this.aClass15_Sub5_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt7888 = 0;
		this.aClass123_10 = new Class123();
		this.anInt7889 = 0;
		this.aClass43_50 = new Class43();
		this.anInt7890 = 0;
		this.method8314();
		Static507.aClass15_Sub8Array1[Static593.anInt10150] = this;
		Static593.anInt10150 = Static593.anInt10150 + 1 & Static562.anIntArray534[Static203.anInt4658];
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(J)V")
	public void method6538(@OriginalArg(0) long arg0) {
		this.aLong204 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method6539(@OriginalArg(0) Class16 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong204 == this.aLong205) {
			this.method6532();
		} else {
			this.method6531();
		}
		if (arg1 - this.aLong204 > 750L) {
			this.method6537();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong205);
		@Pc(36) Class15_Sub2 local36;
		if (this.aBoolean571) {
			for (local36 = (Class15_Sub2) this.aClass123_10.method3537(); local36 != null; local36 = (Class15_Sub2) this.aClass123_10.method3541()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass125_1.anInt4424; local39++) {
					local36.method1970(!this.aBoolean569, 1, arg1, arg0);
				}
			}
			this.aBoolean571 = false;
		}
		for (local36 = (Class15_Sub2) this.aClass123_10.method3537(); local36 != null; local36 = (Class15_Sub2) this.aClass123_10.method3541()) {
			local36.method1970(!this.aBoolean569, local27, arg1, arg0);
		}
		this.aLong205 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "()Lclient!pca;")
	public Class250 method6540() {
		return this.aClass250_1;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "()Lclient!pca;")
	public Class250 method6541() {
		this.aClass250_1.aClass131_1.method3725();
		for (@Pc(6) int local6 = 0; local6 < this.aClass15_Sub5_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass15_Sub5_Sub1_Sub1Array2[local6] != null && this.aClass15_Sub5_Sub1_Sub1Array2[local6].aClass15_Sub2_1 != null) {
				this.aClass250_1.aClass131_1.method3729(this.aClass15_Sub5_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass250_1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ha;[Lclient!nda;Z)V")
	private void method6542(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class219[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static417.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class15_Sub2 local16 = (Class15_Sub2) this.aClass123_10.method3537(); local16 != null; local16 = (Class15_Sub2) this.aClass123_10.method3541()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass219_1 == arg1[local21] || local16.aClass219_1 == arg1[local21].aClass219_2) {
						Static417.aBooleanArray21[local21] = true;
						local16.method1966();
						local16.aBoolean168 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt2329 == 0) {
				local16.method8314();
				this.anInt7889--;
			} else {
				local16.aBoolean168 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt7889 != 32; local21++) {
			if (!Static417.aBooleanArray21[local21]) {
				@Pc(104) Class15_Sub2 local104 = new Class15_Sub2(arg0, arg1[local21], this, this.aLong204);
				this.aClass123_10.method3539(local104);
				this.anInt7889++;
				Static417.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "()V")
	public void method6543() {
		this.aBoolean571 = true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	public void method6544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7891 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ha;)V")
	public void method6546(@OriginalArg(0) Class16 arg0) {
		this.aClass250_1.aClass131_1.method3725();
		for (@Pc(10) Class15_Sub2 local10 = (Class15_Sub2) this.aClass123_10.method3537(); local10 != null; local10 = (Class15_Sub2) this.aClass123_10.method3541()) {
			local10.method1971(arg0, this.aLong205);
		}
	}
}
