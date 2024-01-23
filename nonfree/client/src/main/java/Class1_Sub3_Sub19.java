import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!li", name = "W", descriptor = "I")
	private int anInt3363 = 0;

	@OriginalMember(owner = "client!li", name = "U", descriptor = "I")
	private int anInt3361 = 0;

	@OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
	private int anInt3364 = 1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(19) int local19 = Static94.anIntArray321[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static110.anInt2934; local27++) {
				@Pc(33) int local33 = Static175.anIntArray302[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(65) int local65;
				if (this.anInt3363 == 0) {
					local65 = (local33 - local19) * this.anInt3364;
				} else {
					@Pc(55) int local55 = local25 * local25 + local39 * local39 >> 12;
					local65 = (int) (Math.sqrt((double) ((float) local55 / 4096.0F)) * 4096.0D);
					local65 = (int) ((double) (this.anInt3364 * local65) * 3.141592653589793D);
				}
				local65 -= local65 & 0xFFFFF000;
				if (this.anInt3361 == 0) {
					local65 = Static157.anIntArray276[local65 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3361 == 2) {
					local65 -= 2048;
					if (local65 < 0) {
						local65 = -local65;
					}
					local65 = 2048 - local65 << 1;
				}
				local11[local27] = local65;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		Static35.method621();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3363 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt3361 = arg0.method1772();
		} else if (arg1 == 3) {
			this.anInt3364 = arg0.method1772();
		}
	}
}
