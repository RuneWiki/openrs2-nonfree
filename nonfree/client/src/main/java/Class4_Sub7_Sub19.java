import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class4_Sub7_Sub19 extends Class4_Sub7 {

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray41;

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "[Lclient!jq;")
	public Class180[] aClass180Array1;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
	private final int anInt9721;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V")
	public Class4_Sub7_Sub19(@OriginalArg(0) int arg0) {
		this.anInt9721 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)Z")
	public boolean method7965() {
		if (this.aClass180Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray41 == null) {
			if (!Static143.aClass31_31.method678(this.anInt9721)) {
				return false;
			}
			@Pc(27) int[] local27 = Static143.aClass31_31.method664(this.anInt9721);
			this.aByteArrayArray41 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray41[local34] = Static143.aClass31_31.method667(this.anInt9721, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		for (local34 = 0; local34 < this.aByteArrayArray41.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray41[local34];
			@Pc(73) Class4_Sub9 local73 = new Class4_Sub9(local68);
			local73.anInt7219 = 1;
			@Pc(80) int local80 = local73.method5982();
			local59 &= Static47.aClass31_13.method679(local80);
		}
		if (!local59) {
			return false;
		}
		@Pc(105) Class124 local105 = new Class124();
		@Pc(111) int local111 = Static143.aClass31_31.method657(this.anInt9721);
		this.aClass180Array1 = new Class180[local111];
		@Pc(121) int[] local121 = Static143.aClass31_31.method664(this.anInt9721);
		for (@Pc(123) int local123 = 0; local123 < local121.length; local123++) {
			@Pc(130) byte[] local130 = this.aByteArrayArray41[local123];
			@Pc(135) Class4_Sub9 local135 = new Class4_Sub9(local130);
			local135.anInt7219 = 1;
			@Pc(142) int local142 = local135.method5982();
			@Pc(144) Class4_Sub42 local144 = null;
			for (@Pc(149) Class4_Sub42 local149 = (Class4_Sub42) local105.method3267(); local149 != null; local149 = (Class4_Sub42) local105.method3273()) {
				if (local142 == local149.anInt7813) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class4_Sub42(local142, Static47.aClass31_13.method661(local142));
				local105.method3275(local144);
			}
			this.aClass180Array1[local121[local123]] = new Class180(local130, local144);
		}
		this.aByteArrayArray41 = null;
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)Z")
	public boolean method7967(@OriginalArg(0) int arg0) {
		return this.aClass180Array1[arg0].aBoolean378;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Z")
	public boolean method7969(@OriginalArg(1) int arg0) {
		return this.aClass180Array1[arg0].aBoolean376;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(ZI)Z")
	public boolean method7970(@OriginalArg(1) int arg0) {
		return this.aClass180Array1[arg0].aBoolean377;
	}
}
