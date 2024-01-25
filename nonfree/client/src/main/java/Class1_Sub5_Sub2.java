import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[Lclient!vg;")
	public Class251[] aClass251Array1;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	private final int anInt748;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) int arg0) {
		this.anInt748 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
	public boolean method629(@OriginalArg(0) int arg0) {
		return this.aClass251Array1[arg0].aBoolean782;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)Z")
	public boolean method630(@OriginalArg(0) int arg0) {
		return this.aClass251Array1[arg0].aBoolean781;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Z")
	public boolean method631() {
		if (this.aClass251Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray3 == null) {
			if (!Static457.aClass82_106.method1832(this.anInt748)) {
				return false;
			}
			@Pc(27) int[] local27 = Static457.aClass82_106.method1839(this.anInt748);
			this.aByteArrayArray3 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray3[local34] = Static457.aClass82_106.method1817(this.anInt748, local27[local34]);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray3.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray3[local34];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local55 &= Static449.aClass82_105.method1820(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(101) Class227 local101 = new Class227();
		local78 = Static457.aClass82_106.method1823(this.anInt748);
		this.aClass251Array1 = new Class251[local78];
		@Pc(128) int[] local128 = Static457.aClass82_106.method1839(this.anInt748);
		for (@Pc(130) int local130 = 0; local130 < local128.length; local130++) {
			@Pc(137) byte[] local137 = this.aByteArrayArray3[local130];
			@Pc(151) int local151 = local137[1] & 0xFF | (local137[0] & 0xFF) << 8;
			@Pc(153) Class1_Sub37 local153 = null;
			for (@Pc(158) Class1_Sub37 local158 = (Class1_Sub37) local101.method4967(); local158 != null; local158 = (Class1_Sub37) local101.method4973()) {
				if (local158.anInt5835 == local151) {
					local153 = local158;
					break;
				}
			}
			if (local153 == null) {
				local153 = new Class1_Sub37(local151, Static449.aClass82_105.method1815(local151));
				local101.method4972(local153);
			}
			this.aClass251Array1[local128[local130]] = new Class251(local137, local153);
		}
		this.aByteArrayArray3 = null;
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Z")
	public boolean method634(@OriginalArg(0) int arg0) {
		return this.aClass251Array1[arg0].aBoolean783;
	}
}
