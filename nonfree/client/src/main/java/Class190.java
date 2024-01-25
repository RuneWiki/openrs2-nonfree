import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class190 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Lclient!jr;")
	private final Class169 aClass169_35 = new Class169(16);

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "Lclient!in;")
	private final Class157 aClass157_157;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class190(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_157 = arg2;
		this.aClass157_157.method4561(29);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
	public void method5485() {
		@Pc(6) Class169 local6 = this.aClass169_35;
		synchronized (this.aClass169_35) {
			this.aClass169_35.method5006();
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI)V")
	public void method5488() {
		@Pc(2) Class169 local2 = this.aClass169_35;
		synchronized (this.aClass169_35) {
			this.aClass169_35.method4997(5);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)Lclient!wia;")
	private Class372 method5489(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_35;
		@Pc(16) Class372 local16;
		synchronized (this.aClass169_35) {
			local16 = (Class372) this.aClass169_35.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_157;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_157) {
			local38 = this.aClass157_157.method4564(29, arg0);
		}
		local16 = new Class372();
		if (local38 != null) {
			local16.method9134(new Class2_Sub11(local38));
		}
		@Pc(60) Class169 local60 = this.aClass169_35;
		synchronized (this.aClass169_35) {
			this.aClass169_35.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	public void method5491() {
		@Pc(2) Class169 local2 = this.aClass169_35;
		synchronized (this.aClass169_35) {
			this.aClass169_35.method5009();
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIILclient!hq;I)Lclient!wr;")
	public Class376 method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class137 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class179[] local7 = null;
		@Pc(12) Class372 local12 = this.method5489(arg4);
		if (local12.anIntArray709 != null) {
			local7 = new Class179[local12.anIntArray709.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(37) Class149 local37 = arg3.method4257(local12.anIntArray709[local27]);
				local7[local27] = new Class179(local37.anInt5146, local37.anInt5152, local37.anInt5147, local37.anInt5150, local37.anInt5155, local37.anInt5149, local37.anInt5151, local37.aBoolean377);
			}
		}
		return new Class376(local12.anInt10938, local7, local12.anInt10942, arg2, arg0, arg1);
	}
}
