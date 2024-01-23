import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kj", name = "Z", descriptor = "Lclient!sc;")
	private Class102 aClass102_12;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLclient!k;I)V")
	private void method1877(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method3793();
		@Pc(15) int local15;
		if (this.aClass102_12 == null) {
			local15 = Static148.method2539(local8);
			this.aClass102_12 = new Class102(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(36) boolean local36 = arg0.method3793() == 1;
			@Pc(40) int local40 = arg0.method3806();
			@Pc(49) Class1 local49;
			if (local36) {
				local49 = new Class1_Sub26(arg0.method3781());
			} else {
				local49 = new Class1_Sub15(arg0.method3784());
			}
			this.aClass102_12.method3083(local49, (long) local40);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BILclient!ia;)Lclient!ia;")
	public Class51 method1878(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		if (this.aClass102_12 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub26 local21 = (Class1_Sub26) this.aClass102_12.method3093((long) arg0);
			return local21 == null ? arg1 : local21.aClass51_1609;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!k;)V")
	public void method1879(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3793();
			if (local5 == 0) {
				return;
			}
			this.method1877(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I")
	public int method1882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass102_12 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub15 local21 = (Class1_Sub15) this.aClass102_12.method3093((long) arg0);
			return local21 == null ? arg1 : local21.anInt2107;
		}
	}
}
