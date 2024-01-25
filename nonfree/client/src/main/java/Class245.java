import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class245 {

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!uf;")
	private final Class326 aClass326_35 = new Class326(64);

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_93;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
	public final int anInt6779;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class245(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_93 = arg2;
		this.anInt6779 = this.aClass111_93.method2442(19);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Lclient!qo;")
	public Class270 method5572(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_35;
		@Pc(16) Class270 local16;
		synchronized (this.aClass326_35) {
			local16 = (Class270) this.aClass326_35.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_93;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_93) {
			local38 = this.aClass111_93.method2441(arg0, 19);
		}
		local16 = new Class270();
		if (local38 != null) {
			local16.method6324(new Class1_Sub20(local38));
		}
		@Pc(60) Class326 local60 = this.aClass326_35;
		synchronized (this.aClass326_35) {
			this.aClass326_35.method7236(local16, (long) arg0);
			return local16;
		}
	}
}
