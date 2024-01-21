import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "[Lclient!ia;")
	public final Class30[] aClass30Array1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!jb;Lclient!jb;IZ)V")
	public Class3_Sub1_Sub7(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class5 local7 = new Class5();
		@Pc(12) int local12 = arg0.method911(arg2);
		this.aClass30Array1 = new Class30[local12];
		@Pc(21) int[] local21 = arg0.method930(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method931(local21[local23], arg2);
			@Pc(35) Class3_Sub16 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class3_Sub16 local54 = (Class3_Sub16) local7.method92(); local54 != null; local54 = (Class3_Sub16) local7.method90()) {
				if (local54.anInt2559 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method913(local49, 0);
				local35 = new Class3_Sub16(local49, local80);
				local7.method87(local35);
			}
			this.aClass30Array1[local21[local23]] = new Class30(local33, local35);
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public boolean method775(@OriginalArg(1) int arg0) {
		return this.aClass30Array1[arg0].aBoolean47;
	}
}
