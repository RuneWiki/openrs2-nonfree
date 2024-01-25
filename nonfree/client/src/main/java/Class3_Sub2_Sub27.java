import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
	private int anInt7795 = 1;

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
	private int anInt7791 = 0;

	@OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
	private int anInt7797 = 0;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		Static468.method6978();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7797 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt7791 = arg1.method8401();
		} else if (arg0 == 3) {
			this.anInt7795 = arg1.method8401();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(27) int local27 = Static328.anIntArray387[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static164.anInt8839; local35++) {
				@Pc(41) int local41 = Static352.anIntArray400[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(73) int local73;
				if (this.anInt7797 == 0) {
					local73 = this.anInt7795 * (local41 - local27);
				} else {
					@Pc(63) int local63 = local47 * local47 + local33 * local33 >> 12;
					local73 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local73 = (int) ((double) (this.anInt7795 * local73) * 3.141592653589793D);
				}
				local73 -= local73 & 0xFFFFF000;
				if (this.anInt7791 == 0) {
					local73 = Static8.anIntArray7[local73 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7791 == 2) {
					local73 -= 2048;
					if (local73 < 0) {
						local73 = -local73;
					}
					local73 = 2048 - local73 << 1;
				}
				local19[local35] = local73;
			}
		}
		return local19;
	}
}
