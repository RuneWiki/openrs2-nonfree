import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 {

	@OriginalMember(owner = "client!bea", name = "r", descriptor = "[Lclient!vg;")
	public Class372[] aClass372Array1;

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
	private final int anInt870;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) int arg0) {
		this.anInt870 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(B)Z")
	public boolean method768() {
		if (this.aClass372Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray2 == null) {
			@Pc(15) Class362 local15 = Static445.aClass362_99;
			synchronized (Static445.aClass362_99) {
				if (!Static445.aClass362_99.method8338(this.anInt870)) {
					return false;
				}
				local35 = Static445.aClass362_99.method8362(this.anInt870);
				this.aByteArrayArray2 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray2[local42] = Static445.aClass362_99.method8368(this.anInt870, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		@Pc(92) Class362 local92;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray2.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray2[local71];
			@Pc(83) Class3_Sub4 local83 = new Class3_Sub4(local78);
			local83.anInt9739 = 1;
			local42 = local83.method7951();
			local92 = Static80.aClass362_16;
			synchronized (Static80.aClass362_16) {
				local69 &= Static80.aClass362_16.method8365(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(121) Class302 local121 = new Class302();
		local92 = Static445.aClass362_99;
		@Pc(131) int local131;
		synchronized (Static445.aClass362_99) {
			local131 = Static445.aClass362_99.method8355(this.anInt870);
			this.aClass372Array1 = new Class372[local131];
			local35 = Static445.aClass362_99.method8362(this.anInt870);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray2[local42];
			@Pc(170) Class3_Sub4 local170 = new Class3_Sub4(local165);
			local170.anInt9739 = 1;
			local131 = local170.method7951();
			@Pc(179) Class3_Sub10 local179 = null;
			for (@Pc(184) Class3_Sub10 local184 = (Class3_Sub10) local121.method6603(); local184 != null; local184 = (Class3_Sub10) local121.method6605()) {
				if (local131 == local184.anInt1421) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(204) Class362 local204 = Static80.aClass362_16;
				synchronized (Static80.aClass362_16) {
					local179 = new Class3_Sub10(local131, Static80.aClass362_16.method8356(local131));
				}
				local121.method6613(local179);
			}
			this.aClass372Array1[local35[local42]] = new Class372(local165, local179);
		}
		this.aByteArrayArray2 = null;
		return true;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
	public boolean method769(@OriginalArg(0) int arg0) {
		return this.aClass372Array1[arg0].aBoolean728;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)Z")
	public boolean method770(@OriginalArg(0) int arg0) {
		return this.aClass372Array1[arg0].aBoolean729;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)Z")
	public boolean method773(@OriginalArg(0) int arg0) {
		return this.aClass372Array1[arg0].aBoolean727;
	}
}
