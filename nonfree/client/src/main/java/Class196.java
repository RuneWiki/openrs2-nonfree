import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class196 {

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
	public int anInt5066;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Lclient!tl;")
	private final Class227 aClass227_38 = new Class227(64);

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!tl;")
	public final Class227 aClass227_39 = new Class227(50);

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!tl;")
	public final Class227 aClass227_40 = new Class227(5);

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!ui;")
	public final Class230 aClass230_69;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Lclient!ui;")
	private final Class230 aClass230_68;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!gp;IZLclient!ui;Lclient!ui;)V")
	public Class196(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class230 arg3, @OriginalArg(4) Class230 arg4) {
		this.aClass230_69 = arg4;
		this.aClass230_68 = arg3;
		this.aBoolean480 = arg2;
		if (this.aClass230_68 != null) {
			@Pc(38) int local38 = this.aClass230_68.method4969() - 1;
			this.aClass230_68.method4956(local38);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public void method4443() {
		@Pc(10) Class227 local10 = this.aClass227_38;
		synchronized (this.aClass227_38) {
			this.aClass227_38.method4859(5);
		}
		local10 = this.aClass227_39;
		synchronized (this.aClass227_39) {
			this.aClass227_39.method4859(5);
		}
		local10 = this.aClass227_40;
		synchronized (this.aClass227_40) {
			this.aClass227_40.method4859(5);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method4446() {
		@Pc(2) Class227 local2 = this.aClass227_38;
		synchronized (this.aClass227_38) {
			this.aClass227_38.method4871();
		}
		local2 = this.aClass227_39;
		synchronized (this.aClass227_39) {
			this.aClass227_39.method4871();
		}
		local2 = this.aClass227_40;
		synchronized (this.aClass227_40) {
			this.aClass227_40.method4871();
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V")
	public void method4448(@OriginalArg(0) int arg0) {
		this.anInt5066 = arg0;
		@Pc(9) Class227 local9 = this.aClass227_39;
		synchronized (this.aClass227_39) {
			this.aClass227_39.method4871();
		}
		local9 = this.aClass227_40;
		synchronized (this.aClass227_40) {
			this.aClass227_40.method4871();
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method4449() {
		@Pc(6) Class227 local6 = this.aClass227_39;
		synchronized (this.aClass227_39) {
			this.aClass227_39.method4871();
		}
		local6 = this.aClass227_40;
		synchronized (this.aClass227_40) {
			this.aClass227_40.method4871();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public void method4451() {
		@Pc(2) Class227 local2 = this.aClass227_38;
		synchronized (this.aClass227_38) {
			this.aClass227_38.method4858();
		}
		local2 = this.aClass227_39;
		synchronized (this.aClass227_39) {
			this.aClass227_39.method4858();
		}
		local2 = this.aClass227_40;
		synchronized (this.aClass227_40) {
			this.aClass227_40.method4858();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)Lclient!dr;")
	public Class59 method4452(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_38;
		@Pc(16) Class59 local16;
		synchronized (this.aClass227_38) {
			local16 = (Class59) this.aClass227_38.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass230_68.method4985(Static39.method584(arg0), Static393.method5572(arg0));
		local16 = new Class59();
		local16.aClass196_1 = this;
		local16.anInt1425 = arg0;
		if (local39 != null) {
			local16.method1152(new Class1_Sub33(local39));
		}
		local16.method1155();
		@Pc(71) Class227 local71 = this.aClass227_38;
		synchronized (this.aClass227_38) {
			this.aClass227_38.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BZ)V")
	public void method4453(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean480 != arg0) {
			this.aBoolean480 = arg0;
			this.method4446();
		}
	}
}
