import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class51 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!d;")
	private Class44 aClass44_10 = new Class44(64);

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Lclient!d;")
	public Class44 aClass44_11 = new Class44(64);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!um;")
	public final Class243 aClass243_46;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!um;")
	private final Class243 aClass243_47;

	static {
		new Class198("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;Lclient!um;)V")
	public Class51(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		this.aClass243_46 = arg3;
		this.aClass243_47 = arg2;
		this.aClass243_47.method5472(34);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public void method1139() {
		@Pc(6) Class44 local6 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1025(5);
		}
		local6 = this.aClass44_11;
		synchronized (this.aClass44_11) {
			this.aClass44_11.method1025(5);
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Lclient!ef;")
	public Class59 method1140(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_10;
		@Pc(16) Class59 local16;
		synchronized (this.aClass44_10) {
			local16 = (Class59) this.aClass44_10.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_47;
		@Pc(40) byte[] local40;
		synchronized (this.aClass243_47) {
			local40 = this.aClass243_47.method5455(arg0, 34);
		}
		local16 = new Class59();
		local16.aClass51_1 = this;
		if (local40 != null) {
			local16.method1324(new Class5_Sub15(local40));
		}
		@Pc(65) Class44 local65 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
	public void method1141() {
		@Pc(2) Class44 local2 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1024();
		}
		local2 = this.aClass44_11;
		synchronized (this.aClass44_11) {
			this.aClass44_11.method1024();
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V")
	public void method1142() {
		@Pc(2) Class44 local2 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1031();
		}
		local2 = this.aClass44_11;
		synchronized (this.aClass44_11) {
			this.aClass44_11.method1031();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public void method1144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass44_10 = new Class44(arg1);
		this.aClass44_11 = new Class44(arg0);
	}
}
