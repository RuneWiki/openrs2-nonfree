import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class12_Sub1_Sub19 extends Class12_Sub1 {

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
	private int anInt6284 = 0;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
	private int anInt6288 = 0;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
	private int anInt6287 = 1;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(24) int local24 = Static353.anIntArray458[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static357.anInt6670; local32++) {
				@Pc(38) int local38 = Static347.anIntArray455[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt6284 == 0) {
					local70 = this.anInt6287 * (local38 - local24);
				} else {
					@Pc(60) int local60 = local30 * local30 + local44 * local44 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt6287) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt6288 == 0) {
					local70 = Static103.anIntArray206[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6288 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local11[local32] = local70;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		Static431.method6596();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6284 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt6288 = arg0.method5216();
		} else if (arg1 == 3) {
			this.anInt6287 = arg0.method5216();
		}
	}
}
