import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class188 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	public int anInt5227 = 2048;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public int anInt5229 = 0;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	public int anInt5232 = 0;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	public int anInt5234 = 2048;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method4751(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method7695(95);
			if (local18 == 0) {
				return;
			}
			this.method4756(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BILclient!jc;)V")
	private void method4756(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt5232 = arg1.method7695(120);
		} else if (arg0 == 2) {
			this.anInt5227 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt5234 = arg1.method7717(-1978450544);
			return;
		} else if (arg0 == 4) {
			this.anInt5229 = arg1.method7752();
			return;
		}
	}
}
