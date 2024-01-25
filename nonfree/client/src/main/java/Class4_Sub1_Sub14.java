import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "Lclient!uc;")
	private Class198 aClass198_25;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!tq;II)V")
	private void method3631(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method2380();
		@Pc(15) int local15;
		if (this.aClass198_25 == null) {
			local15 = Static338.method4468(local8);
			this.aClass198_25 = new Class198(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg0.method2380() == 1;
			@Pc(38) int local38 = arg0.method2402();
			@Pc(47) Class4 local47;
			if (local34) {
				local47 = new Class4_Sub30(arg0.method2379());
			} else {
				local47 = new Class4_Sub36(arg0.method2389());
			}
			this.aClass198_25.method5267((long) local38, local47);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLclient!tq;)V")
	public void method3632(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2380();
			if (local9 == 0) {
				return;
			}
			this.method3631(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)I")
	public int method3634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass198_25 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub36 local16 = (Class4_Sub36) this.aClass198_25.method5261((long) arg1);
			return local16 == null ? arg0 : local16.anInt5967;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method3636(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass198_25 == null) {
			return arg1;
		} else {
			@Pc(16) Class4_Sub30 local16 = (Class4_Sub30) this.aClass198_25.method5261((long) arg0);
			return local16 == null ? arg1 : local16.aString146;
		}
	}
}
