import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class284 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!is;")
	public Class148 aClass148_2;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	private int anInt8580;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public int anInt8581;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	public int anInt8585;

	static {
		new Class88(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method7052(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method7054(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lclient!bt;")
	public synchronized Class40 method7053() {
		@Pc(13) Class40 local13 = (Class40) this.aClass148_2.aClass125_29.method3446((long) this.anInt8580);
		if (local13 != null) {
			return local13;
		}
		local13 = Static550.method897(this.aClass148_2.aClass16_55, this.anInt8580, 0);
		if (local13 != null) {
			this.aClass148_2.aClass125_29.method3437(local13, (long) this.anInt8580);
		}
		return local13;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLclient!daa;)V")
	private void method7054(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt8580 = arg1.method5199();
		} else if (arg0 == 2) {
			this.anInt8585 = arg1.method5216();
			this.anInt8581 = arg1.method5216();
		}
	}
}
