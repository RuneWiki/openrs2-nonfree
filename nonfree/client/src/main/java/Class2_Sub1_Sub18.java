import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!sk", name = "K", descriptor = "[Lclient!aw;")
	public Class25[] aClass25Array1;

	@OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
	private final int anInt9611;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub1_Sub18(@OriginalArg(0) int arg0) {
		this.anInt9611 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Z")
	public boolean method8432(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0].aBoolean31;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(II)Z")
	public boolean method8433(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0].aBoolean30;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(BI)Z")
	public boolean method8434(@OriginalArg(1) int arg0) {
		return this.aClass25Array1[arg0].aBoolean29;
	}

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)Z")
	public boolean method8435() {
		if (this.aClass25Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray21 == null) {
			@Pc(15) Class124 local15 = Static55.aClass124_15;
			synchronized (Static55.aClass124_15) {
				if (!Static55.aClass124_15.method3608(this.anInt9611)) {
					return false;
				}
				local35 = Static55.aClass124_15.method3634(this.anInt9611);
				this.aByteArrayArray21 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray21[local42] = Static55.aClass124_15.method3641(this.anInt9611, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray21.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray21[local71];
			@Pc(83) Class2_Sub8 local83 = new Class2_Sub8(local78);
			local83.anInt5725 = 1;
			local42 = local83.method5211();
			@Pc(92) Class124 local92 = Static295.aClass124_66;
			synchronized (Static295.aClass124_66) {
				local69 &= Static295.aClass124_66.method3627(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(121) Class271 local121 = new Class271();
		@Pc(123) Class124 local123 = Static55.aClass124_15;
		synchronized (Static55.aClass124_15) {
			@Pc(131) int local131 = Static55.aClass124_15.method3629(this.anInt9611);
			this.aClass25Array1 = new Class25[local131];
			local35 = Static55.aClass124_15.method3634(this.anInt9611);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(161) byte[] local161 = this.aByteArrayArray21[local42];
			@Pc(166) Class2_Sub8 local166 = new Class2_Sub8(local161);
			local166.anInt5725 = 1;
			@Pc(173) int local173 = local166.method5211();
			@Pc(175) Class2_Sub51 local175 = null;
			for (@Pc(180) Class2_Sub51 local180 = (Class2_Sub51) local121.method7177(); local180 != null; local180 = (Class2_Sub51) local121.method7175()) {
				if (local173 == local180.anInt10883) {
					local175 = local180;
					break;
				}
			}
			if (local175 == null) {
				@Pc(200) Class124 local200 = Static295.aClass124_66;
				synchronized (Static295.aClass124_66) {
					local175 = new Class2_Sub51(local173, Static295.aClass124_66.method3610(local173));
				}
				local121.method7174(local175);
			}
			this.aClass25Array1[local35[local42]] = new Class25(local161, local175);
		}
		this.aByteArrayArray21 = null;
		return true;
	}
}
