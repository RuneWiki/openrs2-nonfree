import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class362 {

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
	public int anInt9529 = 0;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public int anInt9531 = 0;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!uf;")
	private final Class326 aClass326_58 = new Class326(64);

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!hn;")
	private Interface10 anInterface10_1 = null;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!ga;")
	private final Class111 aClass111_129;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!ga;")
	private final Class111 aClass111_130;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(ILclient!ga;Lclient!ga;Lclient!hn;)V")
	public Class362(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Interface10 arg3) {
		this.aClass111_129 = arg1;
		this.aClass111_130 = arg2;
		this.anInterface10_1 = arg3;
		if (this.aClass111_129 != null) {
			this.anInt9529 = this.aClass111_129.method2442(1);
		}
		if (this.aClass111_130 != null) {
			this.anInt9531 = this.aClass111_130.method2442(1);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[IJLclient!lg;)Ljava/lang/String;")
	public String method7871(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class201 arg2) {
		if (this.anInterface10_1 != null) {
			@Pc(24) String local24 = this.anInterface10_1.method1876(arg1, arg2, arg0);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Lclient!bca;")
	public Class1_Sub3_Sub3 method7873(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub3_Sub3 local11 = (Class1_Sub3_Sub3) this.aClass326_58.method7238((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass111_130.method2441(arg0 & 0x7FFF, 1);
		} else {
			local29 = this.aClass111_129.method2441(arg0, 1);
		}
		local11 = new Class1_Sub3_Sub3();
		local11.aClass362_1 = this;
		if (local29 != null) {
			local11.method811(new Class1_Sub20(local29));
		}
		if (arg0 >= 32768) {
			local11.method810();
		}
		this.aClass326_58.method7236(local11, (long) arg0);
		return local11;
	}
}
