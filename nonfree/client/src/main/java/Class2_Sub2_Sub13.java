import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!li", name = "L", descriptor = "[Lclient!sa;")
	public Class86[] aClass86Array1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!nb;Lclient!nb;IZ)V")
	public Class2_Sub2_Sub13(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class108 local7 = new Class108();
		@Pc(12) int local12 = arg0.method390(arg2);
		this.aClass86Array1 = new Class86[local12];
		@Pc(21) int[] local21 = arg0.method396(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method387(local21[local23], arg2);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(49) Class2_Sub12 local49 = null;
			for (@Pc(54) Class2_Sub12 local54 = (Class2_Sub12) local7.method3322(); local54 != null; local54 = (Class2_Sub12) local7.method3331()) {
				if (local47 == local54.anInt1785) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(88) byte[] local88 = arg1.method395(0, local47);
				local49 = new Class2_Sub12(local47, local88);
				local7.method3334(local49);
			}
			this.aClass86Array1[local21[local23]] = new Class86(local33, local49);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)Z")
	public boolean method1949(@OriginalArg(1) int arg0) {
		return this.aClass86Array1[arg0].aBoolean253;
	}
}
