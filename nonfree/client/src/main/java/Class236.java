import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class236 {

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Lclient!ng;")
	private final Class167 aClass167_90 = new Class167(64);

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Lclient!ic;")
	private final Class113 aClass113_121;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!ic;")
	private final Class113 aClass113_122;

	static {
		new Class151("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(ILclient!ic;Lclient!ic;)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_121 = arg2;
		this.aClass113_122 = arg1;
		if (this.aClass113_122 != null) {
			this.aClass113_122.method2271(0);
		}
		if (this.aClass113_121 != null) {
			this.aClass113_121.method2271(0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)Lclient!hg;")
	public Class1_Sub3_Sub8 method4977(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub3_Sub8 local11 = (Class1_Sub3_Sub8) this.aClass167_90.method3386((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass113_121.method2274(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass113_122.method2274(0, arg0);
		}
		local11 = new Class1_Sub3_Sub8();
		if (local27 != null) {
			local11.method2147(new Class1_Sub11(local27));
		}
		if (arg0 >= 32768) {
			local11.method2144();
		}
		this.aClass167_90.method3392(local11, (long) arg0);
		return local11;
	}
}
