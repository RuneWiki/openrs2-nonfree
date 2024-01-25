import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class256 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public int anInt6934;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!eu;")
	public Class102 aClass102_2;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	public int anInt6939;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BILclient!ee;)V")
	private void method6181(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt6936 = arg1.method8631();
		} else if (arg0 == 2) {
			this.anInt6934 = arg1.method8645();
			this.anInt6939 = arg1.method8645();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!jn;")
	public synchronized Class176 method6182() {
		@Pc(13) Class176 local13 = (Class176) this.aClass102_2.aClass293_12.method6921((long) this.anInt6936);
		if (local13 != null) {
			return local13;
		}
		local13 = Static654.method4046(this.aClass102_2.aClass384_37, this.anInt6936, 0);
		if (local13 != null) {
			this.aClass102_2.aClass293_12.method6925((long) this.anInt6936, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!ee;)V")
	public void method6183(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8645();
			if (local17 == 0) {
				return;
			}
			this.method6181(local17, arg0);
		}
	}
}
