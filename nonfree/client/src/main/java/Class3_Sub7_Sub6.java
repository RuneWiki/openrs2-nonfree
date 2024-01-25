import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class3_Sub7_Sub6 extends Class3_Sub7 {

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "[Lclient!np;")
	public Class268[] aClass268Array1;

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
	private final int anInt2481;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub6(@OriginalArg(0) int arg0) {
		this.anInt2481 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)Z")
	public boolean method2271(@OriginalArg(0) int arg0) {
		return this.aClass268Array1[arg0].aBoolean460;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)Z")
	public boolean method2272(@OriginalArg(1) int arg0) {
		return this.aClass268Array1[arg0].aBoolean458;
	}

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "(I)Z")
	public boolean method2273() {
		if (this.aClass268Array1 != null) {
			return true;
		}
		@Pc(36) int[] local36;
		@Pc(43) int local43;
		if (this.aByteArrayArray2 == null) {
			@Pc(16) Class182 local16 = Static524.aClass182_104;
			synchronized (Static524.aClass182_104) {
				if (!Static524.aClass182_104.method3957(this.anInt2481)) {
					return false;
				}
				local36 = Static524.aClass182_104.method3954(this.anInt2481);
				this.aByteArrayArray2 = new byte[local36.length][];
				for (local43 = 0; local43 < local36.length; local43++) {
					this.aByteArrayArray2[local43] = Static524.aClass182_104.method3985(local36[local43], this.anInt2481);
				}
			}
		}
		@Pc(78) boolean local78 = true;
		for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray2.length; local88++) {
			@Pc(95) byte[] local95 = this.aByteArrayArray2[local88];
			@Pc(100) Class3_Sub2 local100 = new Class3_Sub2(local95);
			local100.anInt2178 = 1;
			local43 = local100.method2028(-14795);
			@Pc(109) Class182 local109 = Static89.aClass182_23;
			synchronized (Static89.aClass182_23) {
				local78 &= Static89.aClass182_23.method3964(local43);
			}
		}
		if (!local78) {
			return false;
		}
		@Pc(145) Class342 local145 = new Class342();
		@Pc(147) Class182 local147 = Static524.aClass182_104;
		synchronized (Static524.aClass182_104) {
			@Pc(155) int local155 = Static524.aClass182_104.method3970(this.anInt2481);
			this.aClass268Array1 = new Class268[local155];
			local36 = Static524.aClass182_104.method3954(this.anInt2481);
		}
		for (local43 = 0; local43 < local36.length; local43++) {
			@Pc(182) byte[] local182 = this.aByteArrayArray2[local43];
			@Pc(187) Class3_Sub2 local187 = new Class3_Sub2(local182);
			local187.anInt2178 = 1;
			@Pc(194) int local194 = local187.method2028(-14795);
			@Pc(196) Class3_Sub53 local196 = null;
			for (@Pc(201) Class3_Sub53 local201 = (Class3_Sub53) local145.method7644(); local201 != null; local201 = (Class3_Sub53) local145.method7650()) {
				if (local201.anInt8954 == local194) {
					local196 = local201;
					break;
				}
			}
			if (local196 == null) {
				@Pc(231) Class182 local231 = Static89.aClass182_23;
				synchronized (Static89.aClass182_23) {
					local196 = new Class3_Sub53(local194, Static89.aClass182_23.method3961(local194));
				}
				local145.method7654(local196);
			}
			this.aClass268Array1[local36[local43]] = new Class268(local182, local196);
		}
		this.aByteArrayArray2 = null;
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Z")
	public boolean method2275(@OriginalArg(0) int arg0) {
		return this.aClass268Array1[arg0].aBoolean459;
	}
}
