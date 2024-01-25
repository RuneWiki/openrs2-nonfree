import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class180 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public int anInt4240 = 0;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public int anInt4239 = 0;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!dka;")
	private final Class85 aClass85_30 = new Class85(64);

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!ww;")
	private Interface27 anInterface27_1 = null;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "Lclient!nca;")
	private final Class254 aClass254_90;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!nca;")
	private final Class254 aClass254_89;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ILclient!nca;Lclient!nca;Lclient!ww;)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Interface27 arg3) {
		this.anInterface27_1 = arg3;
		this.aClass254_90 = arg2;
		this.aClass254_89 = arg1;
		if (this.aClass254_89 != null) {
			this.anInt4239 = this.aClass254_89.method6101(1);
		}
		if (this.aClass254_90 != null) {
			this.anInt4240 = this.aClass254_90.method6101(1);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(JI[ILclient!ji;)Ljava/lang/String;")
	public String method3842(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class197 arg2) {
		if (this.anInterface27_1 != null) {
			@Pc(22) String local22 = this.anInterface27_1.method9476(arg2, arg0, arg1);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lclient!jo;")
	public Class2_Sub6_Sub8 method3843(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub6_Sub8 local13 = (Class2_Sub6_Sub8) this.aClass85_30.method1737((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(34) byte[] local34;
		if (arg0 < 32768) {
			local34 = this.aClass254_89.method6087(arg0, 1);
		} else {
			local34 = this.aClass254_90.method6087(arg0 & 0x7FFF, 1);
		}
		local13 = new Class2_Sub6_Sub8();
		local13.aClass180_1 = this;
		if (local34 != null) {
			local13.method4312(new Class2_Sub20(local34));
		}
		if (arg0 >= 32768) {
			local13.method4315();
		}
		this.aClass85_30.method1745((long) arg0, 16383, local13);
		return local13;
	}
}
