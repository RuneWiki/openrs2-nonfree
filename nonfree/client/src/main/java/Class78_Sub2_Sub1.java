import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class78_Sub2_Sub1 extends Class78_Sub2 {

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "Lclient!nj;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
	private final int anInt6382;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	private final int anInt6377;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	private final int anInt6383;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	private final int anInt6380;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	private final int anInt6384;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
	private final int anInt6381;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_14;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!wga;IIIIII)V")
	public Class78_Sub2_Sub1(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6382 = arg3;
		this.anInt6377 = arg5;
		this.anInt6383 = arg1;
		this.anInt6380 = arg4;
		this.anInt6384 = arg2;
		this.anInt6381 = arg6;
		this.aClass20_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)Lclient!nj;")
	@Override
	public Interface19 method5432() {
		if (this.anInterface19_1 == null) {
			Static582.anIntArray665[3] = this.anInt6380;
			Static582.anIntArray665[1] = this.anInt6384;
			Static582.anIntArray665[4] = this.anInt6377;
			@Pc(32) Interface4 local32 = this.aClass20_Sub2_14.anInterface4_12;
			Static582.anIntArray665[5] = this.anInt6381;
			Static582.anIntArray665[2] = this.anInt6382;
			Static582.anIntArray665[0] = this.anInt6383;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local32.method8049(Static582.anIntArray665[local53])) {
					return null;
				}
				@Pc(71) Class127 local71 = local32.method8048(Static582.anIntArray665[local53]);
				@Pc(78) int local78 = local71.aBoolean335 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte76 > 0) {
					local49 = true;
				}
			}
			for (@Pc(103) int local103 = 0; local103 < 6; local103++) {
				Static436.anIntArrayArray46[local103] = local32.method8050(false, Static582.anIntArray665[local103], 1.0F, local51, local51);
			}
			this.anInterface19_1 = this.aClass20_Sub2_14.method1534(Static436.anIntArrayArray46, local49, local51);
		}
		return this.anInterface19_1;
	}
}
