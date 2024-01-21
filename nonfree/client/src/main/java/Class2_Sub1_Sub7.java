import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!i", name = "I", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "Lclient!wh;")
	private final Class89 aClass89_1;

	@OriginalMember(owner = "client!i", name = "G", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Z")
	public final boolean aBoolean73;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "I")
	public final int anInt1624;

	@OriginalMember(owner = "client!i", name = "C", descriptor = "I")
	public int anInt1618;

	@OriginalMember(owner = "client!i", name = "D", descriptor = "I")
	private int anInt1619;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
	private int anInt1631;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
	private int anInt1629;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
	private int anInt1627;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!va;)V")
	public Class2_Sub1_Sub7(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass89_1 = new Class89(arg0);
		@Pc(14) int local14 = arg0.method1461();
		this.aBoolean71 = (local14 & 0x2) != 0;
		this.aBoolean73 = (local14 & 0x1) != 0;
		this.anInt1624 = arg0.method1461();
		this.anInt1618 = arg0.method1456();
		this.anInt1619 = arg0.method1461();
		if (this.anInt1619 == 255) {
			this.anInt1619 = 256;
		}
		@Pc(58) int local58 = arg0.method1461();
		@Pc(62) int local62 = arg0.method1461();
		this.anInt1631 = (local62 & 0x3F) - 6;
		this.anInt1629 = local62 >> 6 & 0x3;
		this.anInt1627 = local58 >> 6 & 0x3;
		arg0.method1461();
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		this.aClass89_1 = new Class89();
		this.anInt1624 = 1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hh;ILclient!kh;IF)[I")
	public int[] method1156(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		if (this.anIntArray177 == null || this.aFloat2 != arg3) {
			if (!this.aClass89_1.method2717(arg1, arg0)) {
				return null;
			}
			@Pc(37) int local37 = this.anInt1624 > arg2 ? arg2 : this.anInt1624;
			this.anIntArray177 = this.aClass89_1.method2714(arg0, local37, true, local37, arg3, arg1);
			this.aFloat2 = arg3;
		}
		return this.anIntArray177;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!kh;Lclient!hh;II)[I")
	public int[] method1157(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass89_1.method2717(arg0, arg1)) {
			@Pc(27) int local27 = arg2 < this.anInt1624 ? arg2 : this.anInt1624;
			return this.aClass89_1.method2714(arg1, local27, false, local27, 1.0F, arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public void method1160(@OriginalArg(0) int arg0) {
		if (this.anIntArray177 == null) {
			return;
		}
		@Pc(41) short local41;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(79) int local79;
		@Pc(93) int[] local93;
		if (this.anInt1629 != 0) {
			if (Static15.anIntArray27 == null || this.anIntArray177.length > Static15.anIntArray27.length) {
				Static15.anIntArray27 = new int[this.anIntArray177.length];
			}
			if (this.anIntArray177.length == 4096) {
				local41 = 64;
			} else {
				local41 = 128;
			}
			local49 = this.anIntArray177.length;
			local56 = local41 * arg0 * this.anInt1631;
			if (this.anInt1629 == 2) {
				local56 = -local56;
			}
			local69 = local49 - 1;
			for (local71 = 0; local71 < local49; local71++) {
				local79 = local69 & local56 + local71;
				Static15.anIntArray27[local71] = this.anIntArray177[local79];
			}
			local93 = this.anIntArray177;
			this.anIntArray177 = Static15.anIntArray27;
			Static15.anIntArray27 = local93;
		}
		if (this.anInt1627 == 0) {
			return;
		}
		if (Static15.anIntArray27 == null || this.anIntArray177.length > Static15.anIntArray27.length) {
			Static15.anIntArray27 = new int[this.anIntArray177.length];
		}
		local49 = this.anIntArray177.length;
		if (this.anIntArray177.length == 4096) {
			local41 = 64;
		} else {
			local41 = 128;
		}
		local56 = this.anInt1631 * arg0;
		if (this.anInt1627 == 1) {
			local56 = -local56;
		}
		local69 = local41 - 1;
		for (local71 = 0; local71 < local49; local71 += local41) {
			for (local79 = 0; local79 < local41; local79++) {
				@Pc(167) int local167 = local71 + local79;
				@Pc(175) int local175 = local71 + (local79 + local56 & local69);
				Static15.anIntArray27[local167] = this.anIntArray177[local175];
			}
		}
		local93 = this.anIntArray177;
		this.anIntArray177 = Static15.anIntArray27;
		Static15.anIntArray27 = local93;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!hh;BLclient!kh;)Z")
	public boolean method1161(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class29 arg1) {
		return this.aClass89_1.method2717(arg1, arg0);
	}
}
