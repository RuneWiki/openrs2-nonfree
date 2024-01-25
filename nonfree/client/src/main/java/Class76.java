import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class76 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!uf;")
	private final Class326 aClass326_8 = new Class326(64);

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!ga;")
	private final Class111 aClass111_24;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class76(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_24 = arg2;
		this.aClass111_24.method2442(5);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Lclient!ps;")
	public Class1_Sub3_Sub15 method1861(@OriginalArg(1) int arg0) {
		@Pc(11) Class326 local11 = this.aClass326_8;
		@Pc(21) Class1_Sub3_Sub15 local21;
		synchronized (this.aClass326_8) {
			local21 = (Class1_Sub3_Sub15) this.aClass326_8.method7238((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class111 local34 = this.aClass111_24;
		@Pc(43) byte[] local43;
		synchronized (this.aClass111_24) {
			local43 = this.aClass111_24.method2441(arg0, 5);
		}
		local21 = new Class1_Sub3_Sub15();
		if (local43 != null) {
			local21.method5822(new Class1_Sub20(local43));
		}
		@Pc(65) Class326 local65 = this.aClass326_8;
		synchronized (this.aClass326_8) {
			this.aClass326_8.method7236(local21, (long) arg0);
			return local21;
		}
	}
}
