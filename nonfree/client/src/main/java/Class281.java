import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class281 {

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	public int anInt8117;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	public int anInt8118;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Lclient!ip;")
	public Class137 aClass137_1;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
	private int anInt8120;

	static {
		new Class114("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Lclient!qm;")
	public synchronized Class242 method6883() {
		@Pc(21) Class242 local21 = (Class242) this.aClass137_1.aClass316_27.method7799((long) this.anInt8120);
		if (local21 != null) {
			return local21;
		}
		local21 = Static559.method5942(this.aClass137_1.aClass160_47, this.anInt8120, 0);
		if (local21 != null) {
			this.aClass137_1.aClass316_27.method7792((long) this.anInt8120, local21);
		}
		return local21;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!gw;)V")
	public void method6885(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3043();
			if (local14 == 0) {
				return;
			}
			this.method6887(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!gw;BI)V")
	private void method6887(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8120 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt8117 = arg0.method3043();
			this.anInt8118 = arg0.method3043();
		}
	}
}
