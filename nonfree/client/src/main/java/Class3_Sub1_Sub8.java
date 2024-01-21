import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!sd;")
	private final Class85 aClass85_1;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "Z")
	public final boolean aBoolean48;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	public final int anInt1126;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	private int anInt1124;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	private int anInt1125;

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
	private int anInt1131;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class3_Sub1_Sub8(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aClass85_1 = new Class85(arg0);
		@Pc(14) int local14 = arg0.method2107();
		this.aBoolean50 = (local14 & 0x2) != 0;
		this.aBoolean48 = (local14 & 0x1) != 0;
		@Pc(45) int local45 = arg0.method2107();
		this.anInt1126 = 0x1 << (local45 & 0x7) + 1;
		this.anInt1118 = arg0.method2111();
		this.anInt1124 = arg0.method2107();
		if (this.anInt1124 == 255) {
			this.anInt1124 = 256;
		}
		this.anInt1125 = arg0.method2123();
		this.anInt1131 = arg0.method2123();
		arg0.method2107();
		arg0.method2107();
		arg0.method2107();
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub8() {
		this.aClass85_1 = new Class85();
		this.aBoolean48 = true;
		this.anInt1126 = 64;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)V")
	public void method760(@OriginalArg(1) int arg0) {
		if (this.anIntArray159 == null || this.anInt1131 == 0 && this.anInt1125 == 0) {
			return;
		}
		if (Static5.anIntArray29 == null || Static5.anIntArray29.length < this.anIntArray159.length) {
			Static5.anIntArray29 = new int[this.anIntArray159.length];
		}
		@Pc(45) int local45 = this.anIntArray159.length == 4096 ? 64 : 128;
		@Pc(50) int local50 = this.anInt1125 * arg0;
		@Pc(54) int local54 = this.anIntArray159.length;
		@Pc(58) int local58 = local54 - 1;
		@Pc(62) int local62 = local45 - 1;
		@Pc(69) int local69 = arg0 * local45 * this.anInt1131;
		for (@Pc(71) int local71 = 0; local71 < local54; local71 += local45) {
			@Pc(79) int local79 = local58 & local71 + local69;
			for (@Pc(81) int local81 = 0; local81 < local45; local81++) {
				@Pc(87) int local87 = local71 + local81;
				@Pc(95) int local95 = local79 + (local62 & local81 + local50);
				Static5.anIntArray29[local87] = this.anIntArray159[local95];
			}
		}
		@Pc(120) int[] local120 = this.anIntArray159;
		this.anIntArray159 = Static5.anIntArray29;
		Static5.anIntArray29 = local120;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!bc;Lclient!aa;)[I")
	public int[] method762(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Interface1 arg2) {
		if (this.aClass85_1.method2634(arg2, arg1)) {
			@Pc(26) int local26 = this.anInt1126 > arg0 ? arg0 : this.anInt1126;
			return this.aClass85_1.method2631(local26, 1.0D, arg2, false, arg1, local26);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!bc;BLclient!aa;F)[I")
	public int[] method763(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) Interface1 arg2, @OriginalArg(4) float arg3) {
		if (this.anIntArray159 == null || this.aFloat1 != arg3) {
			if (!this.aClass85_1.method2634(arg2, arg1)) {
				return null;
			}
			@Pc(34) int local34 = this.anInt1126 <= arg0 ? this.anInt1126 : arg0;
			this.anIntArray159 = this.aClass85_1.method2631(local34, (double) arg3, arg2, true, arg1, local34);
			this.aFloat1 = arg3;
		}
		return this.anIntArray159;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!aa;Lclient!bc;)Z")
	public boolean method766(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class1 arg1) {
		return this.aClass85_1.method2634(arg0, arg1);
	}
}
