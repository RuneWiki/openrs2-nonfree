import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class376 {

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
	public int anInt10340;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!eka;")
	public Class97 aClass97_4;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public int anInt10342;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Z")
	public boolean aBoolean744 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLclient!ha;I)Lclient!hk;")
	public Class155 method8774(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(25) long local25 = (long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.anInt10342 | arg2.anInt10048 << 19);
		@Pc(40) Class155 local40 = (Class155) this.aClass97_4.aClass168_22.method3860(local25);
		if (local40 != null) {
			return local40;
		} else if (this.aClass97_4.aClass126_70.method3077(this.anInt10342)) {
			@Pc(64) Class362 local64 = Static692.method8275(this.aClass97_4.aClass126_70, this.anInt10342, 0);
			if (local64 != null) {
				local64.anInt9726 = local64.anInt9723 = local64.anInt9724 = local64.anInt9725 = 0;
				if (arg1) {
					local64.method8281();
				}
				for (@Pc(88) int local88 = 0; local88 < arg0; local88++) {
					local64.method8283();
				}
			}
			local40 = arg2.method8640(local64, true);
			if (local40 != null) {
				this.aClass97_4.aClass168_22.method3853(local25, local40);
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!wq;)V")
	public void method8775(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7291();
			if (local9 == 0) {
				return;
			}
			this.method8779(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
	public boolean method8778() {
		return this.aClass97_4.aClass126_70.method3077(this.anInt10342);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method8779(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10342 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt10340 = arg0.method7331();
		} else if (arg1 == 3) {
			this.aBoolean744 = true;
		} else if (arg1 == 4) {
			this.anInt10342 = -1;
		}
	}
}
