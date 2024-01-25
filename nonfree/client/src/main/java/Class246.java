import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class246 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
	public int anInt6232 = 0;

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
	public int anInt6233 = 0;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_63 = new Class307(64);

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "Lclient!se;")
	private Interface22 anInterface22_1 = null;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "Lclient!ik;")
	private final Class182 aClass182_83;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "Lclient!ik;")
	private final Class182 aClass182_82;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(ILclient!ik;Lclient!ik;Lclient!se;)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Interface22 arg3) {
		this.aClass182_83 = arg2;
		this.anInterface22_1 = arg3;
		this.aClass182_82 = arg1;
		if (this.aClass182_82 != null) {
			this.anInt6232 = this.aClass182_82.method3970(1);
		}
		if (this.aClass182_83 != null) {
			this.anInt6233 = this.aClass182_83.method3970(1);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IB)Lclient!ud;")
	public Class3_Sub7_Sub20 method5420(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub7_Sub20 local11 = (Class3_Sub7_Sub20) this.aClass307_63.method7002((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = this.aClass182_83.method3985(arg0 & 0x7FFF, 1);
		} else {
			local30 = this.aClass182_82.method3985(arg0, 1);
		}
		local11 = new Class3_Sub7_Sub20();
		local11.aClass246_2 = this;
		if (local30 != null) {
			local11.method8496(new Class3_Sub2(local30));
		}
		if (arg0 >= 32768) {
			local11.method8501();
		}
		this.aClass307_63.method7000(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "([ILclient!fr;IJ)Ljava/lang/String;")
	public String method5422(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface22_1 != null) {
			@Pc(21) String local21 = this.anInterface22_1.method3000(arg0, arg2, arg1);
			if (local21 != null) {
				return local21;
			}
		}
		return Long.toString(arg2);
	}
}
