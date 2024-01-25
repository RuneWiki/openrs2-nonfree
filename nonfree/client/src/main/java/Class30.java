import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class30 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!lh;")
	private final Class151 aClass151_22 = new Class151(64);

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "Lclient!hh;")
	private final Class109 aClass109_18;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class30(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_18 = arg2;
		if (this.aClass109_18 != null) {
			this.aClass109_18.method2322(35);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	public void method481() {
		@Pc(2) Class151 local2 = this.aClass151_22;
		synchronized (this.aClass151_22) {
			this.aClass151_22.method3299();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V")
	public void method482() {
		@Pc(12) Class151 local12 = this.aClass151_22;
		synchronized (this.aClass151_22) {
			this.aClass151_22.method3297(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method483() {
		@Pc(2) Class151 local2 = this.aClass151_22;
		synchronized (this.aClass151_22) {
			this.aClass151_22.method3298();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lclient!si;")
	public Class218 method485(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_22;
		@Pc(16) Class218 local16;
		synchronized (this.aClass151_22) {
			local16 = (Class218) this.aClass151_22.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass109_18.method2349(35, arg0);
		local16 = new Class218();
		if (local33 != null) {
			local16.method5158(new Class1_Sub14(local33));
		}
		local16.method5160();
		@Pc(52) Class151 local52 = this.aClass151_22;
		synchronized (this.aClass151_22) {
			this.aClass151_22.method3291((long) arg0, local16);
			return local16;
		}
	}
}
