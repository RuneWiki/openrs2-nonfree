import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class6_Sub2_Sub9 extends Class6_Sub2 {

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "[Lclient!q;")
	public Class164[] aClass164Array1;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	private final int anInt2974;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub9(@OriginalArg(0) int arg0) {
		this.anInt2974 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)Z")
	public boolean method3161(@OriginalArg(0) int arg0) {
		return this.aClass164Array1[arg0].aBoolean327;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(II)Z")
	public boolean method3163(@OriginalArg(1) int arg0) {
		return this.aClass164Array1[arg0].aBoolean328;
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)Z")
	public boolean method3164() {
		if (this.aClass164Array1 != null) {
			return true;
		}
		@Pc(42) int local42;
		if (this.aByteArrayArray10 == null) {
			if (!Static250.aClass53_23.method1035(this.anInt2974)) {
				return false;
			}
			@Pc(35) int[] local35 = Static250.aClass53_23.method1027(this.anInt2974);
			this.aByteArrayArray10 = new byte[local35.length][];
			for (local42 = 0; local42 < local35.length; local42++) {
				this.aByteArrayArray10[local42] = Static250.aClass53_23.method1033(local35[local42], this.anInt2974);
			}
		}
		@Pc(63) boolean local63 = true;
		@Pc(86) int local86;
		for (local42 = 0; local42 < this.aByteArrayArray10.length; local42++) {
			@Pc(72) byte[] local72 = this.aByteArrayArray10[local42];
			local86 = local72[1] & 0xFF | (local72[0] & 0xFF) << 8;
			local63 &= Static28.aClass53_25.method1026(local86);
		}
		if (!local63) {
			return false;
		}
		@Pc(111) Class211 local111 = new Class211();
		local86 = Static250.aClass53_23.method1011(this.anInt2974);
		this.aClass164Array1 = new Class164[local86];
		@Pc(127) int[] local127 = Static250.aClass53_23.method1027(this.anInt2974);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(136) byte[] local136 = this.aByteArrayArray10[local129];
			@Pc(150) int local150 = local136[1] & 0xFF | (local136[0] & 0xFF) << 8;
			@Pc(152) Class6_Sub4 local152 = null;
			for (@Pc(157) Class6_Sub4 local157 = (Class6_Sub4) local111.method5594(); local157 != null; local157 = (Class6_Sub4) local111.method5582()) {
				if (local150 == local157.anInt305) {
					local152 = local157;
					break;
				}
			}
			if (local152 == null) {
				local152 = new Class6_Sub4(local150, Static28.aClass53_25.method1014(local150));
				local111.method5585(local152);
			}
			this.aClass164Array1[local127[local129]] = new Class164(local136, local152);
		}
		this.aByteArrayArray10 = null;
		return true;
	}
}
