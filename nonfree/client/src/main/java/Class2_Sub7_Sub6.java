import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub7_Sub6 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "[Lclient!eg;")
	public Class95[] aClass95Array1;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	private final int anInt4221;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7_Sub6(@OriginalArg(0) int arg0) {
		this.anInt4221 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	public boolean method3712(@OriginalArg(0) int arg0) {
		return this.aClass95Array1[arg0].aBoolean219;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)Z")
	public boolean method3713(@OriginalArg(0) int arg0) {
		return this.aClass95Array1[arg0].aBoolean218;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Z")
	public boolean method3714() {
		if (this.aClass95Array1 != null) {
			return true;
		}
		@Pc(33) int[] local33;
		@Pc(40) int local40;
		if (this.aByteArrayArray10 == null) {
			@Pc(13) Class238 local13 = Static187.aClass238_90;
			synchronized (Static187.aClass238_90) {
				if (!Static187.aClass238_90.method5565(this.anInt4221)) {
					return false;
				}
				local33 = Static187.aClass238_90.method5595(this.anInt4221);
				this.aByteArrayArray10 = new byte[local33.length][];
				for (local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray10[local40] = Static187.aClass238_90.method5567(local33[local40], this.anInt4221);
				}
			}
		}
		@Pc(72) boolean local72 = true;
		for (@Pc(79) int local79 = 0; local79 < this.aByteArrayArray10.length; local79++) {
			@Pc(85) byte[] local85 = this.aByteArrayArray10[local79];
			@Pc(90) Class2_Sub17 local90 = new Class2_Sub17(local85);
			local90.anInt3378 = 1;
			local40 = local90.method2825();
			@Pc(99) Class238 local99 = Static567.aClass238_265;
			synchronized (Static567.aClass238_265) {
				local72 &= Static567.aClass238_265.method5568(local40);
			}
		}
		if (!local72) {
			return false;
		}
		@Pc(132) Class114 local132 = new Class114();
		@Pc(134) Class238 local134 = Static187.aClass238_90;
		synchronized (Static187.aClass238_90) {
			@Pc(142) int local142 = Static187.aClass238_90.method5592(this.anInt4221);
			this.aClass95Array1 = new Class95[local142];
			local33 = Static187.aClass238_90.method5595(this.anInt4221);
		}
		for (local40 = 0; local40 < local33.length; local40++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray10[local40];
			@Pc(171) Class2_Sub17 local171 = new Class2_Sub17(local166);
			local171.anInt3378 = 1;
			@Pc(180) int local180 = local171.method2825();
			@Pc(182) Class2_Sub46 local182 = null;
			for (@Pc(187) Class2_Sub46 local187 = (Class2_Sub46) local132.method2772(); local187 != null; local187 = (Class2_Sub46) local132.method2762()) {
				if (local187.anInt10083 == local180) {
					local182 = local187;
					break;
				}
			}
			if (local182 == null) {
				@Pc(206) Class238 local206 = Static567.aClass238_265;
				synchronized (Static567.aClass238_265) {
					local182 = new Class2_Sub46(local180, Static567.aClass238_265.method5580(local180));
				}
				local132.method2771(local182);
			}
			this.aClass95Array1[local33[local40]] = new Class95(local166, local182);
		}
		this.aByteArrayArray10 = null;
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(IB)Z")
	public boolean method3717(@OriginalArg(0) int arg0) {
		return this.aClass95Array1[arg0].aBoolean217;
	}
}
