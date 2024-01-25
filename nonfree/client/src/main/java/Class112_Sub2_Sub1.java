import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class112_Sub2_Sub1 extends Class112_Sub2 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!gfa;")
	private Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	private final int anInt5662;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	private final int anInt5661;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_26;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	private final int anInt5663;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	private final int anInt5656;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private final int anInt5658;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	private final int anInt5664;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kfa;IIIIII)V")
	public Class112_Sub2_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5662 = arg2;
		this.anInt5661 = arg4;
		this.aClass7_Sub2_26 = arg0;
		this.anInt5663 = arg1;
		this.anInt5656 = arg3;
		this.anInt5658 = arg6;
		this.anInt5664 = arg5;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lclient!gfa;")
	@Override
	public Class3_Sub4 method7398() {
		if (this.aClass3_Sub4_1 == null) {
			Static424.anIntArray454[5] = this.anInt5658;
			Static424.anIntArray454[1] = this.anInt5662;
			Static424.anIntArray454[4] = this.anInt5664;
			Static424.anIntArray454[0] = this.anInt5663;
			Static424.anIntArray454[2] = this.anInt5656;
			Static424.anIntArray454[3] = this.anInt5661;
			@Pc(50) Interface7 local50 = this.aClass7_Sub2_26.anInterface7_12;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local50.method4463(Static424.anIntArray454[local56])) {
					return null;
				}
				@Pc(74) Class69 local74 = local50.method4460(Static424.anIntArray454[local56]);
				@Pc(81) int local81 = local74.aBoolean179 ? 64 : 128;
				if (local81 > local54) {
					local54 = local81;
				}
				if (local74.aByte45 > 0) {
					local52 = true;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static330.anIntArrayArray30[local97] = local50.method4462(local54, false, Static424.anIntArray454[local97], 1.0F, local54);
			}
			this.aClass3_Sub4_1 = new Class3_Sub4(this.aClass7_Sub2_26, 6407, local54, local52, Static330.anIntArrayArray30);
		}
		return this.aClass3_Sub4_1;
	}
}
