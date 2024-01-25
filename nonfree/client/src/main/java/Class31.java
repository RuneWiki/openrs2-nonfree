import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class31 {

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
	public int anInt854;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!sfa;")
	public Class336 aClass336_1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!rba;I)V")
	private void method671(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt853 = arg0.method5272();
		} else if (arg1 == 2) {
			this.anInt857 = arg0.method5322(-83);
			this.anInt854 = arg0.method5322(-31);
			return;
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Lclient!jr;")
	public synchronized Class194 method673() {
		@Pc(13) Class194 local13 = (Class194) this.aClass336_1.aClass338_55.method8049((long) this.anInt853);
		if (local13 != null) {
			return local13;
		}
		local13 = Static728.method4757(this.aClass336_1.aClass221_146, this.anInt853, 0);
		if (local13 != null) {
			this.aClass336_1.aClass338_55.method8044((long) this.anInt853, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method675(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5322(-10);
			if (local16 == 0) {
				return;
			}
			this.method671(arg0, local16);
		}
	}
}
