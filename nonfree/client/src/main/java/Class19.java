import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class19 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!er;")
	private final Class69 aClass69_6 = new Class69(64);

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!ns;")
	private final Class166 aClass166_26;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!ns;")
	private final Class166 aClass166_27;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ILclient!ns;Lclient!ns;)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_26 = arg2;
		this.aClass166_27 = arg1;
		if (this.aClass166_27 != null) {
			this.aClass166_27.method3691(0);
		}
		if (this.aClass166_26 != null) {
			this.aClass166_26.method3691(0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lclient!ac;")
	public Class4_Sub1_Sub1 method532(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub1_Sub1 local11 = (Class4_Sub1_Sub1) this.aClass69_6.method1591((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass166_26.method3696(arg0 & 0x7FFF, 0);
		} else {
			local29 = this.aClass166_27.method3696(arg0, 0);
		}
		local11 = new Class4_Sub1_Sub1();
		if (local29 != null) {
			local11.method112(new Class4_Sub30(local29));
		}
		if (arg0 >= 32768) {
			local11.method108();
		}
		this.aClass69_6.method1590((long) arg0, local11);
		return local11;
	}
}
