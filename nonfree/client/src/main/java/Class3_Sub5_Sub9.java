import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class3_Sub5_Sub9 extends Class3_Sub5 {

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "Lclient!tca;")
	private Class333 aClass333_15;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method3576(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass333_15 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub19 local21 = (Class3_Sub19) this.aClass333_15.method7489((long) arg0);
			return local21 == null ? arg1 : local21.aString42;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)I")
	public int method3578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass333_15 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub24 local16 = (Class3_Sub24) this.aClass333_15.method7489((long) arg1);
			return local16 == null ? arg0 : local16.anInt3846;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!dt;BI)V")
	private void method3580(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(17) int local17 = arg0.method7954();
		@Pc(24) int local24;
		if (this.aClass333_15 == null) {
			local24 = Static585.method7772(local17);
			this.aClass333_15 = new Class333(local24);
		}
		for (local24 = 0; local24 < local17; local24++) {
			@Pc(45) boolean local45 = arg0.method7954() == 1;
			@Pc(49) int local49 = arg0.method7945();
			@Pc(60) Class3 local60;
			if (local45) {
				local60 = new Class3_Sub19(arg0.method7922());
			} else {
				local60 = new Class3_Sub24(arg0.method7895());
			}
			this.aClass333_15.method7488((long) local49, local60);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!dt;B)V")
	public void method3581(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method3580(arg0, local5);
		}
	}
}
