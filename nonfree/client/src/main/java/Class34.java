import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class34 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!wf;")
	private final Class316 aClass316_5 = new Class316(64);

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!kda;")
	public final Class160 aClass160_7;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!kda;")
	private final Class160 aClass160_6;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;Lclient!kda;)V")
	public Class34(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_7 = arg3;
		this.aClass160_6 = arg2;
		this.aClass160_6.method4207(3);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)Lclient!om;")
	public Class219 method1364(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_5;
		@Pc(16) Class219 local16;
		synchronized (this.aClass316_5) {
			local16 = (Class219) this.aClass316_5.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_6;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_6) {
			local38 = this.aClass160_6.method4198(arg0, 3);
		}
		local16 = new Class219();
		local16.aClass34_1 = this;
		if (local38 != null) {
			local16.method5556(new Class1_Sub13(local38));
		}
		@Pc(68) Class316 local68 = this.aClass316_5;
		synchronized (this.aClass316_5) {
			this.aClass316_5.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method1365() {
		@Pc(2) Class316 local2 = this.aClass316_5;
		synchronized (this.aClass316_5) {
			this.aClass316_5.method7794();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public void method1367() {
		@Pc(2) Class316 local2 = this.aClass316_5;
		synchronized (this.aClass316_5) {
			this.aClass316_5.method7803();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public void method1370() {
		@Pc(6) Class316 local6 = this.aClass316_5;
		synchronized (this.aClass316_5) {
			this.aClass316_5.method7791(5);
		}
	}
}
