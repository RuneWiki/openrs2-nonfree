import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class4_Sub4_Sub15 extends Class4_Sub4 {

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "[Lclient!ui;")
	public Class200[] aClass200Array1;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	private final int anInt5439;

	static {
		new Class159(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class4_Sub4_Sub15(@OriginalArg(0) int arg0) {
		this.anInt5439 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Z")
	public boolean method4670(@OriginalArg(0) int arg0) {
		return this.aClass200Array1[arg0].aBoolean455;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)Z")
	public boolean method4672() {
		if (this.aClass200Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray21 == null) {
			if (!Static185.aClass193_68.method5042(this.anInt5439)) {
				return false;
			}
			@Pc(27) int[] local27 = Static185.aClass193_68.method5038(this.anInt5439);
			this.aByteArrayArray21 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray21[local34] = Static185.aClass193_68.method5047(this.anInt5439, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(87) int local87;
		for (local34 = 0; local34 < this.aByteArrayArray21.length; local34++) {
			@Pc(73) byte[] local73 = this.aByteArrayArray21[local34];
			local87 = (local73[0] & 0xFF) << 8 | local73[1] & 0xFF;
			local59 &= Static335.aClass193_104.method5064(local87);
		}
		if (!local59) {
			return false;
		}
		@Pc(112) Class116 local112 = new Class116();
		local87 = Static185.aClass193_68.method5055(this.anInt5439);
		this.aClass200Array1 = new Class200[local87];
		@Pc(128) int[] local128 = Static185.aClass193_68.method5038(this.anInt5439);
		for (@Pc(130) int local130 = 0; local130 < local128.length; local130++) {
			@Pc(137) byte[] local137 = this.aByteArrayArray21[local130];
			@Pc(151) int local151 = local137[1] & 0xFF | (local137[0] & 0xFF) << 8;
			@Pc(153) Class4_Sub41 local153 = null;
			for (@Pc(158) Class4_Sub41 local158 = (Class4_Sub41) local112.method3270(); local158 != null; local158 = (Class4_Sub41) local112.method3272()) {
				if (local158.anInt6168 == local151) {
					local153 = local158;
					break;
				}
			}
			if (local153 == null) {
				local153 = new Class4_Sub41(local151, Static335.aClass193_104.method5049(local151));
				local112.method3274(local153);
			}
			this.aClass200Array1[local128[local130]] = new Class200(local137, local153);
		}
		this.aByteArrayArray21 = null;
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Z")
	public boolean method4673(@OriginalArg(0) int arg0) {
		return this.aClass200Array1[arg0].aBoolean456;
	}
}
