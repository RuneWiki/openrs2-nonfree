import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "[Lclient!dh;")
	public Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;IZ)V")
	public Class1_Sub2_Sub12(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class131 local7 = new Class131();
		@Pc(12) int local12 = arg0.method2317(arg2);
		this.aClass38Array1 = new Class38[local12];
		@Pc(21) int[] local21 = arg0.method2326(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(39) byte[] local39 = arg0.method2306(arg2, local21[local23]);
			@Pc(41) Class1_Sub6 local41 = null;
			@Pc(55) int local55 = (local39[0] & 0xFF) << 8 | local39[1] & 0xFF;
			for (@Pc(60) Class1_Sub6 local60 = (Class1_Sub6) local7.method3791(); local60 != null; local60 = (Class1_Sub6) local7.method3792()) {
				if (local55 == local60.anInt1362) {
					local41 = local60;
					break;
				}
			}
			if (local41 == null) {
				@Pc(99) byte[] local99 = arg1.method2329(local55, 0);
				local41 = new Class1_Sub6(local55, local99);
				local7.method3799(local41);
			}
			this.aClass38Array1[local21[local23]] = new Class38(local39, local41);
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)Z")
	public boolean method1921(@OriginalArg(0) int arg0) {
		return this.aClass38Array1[arg0].aBoolean79;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)Z")
	public boolean method1922(@OriginalArg(1) int arg0) {
		return this.aClass38Array1[arg0].aBoolean78;
	}
}
