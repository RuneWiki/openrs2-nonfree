import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class6_Sub12_Sub2 extends Class6_Sub12 {

	@OriginalMember(owner = "client!ql", name = "Eb", descriptor = "I")
	private int anInt7578;

	@OriginalMember(owner = "client!ql", name = "Nb", descriptor = "Lclient!bv;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V")
	public Class6_Sub12_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "(I)Z")
	public boolean method6060() {
		@Pc(24) int local24 = super.aByteArray97[super.anInt7556] - this.aClass39_1.method810() & 0xFF;
		return local24 >= 128;
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "(II)I")
	public int method6061(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt7578 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt7578 & 0x7);
		this.anInt7578 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (Static284.anIntArray413[local18] & super.aByteArray97[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += Static284.anIntArray413[local18] & super.aByteArray97[local10];
		} else {
			local26 += super.aByteArray97[local10] >> local18 - arg0 & Static284.anIntArray413[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(IB)V")
	public void method6062(@OriginalArg(0) int arg0) {
		super.aByteArray97[super.anInt7556++] = (byte) (this.aClass39_1.method809() + arg0);
	}

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "(I)I")
	public int method6063() {
		@Pc(29) int local29 = super.aByteArray97[super.anInt7556++] - this.aClass39_1.method809() & 0xFF;
		return local29 < 128 ? local29 : (super.aByteArray97[super.anInt7556++] - this.aClass39_1.method809() & 0xFF) + (local29 - 128 << 8);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([IZ)V")
	public void method6064(@OriginalArg(0) int[] arg0) {
		this.aClass39_1 = new Class39(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "(I)V")
	public void method6065() {
		super.anInt7556 = (this.anInt7578 + 7) / 8;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "([BIII)V")
	public void method6066(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray97[super.anInt7556++] - this.aClass39_1.method809());
		}
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "(B)V")
	public void method6068() {
		this.anInt7578 = super.anInt7556 * 8;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(IB)I")
	public int method6069(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt7578;
	}
}
