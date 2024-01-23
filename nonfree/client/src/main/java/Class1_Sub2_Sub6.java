import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
	public int anInt1552;

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
	private int anInt1554;

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lclient!sc;")
	private Class102 aClass102_8;

	@OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
	public int anInt1555;

	@OriginalMember(owner = "client!gh", name = "V", descriptor = "Lclient!ia;")
	private Class51 aClass51_510 = Static42.aClass51_1657;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)Lclient!ia;")
	public Class51 method1183(@OriginalArg(1) int arg0) {
		if (this.aClass102_8 == null) {
			return this.aClass51_510;
		} else {
			@Pc(17) Class1_Sub26 local17 = (Class1_Sub26) this.aClass102_8.method3093((long) arg0);
			return local17 == null ? this.aClass51_510 : local17.aClass51_1609;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!k;IB)V")
	private void method1184(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1552 = arg0.method3793();
		} else if (arg1 == 2) {
			this.anInt1555 = arg0.method3793();
		} else if (arg1 == 3) {
			this.aClass51_510 = arg0.method3781();
		} else if (arg1 == 4) {
			this.anInt1554 = arg0.method3784();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(47) int local47 = arg0.method3805();
			this.aClass102_8 = new Class102(Static148.method2539(local47));
			for (@Pc(57) int local57 = 0; local57 < local47; local57++) {
				@Pc(63) int local63 = arg0.method3784();
				@Pc(73) Class1 local73;
				if (arg1 == 5) {
					local73 = new Class1_Sub26(arg0.method3781());
				} else {
					local73 = new Class1_Sub15(arg0.method3784());
				}
				this.aClass102_8.method3083(local73, (long) local63);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!k;I)V")
	public void method1188(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3793();
			if (local13 == 0) {
				return;
			}
			this.method1184(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
	public int method1190(@OriginalArg(0) int arg0) {
		if (this.aClass102_8 == null) {
			return this.anInt1554;
		} else {
			@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) this.aClass102_8.method3093((long) arg0);
			return local17 == null ? this.anInt1554 : local17.anInt2107;
		}
	}
}
