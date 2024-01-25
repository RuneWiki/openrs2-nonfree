import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class192 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public int anInt5543;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public int anInt5544;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!fk;")
	public Class95 aClass95_1;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	private int anInt5550;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lclient!ig;")
	public synchronized Class136 method4749() {
		@Pc(13) Class136 local13 = (Class136) this.aClass95_1.aClass313_15.method7406((long) this.anInt5550);
		if (local13 != null) {
			return local13;
		}
		local13 = Static552.method3541(this.aClass95_1.aClass171_50, this.anInt5550, 0);
		if (local13 != null) {
			this.aClass95_1.aClass313_15.method7399((long) this.anInt5550, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method4750(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3922();
			if (local13 == 0) {
				return;
			}
			this.method4751(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method4751(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5550 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt5543 = arg0.method3922();
			this.anInt5544 = arg0.method3922();
		}
	}
}
