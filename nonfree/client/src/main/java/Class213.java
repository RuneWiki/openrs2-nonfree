import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class213 {

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
	public int anInt6346 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public int anInt6344 = 0;

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "Lclient!jn;")
	private final Class167 aClass167_29 = new Class167(64);

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "Lclient!lca;")
	private Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "Lclient!vo;")
	private final Class348 aClass348_66;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "Lclient!vo;")
	private final Class348 aClass348_67;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(ILclient!vo;Lclient!vo;Lclient!lca;)V")
	public Class213(@OriginalArg(0) int arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Interface13 arg3) {
		this.aClass348_66 = arg2;
		this.anInterface13_1 = arg3;
		this.aClass348_67 = arg1;
		if (this.aClass348_67 != null) {
			this.anInt6346 = this.aClass348_67.method7981(1);
		}
		if (this.aClass348_66 != null) {
			this.anInt6344 = this.aClass348_66.method7981(1);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(J[IZLclient!dc;)Ljava/lang/String;")
	public String method4999(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class68 arg2) {
		if (this.anInterface13_1 != null) {
			@Pc(22) String local22 = this.anInterface13_1.method1825(arg1, arg2, arg0);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IB)Lclient!dn;")
	public Class4_Sub6_Sub3 method5000(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub6_Sub3 local11 = (Class4_Sub6_Sub3) this.aClass167_29.method3966((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass348_66.method7964(arg0 & 0x7FFF, 1);
		} else {
			local29 = this.aClass348_67.method7964(arg0, 1);
		}
		local11 = new Class4_Sub6_Sub3();
		local11.aClass213_1 = this;
		if (local29 != null) {
			local11.method1921(new Class4_Sub13(local29));
		}
		if (arg0 >= 32768) {
			local11.method1920();
		}
		this.aClass167_29.method3974((long) arg0, local11);
		return local11;
	}
}
