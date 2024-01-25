import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class216 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	private int anInt6769;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public int anInt6770;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public int anInt6772;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lclient!v;")
	public Class206 method5620() {
		@Pc(13) Class206 local13 = (Class206) Static51.aClass154_16.method4222((long) this.anInt6769);
		if (local13 != null) {
			return local13;
		}
		local13 = Static367.method5452(Static302.aClass11_134, this.anInt6769, 0);
		if (local13 != null) {
			Static51.aClass154_16.method4221((long) this.anInt6769, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!tq;II)V")
	public void method5621(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(22) int local22 = arg0.method2380();
			if (local22 == 0) {
				return;
			}
			this.method5623(arg0, arg1, local22);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!tq;IBI)V")
	private void method5623(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt6769 = arg0.method2404();
		} else if (arg2 == 2) {
			this.anInt6770 = arg0.method2380();
			this.anInt6772 = arg0.method2380();
		}
	}
}
