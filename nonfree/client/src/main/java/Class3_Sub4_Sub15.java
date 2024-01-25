import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!pha", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pha", name = "v", descriptor = "[Lclient!gea;")
	public Class129[] aClass129Array1;

	@OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
	private final int anInt8452;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub15(@OriginalArg(0) int arg0) {
		this.anInt8452 = arg0;
	}

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "(II)Z")
	public boolean method7088(@OriginalArg(1) int arg0) {
		return this.aClass129Array1[arg0].aBoolean287;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)Z")
	public boolean method7090() {
		if (this.aClass129Array1 != null) {
			return true;
		}
		@Pc(38) int[] local38;
		@Pc(45) int local45;
		if (this.aByteArrayArray14 == null) {
			@Pc(16) Class221 local16 = Static673.aClass221_159;
			synchronized (Static673.aClass221_159) {
				if (!Static673.aClass221_159.method5064(this.anInt8452)) {
					return false;
				}
				local38 = Static673.aClass221_159.method5085(this.anInt8452);
				this.aByteArrayArray14 = new byte[local38.length][];
				for (local45 = 0; local45 < local38.length; local45++) {
					this.aByteArrayArray14[local45] = Static673.aClass221_159.method5089(local38[local45], this.anInt8452);
				}
			}
		}
		@Pc(76) boolean local76 = true;
		for (@Pc(78) int local78 = 0; local78 < this.aByteArrayArray14.length; local78++) {
			@Pc(85) byte[] local85 = this.aByteArrayArray14[local78];
			@Pc(90) Class3_Sub28 local90 = new Class3_Sub28(local85);
			local90.anInt6241 = 1;
			local45 = local90.method5272();
			@Pc(99) Class221 local99 = Static365.aClass221_102;
			synchronized (Static365.aClass221_102) {
				local76 &= Static365.aClass221_102.method5068(local45);
			}
		}
		if (!local76) {
			return false;
		}
		@Pc(135) Class357 local135 = new Class357();
		@Pc(137) Class221 local137 = Static673.aClass221_159;
		synchronized (Static673.aClass221_159) {
			@Pc(145) int local145 = Static673.aClass221_159.method5065(this.anInt8452);
			this.aClass129Array1 = new Class129[local145];
			local38 = Static673.aClass221_159.method5085(this.anInt8452);
		}
		for (local45 = 0; local45 < local38.length; local45++) {
			@Pc(180) byte[] local180 = this.aByteArrayArray14[local45];
			@Pc(185) Class3_Sub28 local185 = new Class3_Sub28(local180);
			local185.anInt6241 = 1;
			@Pc(192) int local192 = local185.method5272();
			@Pc(194) Class3_Sub21 local194 = null;
			for (@Pc(199) Class3_Sub21 local199 = (Class3_Sub21) local135.method8391(); local199 != null; local199 = (Class3_Sub21) local135.method8392()) {
				if (local199.anInt2831 == local192) {
					local194 = local199;
					break;
				}
			}
			if (local194 == null) {
				@Pc(225) Class221 local225 = Static365.aClass221_102;
				synchronized (Static365.aClass221_102) {
					local194 = new Class3_Sub21(local192, Static365.aClass221_102.method5077(local192));
				}
				local135.method8401(local194);
			}
			this.aClass129Array1[local38[local45]] = new Class129(local180, local194);
		}
		this.aByteArrayArray14 = null;
		return true;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(II)Z")
	public boolean method7092(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean286;
	}

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "(II)Z")
	public boolean method7094(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean288;
	}
}
