import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class227 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public int anInt5566 = 0;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public int anInt5568 = 0;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "Lclient!au;")
	private final Class21 aClass21_53 = new Class21(64);

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!d;")
	private Interface5 anInterface5_1 = null;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!mv;")
	private final Class229 aClass229_81;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!mv;")
	private final Class229 aClass229_82;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILclient!mv;Lclient!mv;Lclient!d;)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Interface5 arg3) {
		this.aClass229_81 = arg1;
		this.anInterface5_1 = arg3;
		this.aClass229_82 = arg2;
		if (this.aClass229_81 != null) {
			this.anInt5568 = this.aClass229_81.method4981(1);
		}
		if (this.aClass229_82 != null) {
			this.anInt5566 = this.aClass229_82.method4981(1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!cq;[IJB)Ljava/lang/String;")
	public String method4796(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface5_1 != null) {
			@Pc(14) String local14 = this.anInterface5_1.method4081(arg1, arg0, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)Lclient!mn;")
	public Class2_Sub2_Sub13 method4797(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2_Sub13 local16 = (Class2_Sub2_Sub13) this.aClass21_53.method324((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = this.aClass229_82.method4980(1, arg0 & 0x7FFF);
		} else {
			local34 = this.aClass229_81.method4980(1, arg0);
		}
		local16 = new Class2_Sub2_Sub13();
		local16.aClass227_3 = this;
		if (local34 != null) {
			local16.method4795(new Class2_Sub7(local34));
		}
		if (arg0 >= 32768) {
			local16.method4789();
		}
		this.aClass21_53.method317(local16, (long) arg0);
		return local16;
	}
}
