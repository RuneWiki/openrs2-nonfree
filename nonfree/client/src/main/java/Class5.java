import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public int anInt164 = 16777215;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public int anInt159 = 8;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!md;I)V")
	public void method139(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3737();
			if (local11 == 0) {
				return;
			}
			this.method140(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!md;)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt159 = arg1.method3711();
		} else if (arg0 == 2) {
			this.aBoolean16 = true;
		} else if (arg0 == 3) {
			this.anInt156 = arg1.method3701();
			this.anInt165 = arg1.method3701();
			this.anInt161 = arg1.method3701();
		} else if (arg0 == 4) {
			this.anInt166 = arg1.method3737();
		} else if (arg0 == 5) {
			this.anInt167 = arg1.method3711();
		} else if (arg0 == 6) {
			this.anInt164 = arg1.method3748();
			return;
		}
	}
}
