import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class1_Sub13_Sub2 extends Class1_Sub13 {

	@OriginalMember(owner = "client!gba", name = "Eb", descriptor = "Lclient!nl;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "client!gba", name = "Ob", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(ZI)V")
	public void method3083(@OriginalArg(1) int arg0) {
		super.aByteArray45[super.anInt3400++] = (byte) (this.aClass207_1.method5302() + arg0);
	}

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "(I)Z")
	public boolean method3085() {
		@Pc(17) int local17 = super.aByteArray45[super.anInt3400] - this.aClass207_1.method5304() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "(I)V")
	public void method3086() {
		this.anInt3435 = super.anInt3400 * 8;
	}

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "(IB)I")
	public int method3087(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt3435 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3435 & 0x7);
		this.anInt3435 += arg0;
		@Pc(23) int local23 = 0;
		while (local15 < arg0) {
			local23 += (Static181.anIntArray298[local15] & super.aByteArray45[local8++]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local23 += super.aByteArray45[local8] & Static181.anIntArray298[local15];
		} else {
			local23 += super.aByteArray45[local8] >> local15 - arg0 & Static181.anIntArray298[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I[BII)V")
	public void method3088(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = (byte) (super.aByteArray45[super.anInt3400++] - this.aClass207_1.method5302());
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B[I)V")
	public void method3089(@OriginalArg(1) int[] arg0) {
		this.aClass207_1 = new Class207(arg0);
	}

	@OriginalMember(owner = "client!gba", name = "A", descriptor = "(I)V")
	public void method3091() {
		super.anInt3400 = (this.anInt3435 + 7) / 8;
	}

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "(I)I")
	public int method3092() {
		@Pc(22) int local22 = super.aByteArray45[super.anInt3400++] - this.aClass207_1.method5302() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray45[super.anInt3400++] - this.aClass207_1.method5302() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "(II)I")
	public int method3093(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3435;
	}
}
