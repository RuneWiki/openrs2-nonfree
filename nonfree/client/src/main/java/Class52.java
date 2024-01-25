import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class52 {

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Lclient!ng;")
	private final Class167 aClass167_20 = new Class167(64);

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Lclient!ng;")
	public final Class167 aClass167_21 = new Class167(2);

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!ic;")
	public final Class113 aClass113_25;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!ic;")
	private final Class113 aClass113_24;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;Lclient!ic;)V")
	public Class52(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class113 arg3) {
		this.aClass113_25 = arg3;
		this.aClass113_24 = arg2;
		this.aClass113_24.method2271(33);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method1176() {
		@Pc(2) Class167 local2 = this.aClass167_20;
		synchronized (this.aClass167_20) {
			this.aClass167_20.method3389();
		}
		local2 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3389();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
	public void method1177() {
		@Pc(6) Class167 local6 = this.aClass167_20;
		synchronized (this.aClass167_20) {
			this.aClass167_20.method3390();
		}
		local6 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3390();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lclient!i;")
	public Class111 method1178(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_20;
		@Pc(16) Class111 local16;
		synchronized (this.aClass167_20) {
			local16 = (Class111) this.aClass167_20.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass113_24.method2274(33, arg0);
		local16 = new Class111();
		local16.aClass52_1 = this;
		if (local39 != null) {
			local16.method2247(new Class1_Sub11(local39));
		}
		@Pc(58) Class167 local58 = this.aClass167_20;
		synchronized (this.aClass167_20) {
			this.aClass167_20.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V")
	public void method1181() {
		@Pc(2) Class167 local2 = this.aClass167_20;
		synchronized (this.aClass167_20) {
			this.aClass167_20.method3384(5);
		}
		local2 = this.aClass167_21;
		synchronized (this.aClass167_21) {
			this.aClass167_21.method3384(5);
		}
	}
}
