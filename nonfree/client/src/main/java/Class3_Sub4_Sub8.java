import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "[Lclient!cv;")
	public Class60[] aClass60Array1;

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
	private final int anInt3368;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub8(@OriginalArg(0) int arg0) {
		this.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BI)Z")
	public boolean method3036(@OriginalArg(1) int arg0) {
		return this.aClass60Array1[arg0].aBoolean139;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Z")
	public boolean method3037(@OriginalArg(0) int arg0) {
		return this.aClass60Array1[arg0].aBoolean138;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Z")
	public boolean method3038() {
		if (this.aClass60Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray8 == null) {
			@Pc(15) Class196 local15 = Static626.aClass196_130;
			synchronized (Static626.aClass196_130) {
				if (!Static626.aClass196_130.method5119(this.anInt3368)) {
					return false;
				}
				local35 = Static626.aClass196_130.method5123(this.anInt3368);
				this.aByteArrayArray8 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray8[local42] = Static626.aClass196_130.method5102(this.anInt3368, local35[local42]);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray8.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray8[local75];
			@Pc(87) Class3_Sub3 local87 = new Class3_Sub3(local82);
			local87.anInt4736 = 1;
			local42 = local87.method4221();
			@Pc(96) Class196 local96 = Static383.aClass196_75;
			synchronized (Static383.aClass196_75) {
				local73 &= Static383.aClass196_75.method5111(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(131) Class223 local131 = new Class223();
		@Pc(133) Class196 local133 = Static626.aClass196_130;
		synchronized (Static626.aClass196_130) {
			@Pc(141) int local141 = Static626.aClass196_130.method5118(this.anInt3368);
			this.aClass60Array1 = new Class60[local141];
			local35 = Static626.aClass196_130.method5123(this.anInt3368);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray8[local42];
			@Pc(171) Class3_Sub3 local171 = new Class3_Sub3(local166);
			local171.anInt4736 = 1;
			@Pc(178) int local178 = local171.method4221();
			@Pc(180) Class3_Sub17 local180 = null;
			for (@Pc(185) Class3_Sub17 local185 = (Class3_Sub17) local131.method5874(); local185 != null; local185 = (Class3_Sub17) local131.method5870()) {
				if (local178 == local185.anInt2561) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(209) Class196 local209 = Static383.aClass196_75;
				synchronized (Static383.aClass196_75) {
					local180 = new Class3_Sub17(local178, Static383.aClass196_75.method5113(local178));
				}
				local131.method5868(local180);
			}
			this.aClass60Array1[local35[local42]] = new Class60(local166, local180);
		}
		this.aByteArrayArray8 = null;
		return true;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(IB)Z")
	public boolean method3040(@OriginalArg(0) int arg0) {
		return this.aClass60Array1[arg0].aBoolean140;
	}
}
