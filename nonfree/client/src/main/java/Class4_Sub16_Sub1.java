import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class4_Sub16_Sub1 extends Class4_Sub16 {

	@OriginalMember(owner = "client!o", name = "bc", descriptor = "Lclient!na;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!o", name = "cc", descriptor = "I")
	private int anInt2083;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
	public Class4_Sub16_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!o", name = "q", descriptor = "(I)V")
	public void method1491() {
		super.anInt2019 = (this.anInt2083 + 7) / 8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B[I)V")
	public void method1492(@OriginalArg(1) int[] arg0) {
		this.aClass53_1 = new Class53(arg0);
	}

	@OriginalMember(owner = "client!o", name = "o", descriptor = "(II)I")
	public int method1493(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2083;
	}

	@OriginalMember(owner = "client!o", name = "r", descriptor = "(I)V")
	public void method1494() {
		this.anInt2083 = super.anInt2019 * 8;
	}

	@OriginalMember(owner = "client!o", name = "n", descriptor = "(B)I")
	public int method1495() {
		return super.aByteArray22[super.anInt2019++] - this.aClass53_1.method1304() & 0xFF;
	}

	@OriginalMember(owner = "client!o", name = "p", descriptor = "(II)V")
	public void method1499(@OriginalArg(1) int arg0) {
		super.aByteArray22[super.anInt2019++] = (byte) (this.aClass53_1.method1304() + arg0);
	}

	@OriginalMember(owner = "client!o", name = "q", descriptor = "(II)I")
	public int method1500(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2083 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2083 & 0x7);
		this.anInt2083 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (super.aByteArray22[local10++] & Static29.anIntArray85[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += Static29.anIntArray85[local18] & super.aByteArray22[local10];
		} else {
			local26 += super.aByteArray22[local10] >> local18 - arg0 & Static29.anIntArray85[arg0];
		}
		return local26;
	}
}
