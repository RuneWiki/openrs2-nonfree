import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class85 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public int anInt2751;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Z")
	public boolean aBoolean202 = false;

	static {
		new Class106("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)Z")
	public boolean method2628() {
		return Static320.aClass30_66.method1154(this.anInt2751);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZBLclient!fp;)Lclient!ae;")
	public Class4 method2629(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(32) long local32 = (long) (arg0 << 16 | this.anInt2751 | (arg1 ? 262144 : 0) | arg2.anInt5007 << 19);
		@Pc(38) Class4 local38 = (Class4) Static104.aClass21_68.method854(local32);
		if (local38 != null) {
			return local38;
		} else if (Static320.aClass30_66.method1154(this.anInt2751)) {
			@Pc(56) Class201 local56 = Static382.method5432(Static320.aClass30_66, this.anInt2751, 0);
			if (local56 != null) {
				local56.anInt6041 = local56.anInt6039 = local56.anInt6044 = local56.anInt6043 = 0;
				if (arg1) {
					local56.method5438();
				}
				for (@Pc(76) int local76 = 0; local76 < arg0; local76++) {
					local56.method5431();
				}
			}
			local38 = arg2.method4589(local56);
			if (local38 != null) {
				Static104.aClass21_68.method843(local38, local32);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!at;I)V")
	public void method2631(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method2633(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!at;I)V")
	private void method2633(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2751 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt2756 = arg1.method2119();
		} else if (arg0 == 3) {
			this.aBoolean202 = true;
		} else if (arg0 == 4) {
			this.anInt2751 = -1;
		}
	}
}
