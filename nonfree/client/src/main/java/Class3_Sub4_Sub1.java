import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!af", name = "Gb", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!af", name = "Lb", descriptor = "Lclient!hda;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!hda;I)V")
	public void method328(@OriginalArg(0) Class144 arg0) {
		this.aClass144_1 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "k", descriptor = "(B)V")
	public void method329() {
		super.anInt9739 = (this.anInt285 + 7) / 8;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II[BI)V")
	public void method330(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray90[super.anInt9739++] - this.aClass144_1.method3265());
		}
	}

	@OriginalMember(owner = "client!af", name = "l", descriptor = "(B)I")
	public int method331() {
		@Pc(22) int local22 = super.aByteArray90[super.anInt9739++] - this.aClass144_1.method3265() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray90[super.anInt9739++] - this.aClass144_1.method3265() & 0xFF);
	}

	@OriginalMember(owner = "client!af", name = "l", descriptor = "(II)I")
	public int method333(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt285 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt285 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt285 += arg0;
		while (local18 < arg0) {
			local20 += (super.aByteArray90[local10++] & Static284.anIntArray277[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static284.anIntArray277[local18] & super.aByteArray90[local10];
		} else {
			local20 += super.aByteArray90[local10] >> local18 - arg0 & Static284.anIntArray277[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!af", name = "z", descriptor = "(I)V")
	public void method334() {
		this.anInt285 = super.anInt9739 * 8;
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(BI)V")
	public void method335(@OriginalArg(1) int arg0) {
		super.aByteArray90[super.anInt9739++] = (byte) (this.aClass144_1.method3265() + arg0);
	}

	@OriginalMember(owner = "client!af", name = "n", descriptor = "(B)Z")
	public boolean method337() {
		@Pc(21) int local21 = super.aByteArray90[super.anInt9739] - this.aClass144_1.method3267() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!af", name = "m", descriptor = "(II)I")
	public int method338(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt285;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([II)V")
	public void method339(@OriginalArg(0) int[] arg0) {
		this.aClass144_1 = new Class144(arg0);
	}
}
