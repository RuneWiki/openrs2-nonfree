import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Lclient!tq;")
	public final Class55_Sub3_Sub1 aClass55_Sub3_Sub1_5;

	static {
		new Class209("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ef;II[B)V")
	public Class73_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass55_Sub3_Sub1_5 = Static205.method3256(arg2, arg0, arg1, arg3);
		this.aClass55_Sub3_Sub1_5.method5116(false, false);
	}
}
