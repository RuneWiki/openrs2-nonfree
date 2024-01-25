import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class5_Sub4_Sub2 extends Class5_Sub4 {

	@OriginalMember(owner = "client!be", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "[Lclient!vr;")
	public Class365[] aClass365Array1;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	private final int anInt644;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	public Class5_Sub4_Sub2(@OriginalArg(0) int arg0) {
		this.anInt644 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Z")
	public boolean method652(@OriginalArg(0) int arg0) {
		return this.aClass365Array1[arg0].aBoolean816;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z")
	public boolean method653() {
		if (this.aClass365Array1 != null) {
			return true;
		}
		@Pc(37) int[] local37;
		@Pc(44) int local44;
		if (this.aByteArrayArray1 == null) {
			@Pc(15) Class384 local15 = Static555.aClass384_103;
			synchronized (Static555.aClass384_103) {
				if (!Static555.aClass384_103.method8869(this.anInt644)) {
					return false;
				}
				local37 = Static555.aClass384_103.method8881(this.anInt644);
				this.aByteArrayArray1 = new byte[local37.length][];
				for (local44 = 0; local44 < local37.length; local44++) {
					this.aByteArrayArray1[local44] = Static555.aClass384_103.method8885(this.anInt644, local37[local44]);
				}
			}
		}
		@Pc(75) boolean local75 = true;
		for (@Pc(77) int local77 = 0; local77 < this.aByteArrayArray1.length; local77++) {
			@Pc(84) byte[] local84 = this.aByteArrayArray1[local77];
			@Pc(89) Class5_Sub12 local89 = new Class5_Sub12(local84);
			local89.anInt10154 = 1;
			local44 = local89.method8631();
			@Pc(98) Class384 local98 = Static183.aClass384_46;
			synchronized (Static183.aClass384_46) {
				local75 &= Static183.aClass384_46.method8883(local44);
			}
		}
		if (!local75) {
			return false;
		}
		@Pc(131) Class306 local131 = new Class306();
		@Pc(133) Class384 local133 = Static555.aClass384_103;
		synchronized (Static555.aClass384_103) {
			@Pc(141) int local141 = Static555.aClass384_103.method8862(this.anInt644);
			this.aClass365Array1 = new Class365[local141];
			local37 = Static555.aClass384_103.method8881(this.anInt644);
		}
		for (local44 = 0; local44 < local37.length; local44++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray1[local44];
			@Pc(171) Class5_Sub12 local171 = new Class5_Sub12(local166);
			local171.anInt10154 = 1;
			@Pc(178) int local178 = local171.method8631();
			@Pc(180) Class5_Sub21 local180 = null;
			for (@Pc(187) Class5_Sub21 local187 = (Class5_Sub21) local131.method7313(); local187 != null; local187 = (Class5_Sub21) local131.method7301()) {
				if (local187.anInt4010 == local178) {
					local180 = local187;
					break;
				}
			}
			if (local180 == null) {
				@Pc(211) Class384 local211 = Static183.aClass384_46;
				synchronized (Static183.aClass384_46) {
					local180 = new Class5_Sub21(local178, Static183.aClass384_46.method8893(local178));
				}
				local131.method7303(local180);
			}
			this.aClass365Array1[local37[local44]] = new Class365(local166, local180);
		}
		this.aByteArrayArray1 = null;
		return true;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Z")
	public boolean method654(@OriginalArg(1) int arg0) {
		return this.aClass365Array1[arg0].aBoolean817;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Z")
	public boolean method657(@OriginalArg(1) int arg0) {
		return this.aClass365Array1[arg0].aBoolean815;
	}
}
