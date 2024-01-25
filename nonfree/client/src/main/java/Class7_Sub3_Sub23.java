import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class7_Sub3_Sub23 extends Class7_Sub3 {

	@OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
	private int anInt4798 = 585;

	static {
		new Class55(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(24) int local24 = Static203.anIntArray322[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static58.anInt1052; local26++) {
				@Pc(32) int local32 = Static185.anIntArray298[local26];
				@Pc(73) int local73;
				if (this.anInt4798 < local32 && 4096 - this.anInt4798 > local32 && local24 > 2048 - this.anInt4798 && this.anInt4798 + 2048 > local24) {
					local73 = 2048 - local32;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt4798;
					local11[local26] = 4096 - local73;
				} else if (2048 - this.anInt4798 < local32 && local32 < this.anInt4798 + 2048) {
					local73 = local24 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt4798;
					local73 <<= 0xC;
					local11[local26] = local73 / (2048 - this.anInt4798);
				} else if (this.anInt4798 > local24 || local24 > 4096 - this.anInt4798) {
					local73 = local32 - 2048;
					@Pc(179) int local179 = local73 < 0 ? -local73 : local73;
					@Pc(184) int local184 = local179 - this.anInt4798;
					@Pc(188) int local188 = local184 << 12;
					local11[local26] = local188 / (2048 - this.anInt4798);
				} else if (local32 >= this.anInt4798 && 4096 - this.anInt4798 >= local32) {
					local11[local26] = 0;
				} else {
					local73 = 2048 - local24;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt4798;
					local11[local26] = 4096 - local73;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4798 = arg1.method3943();
		}
	}
}
