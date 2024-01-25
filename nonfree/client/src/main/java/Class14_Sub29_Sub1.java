import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class14_Sub29_Sub1 extends Class14_Sub29 {

	@OriginalMember(owner = "client!js", name = "Lb", descriptor = "I")
	private int anInt5131;

	@OriginalMember(owner = "client!js", name = "Pb", descriptor = "Lclient!ws;")
	private Class394 aClass394_2;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
	public Class14_Sub29_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I[I)V")
	public void method4281(@OriginalArg(1) int[] arg0) {
		this.aClass394_2 = new Class394(arg0);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II[BI)V")
	public void method4282(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = (byte) (super.aByteArray84[super.anInt7264++] - this.aClass394_2.method9279());
		}
	}

	@OriginalMember(owner = "client!js", name = "o", descriptor = "(II)V")
	public void method4283(@OriginalArg(1) int arg0) {
		super.aByteArray84[super.anInt7264++] = (byte) (arg0 + this.aClass394_2.method9279());
	}

	@OriginalMember(owner = "client!js", name = "p", descriptor = "(II)I")
	public int method4284(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt5131;
	}

	@OriginalMember(owner = "client!js", name = "o", descriptor = "(I)V")
	public void method4285() {
		this.anInt5131 = super.anInt7264 * 8;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLclient!ws;)V")
	public void method4286(@OriginalArg(1) Class394 arg0) {
		this.aClass394_2 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(Z)Z")
	public boolean method4287() {
		@Pc(16) int local16 = super.aByteArray84[super.anInt7264] - this.aClass394_2.method9281() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!js", name = "p", descriptor = "(I)I")
	public int method4288() {
		@Pc(29) int local29 = super.aByteArray84[super.anInt7264++] - this.aClass394_2.method9279() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray84[super.anInt7264++] - this.aClass394_2.method9279() & 0xFF);
	}

	@OriginalMember(owner = "client!js", name = "q", descriptor = "(II)I")
	public int method4289(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5131 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt5131 & 0x7);
		this.anInt5131 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (Static456.anIntArray606[local18] & super.aByteArray84[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local26 += super.aByteArray84[local10] & Static456.anIntArray606[local18];
		} else {
			local26 += super.aByteArray84[local10] >> local18 - arg0 & Static456.anIntArray606[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!js", name = "q", descriptor = "(I)V")
	public void method4290() {
		super.anInt7264 = (this.anInt5131 + 7) / 8;
	}
}
