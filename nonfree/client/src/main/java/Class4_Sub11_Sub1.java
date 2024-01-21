import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class4_Sub11_Sub1 extends Class4_Sub11 {

	@OriginalMember(owner = "client!ge", name = "Hb", descriptor = "I")
	private int anInt1119;

	@OriginalMember(owner = "client!ge", name = "Ob", descriptor = "Lclient!va;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "(I)I")
	public int method746() {
		return super.aByteArray9[super.anInt1099++] - this.aClass76_1.method1891() & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "(I)V")
	public void method747() {
		this.anInt1119 = super.anInt1099 * 8;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(IB)I")
	public int method748(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt1119 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt1119 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt1119 += arg0;
		while (arg0 > local23) {
			local25 += (Static132.anIntArray343[local23] & super.aByteArray9[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local25 += Static132.anIntArray343[local23] & super.aByteArray9[local15];
		} else {
			local25 += super.aByteArray9[local15] >> local23 - arg0 & Static132.anIntArray343[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(BI)I")
	public int method750(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1119;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)V")
	public void method751() {
		super.anInt1099 = (this.anInt1119 + 7) / 8;
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(II)V")
	public void method752(@OriginalArg(0) int arg0) {
		super.aByteArray9[super.anInt1099++] = (byte) (arg0 + this.aClass76_1.method1891());
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IB)V")
	public void method755(@OriginalArg(0) int[] arg0) {
		this.aClass76_1 = new Class76(arg0);
	}
}
