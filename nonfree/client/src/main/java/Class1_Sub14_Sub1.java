import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!uc", name = "Pb", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!uc", name = "Tb", descriptor = "Lclient!gh;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(Z)V")
	public void method3063() {
		this.anInt4078 = super.anInt4061 * 8;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IB)I")
	public int method3065(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4078;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(BI)V")
	public void method3067(@OriginalArg(1) int arg0) {
		super.aByteArray49[super.anInt4061++] = (byte) (arg0 + this.aClass38_1.method1033());
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIII)V")
	public void method3069(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray49[super.anInt4061++] - this.aClass38_1.method1033());
		}
	}

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "(II)I")
	public int method3070(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt4078 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 8 - (this.anInt4078 & 0x7);
		this.anInt4078 += arg0;
		while (arg0 > local19) {
			local12 += (super.aByteArray49[local10++] & Static85.anIntArray157[local19]) << arg0 - local19;
			arg0 -= local19;
			local19 = 8;
		}
		if (local19 == arg0) {
			local12 += Static85.anIntArray157[local19] & super.aByteArray49[local10];
		} else {
			local12 += super.aByteArray49[local10] >> local19 - arg0 & Static85.anIntArray157[arg0];
		}
		return local12;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(Z)I")
	public int method3071() {
		return super.aByteArray49[super.anInt4061++] - this.aClass38_1.method1033() & 0xFF;
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(B)V")
	public void method3072() {
		super.anInt4061 = (this.anInt4078 + 7) / 8;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([II)V")
	public void method3073(@OriginalArg(0) int[] arg0) {
		this.aClass38_1 = new Class38(arg0);
	}
}
