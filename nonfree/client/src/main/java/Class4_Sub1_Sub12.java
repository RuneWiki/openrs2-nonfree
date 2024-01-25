import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "[Lclient!rq;")
	public Class209[] aClass209Array1;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
	private final int anInt4766;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V")
	public Class4_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt4766 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Z")
	public boolean method3625(@OriginalArg(1) int arg0) {
		return this.aClass209Array1[arg0].aBoolean430;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Z")
	public boolean method3627(@OriginalArg(0) int arg0) {
		return this.aClass209Array1[arg0].aBoolean428;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
	public boolean method3628(@OriginalArg(0) int arg0) {
		return this.aClass209Array1[arg0].aBoolean429;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
	public boolean method3629() {
		if (this.aClass209Array1 != null) {
			return true;
		}
		@Pc(39) int local39;
		if (this.aByteArrayArray11 == null) {
			if (!Static427.aClass166_283.method3680(this.anInt4766)) {
				return false;
			}
			@Pc(32) int[] local32 = Static427.aClass166_283.method3687(this.anInt4766);
			this.aByteArrayArray11 = new byte[local32.length][];
			for (local39 = 0; local39 < local32.length; local39++) {
				this.aByteArrayArray11[local39] = Static427.aClass166_283.method3696(local32[local39], this.anInt4766);
			}
		}
		@Pc(60) boolean local60 = true;
		@Pc(83) int local83;
		for (local39 = 0; local39 < this.aByteArrayArray11.length; local39++) {
			@Pc(69) byte[] local69 = this.aByteArrayArray11[local39];
			local83 = (local69[0] & 0xFF) << 8 | local69[1] & 0xFF;
			local60 &= Static375.aClass166_208.method3670(local83);
		}
		if (!local60) {
			return false;
		}
		@Pc(108) Class258 local108 = new Class258();
		local83 = Static427.aClass166_283.method3691(this.anInt4766);
		this.aClass209Array1 = new Class209[local83];
		@Pc(124) int[] local124 = Static427.aClass166_283.method3687(this.anInt4766);
		for (@Pc(126) int local126 = 0; local126 < local124.length; local126++) {
			@Pc(133) byte[] local133 = this.aByteArrayArray11[local126];
			@Pc(147) int local147 = (local133[0] & 0xFF) << 8 | local133[1] & 0xFF;
			@Pc(149) Class4_Sub29 local149 = null;
			for (@Pc(154) Class4_Sub29 local154 = (Class4_Sub29) local108.method5538(); local154 != null; local154 = (Class4_Sub29) local108.method5528()) {
				if (local154.anInt4421 == local147) {
					local149 = local154;
					break;
				}
			}
			if (local149 == null) {
				local149 = new Class4_Sub29(local147, Static375.aClass166_208.method3684(local147));
				local108.method5526(local149);
			}
			this.aClass209Array1[local124[local126]] = new Class209(local133, local149);
		}
		this.aByteArrayArray11 = null;
		return true;
	}
}
