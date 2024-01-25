import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class5_Sub15_Sub2 extends Class5_Sub15 {

	@OriginalMember(owner = "client!iw", name = "Gb", descriptor = "I")
	private int anInt4205;

	@OriginalMember(owner = "client!iw", name = "Mb", descriptor = "Lclient!td;")
	private Class332 aClass332_6;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!td;I)V")
	public void method3699(@OriginalArg(0) Class332 arg0) {
		this.aClass332_6 = arg0;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(III[B)V")
	public void method3700(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray45[super.anInt4144++] - this.aClass332_6.method7683());
		}
	}

	@OriginalMember(owner = "client!iw", name = "z", descriptor = "(I)V")
	public void method3701() {
		this.anInt4205 = super.anInt4144 * 8;
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(IB)I")
	public int method3702(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt4205 >> 3;
		@Pc(21) int local21 = 8 - (this.anInt4205 & 0x7);
		@Pc(23) int local23 = 0;
		this.anInt4205 += arg0;
		while (local21 < arg0) {
			local23 += (super.aByteArray45[local8++] & Static3.anIntArray2[local21]) << arg0 - local21;
			arg0 -= local21;
			local21 = 8;
		}
		if (local21 == arg0) {
			local23 += super.aByteArray45[local8] & Static3.anIntArray2[local21];
		} else {
			local23 += super.aByteArray45[local8] >> local21 - arg0 & Static3.anIntArray2[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)I")
	public int method3703(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4205;
	}

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "(II)V")
	public void method3704(@OriginalArg(0) int arg0) {
		super.aByteArray45[super.anInt4144++] = (byte) (arg0 + this.aClass332_6.method7683());
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B[I)V")
	public void method3705(@OriginalArg(1) int[] arg0) {
		this.aClass332_6 = new Class332(arg0);
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(Z)I")
	public int method3706() {
		@Pc(30) int local30 = super.aByteArray45[super.anInt4144++] - this.aClass332_6.method7683() & 0xFF;
		return local30 < 128 ? local30 : (super.aByteArray45[super.anInt4144++] - this.aClass332_6.method7683() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!iw", name = "A", descriptor = "(I)Z")
	public boolean method3708() {
		@Pc(24) int local24 = super.aByteArray45[super.anInt4144] - this.aClass332_6.method7680() & 0xFF;
		return local24 >= 128;
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(Z)V")
	public void method3710() {
		super.anInt4144 = (this.anInt4205 + 7) / 8;
	}
}
