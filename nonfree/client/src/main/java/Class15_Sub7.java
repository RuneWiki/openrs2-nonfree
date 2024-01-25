import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private final int anInt3174;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private final int anInt3167;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private final int anInt3181;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	private final int anInt3164;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	private final int anInt3178;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private final int anInt3169;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	private final int anInt3165;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	private final int anInt3177;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	private final int anInt3168;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	private final int anInt3172;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private final int anInt3166;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	private final int anInt3180;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	private final int anInt3179;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!et;II)V")
	public Class15_Sub7(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(23) int local23;
		if (arg1 == 0) {
			local23 = arg0.method8555(-9372);
			this.anInt3174 = local23 & 0xFFFF;
			this.anInt3167 = local23 >>> 16;
			this.anInt3181 = -1;
		} else {
			this.anInt3174 = -1;
			this.anInt3167 = -1;
			this.anInt3181 = arg0.method8575();
		}
		if (arg2 == 0) {
			local23 = arg0.method8555(-9372);
			this.anInt3164 = local23 >>> 16;
			this.anInt3178 = local23 & 0xFFFF;
			this.anInt3169 = -1;
		} else {
			this.anInt3164 = -1;
			this.anInt3178 = -1;
			this.anInt3169 = arg0.method8575();
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt3165 = arg0.method8581(-17416);
		} else {
			this.anInt3165 = -1;
		}
		this.anInt3177 = arg0.method8575();
		this.anInt3168 = arg0.method8581(-17416);
		this.anInt3172 = arg0.method8581(-17416);
		this.anInt3166 = arg0.method8583();
		this.anInt3180 = arg0.method8575();
		this.anInt3179 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		@Pc(30) int local30;
		@Pc(23) int local23;
		@Pc(16) int local16;
		@Pc(39) Class4_Sub2_Sub1_Sub2 local39;
		if (this.anInt3167 >= 0) {
			local16 = this.anInt3165;
			local23 = this.anInt3174 * 512 + 256;
			local30 = this.anInt3167 * 512 + 256;
		} else {
			local39 = Static199.aClass61Array1[this.anInt3181].method1238();
			local23 = local39.anInt10228;
			local30 = local39.anInt10229;
			local16 = local39.aByte133;
		}
		@Pc(69) int local69;
		@Pc(72) int local72;
		if (this.anInt3174 < 0) {
			local39 = Static199.aClass61Array1[this.anInt3169].method1238();
			if (local16 < 0) {
				local16 = local39.aByte133;
			}
			local69 = local39.anInt10229;
			local72 = local39.anInt10228;
		} else {
			local72 = this.anInt3178 * 512 + 256;
			local69 = this.anInt3164 * 512 + 256;
		}
		@Pc(93) int local93 = this.anInt3179 << 2;
		@Pc(129) Class4_Sub2_Sub1_Sub3 local129 = new Class4_Sub2_Sub1_Sub3(this.anInt3177, local16, local16, local30, local23, this.anInt3168 << 2, Static528.anInt8386, this.anInt3166 + Static528.anInt8386, this.anInt3180, local93, this.anInt3181 + 1, this.anInt3169 - -1, this.anInt3172 << 2, false, 0);
		local129.method7309(local69, local72, 3, this.anInt3172 << 2, Static528.anInt8386 + this.anInt3166);
		Static120.aClass60_37.method1233(new Class2_Sub6_Sub17(local129));
	}
}
