import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class6_Sub10_Sub1 extends Class6_Sub10 {

	@OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lclient!hg;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!jh", name = "Ib", descriptor = "I")
	private int anInt2730;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	public Class6_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB[B)V")
	public void method2879(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = (byte) (super.aByteArray67[super.anInt4188++] - this.aClass91_1.method2325());
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([IZ)V")
	public void method2882(@OriginalArg(0) int[] arg0) {
		this.aClass91_1 = new Class91(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "(IB)I")
	public int method2883(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt2730 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt2730 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt2730 += arg0;
		while (arg0 > local23) {
			local25 += (Static198.anIntArray435[local23] & super.aByteArray67[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local25 += super.aByteArray67[local15] & Static198.anIntArray435[local23];
		} else {
			local25 += super.aByteArray67[local15] >> local23 - arg0 & Static198.anIntArray435[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "(I)V")
	public void method2884() {
		super.anInt4188 = (this.anInt2730 + 7) / 8;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public void method2886(@OriginalArg(1) int arg0) {
		super.aByteArray67[super.anInt4188++] = (byte) (this.aClass91_1.method2325() + arg0);
	}

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "(B)V")
	public void method2887() {
		this.anInt2730 = super.anInt4188 * 8;
	}

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "(II)I")
	public int method2888(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2730;
	}

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "(I)I")
	public int method2889() {
		return super.aByteArray67[super.anInt4188++] - this.aClass91_1.method2325() & 0xFF;
	}
}
