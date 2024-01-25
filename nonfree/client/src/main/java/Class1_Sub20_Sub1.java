import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!jd", name = "Bb", descriptor = "I")
	private int anInt4559;

	@OriginalMember(owner = "client!jd", name = "Fb", descriptor = "Lclient!jh;")
	private Class170 aClass170_1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)I")
	public int method3924(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt4559 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt4559 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt4559 += arg0;
		while (arg0 > local17) {
			local19 += (Static132.anIntArray162[local17] & super.aByteArray52[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += super.aByteArray52[local10] & Static132.anIntArray162[local17];
		} else {
			local19 += super.aByteArray52[local10] >> local17 - arg0 & Static132.anIntArray162[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "(I)Z")
	public boolean method3925() {
		@Pc(16) int local16 = super.aByteArray52[super.anInt5238] - this.aClass170_1.method3985() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "(I)V")
	public void method3927() {
		this.anInt4559 = super.anInt5238 * 8;
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(B)I")
	public int method3928() {
		@Pc(22) int local22 = super.aByteArray52[super.anInt5238++] - this.aClass170_1.method3984() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray52[super.anInt5238++] - this.aClass170_1.method3984() & 0xFF);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[B)V")
	public void method3930(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = (byte) (super.aByteArray52[super.anInt5238++] - this.aClass170_1.method3984());
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!jh;)V")
	public void method3931(@OriginalArg(1) Class170 arg0) {
		this.aClass170_1 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "(I)V")
	public void method3932() {
		super.anInt5238 = (this.anInt4559 + 7) / 8;
	}

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "(II)I")
	public int method3933(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4559;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	public void method3934(@OriginalArg(0) int arg0) {
		super.aByteArray52[super.anInt5238++] = (byte) (arg0 + this.aClass170_1.method3984());
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([II)V")
	public void method3935(@OriginalArg(0) int[] arg0) {
		this.aClass170_1 = new Class170(arg0);
	}
}
