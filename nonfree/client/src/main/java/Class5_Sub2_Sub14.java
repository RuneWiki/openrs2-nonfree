import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
	private int anInt4032 = 1;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
	private int anInt4030 = 0;

	@OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
	private int anInt4036 = 0;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4036 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt4030 = arg0.method5966();
		} else if (arg1 == 3) {
			this.anInt4032 = arg0.method5966();
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		Static528.method7829();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(24) int local24 = Static493.anIntArray476[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static597.anInt10025; local32++) {
				@Pc(38) int local38 = Static352.anIntArray331[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt4036 == 0) {
					local70 = this.anInt4032 * (local38 - local24);
				} else {
					@Pc(60) int local60 = local30 * local30 + local44 * local44 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt4032) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt4030 == 0) {
					local70 = Static214.anIntArray205[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4030 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local16[local32] = local70;
			}
		}
		return local16;
	}
}
