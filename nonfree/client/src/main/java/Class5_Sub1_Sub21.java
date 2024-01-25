import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class5_Sub1_Sub21 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!vu", name = "H", descriptor = "[Lclient!le;")
	public Class218[] aClass218Array1;

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
	private final int anInt10618;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub21(@OriginalArg(0) int arg0) {
		this.anInt10618 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(II)Z")
	public boolean method8958(@OriginalArg(0) int arg0) {
		return this.aClass218Array1[arg0].aBoolean368;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)Z")
	public boolean method8961() {
		if (this.aClass218Array1 != null) {
			return true;
		}
		@Pc(38) int[] local38;
		@Pc(45) int local45;
		if (this.aByteArrayArray25 == null) {
			@Pc(16) Class126 local16 = Static7.aClass126_4;
			synchronized (Static7.aClass126_4) {
				if (!Static7.aClass126_4.method3084(this.anInt10618)) {
					return false;
				}
				local38 = Static7.aClass126_4.method3083(this.anInt10618);
				this.aByteArrayArray25 = new byte[local38.length][];
				for (local45 = 0; local45 < local38.length; local45++) {
					this.aByteArrayArray25[local45] = Static7.aClass126_4.method3086(local38[local45], this.anInt10618);
				}
			}
		}
		@Pc(80) boolean local80 = true;
		for (@Pc(82) int local82 = 0; local82 < this.aByteArrayArray25.length; local82++) {
			@Pc(89) byte[] local89 = this.aByteArrayArray25[local82];
			@Pc(94) Class5_Sub36 local94 = new Class5_Sub36(local89);
			local94.anInt8456 = 1;
			local45 = local94.method7333();
			@Pc(103) Class126 local103 = Static433.aClass126_200;
			synchronized (Static433.aClass126_200) {
				local80 &= Static433.aClass126_200.method3077(local45);
			}
		}
		if (!local80) {
			return false;
		}
		@Pc(135) Class20 local135 = new Class20();
		@Pc(137) Class126 local137 = Static7.aClass126_4;
		synchronized (Static7.aClass126_4) {
			@Pc(145) int local145 = Static7.aClass126_4.method3062(this.anInt10618);
			this.aClass218Array1 = new Class218[local145];
			local38 = Static7.aClass126_4.method3083(this.anInt10618);
		}
		for (local45 = 0; local45 < local38.length; local45++) {
			@Pc(179) byte[] local179 = this.aByteArrayArray25[local45];
			@Pc(184) Class5_Sub36 local184 = new Class5_Sub36(local179);
			local184.anInt8456 = 1;
			@Pc(191) int local191 = local184.method7333();
			@Pc(193) Class5_Sub35 local193 = null;
			for (@Pc(198) Class5_Sub35 local198 = (Class5_Sub35) local135.method378(); local198 != null; local198 = (Class5_Sub35) local135.method366()) {
				if (local198.anInt5753 == local191) {
					local193 = local198;
					break;
				}
			}
			if (local193 == null) {
				@Pc(228) Class126 local228 = Static433.aClass126_200;
				synchronized (Static433.aClass126_200) {
					local193 = new Class5_Sub35(local191, Static433.aClass126_200.method3069(local191));
				}
				local135.method370(local193);
			}
			this.aClass218Array1[local38[local45]] = new Class218(local179, local193);
		}
		this.aByteArrayArray25 = null;
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)Z")
	public boolean method8962(@OriginalArg(0) int arg0) {
		return this.aClass218Array1[arg0].aBoolean369;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Z")
	public boolean method8965(@OriginalArg(0) int arg0) {
		return this.aClass218Array1[arg0].aBoolean367;
	}
}
