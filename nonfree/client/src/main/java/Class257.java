import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class257 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "I")
	public int anInt7327 = 0;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public int anInt7330 = 0;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!gw;")
	private final Class136 aClass136_47 = new Class136(64);

	@OriginalMember(owner = "client!os", name = "l", descriptor = "Lclient!uk;")
	private Interface25 anInterface25_1 = null;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "Lclient!uu;")
	private final Class343 aClass343_199;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_198;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILclient!uu;Lclient!uu;Lclient!uk;)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Interface25 arg3) {
		this.anInterface25_1 = arg3;
		this.aClass343_199 = arg2;
		this.aClass343_198 = arg1;
		if (this.aClass343_198 != null) {
			this.anInt7330 = this.aClass343_198.method8157(1);
		}
		if (this.aClass343_199 != null) {
			this.anInt7327 = this.aClass343_199.method8157(1);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!jn;[IJ)Ljava/lang/String;")
	public String method6446(@OriginalArg(1) Class178 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface25_1 != null) {
			@Pc(18) String local18 = this.anInterface25_1.method7852(arg1, arg2, arg0);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Lclient!jb;")
	public Class3_Sub7_Sub14 method6447(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub14 local11 = (Class3_Sub7_Sub14) this.aClass136_47.method3134((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = this.aClass343_199.method8132(1, arg0 & 0x7FFF);
		} else {
			local34 = this.aClass343_198.method8132(1, arg0);
		}
		local11 = new Class3_Sub7_Sub14();
		local11.aClass257_2 = this;
		if (local34 != null) {
			local11.method4297(new Class3_Sub9(local34));
		}
		if (arg0 >= 32768) {
			local11.method4302();
		}
		this.aClass136_47.method3135(local11, (long) arg0);
		return local11;
	}
}
