import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class125 {

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public int anInt3454;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!lh;")
	private final Class151 aClass151_89 = new Class151(64);

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Lclient!lh;")
	public final Class151 aClass151_90 = new Class151(30);

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!hh;")
	public final Class109 aClass109_49;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Lclient!hh;")
	private final Class109 aClass109_51;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;Lclient!hh;)V")
	public Class125(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3) {
		this.aClass109_49 = arg3;
		this.aClass109_51 = arg2;
		@Pc(26) int local26 = this.aClass109_51.method2324() - 1;
		this.aClass109_51.method2322(local26);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method2959() {
		@Pc(6) Class151 local6 = this.aClass151_89;
		synchronized (this.aClass151_89) {
			this.aClass151_89.method3299();
		}
		local6 = this.aClass151_90;
		synchronized (this.aClass151_90) {
			this.aClass151_90.method3299();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public void method2960() {
		@Pc(6) Class151 local6 = this.aClass151_89;
		synchronized (this.aClass151_89) {
			this.aClass151_89.method3297(5);
		}
		local6 = this.aClass151_90;
		synchronized (this.aClass151_90) {
			this.aClass151_90.method3297(5);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Lclient!mn;")
	public Class166 method2961(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_89;
		@Pc(16) Class166 local16;
		synchronized (this.aClass151_89) {
			local16 = (Class166) this.aClass151_89.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = this.aClass109_51.method2349(Static245.method3549(arg0), Static7.method166(arg0));
		local16 = new Class166();
		local16.anInt4340 = arg0;
		local16.aClass125_1 = this;
		if (local43 != null) {
			local16.method3601(new Class1_Sub14(local43));
		}
		@Pc(65) Class151 local65 = this.aClass151_89;
		synchronized (this.aClass151_89) {
			this.aClass151_89.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	public void method2963() {
		@Pc(2) Class151 local2 = this.aClass151_89;
		synchronized (this.aClass151_89) {
			this.aClass151_89.method3298();
		}
		local2 = this.aClass151_90;
		synchronized (this.aClass151_90) {
			this.aClass151_90.method3298();
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
	public void method2965(@OriginalArg(0) int arg0) {
		this.anInt3454 = arg0;
		@Pc(9) Class151 local9 = this.aClass151_90;
		synchronized (this.aClass151_90) {
			this.aClass151_90.method3298();
		}
	}
}
