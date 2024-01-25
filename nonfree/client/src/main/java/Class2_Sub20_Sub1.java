import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class2_Sub20_Sub1 extends Class2_Sub20 {

	@OriginalMember(owner = "client!hq", name = "Nb", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!hq", name = "Qb", descriptor = "Lclient!ar;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!hq", name = "Zb", descriptor = "I")
	private int anInt3123;

	static {
		for (@Pc(335) int local335 = 0; local335 < 100; local335++) {
			aRectangleArray2[local335] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(BI)V")
	public void method2498(@OriginalArg(1) int arg0) {
		super.aByteArray136[super.anInt4608++] = (byte) (this.aClass15_1.method246() + arg0);
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(Z)V")
	public void method2499() {
		this.anInt3123 = super.anInt4608 * 8;
	}

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "(II)I")
	public int method2501(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3123;
	}

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "(I)Z")
	public boolean method2502() {
		@Pc(19) int local19 = super.aByteArray136[super.anInt4608] - this.aClass15_1.method247() & 0xFF;
		return local19 >= 128;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "([II)V")
	public void method2503(@OriginalArg(0) int[] arg0) {
		this.aClass15_1 = new Class15(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "(II)I")
	public int method2505(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt3123 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3123 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt3123 += arg0;
		while (local18 < arg0) {
			local20 += (Static443.anIntArray509[local18] & super.aByteArray136[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static443.anIntArray509[local18] & super.aByteArray136[local10];
		} else {
			local20 += super.aByteArray136[local10] >> local18 - arg0 & Static443.anIntArray509[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "(B)V")
	public void method2506() {
		super.anInt4608 = (this.anInt3123 + 7) / 8;
	}

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "(I)I")
	public int method2507() {
		@Pc(22) int local22 = super.aByteArray136[super.anInt4608++] - this.aClass15_1.method246() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray136[super.anInt4608++] - this.aClass15_1.method246() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[BIB)V")
	public void method2508(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray136[super.anInt4608++] - this.aClass15_1.method246());
		}
	}
}
