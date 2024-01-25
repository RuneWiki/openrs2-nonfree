import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class5_Sub23_Sub2 extends Class5_Sub23 {

	@OriginalMember(owner = "client!ub", name = "Mb", descriptor = "I")
	private int anInt9934;

	@OriginalMember(owner = "client!ub", name = "Lb", descriptor = "Lclient!sa;")
	private Class313 aClass313_2;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
	public Class5_Sub23_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "(I)Z")
	public boolean method8544() {
		@Pc(17) int local17 = super.aByteArray102[super.anInt9869] - this.aClass313_2.method7587() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "(B)I")
	public int method8545() {
		@Pc(30) int local30 = super.aByteArray102[super.anInt9869++] - this.aClass313_2.method7589() & 0xFF;
		return local30 < 128 ? local30 : (super.aByteArray102[super.anInt9869++] - this.aClass313_2.method7589() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "([II)V")
	public void method8546(@OriginalArg(0) int[] arg0) {
		this.aClass313_2 = new Class313(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "(II)V")
	public void method8547(@OriginalArg(1) int arg0) {
		super.aByteArray102[super.anInt9869++] = (byte) (this.aClass313_2.method7589() + arg0);
	}

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "(I)V")
	public void method8548() {
		super.anInt9869 = (this.anInt9934 + 7) / 8;
	}

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "(I)V")
	public void method8549() {
		this.anInt9934 = super.anInt9869 * 8;
	}

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "(II)I")
	public int method8550(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt9934 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt9934 & 0x7);
		this.anInt9934 += arg0;
		@Pc(25) int local25 = 0;
		while (local17 < arg0) {
			local25 += (Static83.anIntArray70[local17] & super.aByteArray102[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local25 += Static83.anIntArray70[local17] & super.aByteArray102[local10];
		} else {
			local25 += super.aByteArray102[local10] >> local17 - arg0 & Static83.anIntArray70[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!sa;)V")
	public void method8551(@OriginalArg(1) Class313 arg0) {
		this.aClass313_2 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(BI)I")
	public int method8552(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt9934;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BI)V")
	public void method8553(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray102[super.anInt9869++] - this.aClass313_2.method7589());
		}
		if (29235 == 29235) {
			;
		}
	}
}
