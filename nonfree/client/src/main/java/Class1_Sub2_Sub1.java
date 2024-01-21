import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt303 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(24) int local24 = Static37.anIntArray125[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static110.anInt2825; local26++) {
				@Pc(32) int local32 = Static86.anIntArray294[local26];
				@Pc(73) int local73;
				if (this.anInt303 < local32 && local32 < 4096 - this.anInt303 && 2048 - this.anInt303 < local24 && this.anInt303 + 2048 > local24) {
					local73 = 2048 - local32;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt303;
					local16[local26] = 4096 - local73;
				} else if (2048 - this.anInt303 < local32 && this.anInt303 + 2048 > local32) {
					local73 = local24 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt303;
					local73 <<= 0xC;
					local16[local26] = local73 / (2048 - this.anInt303);
				} else if (local24 < this.anInt303 || 4096 - this.anInt303 < local24) {
					local73 = local32 - 2048;
					@Pc(181) int local181 = local73 < 0 ? -local73 : local73;
					@Pc(186) int local186 = local181 - this.anInt303;
					@Pc(190) int local190 = local186 << 12;
					local16[local26] = local190 / (2048 - this.anInt303);
				} else if (local32 >= this.anInt303 && 4096 - this.anInt303 >= local32) {
					local16[local26] = 0;
				} else {
					local73 = 2048 - local24;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt303;
					local16[local26] = 4096 - local73;
				}
			}
		}
		return local16;
	}
}
