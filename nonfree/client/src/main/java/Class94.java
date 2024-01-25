import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class94 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lclient!ng;")
	private final Class167 aClass167_34 = new Class167(64);

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!ic;")
	private final Class113 aClass113_44;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public final int anInt2299;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class94(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_44 = arg2;
		this.anInt2299 = this.aClass113_44.method2271(19);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)Lclient!uj;")
	public Class243 method1816(@OriginalArg(1) int arg0) {
		@Pc(12) Class167 local12 = this.aClass167_34;
		@Pc(22) Class243 local22;
		synchronized (this.aClass167_34) {
			local22 = (Class243) this.aClass167_34.method3386((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass113_44.method2274(19, arg0);
		local22 = new Class243();
		if (local39 != null) {
			local22.method5107(new Class1_Sub11(local39));
		}
		@Pc(55) Class167 local55 = this.aClass167_34;
		synchronized (this.aClass167_34) {
			this.aClass167_34.method3392(local22, (long) arg0);
			return local22;
		}
	}
}
