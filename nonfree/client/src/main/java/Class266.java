import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class266 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public int anInt7495 = 0;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	public int anInt7501 = 0;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!vh;")
	private final Class330 aClass330_52 = new Class330(64);

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!qe;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!pj;")
	private final Class248 aClass248_80;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Lclient!pj;")
	private final Class248 aClass248_79;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(ILclient!pj;Lclient!pj;Lclient!qe;)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Interface16 arg3) {
		this.aClass248_80 = arg2;
		this.anInterface16_1 = arg3;
		this.aClass248_79 = arg1;
		if (this.aClass248_79 != null) {
			this.anInt7501 = this.aClass248_79.method5793(1);
		}
		if (this.aClass248_80 != null) {
			this.anInt7495 = this.aClass248_80.method5793(1);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lclient!pg;")
	public Class6_Sub5_Sub14 method5987(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub5_Sub14 local11 = (Class6_Sub5_Sub14) this.aClass330_52.method7677((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass248_80.method5797(1, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass248_79.method5797(1, arg0);
		}
		local11 = new Class6_Sub5_Sub14();
		local11.aClass266_2 = this;
		if (local27 != null) {
			local11.method5750(new Class6_Sub12(local27));
		}
		if (arg0 >= 32768) {
			local11.method5745();
		}
		this.aClass330_52.method7676(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!laa;[IJB)Ljava/lang/String;")
	public String method5989(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(14) String local14 = this.anInterface16_1.method4619(arg1, arg2, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}
}
