import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class163 {

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
	public int anInt4617 = 0;

	@OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
	public int anInt4618 = 0;

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "Lclient!tq;")
	private final Class340 aClass340_27 = new Class340(64);

	@OriginalMember(owner = "client!iga", name = "k", descriptor = "Lclient!nw;")
	private Interface18 anInterface18_1 = null;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "Lclient!wm;")
	private final Class390 aClass390_59;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "Lclient!wm;")
	private final Class390 aClass390_58;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(ILclient!wm;Lclient!wm;Lclient!nw;)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Interface18 arg3) {
		this.anInterface18_1 = arg3;
		this.aClass390_59 = arg1;
		this.aClass390_58 = arg2;
		if (this.aClass390_59 != null) {
			this.anInt4617 = this.aClass390_59.method8913(1);
		}
		if (this.aClass390_58 != null) {
			this.anInt4618 = this.aClass390_58.method8913(1);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)Lclient!dm;")
	public Class5_Sub3_Sub2 method3900(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub3_Sub2 local11 = (Class5_Sub3_Sub2) this.aClass340_27.method7999((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass390_58.method8914(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass390_59.method8914(1, arg0);
		}
		local11 = new Class5_Sub3_Sub2();
		local11.aClass163_1 = this;
		if (local29 != null) {
			local11.method2131(new Class5_Sub41(local29));
		}
		if (arg0 >= 32768) {
			local11.method2137();
		}
		this.aClass340_27.method7986((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!gh;JI[I)Ljava/lang/String;")
	public String method3902(@OriginalArg(0) Class131 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface18_1 != null) {
			@Pc(18) String local18 = this.anInterface18_1.method351(arg1, arg2, arg0);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg1);
	}
}
