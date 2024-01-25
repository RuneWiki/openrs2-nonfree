import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class266 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
	public int anInt7202;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "Lclient!wv;")
	public Class366 aClass366_2;

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
	public int anInt7203;

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
	private int anInt7204;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Lclient!qo;")
	public synchronized Class279 method6025() {
		@Pc(13) Class279 local13 = (Class279) this.aClass366_2.aClass6_65.method92((long) this.anInt7204);
		if (local13 != null) {
			return local13;
		}
		local13 = Static604.method6161(this.aClass366_2.aClass322_158, this.anInt7204, 0);
		if (local13 != null) {
			this.aClass366_2.aClass6_65.method106((long) this.anInt7204, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!np;B)V")
	public void method6026(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5175();
			if (local17 == 0) {
				return;
			}
			this.method6028(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!np;)V")
	private void method6028(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt7204 = arg1.method5198();
		} else if (arg0 == 2) {
			this.anInt7202 = arg1.method5175();
			this.anInt7203 = arg1.method5175();
		}
	}
}
