import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class249 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "Lclient!tl;")
	private Class227 aClass227_55 = new Class227(128);

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "Lclient!tl;")
	public Class227 aClass227_56 = new Class227(64);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!ui;")
	public final Class230 aClass230_91;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!ui;")
	private final Class230 aClass230_92;

	static {
		new Class169(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;Lclient!ui;)V")
	public Class249(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3) {
		this.aClass230_91 = arg3;
		this.aClass230_92 = arg2;
		this.aClass230_92.method4956(36);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public void method5521() {
		@Pc(2) Class227 local2 = this.aClass227_55;
		synchronized (this.aClass227_55) {
			this.aClass227_55.method4859(5);
		}
		local2 = this.aClass227_56;
		synchronized (this.aClass227_56) {
			this.aClass227_56.method4859(5);
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)Lclient!gu;")
	public Class97 method5522(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_55;
		@Pc(16) Class97 local16;
		synchronized (this.aClass227_55) {
			local16 = (Class97) this.aClass227_55.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_92.method4985(arg0, 36);
		local16 = new Class97();
		local16.anInt2284 = arg0;
		local16.aClass249_2 = this;
		if (local33 != null) {
			local16.method1858(new Class1_Sub33(local33));
		}
		local16.method1855();
		@Pc(63) Class227 local63 = this.aClass227_55;
		synchronized (this.aClass227_55) {
			this.aClass227_55.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public void method5523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass227_55 = new Class227(arg0);
		this.aClass227_56 = new Class227(arg1);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public void method5524() {
		@Pc(6) Class227 local6 = this.aClass227_55;
		synchronized (this.aClass227_55) {
			this.aClass227_55.method4858();
		}
		local6 = this.aClass227_56;
		synchronized (this.aClass227_56) {
			this.aClass227_56.method4858();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public void method5525() {
		@Pc(2) Class227 local2 = this.aClass227_55;
		synchronized (this.aClass227_55) {
			this.aClass227_55.method4871();
		}
		local2 = this.aClass227_56;
		synchronized (this.aClass227_56) {
			this.aClass227_56.method4871();
		}
	}
}
