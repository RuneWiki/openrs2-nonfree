import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class11_Sub2_Sub26 extends Class11_Sub2 {

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
	private int anInt4303;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
	private int anInt4310;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
	private int anInt4307 = -1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5712(arg0, arg1);
		if (this.anInt4307 >= 0 && Static202.anInterface2_5 != null) {
			@Pc(24) int local24 = Static202.anInterface2_5.method2244(this.anInt4307).aBoolean259 ? 64 : 128;
			this.anIntArray333 = Static202.anInterface2_5.method2243(local24, 1.0F, false, this.anInt4307, local24);
			this.anInt4303 = local24;
			this.anInt4310 = local24;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(40) int local40 = this.anInt4303 * (this.anInt4310 == Static113.anInt2160 ? arg0 : arg0 * this.anInt4310 / Static113.anInt2160);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (Static339.anInt6549 == this.anInt4303) {
				for (local58 = 0; local58 < Static339.anInt6549; local58++) {
					local66 = this.anIntArray333[local40++];
					local52[local58] = (local66 & 0xFF) << 4;
					local48[local58] = local66 >> 4 & 0xFF0;
					local44[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static339.anInt6549; local58++) {
					local66 = local58 * this.anInt4303 / Static339.anInt6549;
					@Pc(119) int local119 = this.anIntArray333[local40 + local66];
					local52[local58] = (local119 & 0xFF) << 4;
					local48[local58] = local119 >> 4 & 0xFF0;
					local44[local58] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)I")
	@Override
	public int method5714() {
		return this.anInt4307;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4307 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
	@Override
	public void method5707() {
		super.method5707();
		this.anIntArray333 = null;
	}
}
