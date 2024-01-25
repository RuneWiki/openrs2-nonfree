import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class99 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
	public final int[] anIntArray169 = new int[3];

	@OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
	public final int[] anIntArray171 = new int[2];

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	public final int[] anIntArray170 = new int[3];

	@OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
	public final int[] anIntArray172 = new int[2];

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class99(@OriginalArg(0) Class275 arg0) {
		this.anIntArray169[0] = arg0.anInt7240;
		this.anIntArray169[2] = arg0.anInt7268;
		this.anIntArray169[1] = arg0.anInt7286;
		this.anIntArray170[0] = arg0.anInt7274;
		this.anIntArray170[1] = arg0.anInt7249;
		this.anIntArray170[2] = arg0.anInt7227;
		this.anIntArray171[0] = arg0.anInt7231;
		this.anIntArray171[1] = arg0.anInt7229;
		this.anIntArray172[1] = arg0.anInt7292;
		this.anIntArray172[0] = arg0.anInt7246;
		if (arg0.aShortArray102 != null) {
			this.aShortArray14 = new short[arg0.aShortArray102.length];
			Static732.method6319(arg0.aShortArray102, 0, this.aShortArray14, 0, this.aShortArray14.length);
		}
		if (arg0.aShortArray99 != null) {
			this.aShortArray15 = new short[arg0.aShortArray99.length];
			Static732.method6319(arg0.aShortArray99, 0, this.aShortArray15, 0, this.aShortArray15.length);
		}
	}
}
