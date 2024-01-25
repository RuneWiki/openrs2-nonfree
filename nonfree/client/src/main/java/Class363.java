import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class363 {

	@OriginalMember(owner = "client!us", name = "n", descriptor = "F")
	public float aFloat196 = 1.0F;

	@OriginalMember(owner = "client!us", name = "s", descriptor = "F")
	public float aFloat198 = 0.25F;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "F")
	public float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	public final int anInt10779;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	public final int anInt10778;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "F")
	public final float aFloat193;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "I")
	public final int anInt10776;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "Lclient!vr;")
	public final Class3 aClass3_4;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "F")
	public final float aFloat195;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "F")
	public final float aFloat197;

	@OriginalMember(owner = "client!us", name = "t", descriptor = "I")
	public final int anInt10783;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "I")
	public final int anInt10773;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "I")
	public final int anInt10780;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class363() {
		this.anInt10779 = -60;
		this.anInt10778 = 0;
		this.aFloat193 = 1.2F;
		this.anInt10776 = Static201.anInt4209;
		this.aClass3_4 = Static218.aClass3_1;
		this.aFloat195 = 0.69921875F;
		this.aFloat197 = 1.1523438F;
		this.anInt10783 = Static440.anInt8006;
		this.anInt10773 = -50;
		this.anInt10780 = -50;
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class363(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(16) int local16 = arg0.method5203();
		if (Static230.aClass2_Sub54_15.aClass4_Sub28_1.method8732() == 1 && Static595.aClass101_14.method8109() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt10783 = Static440.anInt8006;
			} else {
				this.anInt10783 = arg0.method5172();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat197 = 1.1523438F;
			} else {
				this.aFloat197 = (float) arg0.method5211() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat195 = 0.69921875F;
			} else {
				this.aFloat195 = (float) arg0.method5211() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat193 = 1.2F;
			} else {
				this.aFloat193 = (float) arg0.method5211() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5172();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5211();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5211();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5211();
			}
			this.aFloat193 = 1.2F;
			this.aFloat197 = 1.1523438F;
			this.aFloat195 = 0.69921875F;
			this.anInt10783 = Static440.anInt8006;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt10779 = -60;
			this.anInt10780 = -50;
			this.anInt10773 = -50;
		} else {
			this.anInt10780 = arg0.method5174();
			this.anInt10779 = arg0.method5174();
			this.anInt10773 = arg0.method5174();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt10776 = Static201.anInt4209;
		} else {
			this.anInt10776 = arg0.method5172();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt10778 = 0;
		} else {
			this.anInt10778 = arg0.method5211();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass3_4 = Static218.aClass3_1;
		} else {
			@Pc(214) int local214 = arg0.method5211();
			@Pc(218) int local218 = arg0.method5211();
			@Pc(222) int local222 = arg0.method5211();
			@Pc(226) int local226 = arg0.method5211();
			@Pc(230) int local230 = arg0.method5211();
			@Pc(234) int local234 = arg0.method5211();
			this.aClass3_4 = Static517.method8015(local230, local234, local214, local222, local226, local218);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method9219(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aFloat196 = (float) (arg0.method5203() * 8) / 255.0F;
		this.aFloat198 = (float) (arg0.method5203() * 8) / 255.0F;
		this.aFloat194 = (float) (arg0.method5203() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!us;B)Z")
	public boolean method9220(@OriginalArg(0) Class363 arg0) {
		return arg0.anInt10783 == this.anInt10783 && this.aFloat197 == arg0.aFloat197 && arg0.aFloat195 == this.aFloat195 && this.aFloat193 == arg0.aFloat193 && arg0.aFloat198 == this.aFloat198 && this.aFloat196 == arg0.aFloat196 && arg0.aFloat194 == this.aFloat194 && this.anInt10776 == arg0.anInt10776 && arg0.anInt10778 == this.anInt10778 && this.aClass3_4 == arg0.aClass3_4;
	}
}
