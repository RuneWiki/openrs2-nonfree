import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class293 implements Interface6 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Lclient!ke;")
	private final Class189 aClass189_6 = new Class189(256);

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Lclient!ae;")
	private final Class8 aClass8_120;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "Lclient!ae;")
	private final Class8 aClass8_121;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	private final int anInt8318;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "[Lclient!qr;")
	private final Class294[] aClass294Array1;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!ae;)V")
	public Class293(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_120 = arg2;
		this.aClass8_121 = arg1;
		@Pc(24) Class6_Sub23 local24 = new Class6_Sub23(arg0.method262(0, 0));
		this.anInt8318 = local24.method8363();
		this.aClass294Array1 = new Class294[this.anInt8318];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8318; local36++) {
			if (local24.method8374() == 1) {
				this.aClass294Array1[local36] = new Class294();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt8318; local57++) {
			if (this.aClass294Array1[local57] != null) {
				this.aClass294Array1[local57].aBoolean573 = local24.method8374() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt8318; local87++) {
			if (this.aClass294Array1[local87] != null) {
				this.aClass294Array1[local87].aBoolean574 = local24.method8374() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt8318; local118++) {
			if (this.aClass294Array1[local118] != null) {
				this.aClass294Array1[local118].aBoolean567 = local24.method8374() == 1;
			}
		}
		for (@Pc(151) int local151 = 0; local151 < this.anInt8318; local151++) {
			if (this.aClass294Array1[local151] != null) {
				this.aClass294Array1[local151].aByte116 = local24.method8391();
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt8318; local177++) {
			if (this.aClass294Array1[local177] != null) {
				this.aClass294Array1[local177].aByte118 = local24.method8391();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt8318; local203++) {
			if (this.aClass294Array1[local203] != null) {
				this.aClass294Array1[local203].aByte120 = local24.method8391();
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt8318; local225++) {
			if (this.aClass294Array1[local225] != null) {
				this.aClass294Array1[local225].aByte114 = local24.method8391();
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.anInt8318; local251++) {
			if (this.aClass294Array1[local251] != null) {
				this.aClass294Array1[local251].aShort108 = (short) local24.method8363();
			}
		}
		for (@Pc(278) int local278 = 0; local278 < this.anInt8318; local278++) {
			if (this.aClass294Array1[local278] != null) {
				this.aClass294Array1[local278].aByte115 = local24.method8391();
			}
		}
		for (@Pc(300) int local300 = 0; local300 < this.anInt8318; local300++) {
			if (this.aClass294Array1[local300] != null) {
				this.aClass294Array1[local300].aByte117 = local24.method8391();
			}
		}
		for (@Pc(326) int local326 = 0; local326 < this.anInt8318; local326++) {
			if (this.aClass294Array1[local326] != null) {
				this.aClass294Array1[local326].aBoolean572 = local24.method8374() == 1;
			}
		}
		for (@Pc(359) int local359 = 0; local359 < this.anInt8318; local359++) {
			if (this.aClass294Array1[local359] != null) {
				this.aClass294Array1[local359].aBoolean571 = local24.method8374() == 1;
			}
		}
		for (@Pc(388) int local388 = 0; local388 < this.anInt8318; local388++) {
			if (this.aClass294Array1[local388] != null) {
				this.aClass294Array1[local388].aByte119 = local24.method8391();
			}
		}
		for (@Pc(410) int local410 = 0; local410 < this.anInt8318; local410++) {
			if (this.aClass294Array1[local410] != null) {
				this.aClass294Array1[local410].aBoolean569 = local24.method8374() == 1;
			}
		}
		for (@Pc(443) int local443 = 0; local443 < this.anInt8318; local443++) {
			if (this.aClass294Array1[local443] != null) {
				this.aClass294Array1[local443].aBoolean570 = local24.method8374() == 1;
			}
		}
		for (@Pc(472) int local472 = 0; local472 < this.anInt8318; local472++) {
			if (this.aClass294Array1[local472] != null) {
				this.aClass294Array1[local472].aBoolean568 = local24.method8374() == 1;
			}
		}
		for (@Pc(503) int local503 = 0; local503 < this.anInt8318; local503++) {
			if (this.aClass294Array1[local503] != null) {
				this.aClass294Array1[local503].anInt8332 = local24.method8374();
			}
		}
		for (@Pc(529) int local529 = 0; local529 < this.anInt8318; local529++) {
			if (this.aClass294Array1[local529] != null) {
				this.aClass294Array1[local529].anInt8334 = local24.method8369();
			}
		}
		for (@Pc(555) int local555 = 0; local555 < this.anInt8318; local555++) {
			if (this.aClass294Array1[local555] != null) {
				this.aClass294Array1[local555].anInt8333 = local24.method8374();
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(FZIIII)[F")
	@Override
	public float[] method7086(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method7093(arg3).method8022(this.aClass294Array1[arg3].aBoolean571, this, arg1, arg2, this.aClass8_120);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)Lclient!tm;")
	private Class6_Sub4_Sub19 method7093(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub4 local10 = this.aClass189_6.method4279((long) arg0);
		if (local10 != null) {
			return (Class6_Sub4_Sub19) local10;
		}
		@Pc(26) byte[] local26 = this.aClass8_121.method267(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class6_Sub4_Sub19 local38 = new Class6_Sub4_Sub19(new Class6_Sub23(local26));
			this.aClass189_6.method4278(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIFZI)[I")
	@Override
	public int[] method7085(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4) {
		return this.method7093(arg2).method8015(this.aClass8_120, (double) arg3, arg4, this, this.aClass294Array1[arg2].aBoolean571, arg0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IFZIII)[I")
	@Override
	public int[] method7089(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method7093(arg0).method8019(this.aClass8_120, arg3, arg2, this.aClass294Array1[arg0].aBoolean571, this, (double) arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.anInt8318;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lclient!qr;")
	@Override
	public Class294 method7088(@OriginalArg(1) int arg0) {
		return this.aClass294Array1[arg0];
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method7090(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub4_Sub19 local13 = this.method7093(arg0);
		return local13 != null && local13.method8017(this, this.aClass8_120);
	}
}
