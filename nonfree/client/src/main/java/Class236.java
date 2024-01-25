import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class236 {

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "[Lclient!wn;")
	public Interface20[] anInterface20Array1 = null;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "Lclient!uda;")
	public Interface17 anInterface17_1 = null;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "[Lclient!wn;")
	private Interface20[] anInterface20Array2 = null;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "Z")
	public boolean aBoolean493;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class236(@OriginalArg(0) Class42_Sub1 arg0) {
		this.aBoolean493 = arg0.aBoolean501;
		if (this.aBoolean493 && !arg0.method5923(Static473.aClass72_15, Static155.aClass114_6)) {
			this.aBoolean493 = false;
		}
		if (this.aBoolean493 || arg0.method5911(Static473.aClass72_15, Static155.aClass114_6)) {
			Static521.method6310();
			if (this.aBoolean493) {
				@Pc(121) byte[] local121 = Static202.method3816(Static428.anObject15, false);
				this.anInterface17_1 = arg0.method5962(Static473.aClass72_15, local121);
				@Pc(136) byte[] local136 = Static202.method3816(Static465.anObject17, false);
				arg0.method5962(Static473.aClass72_15, local136);
			} else {
				this.anInterface20Array1 = new Interface20[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(63) byte[] local63 = Static380.method6370(2 * 128 * local49 * 128, Static428.anObject15);
					this.anInterface20Array1[local49] = arg0.method5969(128, Static473.aClass72_15, true, 128, local63);
				}
				this.anInterface20Array2 = new Interface20[16];
				for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
					@Pc(97) byte[] local97 = Static380.method6370(local85 * 128 * 256, Static465.anObject17);
					this.anInterface20Array2[local85] = arg0.method5969(128, Static473.aClass72_15, true, 128, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)Z")
	public boolean method5705() {
		if (this.aBoolean493) {
			return this.anInterface17_1 != null;
		} else {
			return this.anInterface20Array1 != null;
		}
	}
}
