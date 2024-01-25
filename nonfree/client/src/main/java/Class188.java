import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class188 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public int anInt5702;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public int anInt5705;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Z")
	public boolean aBoolean425 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBZLclient!en;)Lclient!kh;")
	public Class54 method5042(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(24) long local24 = (long) (arg0 << 16 | this.anInt5702 | (arg1 ? 262144 : 0) | arg2.anInt5487 << 19);
		@Pc(38) Class54 local38 = (Class54) Static38.aClass66_11.method1939(local24);
		if (local38 != null) {
			return local38;
		} else if (Static129.aClass170_54.method4568(this.anInt5702)) {
			@Pc(56) Class37 local56 = Static360.method907(Static129.aClass170_54, this.anInt5702, 0);
			if (local56 != null) {
				local56.anInt1009 = local56.anInt1011 = local56.anInt1010 = local56.anInt1013 = 0;
				if (arg1) {
					local56.method919();
				}
				for (@Pc(76) int local76 = 0; local76 < arg0; local76++) {
					local56.method905();
				}
			}
			local38 = arg2.method4872(local56);
			if (local38 != null) {
				Static38.aClass66_11.method1936(local24, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!bk;II)V")
	public void method5045(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(8) int local8 = arg0.method1832();
			if (local8 == 0) {
				return;
			}
			this.method5046(local8, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIILclient!bk;)V")
	private void method5046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1 arg2) {
		if (arg0 == 1) {
			this.anInt5702 = arg2.method1845();
		} else if (arg0 == 2) {
			this.anInt5705 = arg2.method1843();
		} else if (arg0 == 3) {
			this.aBoolean425 = true;
		} else if (arg0 == 4) {
			this.anInt5702 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
	public boolean method5047() {
		return Static129.aClass170_54.method4568(this.anInt5702);
	}
}
