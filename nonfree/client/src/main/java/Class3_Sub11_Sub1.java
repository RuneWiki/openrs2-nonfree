import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ob", name = "rc", descriptor = "Lclient!oa;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!ob", name = "vc", descriptor = "I")
	private int anInt2087;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(Z)V")
	public void method1475() {
		this.anInt2087 = super.anInt2060 * 8;
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "(II)I")
	public int method1476(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = 8 - (this.anInt2087 & 0x7);
		@Pc(26) int local26 = this.anInt2087 >> 3;
		this.anInt2087 += arg0;
		@Pc(34) int local34 = 0;
		while (local21 < arg0) {
			local34 += (Static98.anIntArray379[local21] & super.aByteArray17[local26++]) << arg0 - local21;
			arg0 -= local21;
			local21 = 8;
		}
		if (local21 == arg0) {
			local34 += Static98.anIntArray379[local21] & super.aByteArray17[local26];
		} else {
			local34 += Static98.anIntArray379[arg0] & super.aByteArray17[local26] >> local21 - arg0;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "(I)I")
	public int method1477() {
		return super.aByteArray17[super.anInt2060++] - this.aClass45_1.method1345() & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
	public void method1478(@OriginalArg(1) int arg0) {
		super.aByteArray17[super.anInt2060++] = (byte) (this.aClass45_1.method1345() + arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IB)V")
	public void method1479(@OriginalArg(0) int[] arg0) {
		this.aClass45_1 = new Class45(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "(I)V")
	public void method1480() {
		super.anInt2060 = (this.anInt2087 + 7) / 8;
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "(II)I")
	public int method1482(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2087;
	}
}
