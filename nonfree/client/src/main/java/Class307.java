import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class307 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!tb;")
	private final Class313 aClass313_52 = new Class313(64);

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!pl;")
	private final Class259 aClass259_154;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class307(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_154 = arg2;
		this.aClass259_154.method5969(5);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lclient!no;")
	public Class2_Sub3_Sub11 method6856(@OriginalArg(1) int arg0) {
		@Pc(11) Class313 local11 = this.aClass313_52;
		@Pc(21) Class2_Sub3_Sub11 local21;
		synchronized (this.aClass313_52) {
			local21 = (Class2_Sub3_Sub11) this.aClass313_52.method6989((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class259 local34 = this.aClass259_154;
		@Pc(43) byte[] local43;
		synchronized (this.aClass259_154) {
			local43 = this.aClass259_154.method5985(arg0, 5);
		}
		local21 = new Class2_Sub3_Sub11();
		if (local43 != null) {
			local21.method5438(new Class2_Sub15(local43));
		}
		@Pc(65) Class313 local65 = this.aClass313_52;
		synchronized (this.aClass313_52) {
			this.aClass313_52.method6980((long) arg0, local21);
			return local21;
		}
	}
}
