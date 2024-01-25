import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class221 {

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
	public int anInt6226 = 0;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public int anInt6229 = 0;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "Lclient!pca;")
	private final Class245 aClass245_48 = new Class245(64);

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "Lclient!oo;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "Lclient!jo;")
	private final Class168 aClass168_81;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "Lclient!jo;")
	private final Class168 aClass168_82;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(ILclient!jo;Lclient!jo;Lclient!oo;)V")
	public Class221(@OriginalArg(0) int arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Interface16 arg3) {
		this.anInterface16_1 = arg3;
		this.aClass168_81 = arg2;
		this.aClass168_82 = arg1;
		if (this.aClass168_82 != null) {
			this.anInt6229 = this.aClass168_82.method4443(1);
		}
		if (this.aClass168_81 != null) {
			this.anInt6226 = this.aClass168_81.method4443(1);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B[ILclient!fv;J)Ljava/lang/String;")
	public String method5318(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(19) String local19 = this.anInterface16_1.method7633(arg2, arg1, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)Lclient!baa;")
	public Class6_Sub4_Sub1 method5320(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub4_Sub1 local11 = (Class6_Sub4_Sub1) this.aClass245_48.method6082((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass168_82.method4435(arg0, 1);
		} else {
			local25 = this.aClass168_81.method4435(arg0 & 0x7FFF, 1);
		}
		local11 = new Class6_Sub4_Sub1();
		local11.aClass221_1 = this;
		if (local25 != null) {
			local11.method964(new Class6_Sub26(local25));
		}
		if (arg0 >= 32768) {
			local11.method957();
		}
		this.aClass245_48.method6075(local11, (long) arg0);
		return local11;
	}
}
