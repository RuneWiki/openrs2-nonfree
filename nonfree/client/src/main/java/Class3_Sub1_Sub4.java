import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
	private int anInt578 = 0;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
	private int anInt582 = 0;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
	private int anInt579 = 20;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
	private int anInt581 = 1365;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt581 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt579 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt578 = arg0.method2767();
		} else if (arg1 == 3) {
			this.anInt582 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			for (@Pc(22) int local22 = 0; local22 < Static238.anInt4221; local22++) {
				@Pc(36) int local36 = (Static187.anIntArray379[local22] << 12) / this.anInt581 + this.anInt578;
				@Pc(48) int local48 = this.anInt582 + (Static351.anIntArray371[arg0] << 12) / this.anInt581;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && local70 < this.anInt579) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local36 + local62 - local68;
					local70++;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = this.anInt579 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt579;
			}
		}
		return local16;
	}
}
