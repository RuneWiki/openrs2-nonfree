import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class139 {

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lclient!br;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
	public int anInt3467;

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
	public int anInt3468;

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
	private int anInt3469;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!dga;B)V")
	public void method3001(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method3003(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!dga;II)V")
	private void method3003(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3469 = arg0.method6006();
		} else if (arg1 == 2) {
			this.anInt3468 = arg0.method6041();
			this.anInt3467 = arg0.method6041();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)Lclient!me;")
	public synchronized Class196 method3004() {
		@Pc(13) Class196 local13 = (Class196) this.aClass33_1.aClass332_24.method7502((long) this.anInt3469);
		if (local13 != null) {
			return local13;
		}
		local13 = Static589.method4745(this.aClass33_1.aClass251_15, this.anInt3469, 0);
		if (local13 != null) {
			this.aClass33_1.aClass332_24.method7498((long) this.anInt3469, local13);
		}
		return local13;
	}
}
