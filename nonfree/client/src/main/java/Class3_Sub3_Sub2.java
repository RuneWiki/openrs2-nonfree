import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!jc", name = "zb", descriptor = "Lclient!nha;")
	private Class233 aClass233_2;

	@OriginalMember(owner = "client!jc", name = "Jb", descriptor = "I")
	private int anInt4746;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "(I)Z")
	public boolean method4267() {
		@Pc(23) int local23 = super.aByteArray54[super.anInt4736] - this.aClass233_2.method6071() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)V")
	public void method4268(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = (byte) (super.aByteArray54[super.anInt4736++] - this.aClass233_2.method6068());
		}
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(II)V")
	public void method4270(@OriginalArg(0) int arg0) {
		super.aByteArray54[super.anInt4736++] = (byte) (arg0 + this.aClass233_2.method6068());
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([IZ)V")
	public void method4271(@OriginalArg(0) int[] arg0) {
		this.aClass233_2 = new Class233(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(II)I")
	public int method4272(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4746;
	}

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "(I)V")
	public void method4273() {
		this.anInt4746 = super.anInt4736 * 8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!nha;I)V")
	public void method4274(@OriginalArg(0) Class233 arg0) {
		this.aClass233_2 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(IB)I")
	public int method4276(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt4746 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt4746 & 0x7);
		this.anInt4746 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local17) {
			local31 += (super.aByteArray54[local10++] & Static279.anIntArray269[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local31 += Static279.anIntArray269[local17] & super.aByteArray54[local10];
		} else {
			local31 += super.aByteArray54[local10] >> local17 - arg0 & Static279.anIntArray269[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)I")
	public int method4277() {
		@Pc(21) int local21 = super.aByteArray54[super.anInt4736++] - this.aClass233_2.method6068() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray54[super.anInt4736++] - this.aClass233_2.method6068() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(B)V")
	public void method4278() {
		super.anInt4736 = (this.anInt4746 + 7) / 8;
	}
}
