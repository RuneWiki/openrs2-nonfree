import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class10_Sub9 extends Class10 {

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
	private final int anInt4858;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	private final int anInt4857;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
	private final int anInt4859;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
	private final int anInt4862;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	private final int anInt4860;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	private final int anInt4864;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub9(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt4858 = arg0.method5272();
		@Pc(13) int local13 = arg0.method5322(-111);
		if ((local13 & 0x1) == 0) {
			this.anInt4857 = -1;
			this.anInt4859 = -1;
		} else {
			this.anInt4859 = arg0.method5272();
			this.anInt4857 = arg0.method5272();
		}
		if ((local13 & 0x2) == 0) {
			this.anInt4862 = -1;
			this.anInt4860 = -1;
		} else {
			this.anInt4862 = arg0.method5272();
			this.anInt4860 = arg0.method5272();
		}
		if ((local13 & 0x4) == 0) {
			this.anInt4864 = -1;
		} else {
			@Pc(76) int local76 = arg0.method5272();
			@Pc(80) int local80 = arg0.method5272();
			@Pc(86) int local86 = local76 * 255 / local80;
			if (local76 > 0 && local86 < 1) {
				local86 = 1;
			}
			this.anInt4864 = local86;
		}
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass11Array1[this.anInt4858].method295().method6589(this.anInt4859, this.anInt4860, this.anInt4857, 0, this.anInt4864, Static269.anInt4883, this.anInt4862);
	}
}
