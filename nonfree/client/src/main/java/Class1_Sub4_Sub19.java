import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub4_Sub19 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "[Lclient!ea;")
	public Class49[] aClass49Array1;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	private final int anInt5240;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub4_Sub19(@OriginalArg(0) int arg0) {
		this.anInt5240 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
	public boolean method4587(@OriginalArg(0) int arg0) {
		return this.aClass49Array1[arg0].aBoolean175;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Z")
	public boolean method4590() {
		if (this.aClass49Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray15 == null) {
			if (!Static73.aClass216_28.method5667(this.anInt5240)) {
				return false;
			}
			@Pc(27) int[] local27 = Static73.aClass216_28.method5664(this.anInt5240);
			this.aByteArrayArray15 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray15[local34] = Static73.aClass216_28.method5648(this.anInt5240, local27[local34]);
			}
		}
		@Pc(57) boolean local57 = true;
		@Pc(80) int local80;
		for (local34 = 0; local34 < this.aByteArrayArray15.length; local34++) {
			@Pc(66) byte[] local66 = this.aByteArrayArray15[local34];
			local80 = (local66[0] & 0xFF) << 8 | local66[1] & 0xFF;
			local57 &= Static259.aClass216_47.method5651(local80);
		}
		if (!local57) {
			return false;
		}
		@Pc(110) Class16 local110 = new Class16();
		local80 = Static73.aClass216_28.method5675(this.anInt5240);
		this.aClass49Array1 = new Class49[local80];
		@Pc(126) int[] local126 = Static73.aClass216_28.method5664(this.anInt5240);
		for (@Pc(128) int local128 = 0; local128 < local126.length; local128++) {
			@Pc(135) byte[] local135 = this.aByteArrayArray15[local128];
			@Pc(149) int local149 = (local135[0] & 0xFF) << 8 | local135[1] & 0xFF;
			@Pc(151) Class1_Sub36 local151 = null;
			for (@Pc(156) Class1_Sub36 local156 = (Class1_Sub36) local110.method410(); local156 != null; local156 = (Class1_Sub36) local110.method419()) {
				if (local156.anInt6146 == local149) {
					local151 = local156;
					break;
				}
			}
			if (local151 == null) {
				local151 = new Class1_Sub36(local149, Static259.aClass216_47.method5659(local149));
				local110.method416(local151);
			}
			this.aClass49Array1[local126[local128]] = new Class49(local135, local151);
		}
		this.aByteArrayArray15 = null;
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)Z")
	public boolean method4593(@OriginalArg(1) int arg0) {
		return this.aClass49Array1[arg0].aBoolean174;
	}
}
