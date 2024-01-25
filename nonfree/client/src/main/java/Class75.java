import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class75 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!af;")
	private final Class10 aClass10_5 = new Class10(64);

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Lclient!ae;")
	private final Class8 aClass8_33;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!ae;")
	private final Class8 aClass8_32;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(ILclient!ae;Lclient!ae;)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_33 = arg1;
		this.aClass8_32 = arg2;
		if (this.aClass8_33 != null) {
			this.aClass8_33.method280(0);
		}
		if (this.aClass8_32 != null) {
			this.aClass8_32.method280(0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lclient!rn;")
	public Class6_Sub4_Sub17 method1820(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub4_Sub17 local11 = (Class6_Sub4_Sub17) this.aClass10_5.method373((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass8_33.method262(arg0, 0);
		} else {
			local25 = this.aClass8_32.method262(arg0 & 0x7FFF, 0);
		}
		local11 = new Class6_Sub4_Sub17();
		if (local25 != null) {
			local11.method7289(new Class6_Sub23(local25));
		}
		if (arg0 >= 32768) {
			local11.method7288();
		}
		this.aClass10_5.method366(local11, (long) arg0);
		return local11;
	}
}
