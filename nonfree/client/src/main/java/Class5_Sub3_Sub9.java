import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class5_Sub3_Sub9 extends Class5_Sub3 {

	@OriginalMember(owner = "client!is", name = "t", descriptor = "[Lclient!uo;")
	public Class354[] aClass354Array1;

	@OriginalMember(owner = "client!is", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!is", name = "w", descriptor = "I")
	private final int anInt4965;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3_Sub9(@OriginalArg(0) int arg0) {
		this.anInt4965 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)Z")
	public boolean method4151(@OriginalArg(0) int arg0) {
		return this.aClass354Array1[arg0].aBoolean845;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(II)Z")
	public boolean method4152(@OriginalArg(0) int arg0) {
		return this.aClass354Array1[arg0].aBoolean846;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Z")
	public boolean method4155() {
		if (this.aClass354Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray14 == null) {
			@Pc(13) Class390 local13 = Static304.aClass390_76;
			synchronized (Static304.aClass390_76) {
				if (!Static304.aClass390_76.method8931(this.anInt4965)) {
					return false;
				}
				@Pc(33) int[] local33 = Static304.aClass390_76.method8900(this.anInt4965);
				this.aByteArrayArray14 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray14[local40] = Static304.aClass390_76.method8914(this.anInt4965, local33[local40]);
				}
			}
		}
		@Pc(74) boolean local74 = true;
		@Pc(94) int local94;
		for (@Pc(76) int local76 = 0; local76 < this.aByteArrayArray14.length; local76++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray14[local76];
			@Pc(87) Class5_Sub41 local87 = new Class5_Sub41(local82);
			local87.anInt9230 = 1;
			local94 = local87.method7860();
			@Pc(96) Class390 local96 = Static614.aClass390_119;
			synchronized (Static614.aClass390_119) {
				local74 &= Static614.aClass390_119.method8905(local94);
			}
		}
		if (!local74) {
			return false;
		}
		@Pc(129) Class114 local129 = new Class114();
		@Pc(131) Class390 local131 = Static304.aClass390_76;
		@Pc(149) int[] local149;
		synchronized (Static304.aClass390_76) {
			@Pc(139) int local139 = Static304.aClass390_76.method8913(this.anInt4965);
			this.aClass354Array1 = new Class354[local139];
			local149 = Static304.aClass390_76.method8900(this.anInt4965);
		}
		for (local94 = 0; local94 < local149.length; local94++) {
			@Pc(163) byte[] local163 = this.aByteArrayArray14[local94];
			@Pc(168) Class5_Sub41 local168 = new Class5_Sub41(local163);
			local168.anInt9230 = 1;
			@Pc(175) int local175 = local168.method7860();
			@Pc(177) Class5_Sub55 local177 = null;
			for (@Pc(182) Class5_Sub55 local182 = (Class5_Sub55) local129.method2805(); local182 != null; local182 = (Class5_Sub55) local129.method2814()) {
				if (local175 == local182.anInt10636) {
					local177 = local182;
					break;
				}
			}
			if (local177 == null) {
				@Pc(205) Class390 local205 = Static614.aClass390_119;
				synchronized (Static614.aClass390_119) {
					local177 = new Class5_Sub55(local175, Static614.aClass390_119.method8923(local175));
				}
				local129.method2807(local177);
			}
			this.aClass354Array1[local149[local94]] = new Class354(local163, local177);
		}
		this.aByteArrayArray14 = null;
		return true;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(II)Z")
	public boolean method4156(@OriginalArg(0) int arg0) {
		return this.aClass354Array1[arg0].aBoolean847;
	}
}
