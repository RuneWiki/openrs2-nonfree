import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class6_Sub5_Sub15 extends Class6_Sub5 {

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!wr;")
	private Class380 aClass380_13;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZI)I")
	public int method3741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass380_13 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub37 local16 = (Class6_Sub37) this.aClass380_13.method8747((long) arg0);
			return local16 == null ? arg1 : local16.anInt7833;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method3742(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass380_13 == null) {
			return arg1;
		} else {
			@Pc(23) Class6_Sub23 local23 = (Class6_Sub23) this.aClass380_13.method8747((long) arg0);
			return local23 == null ? arg1 : local23.aString42;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ji;)V")
	public void method3744(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method3745(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZLclient!ji;)V")
	private void method3745(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method8246();
		@Pc(15) int local15;
		if (this.aClass380_13 == null) {
			local15 = Static101.method2622(local8);
			this.aClass380_13 = new Class380(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(36) boolean local36 = arg1.method8246() == 1;
			@Pc(40) int local40 = arg1.method8203();
			@Pc(49) Class6 local49;
			if (local36) {
				local49 = new Class6_Sub23(arg1.method8221());
			} else {
				local49 = new Class6_Sub37(arg1.method8236());
			}
			this.aClass380_13.method8753(local49, (long) local40);
		}
	}
}
