import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class10 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public int anInt393;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Lclient!ek;")
	public Class1_Sub2_Sub2_Sub1 method301() {
		@Pc(16) Class1_Sub2_Sub2_Sub1 local16 = (Class1_Sub2_Sub2_Sub1) Static274.aClass31_40.method852((long) this.anInt404);
		if (local16 != null) {
			return local16;
		}
		local16 = Static269.method4137(this.anInt404, Static233.aClass7_191);
		if (local16 != null) {
			Static274.aClass31_40.method851(local16, (long) this.anInt404);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!jj;I)V")
	public void method307(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method3122();
			if (local13 == 0) {
				return;
			}
			this.method313(arg0, arg1, local13);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!jj;III)V")
	private void method313(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt404 = arg0.method3107();
		} else if (arg2 == 2) {
			this.anInt399 = arg0.method3122();
			this.anInt393 = arg0.method3122();
		}
	}
}
