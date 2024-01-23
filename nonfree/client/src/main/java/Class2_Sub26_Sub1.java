import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class2_Sub26_Sub1 extends Class2_Sub26 {

	@OriginalMember(owner = "client!tk", name = "Mb", descriptor = "I")
	private int anInt5342;

	@OriginalMember(owner = "client!tk", name = "Nb", descriptor = "Lclient!vc;")
	private Class172 aClass172_1;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub26_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "(II)I")
	public int method4278(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt5342 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt5342 & 0x7);
		this.anInt5342 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (Static99.anIntArray157[local23] & this.aByteArray72[local10++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += Static99.anIntArray157[local23] & this.aByteArray72[local10];
		} else {
			local31 += this.aByteArray72[local10] >> local23 - arg0 & Static99.anIntArray157[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "(I)V")
	public void method4279() {
		this.anInt5328 = (this.anInt5342 + 7) / 8;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II[BI)V")
	public void method4280(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = (byte) (this.aByteArray72[this.anInt5328++] - this.aClass172_1.method4583());
		}
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(IB)I")
	public int method4281(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt5342;
	}

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "(I)V")
	public void method4282() {
		this.anInt5342 = this.anInt5328 * 8;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[I)V")
	public void method4283(@OriginalArg(1) int[] arg0) {
		this.aClass172_1 = new Class172(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(Z)I")
	public int method4285() {
		return this.aByteArray72[this.anInt5328++] - this.aClass172_1.method4583() & 0xFF;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(BI)V")
	public void method4287(@OriginalArg(1) int arg0) {
		this.aByteArray72[this.anInt5328++] = (byte) (arg0 + this.aClass172_1.method4583());
	}
}
