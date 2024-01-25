import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class8_Sub8_Sub2 extends Class8_Sub8 {

	@OriginalMember(owner = "client!wp", name = "Ab", descriptor = "Lclient!ub;")
	private Class336 aClass336_2;

	@OriginalMember(owner = "client!wp", name = "Nb", descriptor = "I")
	private int anInt10647;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V")
	public Class8_Sub8_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([IB)V")
	public void method8584(@OriginalArg(0) int[] arg0) {
		this.aClass336_2 = new Class336(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(BI)I")
	public int method8585(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt10647;
	}

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "(II)I")
	public int method8586(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt10647 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt10647 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt10647 += arg0;
		while (local23 < arg0) {
			local25 += (super.aByteArray107[local15++] & Static184.anIntArray236[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local25 += super.aByteArray107[local15] & Static184.anIntArray236[local23];
		} else {
			local25 += super.aByteArray107[local15] >> local23 - arg0 & Static184.anIntArray236[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "(B)Z")
	public boolean method8587() {
		@Pc(16) int local16 = super.aByteArray107[super.anInt10588] - this.aClass336_2.method7834() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ub;B)V")
	public void method8588(@OriginalArg(0) Class336 arg0) {
		this.aClass336_2 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "(I)V")
	public void method8590() {
		super.anInt10588 = (this.anInt10647 + 7) / 8;
	}

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "(II)V")
	public void method8591(@OriginalArg(1) int arg0) {
		super.aByteArray107[super.anInt10588++] = (byte) (arg0 + this.aClass336_2.method7838());
	}

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "(I)V")
	public void method8592() {
		this.anInt10647 = super.anInt10588 * 8;
	}

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "(I)I")
	public int method8593() {
		@Pc(29) int local29 = super.aByteArray107[super.anInt10588++] - this.aClass336_2.method7838() & 0xFF;
		return local29 < 128 ? local29 : (super.aByteArray107[super.anInt10588++] - this.aClass336_2.method7838() & 0xFF) + (local29 - 128 << 8);
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I[BII)V")
	public void method8594(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray107[super.anInt10588++] - this.aClass336_2.method7838());
		}
	}
}
