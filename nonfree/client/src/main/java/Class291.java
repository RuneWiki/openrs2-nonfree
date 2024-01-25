import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class291 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public int anInt8601 = 0;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public int anInt8600 = 0;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Lclient!fc;")
	private final Class94 aClass94_46 = new Class94(64);

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Lclient!aia;")
	private Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Lclient!ni;")
	private final Class223 aClass223_115;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!ni;")
	private final Class223 aClass223_114;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ILclient!ni;Lclient!ni;Lclient!aia;)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Interface1 arg3) {
		this.aClass223_115 = arg1;
		this.anInterface1_1 = arg3;
		this.aClass223_114 = arg2;
		if (this.aClass223_115 != null) {
			this.anInt8600 = this.aClass223_115.method5970(1);
		}
		if (this.aClass223_114 != null) {
			this.anInt8601 = this.aClass223_114.method5970(1);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!gj;")
	public Class6_Sub5_Sub14 method7162(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub5_Sub14 local11 = (Class6_Sub5_Sub14) this.aClass94_46.method2960((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(39) byte[] local39;
		if (arg0 >= 32768) {
			local39 = this.aClass223_114.method5954(arg0 & 0x7FFF, 1);
		} else {
			local39 = this.aClass223_115.method5954(arg0, 1);
		}
		local11 = new Class6_Sub5_Sub14();
		local11.aClass291_2 = this;
		if (local39 != null) {
			local11.method3492(new Class6_Sub8(local39));
		}
		if (arg0 >= 32768) {
			local11.method3483();
		}
		this.aClass94_46.method2963((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!vea;[IBJ)Ljava/lang/String;")
	public String method7163(@OriginalArg(0) Class352 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface1_1 != null) {
			@Pc(22) String local22 = this.anInterface1_1.method6822(arg2, arg0, arg1);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg2);
	}
}
