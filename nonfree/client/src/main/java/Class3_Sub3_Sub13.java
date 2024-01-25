import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class3_Sub3_Sub13 extends Class3_Sub3 {

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "[Lclient!dc;")
	public Class46[] aClass46Array1;

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
	private final int anInt3712;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub13(@OriginalArg(0) int arg0) {
		this.anInt3712 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)Z")
	public boolean method3081(@OriginalArg(1) int arg0) {
		return this.aClass46Array1[arg0].aBoolean121;
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(II)Z")
	public boolean method3082(@OriginalArg(1) int arg0) {
		return this.aClass46Array1[arg0].aBoolean120;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(II)Z")
	public boolean method3084(@OriginalArg(0) int arg0) {
		return this.aClass46Array1[arg0].aBoolean119;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Z")
	public boolean method3085() {
		if (this.aClass46Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray12 == null) {
			if (!Static113.aClass56_82.method1379(this.anInt3712)) {
				return false;
			}
			@Pc(25) int[] local25 = Static113.aClass56_82.method1363(this.anInt3712);
			this.aByteArrayArray12 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray12[local32] = Static113.aClass56_82.method1384(this.anInt3712, local25[local32]);
			}
		}
		@Pc(56) boolean local56 = true;
		@Pc(78) int local78;
		for (local32 = 0; local32 < this.aByteArrayArray12.length; local32++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray12[local32];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local56 &= Static211.aClass56_52.method1365(local78);
		}
		if (!local56) {
			return false;
		}
		@Pc(99) Class229 local99 = new Class229();
		local78 = Static113.aClass56_82.method1373(this.anInt3712);
		this.aClass46Array1 = new Class46[local78];
		@Pc(127) int[] local127 = Static113.aClass56_82.method1363(this.anInt3712);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(135) byte[] local135 = this.aByteArrayArray12[local129];
			@Pc(149) int local149 = (local135[0] & 0xFF) << 8 | local135[1] & 0xFF;
			@Pc(151) Class3_Sub39 local151 = null;
			for (@Pc(156) Class3_Sub39 local156 = (Class3_Sub39) local99.method5328(); local156 != null; local156 = (Class3_Sub39) local99.method5325()) {
				if (local156.anInt6573 == local149) {
					local151 = local156;
					break;
				}
			}
			if (local151 == null) {
				local151 = new Class3_Sub39(local149, Static211.aClass56_52.method1391(local149));
				local99.method5321(local151);
			}
			this.aClass46Array1[local127[local129]] = new Class46(local135, local151);
		}
		this.aByteArrayArray12 = null;
		return true;
	}
}
