import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!mfa", name = "Ob", descriptor = "Lclient!aq;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!mfa", name = "dc", descriptor = "I")
	private int anInt6502;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub9_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "(B)Z")
	public boolean method5641() {
		@Pc(23) int local23 = super.aByteArray51[super.anInt6453] - this.aClass20_3.method321() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "(II)I")
	public int method5642(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6502 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt6502 & 0x7);
		this.anInt6502 += arg0;
		@Pc(35) int local35 = 0;
		while (arg0 > local18) {
			local35 += (super.aByteArray51[local10++] & Static299.anIntArray315[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local35 += Static299.anIntArray315[local18] & super.aByteArray51[local10];
		} else {
			local35 += super.aByteArray51[local10] >> local18 - arg0 & Static299.anIntArray315[arg0];
		}
		return local35;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[I)V")
	public void method5643(@OriginalArg(1) int[] arg0) {
		this.aClass20_3 = new Class20(arg0);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZ)I")
	public int method5644(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6502;
	}

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "(B)V")
	public void method5645() {
		this.anInt6502 = super.anInt6453 * 8;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "([BIII)V")
	public void method5648(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray51[super.anInt6453++] - this.aClass20_3.method323());
		}
	}

	@OriginalMember(owner = "client!mfa", name = "x", descriptor = "(I)V")
	public void method5649() {
		super.anInt6453 = (this.anInt6502 + 7) / 8;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!aq;B)V")
	public void method5650(@OriginalArg(0) Class20 arg0) {
		this.aClass20_3 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "(B)I")
	public int method5651() {
		@Pc(22) int local22 = super.aByteArray51[super.anInt6453++] - this.aClass20_3.method323() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray51[super.anInt6453++] - this.aClass20_3.method323() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "(IB)V")
	public void method5652(@OriginalArg(0) int arg0) {
		super.aByteArray51[super.anInt6453++] = (byte) (arg0 + this.aClass20_3.method323());
	}
}
