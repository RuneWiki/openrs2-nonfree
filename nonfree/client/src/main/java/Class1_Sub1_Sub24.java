import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "[Lclient!dd;")
	public Class35[] aClass35Array1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!ph;Lclient!ph;IZ)V")
	public Class1_Sub1_Sub24(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class24 local7 = new Class24();
		@Pc(12) int local12 = arg0.method3365(arg2);
		this.aClass35Array1 = new Class35[local12];
		@Pc(21) int[] local21 = arg0.method3334(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(39) byte[] local39 = arg0.method3346(arg2, local21[local23]);
			@Pc(41) Class1_Sub12 local41 = null;
			@Pc(55) int local55 = local39[1] & 0xFF | (local39[0] & 0xFF) << 8;
			for (@Pc(60) Class1_Sub12 local60 = (Class1_Sub12) local7.method460(); local60 != null; local60 = (Class1_Sub12) local7.method464()) {
				if (local60.anInt2840 == local55) {
					local41 = local60;
					break;
				}
			}
			if (local41 == null) {
				@Pc(101) byte[] local101 = arg1.method3348(0, local55);
				local41 = new Class1_Sub12(local55, local101);
				local7.method473(local41);
			}
			this.aClass35Array1[local21[local23]] = new Class35(local39, local41);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z")
	public boolean method4482(@OriginalArg(1) int arg0) {
		return this.aClass35Array1[arg0].aBoolean67;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Z")
	public boolean method4484(@OriginalArg(0) int arg0) {
		return this.aClass35Array1[arg0].aBoolean66;
	}
}
