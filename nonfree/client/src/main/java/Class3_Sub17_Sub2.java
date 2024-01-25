import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class3_Sub17_Sub2 extends Class3_Sub17 {

	@OriginalMember(owner = "client!kka", name = "Eb", descriptor = "Lclient!pp;")
	private Class282 aClass282_3;

	@OriginalMember(owner = "client!kka", name = "Jb", descriptor = "I")
	private int anInt5861;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!pp;B)V")
	public void method4898(@OriginalArg(0) Class282 arg0) {
		this.aClass282_3 = arg0;
	}

	@OriginalMember(owner = "client!kka", name = "p", descriptor = "(II)V")
	public void method4899(@OriginalArg(1) int arg0) {
		super.aByteArray59[super.lb++] = (byte) (arg0 + this.aClass282_3.method6678());
	}

	@OriginalMember(owner = "client!kka", name = "s", descriptor = "(I)I")
	public int method4900() {
		@Pc(21) int local21 = super.aByteArray59[super.lb++] - this.aClass282_3.method6678() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray59[super.lb++] - this.aClass282_3.method6678() & 0xFF);
	}

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "(IB)I")
	public int method4901(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt5861;
	}

	@OriginalMember(owner = "client!kka", name = "e", descriptor = "(Z)Z")
	public boolean method4903() {
		@Pc(21) int local21 = super.aByteArray59[super.lb] - this.aClass282_3.method6680() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(I[BBI)V")
	public void method4904(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (super.aByteArray59[super.lb++] - this.aClass282_3.method6678());
		}
	}

	@OriginalMember(owner = "client!kka", name = "q", descriptor = "(II)I")
	public int method4905(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt5861 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt5861 & 0x7);
		this.anInt5861 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (super.aByteArray59[local10++] & Static123.anIntArray156[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray59[local10] & Static123.anIntArray156[local18];
		} else {
			local26 += super.aByteArray59[local10] >> local18 - arg0 & Static123.anIntArray156[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!kka", name = "p", descriptor = "(B)V")
	public void method4906() {
		this.anInt5861 = super.lb * 8;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z[I)V")
	public void method4907(@OriginalArg(1) int[] arg0) {
		this.aClass282_3 = new Class282(arg0);
	}

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "(Z)V")
	public void method4908() {
		super.lb = (this.anInt5861 + 7) / 8;
	}
}
