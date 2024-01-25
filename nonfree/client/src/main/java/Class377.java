import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class377 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
	public int anInt10376 = 0;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	public int anInt10382 = 0;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Lclient!af;")
	private final Class10 aClass10_62 = new Class10(64);

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Lclient!td;")
	private Interface25 anInterface25_1 = null;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "Lclient!ae;")
	private final Class8 aClass8_144;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_143;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(ILclient!ae;Lclient!ae;Lclient!td;)V")
	public Class377(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Interface25 arg3) {
		this.aClass8_144 = arg1;
		this.anInterface25_1 = arg3;
		this.aClass8_143 = arg2;
		if (this.aClass8_144 != null) {
			this.anInt10382 = this.aClass8_144.method280(1);
		}
		if (this.aClass8_143 != null) {
			this.anInt10376 = this.aClass8_143.method280(1);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Lclient!pk;")
	public Class6_Sub4_Sub13 method8763(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub4_Sub13 local11 = (Class6_Sub4_Sub13) this.aClass10_62.method373((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass8_144.method262(arg0, 1);
		} else {
			local27 = this.aClass8_143.method262(arg0 & 0x7FFF, 1);
		}
		local11 = new Class6_Sub4_Sub13();
		local11.aClass377_2 = this;
		if (local27 != null) {
			local11.method6587(new Class6_Sub23(local27));
		}
		if (arg0 >= 32768) {
			local11.method6584();
		}
		this.aClass10_62.method366(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([IJLclient!o;Z)Ljava/lang/String;")
	public String method8765(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class246 arg2) {
		if (this.anInterface25_1 != null) {
			@Pc(19) String local19 = this.anInterface25_1.method4156(arg0, arg1, arg2);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}
}
