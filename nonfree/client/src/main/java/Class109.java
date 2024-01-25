import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class109 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public int anInt3652 = 0;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	public int anInt3657 = 0;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!wf;")
	private final Class316 aClass316_19 = new Class316(64);

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "Lclient!jv;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!kda;")
	private final Class160 aClass160_39;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!kda;")
	private final Class160 aClass160_38;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(ILclient!kda;Lclient!kda;Lclient!jv;)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Interface6 arg3) {
		this.aClass160_39 = arg2;
		this.anInterface6_1 = arg3;
		this.aClass160_38 = arg1;
		if (this.aClass160_38 != null) {
			this.anInt3652 = this.aClass160_38.method4207(1);
		}
		if (this.aClass160_39 != null) {
			this.anInt3657 = this.aClass160_39.method4207(1);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(JILclient!tda;[I)Ljava/lang/String;")
	public String method3267(@OriginalArg(0) long arg0, @OriginalArg(2) Class273 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(19) String local19 = this.anInterface6_1.method7977(arg1, arg2, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Lclient!qaa;")
	public Class1_Sub1_Sub17 method3268(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1_Sub17 local13 = (Class1_Sub1_Sub17) this.aClass316_19.method7799((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass160_38.method4198(arg0, 1);
		} else {
			local27 = this.aClass160_39.method4198(arg0 & 0x7FFF, 1);
		}
		local13 = new Class1_Sub1_Sub17();
		local13.aClass109_2 = this;
		if (local27 != null) {
			local13.method5811(new Class1_Sub13(local27));
		}
		if (arg0 >= 32768) {
			local13.method5804();
		}
		this.aClass316_19.method7792((long) arg0, local13);
		return local13;
	}
}
