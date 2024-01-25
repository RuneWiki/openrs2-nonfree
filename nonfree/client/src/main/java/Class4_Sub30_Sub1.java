import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class4_Sub30_Sub1 extends Class4_Sub30 {

	@OriginalMember(owner = "client!of", name = "Ob", descriptor = "Lclient!kr;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!of", name = "Qb", descriptor = "I")
	private int anInt5112;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
	public Class4_Sub30_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!of", name = "s", descriptor = "(I)Z")
	public boolean method3916() {
		@Pc(16) int local16 = super.aByteArray79[super.anInt6244] - this.aClass141_1.method3075() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!of", name = "t", descriptor = "(I)V")
	public void method3917() {
		this.anInt5112 = super.anInt6244 * 8;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[I)V")
	public void method3918(@OriginalArg(1) int[] arg0) {
		this.aClass141_1 = new Class141(arg0);
	}

	@OriginalMember(owner = "client!of", name = "m", descriptor = "(B)I")
	public int method3919() {
		@Pc(21) int local21 = super.aByteArray79[super.anInt6244++] - this.aClass141_1.method3073() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray79[super.anInt6244++] - this.aClass141_1.method3073() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(BI)I")
	public int method3920(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5112;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BIII)V")
	public void method3921(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray79[super.anInt6244++] - this.aClass141_1.method3073());
		}
	}

	@OriginalMember(owner = "client!of", name = "n", descriptor = "(II)V")
	public void method3922(@OriginalArg(1) int arg0) {
		super.aByteArray79[super.anInt6244++] = (byte) (arg0 + this.aClass141_1.method3073());
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(BI)I")
	public int method3924(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5112 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt5112 & 0x7);
		@Pc(26) int local26 = 0;
		this.anInt5112 += arg0;
		while (arg0 > local17) {
			local26 += (super.aByteArray79[local10++] & Static293.anIntArray460[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local26 += super.aByteArray79[local10] & Static293.anIntArray460[local17];
		} else {
			local26 += super.aByteArray79[local10] >> local17 - arg0 & Static293.anIntArray460[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!of", name = "u", descriptor = "(I)V")
	public void method3925() {
		super.anInt6244 = (this.anInt5112 + 7) / 8;
	}
}
