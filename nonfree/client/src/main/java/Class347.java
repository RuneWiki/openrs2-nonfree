import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class347 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
	public int anInt8880;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public int anInt8881;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
	public int anInt8884;

	static {
		new Class268("", 76);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!es;BI)V")
	private void method7591(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static305.method4280(arg0.method8861());
		} else if (arg1 == 2) {
			this.anInt8881 = arg0.method8859();
			this.anInt8884 = arg0.method8865();
			this.anInt8880 = arg0.method8865();
			return;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!es;)V")
	public void method7592(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8865();
			if (local13 == 0) {
				return;
			}
			this.method7591(arg0, local13);
		}
	}
}
