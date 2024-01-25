import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class213 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt6739;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public int anInt6740;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
	public boolean aBoolean586 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!rg;I)V")
	public void method5983(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method5115();
			if (local12 == 0) {
				return;
			}
			this.method5986(arg1, local12, arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ea;ZZ)Lclient!wn;")
	public Class95 method5984(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt5811 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt6739);
		@Pc(30) Class95 local30 = (Class95) Static69.aClass109_18.method2857(local24);
		if (local30 != null) {
			return local30;
		} else if (Static296.aClass93_114.method2414(this.anInt6739)) {
			@Pc(48) Class100 local48 = Static363.method2672(Static296.aClass93_114, this.anInt6739, 0);
			if (local48 != null) {
				local48.anInt2898 = local48.anInt2897 = local48.anInt2900 = local48.anInt2899 = 0;
				if (arg2) {
					local48.method2685();
				}
				for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
					local48.method2673();
				}
			}
			local30 = arg1.method5229(local48);
			if (local30 != null) {
				Static69.aClass109_18.method2855(local24, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z")
	public boolean method5985() {
		return Static296.aClass93_114.method2414(this.anInt6739);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!rg;III)V")
	private void method5986(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt6739 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt6740 = arg0.method5072();
		} else if (arg1 == 3) {
			this.aBoolean586 = true;
		} else if (arg1 == 4) {
			this.anInt6739 = -1;
		}
	}
}
