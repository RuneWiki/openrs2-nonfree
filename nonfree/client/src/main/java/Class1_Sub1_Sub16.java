import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!im", name = "H", descriptor = "I")
	private int anInt4134 = 585;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4134 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(24) int local24 = Static583.anIntArray614[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static501.anInt8748; local26++) {
				@Pc(32) int local32 = Static95.anIntArray77[local26];
				@Pc(73) int local73;
				if (this.anInt4134 < local32 && 4096 - this.anInt4134 > local32 && local24 > 2048 - this.anInt4134 && this.anInt4134 + 2048 > local24) {
					local73 = 2048 - local32;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt4134;
					local16[local26] = 4096 - local73;
				} else if (local32 > 2048 - this.anInt4134 && this.anInt4134 + 2048 > local32) {
					local73 = local24 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt4134;
					local73 <<= 0xC;
					local16[local26] = local73 / (2048 - this.anInt4134);
				} else if (local24 < this.anInt4134 || local24 > 4096 - this.anInt4134) {
					local73 = local32 - 2048;
					@Pc(170) int local170 = local73 < 0 ? -local73 : local73;
					@Pc(175) int local175 = local170 - this.anInt4134;
					@Pc(179) int local179 = local175 << 12;
					local16[local26] = local179 / (2048 - this.anInt4134);
				} else if (this.anInt4134 <= local32 && local32 <= 4096 - this.anInt4134) {
					local16[local26] = 0;
				} else {
					local73 = 2048 - local24;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt4134;
					local16[local26] = 4096 - local73;
				}
			}
		}
		return local16;
	}
}
