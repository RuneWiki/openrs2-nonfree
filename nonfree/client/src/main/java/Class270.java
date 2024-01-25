import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class270 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!mga;")
	private final Class223 aClass223_48 = new Class223(64);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_91;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public final int anInt7161;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class270(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_91 = arg2;
		if (this.aClass31_91 == null) {
			this.anInt7161 = 0;
		} else {
			this.anInt7161 = this.aClass31_91.method657(16);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
	public void method5936() {
		@Pc(2) Class223 local2 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method4933(5);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Lclient!hc;")
	public Class136 method5937(@OriginalArg(0) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_48;
		@Pc(21) Class136 local21;
		synchronized (this.aClass223_48) {
			local21 = (Class136) this.aClass223_48.method4943((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class31 local34 = this.aClass31_91;
		@Pc(43) byte[] local43;
		synchronized (this.aClass31_91) {
			local43 = this.aClass31_91.method667(16, arg0);
		}
		local21 = new Class136();
		if (local43 != null) {
			local21.method3426(new Class4_Sub9(local43));
		}
		@Pc(65) Class223 local65 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method4938((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public void method5938() {
		@Pc(6) Class223 local6 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method4932();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public void method5940() {
		@Pc(2) Class223 local2 = this.aClass223_48;
		synchronized (this.aClass223_48) {
			this.aClass223_48.method4941();
		}
	}
}
