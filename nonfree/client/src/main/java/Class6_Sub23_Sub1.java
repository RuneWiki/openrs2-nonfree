import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class6_Sub23_Sub1 extends Class6_Sub23 {

	@OriginalMember(owner = "client!gs", name = "Qb", descriptor = "I")
	private int anInt3443;

	@OriginalMember(owner = "client!gs", name = "Tb", descriptor = "Lclient!aia;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
	public Class6_Sub23_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gs", name = "A", descriptor = "(I)I")
	public int method2873() {
		@Pc(30) int local30 = super.aByteArray101[super.anInt9901++] - this.aClass15_1.method466() & 0xFF;
		return local30 < 128 ? local30 : (super.aByteArray101[super.anInt9901++] - this.aClass15_1.method466() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "(II)V")
	public void method2874(@OriginalArg(0) int arg0) {
		super.aByteArray101[super.anInt9901++] = (byte) (this.aClass15_1.method466() + arg0);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([BIII)V")
	public void method2876(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray101[super.anInt9901++] - this.aClass15_1.method466());
		}
	}

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "(B)V")
	public void method2877() {
		this.anInt3443 = super.anInt9901 * 8;
	}

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "(II)I")
	public int method2878(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt3443 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt3443 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt3443 += arg0;
		while (arg0 > local23) {
			local25 += (super.aByteArray101[local15++] & Static206.anIntArray201[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local25 += Static206.anIntArray201[local23] & super.aByteArray101[local15];
		} else {
			local25 += super.aByteArray101[local15] >> local23 - arg0 & Static206.anIntArray201[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!aia;I)V")
	public void method2879(@OriginalArg(0) Class15 arg0) {
		this.aClass15_1 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B[I)V")
	public void method2880(@OriginalArg(1) int[] arg0) {
		this.aClass15_1 = new Class15(arg0);
	}

	@OriginalMember(owner = "client!gs", name = "C", descriptor = "(I)Z")
	public boolean method2881() {
		@Pc(16) int local16 = super.aByteArray101[super.anInt9901] - this.aClass15_1.method468() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "(II)I")
	public int method2882(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3443;
	}

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "(B)V")
	public void method2883() {
		super.anInt9901 = (this.anInt3443 + 7) / 8;
	}
}
