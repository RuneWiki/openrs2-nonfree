import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class5_Sub36_Sub2 extends Class5_Sub36 {

	@OriginalMember(owner = "client!rv", name = "Jb", descriptor = "Lclient!wha;")
	private Class393 aClass393_1;

	@OriginalMember(owner = "client!rv", name = "Tb", descriptor = "I")
	private int anInt8522;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
	public Class5_Sub36_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(II)V")
	public void method7334(@OriginalArg(0) int arg0) {
		super.aByteArray89[super.anInt8456++] = (byte) (this.aClass393_1.method9102() + arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!wha;)V")
	public void method7335(@OriginalArg(1) Class393 arg0) {
		this.aClass393_1 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "(I)V")
	public void method7336() {
		this.anInt8522 = super.anInt8456 * 8;
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "(I)Z")
	public boolean method7337() {
		@Pc(17) int local17 = super.aByteArray89[super.anInt8456] - this.aClass393_1.method9100() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "(I)I")
	public int method7338() {
		@Pc(29) int local29 = super.aByteArray89[super.anInt8456++] - this.aClass393_1.method9102() & 0xFF;
		return local29 < 128 ? local29 : (super.aByteArray89[super.anInt8456++] - this.aClass393_1.method9102() & 0xFF) + (local29 - 128 << 8);
	}

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "(I)V")
	public void method7340() {
		super.anInt8456 = (this.anInt8522 + 7) / 8;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I[BII)V")
	public void method7342(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray89[super.anInt8456++] - this.aClass393_1.method9102());
		}
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(II)I")
	public int method7343(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt8522 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt8522 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt8522 += arg0;
		while (local17 < arg0) {
			local19 += (super.aByteArray89[local10++] & Static146.anIntArray136[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += super.aByteArray89[local10] & Static146.anIntArray136[local17];
		} else {
			local19 += super.aByteArray89[local10] >> local17 - arg0 & Static146.anIntArray136[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "(II)I")
	public int method7344(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt8522;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "([IB)V")
	public void method7345(@OriginalArg(0) int[] arg0) {
		this.aClass393_1 = new Class393(arg0);
	}
}
