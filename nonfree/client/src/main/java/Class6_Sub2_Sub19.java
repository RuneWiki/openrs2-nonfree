import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class6_Sub2_Sub19 extends Class6_Sub2 {

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "[Lclient!sm;")
	public Class308[] aClass308Array1;

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
	private final int anInt8672;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub19(@OriginalArg(0) int arg0) {
		this.anInt8672 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)Z")
	public boolean method7102(@OriginalArg(1) int arg0) {
		return this.aClass308Array1[arg0].aBoolean580;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)Z")
	public boolean method7105() {
		if (this.aClass308Array1 != null) {
			return true;
		}
		@Pc(36) int local36;
		if (this.aByteArrayArray27 == null) {
			if (!Static453.aClass251_105.method5775(this.anInt8672)) {
				return false;
			}
			@Pc(29) int[] local29 = Static453.aClass251_105.method5752(this.anInt8672);
			this.aByteArrayArray27 = new byte[local29.length][];
			for (local36 = 0; local36 < local29.length; local36++) {
				this.aByteArrayArray27[local36] = Static453.aClass251_105.method5772(local29[local36], this.anInt8672);
			}
		}
		@Pc(57) boolean local57 = true;
		for (local36 = 0; local36 < this.aByteArrayArray27.length; local36++) {
			@Pc(66) byte[] local66 = this.aByteArrayArray27[local36];
			@Pc(71) Class6_Sub21 local71 = new Class6_Sub21(local66);
			local71.anInt7338 = 1;
			@Pc(78) int local78 = local71.method6003();
			local57 &= Static205.aClass251_60.method5782(local78);
		}
		if (!local57) {
			return false;
		}
		@Pc(105) Class361 local105 = new Class361();
		@Pc(111) int local111 = Static453.aClass251_105.method5768(this.anInt8672);
		this.aClass308Array1 = new Class308[local111];
		@Pc(121) int[] local121 = Static453.aClass251_105.method5752(this.anInt8672);
		for (@Pc(123) int local123 = 0; local123 < local121.length; local123++) {
			@Pc(130) byte[] local130 = this.aByteArrayArray27[local123];
			@Pc(135) Class6_Sub21 local135 = new Class6_Sub21(local130);
			local135.anInt7338 = 1;
			@Pc(142) int local142 = local135.method6003();
			@Pc(144) Class6_Sub38 local144 = null;
			for (@Pc(149) Class6_Sub38 local149 = (Class6_Sub38) local105.method7838(); local149 != null; local149 = (Class6_Sub38) local105.method7845()) {
				if (local149.anInt6952 == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class6_Sub38(local142, Static205.aClass251_60.method5761(local142));
				local105.method7833(local144);
			}
			this.aClass308Array1[local121[local123]] = new Class308(local130, local144);
		}
		this.aByteArrayArray27 = null;
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)Z")
	public boolean method7106(@OriginalArg(1) int arg0) {
		return this.aClass308Array1[arg0].aBoolean581;
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(II)Z")
	public boolean method7107(@OriginalArg(1) int arg0) {
		return this.aClass308Array1[arg0].aBoolean579;
	}
}
