import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class36 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!pca;")
	private final Class245 aClass245_12 = new Class245(64);

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Lclient!jo;")
	private final Class168 aClass168_16;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class36(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_16 = arg2;
		this.aClass168_16.method4443(5);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Lclient!dfa;")
	public Class6_Sub4_Sub3 method1096(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_12;
		@Pc(16) Class6_Sub4_Sub3 local16;
		synchronized (this.aClass245_12) {
			local16 = (Class6_Sub4_Sub3) this.aClass245_12.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class168 local37 = this.aClass168_16;
		@Pc(46) byte[] local46;
		synchronized (this.aClass168_16) {
			local46 = this.aClass168_16.method4435(arg0, 5);
		}
		local16 = new Class6_Sub4_Sub3();
		if (local46 != null) {
			local16.method2006(new Class6_Sub26(local46));
		}
		@Pc(68) Class245 local68 = this.aClass245_12;
		synchronized (this.aClass245_12) {
			this.aClass245_12.method6075(local16, (long) arg0);
			return local16;
		}
	}
}
