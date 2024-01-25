import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class295 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	public int anInt8603 = 0;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public int anInt8605 = 0;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Lclient!mq;")
	private final Class223 aClass223_58 = new Class223(64);

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "Lclient!fo;")
	private Interface12 anInterface12_1 = null;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_111;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Lclient!jn;")
	private final Class176 aClass176_112;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILclient!jn;Lclient!jn;Lclient!fo;)V")
	public Class295(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Interface12 arg3) {
		this.anInterface12_1 = arg3;
		this.aClass176_111 = arg2;
		this.aClass176_112 = arg1;
		if (this.aClass176_112 != null) {
			this.anInt8603 = this.aClass176_112.method3999(1);
		}
		if (this.aClass176_111 != null) {
			this.anInt8605 = this.aClass176_111.method3999(1);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(JI[ILclient!gfa;)Ljava/lang/String;")
	public String method7019(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class116 arg2) {
		if (this.anInterface12_1 != null) {
			@Pc(14) String local14 = this.anInterface12_1.method3230(arg1, arg2, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Lclient!jc;")
	public Class4_Sub5_Sub9 method7021(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub5_Sub9 local16 = (Class4_Sub5_Sub9) this.aClass223_58.method5388((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = this.aClass176_112.method3994(arg0, 1);
		} else {
			local30 = this.aClass176_111.method3994(arg0 & 0x7FFF, 1);
		}
		local16 = new Class4_Sub5_Sub9();
		local16.aClass295_2 = this;
		if (local30 != null) {
			local16.method3764(new Class4_Sub11(local30));
		}
		if (arg0 >= 32768) {
			local16.method3771();
		}
		this.aClass223_58.method5394(local16, (long) arg0);
		return local16;
	}
}
