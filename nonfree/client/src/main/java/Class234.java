import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class234 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public int anInt5898;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public int anInt5899;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	private int anInt5900;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!rs;")
	public Class308 aClass308_1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lclient!tba;")
	public synchronized Class329 method5056() {
		@Pc(15) Class329 local15 = (Class329) this.aClass308_1.aClass32_74.method630((long) this.anInt5900);
		if (local15 != null) {
			return local15;
		}
		local15 = Static655.method7423(this.aClass308_1.aClass380_111, this.anInt5900, 0);
		if (local15 != null) {
			this.aClass308_1.aClass32_74.method629(local15, (long) this.anInt5900);
		}
		return local15;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!vj;I)V")
	private void method5057(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt5900 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt5899 = arg1.method8547();
			this.anInt5898 = arg1.method8547();
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!vj;B)V")
	public void method5058(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8547();
			if (local13 == 0) {
				return;
			}
			this.method5057(local13, arg0);
		}
	}
}
