import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class3_Sub25_Sub1 extends Class3_Sub25 {

	@OriginalMember(owner = "client!gaa", name = "Kb", descriptor = "I")
	private int anInt3710;

	@OriginalMember(owner = "client!gaa", name = "Pb", descriptor = "Lclient!w;")
	private Class375 aClass375_2;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B[I)V")
	public void method3391(@OriginalArg(1) int[] arg0) {
		this.aClass375_2 = new Class375(arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "(II)V")
	public void method3392(@OriginalArg(1) int arg0) {
		super.aByteArray106[super.anInt9765++] = (byte) (this.aClass375_2.method9014() + arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "(I)V")
	public void method3393() {
		super.anInt9765 = (this.anInt3710 + 7) / 8;
	}

	@OriginalMember(owner = "client!gaa", name = "w", descriptor = "(I)Z")
	public boolean method3394() {
		@Pc(16) int local16 = super.aByteArray106[super.anInt9765] - this.aClass375_2.method9012() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "(II)I")
	public int method3395(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3710;
	}

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "(I)I")
	public int method3396() {
		@Pc(29) int local29 = super.aByteArray106[super.anInt9765++] - this.aClass375_2.method9014() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray106[super.anInt9765++] - this.aClass375_2.method9014() & 0xFF);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!w;I)V")
	public void method3397(@OriginalArg(0) Class375 arg0) {
		this.aClass375_2 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(Z)V")
	public void method3399() {
		this.anInt3710 = super.anInt9765 * 8;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIB[B)V")
	public void method3400(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray106[super.anInt9765++] - this.aClass375_2.method9014());
		}
	}

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "(II)I")
	public int method3402(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt3710 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3710 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt3710 += arg0;
		while (arg0 > local18) {
			local20 += (super.aByteArray106[local10++] & Static284.anIntArray441[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += super.aByteArray106[local10] & Static284.anIntArray441[local18];
		} else {
			local20 += super.aByteArray106[local10] >> local18 - arg0 & Static284.anIntArray441[arg0];
		}
		return local20;
	}
}
