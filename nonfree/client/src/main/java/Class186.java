import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class186 {

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public int anInt5362 = 0;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
	public int anInt5371 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!aq;")
	private final Class22 aClass22_25 = new Class22(64);

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "Lclient!fba;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!gga;")
	private final Class124 aClass124_65;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_64;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(ILclient!gga;Lclient!gga;Lclient!fba;)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Interface6 arg3) {
		this.anInterface6_1 = arg3;
		this.aClass124_65 = arg1;
		this.aClass124_64 = arg2;
		if (this.aClass124_65 != null) {
			this.anInt5362 = this.aClass124_65.method3629(1);
		}
		if (this.aClass124_64 != null) {
			this.anInt5371 = this.aClass124_64.method3629(1);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!hk;[IJZ)Ljava/lang/String;")
	public String method4868(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(19) String local19 = this.anInterface6_1.method8557(arg1, arg0, arg2);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)Lclient!iaa;")
	public Class2_Sub1_Sub8 method4870(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub1_Sub8 local11 = (Class2_Sub1_Sub8) this.aClass22_25.method462((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass124_65.method3641(1, arg0);
		} else {
			local27 = this.aClass124_64.method3641(1, arg0 & 0x7FFF);
		}
		local11 = new Class2_Sub1_Sub8();
		local11.aClass186_1 = this;
		if (local27 != null) {
			local11.method4329(new Class2_Sub8(local27));
		}
		if (arg0 >= 32768) {
			local11.method4333();
		}
		this.aClass22_25.method470((long) arg0, local11);
		return local11;
	}
}
