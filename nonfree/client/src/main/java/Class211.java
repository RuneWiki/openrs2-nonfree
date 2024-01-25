import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class211 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public int anInt5642 = 0;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	public int anInt5643 = 0;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Lclient!lga;")
	private final Class207 aClass207_30 = new Class207(64);

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!mm;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!sea;")
	private final Class308 aClass308_108;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!sea;")
	private final Class308 aClass308_107;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!sea;Lclient!sea;Lclient!mm;)V")
	public Class211(@OriginalArg(0) int arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Interface16 arg3) {
		this.anInterface16_1 = arg3;
		this.aClass308_108 = arg2;
		this.aClass308_107 = arg1;
		if (this.aClass308_107 != null) {
			this.anInt5642 = this.aClass308_107.method6568(1);
		}
		if (this.aClass308_108 != null) {
			this.anInt5643 = this.aClass308_108.method6568(1);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(JZLclient!go;[I)Ljava/lang/String;")
	public String method4598(@OriginalArg(0) long arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(19) String local19 = this.anInterface16_1.method5293(arg1, arg2, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)Lclient!tl;")
	public Class1_Sub8_Sub17 method4599(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub8_Sub17 local11 = (Class1_Sub8_Sub17) this.aClass207_30.method4390((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass308_108.method6569(1, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass308_107.method6569(1, arg0);
		}
		local11 = new Class1_Sub8_Sub17();
		local11.aClass211_2 = this;
		if (local27 != null) {
			local11.method7104(new Class1_Sub3(local27));
		}
		if (arg0 >= 32768) {
			local11.method7103();
		}
		this.aClass207_30.method4391((long) arg0, local11);
		return local11;
	}
}
