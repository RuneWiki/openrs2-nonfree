import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class44 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public int anInt875 = 0;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public int anInt877 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!vi;")
	private final Class332 aClass332_30 = new Class332(64);

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!ag;")
	private Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!pq;")
	private final Class251 aClass251_19;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!pq;")
	private final Class251 aClass251_20;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILclient!pq;Lclient!pq;Lclient!ag;)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Interface1 arg3) {
		this.aClass251_19 = arg1;
		this.anInterface1_1 = arg3;
		this.aClass251_20 = arg2;
		if (this.aClass251_19 != null) {
			this.anInt877 = this.aClass251_19.method5849(1);
		}
		if (this.aClass251_20 != null) {
			this.anInt875 = this.aClass251_20.method5849(1);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!ak;")
	public Class6_Sub1_Sub2 method690(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub1_Sub2 local11 = (Class6_Sub1_Sub2) this.aClass332_30.method7502((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass251_19.method5860(1, arg0);
		} else {
			local25 = this.aClass251_20.method5860(1, arg0 & 0x7FFF);
		}
		local11 = new Class6_Sub1_Sub2();
		local11.aClass44_3 = this;
		if (local25 != null) {
			local11.method197(new Class6_Sub14(local25));
		}
		if (arg0 >= 32768) {
			local11.method207();
		}
		this.aClass332_30.method7498((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([IJLclient!lp;Z)Ljava/lang/String;")
	public String method692(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class188 arg2) {
		if (this.anInterface1_1 != null) {
			@Pc(24) String local24 = this.anInterface1_1.method5559(arg0, arg1, arg2);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg1);
	}
}
