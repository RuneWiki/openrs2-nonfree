import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class355 {

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	public int anInt10058;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
	public int anInt10059;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
	public int anInt10060;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Z")
	public boolean aBoolean712;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
	public int anInt10065;

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
	public int anInt10066;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
	public int anInt10055 = 16777215;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
	public int anInt10062 = 8;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!un;II)V")
	private void method8236(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10062 = arg0.method4936();
		} else if (arg1 == 2) {
			this.aBoolean712 = true;
		} else if (arg1 == 3) {
			this.anInt10065 = arg0.method4946();
			this.anInt10058 = arg0.method4946();
			this.anInt10059 = arg0.method4946();
		} else if (arg1 == 4) {
			this.anInt10060 = arg0.method4905();
		} else if (arg1 == 5) {
			this.anInt10066 = arg0.method4936();
		} else if (arg1 == 6) {
			this.anInt10055 = arg0.method4934();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!un;)V")
	public void method8238(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4905();
			if (local14 == 0) {
				return;
			}
			this.method8236(arg0, local14);
		}
	}
}
