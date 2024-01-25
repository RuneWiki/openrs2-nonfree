import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class55 {

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
	public int anInt996;

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
	public int anInt997;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "Lclient!je;")
	public Class176 aClass176_1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!mc;)V")
	private void method914(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.anInt998 = arg1.method7860();
		} else if (arg0 == 2) {
			this.anInt996 = arg1.method7816();
			this.anInt997 = arg1.method7816();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method915(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method914(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Lclient!vi;")
	public synchronized Class369 method918() {
		@Pc(21) Class369 local21 = (Class369) this.aClass176_1.aClass340_33.method7999((long) this.anInt998);
		if (local21 != null) {
			return local21;
		}
		local21 = Static689.method8541(this.aClass176_1.aClass390_69, this.anInt998, 0);
		if (local21 != null) {
			this.aClass176_1.aClass340_33.method7986((long) this.anInt998, local21);
		}
		return local21;
	}
}
