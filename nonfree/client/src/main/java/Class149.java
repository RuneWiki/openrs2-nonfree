import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class149 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public int anInt5146;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	public int anInt5147;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
	public int anInt5150;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	public int anInt5152;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	public int anInt5155;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	public int anInt5149 = 8;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	public int anInt5151 = 16777215;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method4455(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5149 = arg0.method8326();
		} else if (arg1 == 2) {
			this.aBoolean377 = true;
		} else if (arg1 == 3) {
			this.anInt5147 = arg0.method8368();
			this.anInt5150 = arg0.method8368();
			this.anInt5155 = arg0.method8368();
		} else if (arg1 == 4) {
			this.anInt5146 = arg0.method8383();
		} else if (arg1 == 5) {
			this.anInt5152 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt5151 = arg0.method8347();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!cea;B)V")
	public void method4458(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8383();
			if (local13 == 0) {
				return;
			}
			this.method4455(arg0, local13);
		}
	}
}
