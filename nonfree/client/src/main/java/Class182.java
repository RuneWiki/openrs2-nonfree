import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class182 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public int anInt5811;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public int anInt5813;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Z")
	public boolean aBoolean516 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!dg;I)V")
	public void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4421();
			if (local9 == 0) {
				return;
			}
			this.method5125(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!dg;I)V")
	private void method5125(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5813 = arg1.method4464();
		} else if (arg2 == 2) {
			this.anInt5811 = arg1.method4463();
		} else if (arg2 == 3) {
			this.aBoolean516 = true;
		} else if (arg2 == 4) {
			this.anInt5813 = -1;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!ae;II)Lclient!gj;")
	public Class31 method5127(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg2 << 16 | this.anInt5813 | (arg0 ? 262144 : 0) | arg1.anInt4681 << 19);
		@Pc(30) Class31 local30 = (Class31) Static38.aClass119_24.method3311(local24);
		if (local30 != null) {
			return local30;
		} else if (Static186.aClass191_175.method5440(this.anInt5813)) {
			@Pc(56) Class76 local56 = Static361.method2368(Static186.aClass191_175, this.anInt5813, 0);
			if (local56 != null) {
				local56.anInt2418 = local56.anInt2416 = local56.anInt2417 = local56.anInt2413 = 0;
				if (arg0) {
					local56.method2363();
				}
				for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
					local56.method2362();
				}
			}
			local30 = arg1.method4214(local56);
			if (local30 != null) {
				Static38.aClass119_24.method3308(local30, local24);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
	public boolean method5128() {
		return Static186.aClass191_175.method5440(this.anInt5813);
	}
}
