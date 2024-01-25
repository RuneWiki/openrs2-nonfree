import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class135 {

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!ng;")
	private Class167 aClass167_55 = new Class167(64);

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!ng;")
	public Class167 aClass167_56 = new Class167(64);

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!ic;")
	public final Class113 aClass113_69;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!ic;")
	private final Class113 aClass113_70;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;Lclient!ic;)V")
	public Class135(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class113 arg3) {
		this.aClass113_69 = arg3;
		this.aClass113_70 = arg2;
		this.aClass113_70.method2271(34);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public void method2790() {
		@Pc(2) Class167 local2 = this.aClass167_55;
		synchronized (this.aClass167_55) {
			this.aClass167_55.method3389();
		}
		local2 = this.aClass167_56;
		synchronized (this.aClass167_56) {
			this.aClass167_56.method3389();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)Lclient!pb;")
	public Class188 method2791(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_55;
		@Pc(16) Class188 local16;
		synchronized (this.aClass167_55) {
			local16 = (Class188) this.aClass167_55.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass113_70.method2274(34, arg0);
		local16 = new Class188();
		local16.aClass135_2 = this;
		if (local33 != null) {
			local16.method3937(new Class1_Sub11(local33));
		}
		@Pc(52) Class167 local52 = this.aClass167_55;
		synchronized (this.aClass167_55) {
			this.aClass167_55.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public void method2793() {
		@Pc(2) Class167 local2 = this.aClass167_55;
		synchronized (this.aClass167_55) {
			this.aClass167_55.method3384(5);
		}
		local2 = this.aClass167_56;
		synchronized (this.aClass167_56) {
			this.aClass167_56.method3384(5);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method2794() {
		@Pc(13) Class167 local13 = this.aClass167_55;
		synchronized (this.aClass167_55) {
			this.aClass167_55.method3390();
		}
		local13 = this.aClass167_56;
		synchronized (this.aClass167_56) {
			this.aClass167_56.method3390();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	public void method2795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass167_55 = new Class167(arg0);
		this.aClass167_56 = new Class167(arg1);
	}
}
