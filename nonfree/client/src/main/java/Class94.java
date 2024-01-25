import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class94 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	private int anInt2756;

	static {
		new Class140("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ef;IB)V")
	public void method2506(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method2509(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lclient!ck;")
	public Class40 method2508() {
		@Pc(16) Class40 local16 = (Class40) Static171.aClass107_19.method3021((long) this.anInt2756);
		if (local16 != null) {
			return local16;
		}
		local16 = Static368.method843(Static200.aClass104_110, this.anInt2756, 0);
		if (local16 != null) {
			Static171.aClass107_19.method3018((long) this.anInt2756, local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLclient!ef;II)V")
	private void method2509(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2756 = arg0.method3104();
		} else if (arg1 == 2) {
			this.anInt2752 = arg0.method3124();
			this.anInt2755 = arg0.method3124();
			return;
		}
	}
}
