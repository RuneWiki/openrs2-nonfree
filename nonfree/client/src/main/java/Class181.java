import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class181 {

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
	private int anInt5231;

	@OriginalMember(owner = "client!jha", name = "e", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!jha", name = "h", descriptor = "Lclient!iia;")
	public Class165 aClass165_1;

	@OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
	public int anInt5241;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!ol;)V")
	public void method4757(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5203();
			if (local15 == 0) {
				return;
			}
			this.method4762(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)Lclient!de;")
	public synchronized Class67 method4760() {
		@Pc(20) Class67 local20 = (Class67) this.aClass165_1.aClass22_22.method462((long) this.anInt5231);
		if (local20 != null) {
			return local20;
		}
		local20 = Static676.method1693(this.aClass165_1.aClass124_57, this.anInt5231, 0);
		if (local20 != null) {
			this.aClass165_1.aClass22_22.method470((long) this.anInt5231, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!ol;BI)V")
	private void method4762(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5231 = arg0.method5211();
		} else if (arg1 == 2) {
			this.anInt5241 = arg0.method5203();
			this.anInt5235 = arg0.method5203();
		}
	}
}
