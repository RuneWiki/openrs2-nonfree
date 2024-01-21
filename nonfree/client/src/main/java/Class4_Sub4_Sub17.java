import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class4_Sub4_Sub17 extends Class4_Sub4 {

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "[Lclient!nf;")
	public final Class52[] aClass52Array1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!la;Lclient!la;IZ)V")
	public Class4_Sub4_Sub17(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class78 local7 = new Class78();
		@Pc(12) int local12 = arg0.method283(arg2);
		this.aClass52Array1 = new Class52[local12];
		@Pc(21) int[] local21 = arg0.method282(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class4_Sub11 local27 = null;
			@Pc(35) byte[] local35 = arg0.method290(arg2, local21[local23]);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class4_Sub11 local54 = (Class4_Sub11) local7.method1916(); local54 != null; local54 = (Class4_Sub11) local7.method1920()) {
				if (local49 == local54.anInt1091) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(80) byte[] local80 = arg1.method281(local49, 0);
				local27 = new Class4_Sub11(local49, local80);
				local7.method1914(local27);
			}
			this.aClass52Array1[local21[local23]] = new Class52(local35, local27);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Z")
	public boolean method1948(@OriginalArg(1) int arg0) {
		return this.aClass52Array1[arg0].aBoolean122;
	}
}
