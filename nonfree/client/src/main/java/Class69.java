import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class69 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public int anInt1643;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	public int anInt1653;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!nj;IZI)V")
	private void method1387(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1643 = arg0.method5715();
		} else if (arg2 == 2) {
			this.anInt1653 = arg0.method5705();
		} else if (arg2 == 3) {
			this.aBoolean116 = true;
		} else if (arg2 == 4) {
			this.anInt1643 = -1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!nj;)V")
	public void method1391(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.method5720();
			if (local7 == 0) {
				return;
			}
			this.method1387(arg1, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!ii;II)Lclient!cq;")
	public Class8 method1396(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) int arg2) {
		@Pc(24) long local24 = (long) (this.anInt1643 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.anInt4861 << 19);
		@Pc(30) Class8 local30 = (Class8) Static44.aClass37_21.method915(local24);
		if (local30 != null) {
			return local30;
		} else if (Static166.aClass134_74.method3005(this.anInt1643)) {
			@Pc(48) Class201 local48 = Static369.method5469(Static166.aClass134_74, this.anInt1643, 0);
			if (local48 != null) {
				local48.anInt6355 = local48.anInt6353 = local48.anInt6356 = local48.anInt6358 = 0;
				if (arg0) {
					local48.method5468();
				}
				for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
					local48.method5471();
				}
			}
			local30 = arg1.method4238(local48);
			if (local30 != null) {
				Static44.aClass37_21.method922(local24, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
	public boolean method1397() {
		return Static166.aClass134_74.method3005(this.anInt1643);
	}
}
