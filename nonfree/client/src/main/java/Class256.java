import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class256 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
	private int anInt6968;

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
	public int anInt6970;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
	public int anInt6971;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Lclient!gr;")
	public Class149 aClass149_1;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)Lclient!gs;")
	public synchronized Class150 method5826() {
		@Pc(13) Class150 local13 = (Class150) this.aClass149_1.aClass279_19.method6631((long) this.anInt6968);
		if (local13 != null) {
			return local13;
		}
		local13 = Static683.method3275(this.aClass149_1.aClass143_50, this.anInt6968, 0);
		if (local13 != null) {
			this.aClass149_1.aClass279_19.method6635(local13, (long) this.anInt6968);
		}
		return local13;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method5827(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method5829(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLclient!fca;I)V")
	private void method5829(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6968 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt6971 = arg0.method4888();
			this.anInt6970 = arg0.method4888();
		}
	}
}
