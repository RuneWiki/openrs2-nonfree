import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class347 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lclient!iha;")
	private final Class168 aClass168_81 = new Class168(64);

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "Lclient!gda;")
	private final Class126 aClass126_259;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class347(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_259 = arg2;
		this.aClass126_259.method3062(5);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lclient!lk;")
	public Class5_Sub1_Sub11 method7721(@OriginalArg(0) int arg0) {
		@Pc(17) Class168 local17 = this.aClass168_81;
		@Pc(27) Class5_Sub1_Sub11 local27;
		synchronized (this.aClass168_81) {
			local27 = (Class5_Sub1_Sub11) this.aClass168_81.method3860((long) arg0);
		}
		if (local27 != null) {
			return local27;
		}
		@Pc(41) Class126 local41 = this.aClass126_259;
		@Pc(50) byte[] local50;
		synchronized (this.aClass126_259) {
			local50 = this.aClass126_259.method3086(arg0, 5);
		}
		local27 = new Class5_Sub1_Sub11();
		if (local50 != null) {
			local27.method5067(new Class5_Sub36(local50));
		}
		@Pc(74) Class168 local74 = this.aClass168_81;
		synchronized (this.aClass168_81) {
			this.aClass168_81.method3853((long) arg0, local27);
			return local27;
		}
	}
}
