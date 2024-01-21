import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Lclient!ed;")
	private final Class19 aClass19_1;

	@OriginalMember(owner = "client!ac", name = "gb", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "Z")
	public final boolean aBoolean4;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
	public final int anInt133;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass19_1 = new Class19(arg0);
		@Pc(14) int local14 = arg0.method544();
		this.aBoolean5 = (local14 & 0x2) != 0;
		this.aBoolean4 = (local14 & 0x1) != 0;
		this.anInt133 = arg0.method544();
		this.anInt126 = arg0.method546();
		this.anInt129 = arg0.method544();
		if (this.anInt129 == 255) {
			this.anInt129 = 256;
		}
		@Pc(61) int local61 = arg0.method544();
		@Pc(65) int local65 = arg0.method544();
		this.anInt127 = local61 >> 6 & 0x3;
		this.anInt135 = local65 >> 6 & 0x3;
		this.anInt130 = (local65 & 0x3F) - 6;
		arg0.method544();
		arg0.method544();
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		this.aClass19_1 = new Class19();
		this.aBoolean4 = true;
		this.anInt133 = 1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!dd;Lclient!ue;Z)Z")
	public boolean method73(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Interface3 arg1) {
		return this.aClass19_1.method766(arg1, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ue;Lclient!dd;I)[I")
	public int[] method75(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass19_1.method766(arg0, arg1)) {
			@Pc(33) int local33 = this.anInt133 <= arg2 ? this.anInt133 : arg2;
			return this.aClass19_1.method763(local33, 1.0F, local33, false, arg1, arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public void method76(@OriginalArg(0) int arg0) {
		if (this.anIntArray4 == null) {
			return;
		}
		@Pc(45) short local45;
		@Pc(67) int local67;
		@Pc(56) int local56;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(96) int[] local96;
		if (this.anInt135 != 0) {
			if (Static3.anIntArray5 == null || Static3.anIntArray5.length < this.anIntArray4.length) {
				Static3.anIntArray5 = new int[this.anIntArray4.length];
			}
			if (this.anIntArray4.length == 4096) {
				local45 = 64;
			} else {
				local45 = 128;
			}
			local56 = local45 * arg0 * this.anInt130;
			if (this.anInt135 == 2) {
				local56 = -local56;
			}
			local67 = this.anIntArray4.length;
			local71 = local67 - 1;
			for (local73 = 0; local73 < local67; local73++) {
				local82 = local73 + local56 & local71;
				Static3.anIntArray5[local73] = this.anIntArray4[local82];
			}
			local96 = this.anIntArray4;
			this.anIntArray4 = Static3.anIntArray5;
			Static3.anIntArray5 = local96;
		}
		if (this.anInt127 == 0) {
			return;
		}
		if (Static3.anIntArray5 == null || Static3.anIntArray5.length < this.anIntArray4.length) {
			Static3.anIntArray5 = new int[this.anIntArray4.length];
		}
		local67 = this.anIntArray4.length;
		if (this.anIntArray4.length == 4096) {
			local45 = 64;
		} else {
			local45 = 128;
		}
		local56 = this.anInt130 * arg0;
		if (this.anInt127 == 1) {
			local56 = -local56;
		}
		local71 = local45 - 1;
		for (local73 = 0; local73 < local67; local73 += local45) {
			for (local82 = 0; local82 < local45; local82++) {
				@Pc(163) int local163 = local73 + local82;
				@Pc(171) int local171 = (local82 + local56 & local71) + local73;
				Static3.anIntArray5[local163] = this.anIntArray4[local171];
			}
		}
		local96 = this.anIntArray4;
		this.anIntArray4 = Static3.anIntArray5;
		Static3.anIntArray5 = local96;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IFLclient!ue;Lclient!dd;I)[I")
	public int[] method77(@OriginalArg(1) float arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray4 == null || this.aFloat1 != arg0) {
			if (!this.aClass19_1.method766(arg1, arg2)) {
				return null;
			}
			@Pc(29) int local29 = this.anInt133 <= arg3 ? this.anInt133 : arg3;
			this.anIntArray4 = this.aClass19_1.method763(local29, arg0, local29, true, arg2, arg1);
			this.aFloat1 = arg0;
		}
		return this.anIntArray4;
	}
}
