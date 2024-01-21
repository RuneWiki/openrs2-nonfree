import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "[Lclient!s;")
	public final Class72[] aClass72Array1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!jg;Lclient!jg;IZ)V")
	public Class3_Sub2_Sub4(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class59 local7 = new Class59();
		@Pc(12) int local12 = arg0.method1619(arg2);
		this.aClass72Array1 = new Class72[local12];
		@Pc(21) int[] local21 = arg0.method1615(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1624(arg2, local21[local23]);
			@Pc(35) Class3_Sub13 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class3_Sub13 local54 = (Class3_Sub13) local7.method1731(); local54 != null; local54 = (Class3_Sub13) local7.method1734()) {
				if (local54.anInt2083 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method1620(local49, 0);
				local35 = new Class3_Sub13(local49, local88);
				local7.method1730(local35);
			}
			this.aClass72Array1[local21[local23]] = new Class72(local33, local35);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Z")
	public boolean method842(@OriginalArg(1) int arg0) {
		return this.aClass72Array1[arg0].aBoolean137;
	}
}
