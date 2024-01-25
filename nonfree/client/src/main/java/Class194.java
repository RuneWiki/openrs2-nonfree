import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class194 {

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!uf;")
	private final Class326 aClass326_25 = new Class326(256);

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!ga;")
	private final Class111 aClass111_65;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class194(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_65 = arg2;
		this.aClass111_65.method2442(26);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public void method4314() {
		@Pc(2) Class326 local2 = this.aClass326_25;
		synchronized (this.aClass326_25) {
			this.aClass326_25.method7230();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
	public void method4315() {
		@Pc(2) Class326 local2 = this.aClass326_25;
		synchronized (this.aClass326_25) {
			this.aClass326_25.method7241(5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)Lclient!b;")
	public Class1_Sub3_Sub2 method4318(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_25;
		@Pc(16) Class1_Sub3_Sub2 local16;
		synchronized (this.aClass326_25) {
			local16 = (Class1_Sub3_Sub2) this.aClass326_25.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_65;
		@Pc(40) byte[] local40;
		synchronized (this.aClass111_65) {
			local40 = this.aClass111_65.method2441(arg0, 26);
		}
		local16 = new Class1_Sub3_Sub2();
		if (local40 != null) {
			local16.method768(new Class1_Sub20(local40));
		}
		@Pc(64) Class326 local64 = this.aClass326_25;
		synchronized (this.aClass326_25) {
			this.aClass326_25.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public void method4319() {
		@Pc(6) Class326 local6 = this.aClass326_25;
		synchronized (this.aClass326_25) {
			this.aClass326_25.method7234();
		}
	}
}
