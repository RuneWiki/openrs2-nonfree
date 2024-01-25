import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
	private int anInt1126 = 585;

	static {
		new Class159("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1126 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(25) int local25 = Static128.anIntArray265[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static31.anInt797; local27++) {
				@Pc(33) int local33 = Static339.anIntArray4[local27];
				@Pc(75) int local75;
				if (local33 > this.anInt1126 && 4096 - this.anInt1126 > local33 && 2048 - this.anInt1126 < local25 && local25 < this.anInt1126 + 2048) {
					local75 = 2048 - local33;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt1126;
					local17[local27] = 4096 - local75;
				} else if (2048 - this.anInt1126 < local33 && this.anInt1126 + 2048 > local33) {
					local75 = local25 - 2048;
					local75 = local75 < 0 ? -local75 : local75;
					local75 -= this.anInt1126;
					local75 <<= 0xC;
					local17[local27] = local75 / (2048 - this.anInt1126);
				} else if (this.anInt1126 > local25 || local25 > 4096 - this.anInt1126) {
					local75 = local33 - 2048;
					@Pc(177) int local177 = local75 >= 0 ? local75 : -local75;
					@Pc(182) int local182 = local177 - this.anInt1126;
					@Pc(186) int local186 = local182 << 12;
					local17[local27] = local186 / (2048 - this.anInt1126);
				} else if (local33 >= this.anInt1126 && 4096 - this.anInt1126 >= local33) {
					local17[local27] = 0;
				} else {
					local75 = 2048 - local25;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt1126;
					local17[local27] = 4096 - local75;
				}
			}
		}
		return local17;
	}
}
