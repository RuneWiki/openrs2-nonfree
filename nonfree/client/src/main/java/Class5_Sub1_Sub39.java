import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class5_Sub1_Sub39 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
	private int anInt7263 = 0;

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
	private int anInt7265 = 1;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
	private int anInt7267 = 0;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7263 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt7267 = arg1.method5539();
		} else if (arg0 == 3) {
			this.anInt7265 = arg1.method5539();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		Static56.method929();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(27) int local27 = Static346.anIntArray401[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static148.anInt2666; local35++) {
				@Pc(41) int local41 = Static224.anIntArray234[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(73) int local73;
				if (this.anInt7263 == 0) {
					local73 = (local41 - local27) * this.anInt7265;
				} else {
					@Pc(63) int local63 = local33 * local33 + local47 * local47 >> 12;
					local73 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local73 = (int) ((double) (this.anInt7265 * local73) * 3.141592653589793D);
				}
				local73 -= local73 & 0xFFFFF000;
				if (this.anInt7267 == 0) {
					local73 = Static451.anIntArray501[local73 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7267 == 2) {
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
