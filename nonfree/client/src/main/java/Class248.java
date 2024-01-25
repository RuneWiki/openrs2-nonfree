import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class248 {

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
	public int anInt6817 = 0;

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
	public int anInt6818 = 0;

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "Lclient!hm;")
	private final Class136 aClass136_77 = new Class136(64);

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "Lclient!dea;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_92;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_91;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILclient!pfa;Lclient!pfa;Lclient!dea;)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Interface3 arg3) {
		this.anInterface3_1 = arg3;
		this.aClass251_92 = arg1;
		this.aClass251_91 = arg2;
		if (this.aClass251_92 != null) {
			this.anInt6817 = this.aClass251_92.method5768(1);
		}
		if (this.aClass251_91 != null) {
			this.anInt6818 = this.aClass251_91.method5768(1);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!vf;[IIJ)Ljava/lang/String;")
	public String method5724(@OriginalArg(0) Class342 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(14) String local14 = this.anInterface3_1.method4643(arg2, arg1, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)Lclient!dw;")
	public Class6_Sub2_Sub5 method5726(@OriginalArg(0) int arg0) {
		@Pc(19) Class6_Sub2_Sub5 local19 = (Class6_Sub2_Sub5) this.aClass136_77.method3473((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass251_92.method5772(arg0, 1);
		} else {
			local33 = this.aClass251_91.method5772(arg0 & 0x7FFF, 1);
		}
		local19 = new Class6_Sub2_Sub5();
		local19.aClass248_1 = this;
		if (local33 != null) {
			local19.method1823(new Class6_Sub21(local33));
		}
		if (arg0 >= 32768) {
			local19.method1829();
		}
		this.aClass136_77.method3482((long) arg0, local19);
		return local19;
	}
}
