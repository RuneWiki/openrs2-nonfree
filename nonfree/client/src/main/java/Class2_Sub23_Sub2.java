import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub23_Sub2 extends Class2_Sub23 {

	@OriginalMember(owner = "client!vc", name = "Eb", descriptor = "I")
	private int anInt6971;

	@OriginalMember(owner = "client!vc", name = "Lb", descriptor = "Lclient!pb;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "(I)V")
	public void method5513() {
		super.anInt6952 = (this.anInt6971 + 7) / 8;
	}

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "(I)Z")
	public boolean method5514() {
		@Pc(25) int local25 = super.aByteArray130[super.anInt6952] - this.aClass188_1.method4257() & 0xFF;
		return local25 >= 128;
	}

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "(I)V")
	public void method5515() {
		this.anInt6971 = super.anInt6952 * 8;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(ZI)I")
	public int method5516(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt6971;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[I)V")
	public void method5517(@OriginalArg(1) int[] arg0) {
		this.aClass188_1 = new Class188(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "(II)V")
	public void method5518(@OriginalArg(0) int arg0) {
		super.aByteArray130[super.anInt6952++] = (byte) (this.aClass188_1.method4254() + arg0);
	}

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "(II)I")
	public int method5519(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6971 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt6971 & 0x7);
		this.anInt6971 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray130[local10++] & Static106.anIntArray196[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += super.aByteArray130[local10] & Static106.anIntArray196[local23];
		} else {
			local31 += super.aByteArray130[local10] >> local23 - arg0 & Static106.anIntArray196[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BIII)V")
	public void method5523(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray130[super.anInt6952++] - this.aClass188_1.method4254());
		}
	}

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "(B)I")
	public int method5524() {
		@Pc(27) int local27 = super.aByteArray130[super.anInt6952++] - this.aClass188_1.method4254() & 0xFF;
		return local27 < 128 ? local27 : (local27 - 128 << 8) + (super.aByteArray130[super.anInt6952++] - this.aClass188_1.method4254() & 0xFF);
	}
}
