import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!ei", name = "Pb", descriptor = "I")
	private int anInt2864;

	@OriginalMember(owner = "client!ei", name = "Qb", descriptor = "Lclient!sh;")
	private Class314 aClass314_1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "(I)Z")
	public boolean method2451() {
		@Pc(16) int local16 = super.aByteArray26[super.anInt3378] - this.aClass314_1.method7270() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!sh;I)V")
	public void method2452(@OriginalArg(0) Class314 arg0) {
		this.aClass314_1 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B[BII)V")
	public void method2453(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray26[super.anInt3378++] - this.aClass314_1.method7271());
		}
	}

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "(II)V")
	public void method2454(@OriginalArg(0) int arg0) {
		super.aByteArray26[super.anInt3378++] = (byte) (this.aClass314_1.method7271() + arg0);
	}

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "(B)V")
	public void method2455() {
		super.anInt3378 = (this.anInt2864 + 7) / 8;
	}

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "(II)I")
	public int method2456(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt2864 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt2864 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt2864 += arg0;
		while (arg0 > local23) {
			local25 += (super.aByteArray26[local15++] & Static72.anIntArray145[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local25 += Static72.anIntArray145[local23] & super.aByteArray26[local15];
		} else {
			local25 += super.aByteArray26[local15] >> local23 - arg0 & Static72.anIntArray145[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([II)V")
	public void method2457(@OriginalArg(0) int[] arg0) {
		this.aClass314_1 = new Class314(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)I")
	public int method2458(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2864;
	}

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "(B)I")
	public int method2459() {
		@Pc(21) int local21 = super.aByteArray26[super.anInt3378++] - this.aClass314_1.method7271() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray26[super.anInt3378++] - this.aClass314_1.method7271() & 0xFF);
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(Z)V")
	public void method2461() {
		this.anInt2864 = super.anInt3378 * 8;
	}
}
