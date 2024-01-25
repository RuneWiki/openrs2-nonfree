import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	@OriginalMember(owner = "client!lr", name = "Kb", descriptor = "Lclient!cr;")
	private Class64 aClass64_1;

	@OriginalMember(owner = "client!lr", name = "Sb", descriptor = "I")
	private int anInt5225;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "(B)V")
	public void method4524() {
		super.anInt5186 = (this.anInt5225 + 7) / 8;
	}

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "(II)I")
	public int method4525(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5225;
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "(B)Z")
	public boolean method4526() {
		@Pc(23) int local23 = super.aByteArray52[super.anInt5186] - this.aClass64_1.method1211() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "(B)I")
	public int method4527() {
		@Pc(29) int local29 = super.aByteArray52[super.anInt5186++] - this.aClass64_1.method1212() & 0xFF;
		return local29 < 128 ? local29 : (super.aByteArray52[super.anInt5186++] - this.aClass64_1.method1212() & 0xFF) + (local29 - 128 << 8);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZI)V")
	public void method4528(@OriginalArg(1) int arg0) {
		super.aByteArray52[super.anInt5186++] = (byte) (arg0 + this.aClass64_1.method1212());
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([IB)V")
	public void method4529(@OriginalArg(0) int[] arg0) {
		this.aClass64_1 = new Class64(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "(I)V")
	public void method4530() {
		this.anInt5225 = super.anInt5186 * 8;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III[B)V")
	public void method4533(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			arg1[local14] = (byte) (super.aByteArray52[super.anInt5186++] - this.aClass64_1.method1212());
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!cr;I)V")
	public void method4534(@OriginalArg(0) Class64 arg0) {
		this.aClass64_1 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(IB)I")
	public int method4535(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt5225 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt5225 & 0x7);
		@Pc(26) int local26 = 0;
		this.anInt5225 += arg0;
		while (arg0 > local18) {
			local26 += (super.aByteArray52[local10++] & Static186.anIntArray229[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray52[local10] & Static186.anIntArray229[local18];
		} else {
			local26 += super.aByteArray52[local10] >> local18 - arg0 & Static186.anIntArray229[arg0];
		}
		return local26;
	}
}
