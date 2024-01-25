import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class194 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public int anInt5649;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public int anInt5650;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt5653;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!wt;")
	public Class275 aClass275_3;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lclient!ho;")
	public synchronized Class98 method4691() {
		@Pc(13) Class98 local13 = (Class98) this.aClass275_3.aClass83_63.method2338((long) this.anInt5653);
		if (local13 != null) {
			return local13;
		}
		local13 = Static472.method2850(this.aClass275_3.aClass38_95, this.anInt5653, 0);
		if (local13 != null) {
			this.aClass275_3.aClass83_63.method2337(local13, (long) this.anInt5653);
		}
		return local13;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!wn;)V")
	public void method4692(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4614();
			if (local13 == 0) {
				return;
			}
			this.method4694(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!wn;)V")
	private void method4694(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt5653 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt5649 = arg1.method4614();
			this.anInt5650 = arg1.method4614();
		}
	}
}
